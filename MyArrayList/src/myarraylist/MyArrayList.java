package myarraylist;
public class MyArrayList {
    public static void main(String[] args) {
        // TODO code application logic here
        List list=new List();
        list.pushFront(1);
        list.pushFront(2);    
        list.pushFront(3);
        list.print();
        
        list.pushBack(10);
        list.pushBack(11);
        list.pushBack(12);
        list.print();
        
        list.deleteFront();
        list.deleteFront();
        list.print();
        
        list.deleteBack();
        list.print();
        
        list.delete(2);
        list.print();
    }
}
