import javax.swing.*;

/**
 * @author yolo
 * @date 2019/10/21-22:22
 */
public class RedPacketFrame extends JFrame {
        /*  ownerName : 群主名称 */
        public String ownerName = "谁谁谁谁";
        /* openMode : 红包的类型 [普通红包/手气红包]  */
        public OpenMode openMode = null;
        /**
         * 构造方法:生成红包界面.
         * @param title 页面的标题.
         */
        public RedPacketFrame(String title) {
            super(title);
        }
        /* set方法 */
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }
        public void setOpenMode(OpenMode openMode) {
            this.openMode = openMode;
        }
}

