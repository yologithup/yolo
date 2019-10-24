package Demo01Thread;

/**
 * @author yolo
 * @date 2019/10/24-16:27
 */
public class Person {
    String name;
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(name+i);
        }
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
