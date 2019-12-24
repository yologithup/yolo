package team.capture.entity;

/**
 * @author yolo
 * @date 2019/12/23-20:46
 */
public class TcpPacket {
    //网络书 217页
    String src_ip;// 本地ip,网卡设置上的ip地址
    String src_port;// 本地端口,本地可以对外提供服务或与外界连接的接口
    String dst_ip;// 目标ip,数据接收方的IP地址
    String dst_port;// 目的端口,接受数据包的一方的端口
    String sequence;// 序列号,一个TCP连接中传送的字节流中的每一个字节都按顺序编号
    boolean ack;// 确认ack，在数据通信中，接收站发给发送站的一种传输类控制字符。表示发来的数据已确认接收无误
    String ack_num;// 确认号，期望收到对方下一个报文段的第一个数据字节的序号
    boolean urg;// 紧急，设置为1时，首部中的紧急指针有效，表示数据要优先处理
    boolean psh;// 推送，当设置为1时，要求把数据尽快的交给应用层，不做处理
    boolean rst;// 复位，为1时，表明tcp连接中出现严重差错，必须释放连接，然后重新再建立运输连接
    boolean syn;// 同步，为1时，表示这是一个连接请求报文段
    boolean fin;// 终止，为1时，表明此报文段的发送方的数据已发送完毕，并要求释放连接
    String window;// 窗口大小，允许对方发送的数据量，经常动态变化
    String urgent;// 紧急指针，指出紧急数据的末尾在报文段中的位置，即使窗口为0时也可发送紧急数据

    public TcpPacket() {
    }

    public TcpPacket(String src_ip, String src_port, String dst_ip, String dst_port, String sequence, boolean ack,
                     String ack_num, boolean urg, boolean psh, boolean rst, boolean syn, boolean fin, String window,
                     String urgent) {
        super();
        this.src_ip = src_ip;
        this.src_port = src_port;
        this.dst_ip = dst_ip;
        this.dst_port = dst_port;
        this.sequence = sequence;
        this.ack = ack;
        this.ack_num = ack_num;
        this.urg = urg;
        this.psh = psh;
        this.rst = rst;
        this.syn = syn;
        this.fin = fin;
        this.window = window;
        this.urgent = urgent;
    }

    public String getSrc_ip() {
        return src_ip;
    }

    public void setSrc_ip(String src_ip) {
        this.src_ip = src_ip;
    }

    public String getSrc_port() {
        return src_port;
    }

    public void setSrc_port(String src_port) {
        this.src_port = src_port;
    }

    public String getDst_ip() {
        return dst_ip;
    }

    public void setDst_ip(String dst_ip) {
        this.dst_ip = dst_ip;
    }

    public String getDst_port() {
        return dst_port;
    }

    public void setDst_port(String dst_port) {
        this.dst_port = dst_port;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public boolean isAck() {
        return ack;
    }

    public void setAck(boolean ack) {
        this.ack = ack;
    }

    public String getAck_num() {
        return ack_num;
    }

    public void setAck_num(String ack_num) {
        this.ack_num = ack_num;
    }

    public boolean isUrg() {
        return urg;
    }

    public void setUrg(boolean urg) {
        this.urg = urg;
    }

    public boolean isPsh() {
        return psh;
    }

    public void setPsh(boolean psh) {
        this.psh = psh;
    }

    public boolean isRst() {
        return rst;
    }

    public void setRst(boolean rst) {
        this.rst = rst;
    }

    public boolean isSyn() {
        return syn;
    }

    public void setSyn(boolean syn) {
        this.syn = syn;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    @Override
    public String toString() {
        return "TcpPacket:[本地ip:" + src_ip + ", 本地端口:" + src_port + ", 目标ip:" + dst_ip + ", 目标端口:"
                + dst_port + ", 序列号=" + sequence +  "\n" +" 确认ack:" + ack + ", 确认号:" + ack_num + ", 是否紧急:" + urg
                + ", 推送:" + psh + ", 复位:" + rst + ", 同步:" + syn + ", 终止:" + fin + ", 窗口大小:" + window + ", 紧急指针:"
                + urgent + "]";
    }

}
