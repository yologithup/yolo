import java.util.Comparator;

/**
 * @author
 * @date 2019/9/28-14:47
 * 自然比较：class Person implements Comparable<Person>
 * 非自然比较：class PersonNameCompararorn implements Comparator<Person>(比较器)
 */
//姓名比较
class PersonNameCompararorn implements Comparator<Person>{
    public int compare(Person o1,Person o2){
        return o1.name.compareTo(o2.name);
    }
}
//身高比较
class PersonCompararorn implements Comparator<Person>{
    public int compare(Person o1,Person o2){
        return o1.high-o2.high;
    }
}
class PersonAll implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.high>o2.high){
            return 1;
        }else if(o1.high<o2.high){
            return -1;
        }else{
            if(o1.compareTo(o2)<0){
                return -1;
            }else if(o1.compareTo(o2)>0){
                return 1;
            }else{
                if(o1.weight>o2.weight){
                    return 1;
                }else if(o1.weight<o2.weight){
                    return -1;
                }else {
                    return o1.age-o2.age;
                }
            }
        }
    }
}
public class Person implements Comparable<Person>{
    String name;
    int age;
    int high;
    int weight;

    public Person(String name,int age,int high,int weight) {
        this.name=name;
        this.age=age;
        this.high=high;
        this.weight=weight;
    }

    @Override
    public int compareTo(Person o) {
//        if(age<o.age){
//            return -1;
//        }else if(age==o.age){
//            return 0;
//        }else {
//            return 1;
//        }
        return age-o.age;
    }

    public static void main(String[] args) {
        Person p=new Person("tom",18,175,55);
        Person q=new Person("liming",20,180,65);
        System.out.println("姓名比较");
        if(p.compareTo(q)<0){
            System.out.println("p小于q");
        }else if(p.compareTo(q)==0){
            System.out.println("p等于q");
        }else {
            System.out.println("p大于q");
        }


        Comparator<Person>comparator=new PersonAll();
        System.out.println("多个比较：");
        if(comparator.compare(p,q)<0){
            System.out.println("p小于q");
        }if(comparator.compare(p,q)==0){
            System.out.println("p等于q");
        }else {
            System.out.println("p大于");
        }

    }
}
