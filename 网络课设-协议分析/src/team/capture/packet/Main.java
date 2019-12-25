package team.capture.packet;

import java.io.IOException;
import java.util.Scanner;

import jpcap.*;
import jpcap.packet.*;
/**
 * @author yolo
 * @date 2019/12/23-20:45
 */
public class Main {
    static JpcapCaptor jpcap = null;
    static jpcap.NetworkInterface[] devices = JpcapCaptor.getDeviceList();
    static DataPacket dp = new DataPacket();
    static int captureCount = 0;// 记录捕捉的次数
    static String path = null;

    public static void main(String[] args) {
        if(devices.length==0){
            System.out.println("无网卡信息");
            return;
        }
        //输出网卡信息
        for (int i = 0; i < devices.length; i++) {
            System.out.println("网卡"+i+"  信息"+devices[i].name);
            for (NetworkInterfaceAddress address : devices[i].addresses) {
                System.out.print(address.address+" ");
            }
            System.out.println("\n");
        }
        // 返回机器上网络接口卡对象的数组

        int a = 0;
        byte[] b = devices[1].mac_address; // 网卡物理地址
        System.out.println("------------------本机网卡信息-----------------------");
        System.out.println("网卡名称 : " + devices[1].name);
        System.out.print("网卡地址:");
        for (int j = 0; j < b.length; j++) {
            /*
             * << : 左移运算符，num << 1,相当于num乘以2 >> : 右移运算符，num >> 1,相当于num除以2 >>>
             * :无符号右移，忽略符号位，空位都以0补齐
             */
            a = b[j];
            a = a << 24;
            a = a >>> 24;
            System.out.print(Integer.toHexString(a));
        }
        System.out.println();

        int netLine = 1;
        // 这个接口的网络地址。设定为数组应该是考虑到有些设备同时连接多条线路,选择为0或1
        // 0：无线网卡 1：有线网卡 这个接口的网络地址。设定为数组应该是考虑到有些设备同时连接多条线路，
        // 例如路由器。但我们的PC机的网卡一般只有一条线路，所以我们一般取addresses[0]就够了
        NetworkInterfaceAddress[] k = devices[0].addresses;
        // for (int n = 0; n < k.length; n++) {
        System.out.println("本机IP地址 : " + k[netLine].address); // 本机IP地址
        System.out.println("子网掩码   : " + k[netLine].subnet); // 子网掩码
        // }
        System.out.println("网络连接类型 : " + devices[netLine].datalink_description);
        System.out.println(
                "网卡类型：" + devices[netLine].description + "\n" + "网络设备所对应数据链路层的名称 " + devices[netLine].datalink_name);
        // 以太网（Ethernet）、无线LAN网（wireless LAN）、令牌环网(token ring)
        startCapture();
    }

    /*
     * 开始捕捉数据包
     */
    static void startCapture() {

        //Packet packet=jpcap.getPacket();
       NetworkInterface deviceName = devices[0];

        /* 将网卡设为混杂模式下用网络设备deviceName */

        try {
            jpcap = JpcapCaptor.openDevice(deviceName, 20000, false, 1);
            /*
             * 取得在指定网卡上的Jpcapcator对象， Interface：返回的某个网卡对象。 Snaplen：一次性要抓取数据包的最大长度。
             * 这个是比较容易搞混的一个参数。其实这个参数不是限制只能捕捉多少数据包，而是限制每一次收到一个数据包，只提取该数据包中前多少字节
             * Promisc：设置是否混杂模式。处于混杂模式将接收所有数据包，如果设置为混杂模式后调用了包过滤函数setFilter()将不起任何作用；
             * To_ms：这个参数主要用于processPacket()方法，指定超时的时间；
             */

            capture();// 选择捕捉类型

        } catch (Exception e) {
        }
    }

    static void capture() {
        captureCount++;//
        System.out.println("\n" + "请选择捕捉协议类型:");
        System.out.println("0:全部协议类型" + "\n" + "1. arp" + "\n" + "" + "2. ip " + "\n" + "3. udp" + "\n" + "4. 准备结束操作");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        try {
            if (st.equals("0")) {
                loop(st);

            } else if (st.equals("1")) {

                jpcap.setFilter("arp", true);// 需要捕捉异常

                loop(st);

            } else if (st.equals("2")) {
                jpcap.setFilter("ip", true);
                loop(st);
            } else if (st.equals("3")) {
                jpcap.setFilter("udp", true);
                loop(st);

            } else if (st.equals("4")) {
                isExist();

            } else {
                System.out.println("输入错误，请重新输入");
                capture();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void loop(String st) {// 开始捕捉数据包
        System.out.println("请稍等……" + "\n");
        jpcap.loopPacket(100, new DataPacket());
        // 连续地捕获数据包，返回捕获数据包的数量。 参数count是要捕获数据包的数量，可以将其设置为-1， 这样就可以持续抓包直到EOF或发生错误为止。

        path = dp.write();// 写入本地文件
        if (st.equals("0")) {

            dp.search();

        } else if (st.equals("1")) {
            dp.arpWatch();
        } else if (st.equals("2")) {
            dp.ipWatch();
        } else if (st.equals("3")) {
            dp.udpWatch();
        }

        startCapture();
    }

    public static void isExist() {
        if (captureCount == 1) {
            System.out.println("退出成功");
            System.exit(0);
        }
        System.out.println("是否在本地保存此次捕捉协议包数据" + "\n" + "0:保存" + "\n" + "1:不保存");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        if (st.equals("0")) {
            System.out.println("保存文件成功");
            System.out.println("退出成功");
            System.exit(0);
        } else if (st.equals("1")) {
            dp.delFile(path);// 删除文件的方法
            System.out.println("退出成功");
            System.exit(0);
        } else {
            System.out.println("输入错误，重新输入");
            isExist();
        }
    }
}

//package team.capture.packet;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;
//import jpcap.*;
//import jpcap.packet.*;
///**
// * @author yolo
// * @date 2019/12/23-20:45
// */
//public class Main {
//    static JpcapCaptor jpcap = null;
//    static jpcap.NetworkInterface[] devices = JpcapCaptor.getDeviceList();
//    static DataPacket dp = new DataPacket();
//    static int captureCount = 0;// 记录捕捉的次数
//    static String path = null;
//
//    public static void main(String[] args) {
//        if(devices.length==0){
//            System.out.println("无网卡信息");
//            return;
//        }
//        //输出网卡信息
//        for (int i = 0; i < devices.length; i++) {
//            System.out.println("网卡"+i+"  信息"+devices[i].name);
//            for (NetworkInterfaceAddress address : devices[i].addresses) {
//                System.out.print(address.address+" ");
//            }
//            System.out.println("\n");
//        }
//        startCapture();
//    }
//
//    /*
//     * 开始捕捉数据包
//     */
//    static void startCapture() {
//        Scanner input=new Scanner(System.in);
//        System.out.println("请选择你要监听的接口序号：");
//        //Packet packet=jpcap.getPacket();
//        int index=input.nextInt();
//        NetworkInterface deviceName = devices[index];
//
//        /* 将网卡设为混杂模式下用网络设备deviceName */
//
//        try {
//            jpcap = JpcapCaptor.openDevice(deviceName, 2000, false, 1);
//            /*
//             * 取得在指定网卡上的Jpcapcator对象， Interface：返回的某个网卡对象。 Snaplen：一次性要抓取数据包的最大长度。
//             * 这个是比较容易搞混的一个参数。其实这个参数不是限制只能捕捉多少数据包，而是限制每一次收到一个数据包，只提取该数据包中前多少字节
//             * Promisc：设置是否混杂模式。处于混杂模式将接收所有数据包，如果设置为混杂模式后调用了包过滤函数setFilter()将不起任何作用；
//             * To_ms：这个参数主要用于processPacket()方法，指定超时的时间；
//             */
//
//            jpcap.loopPacket(100, new DataPacket());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
