import java.util.Comparator;

/**
 * @author yolo
 * @date 2019/9/28-16:27
 * 1.设计图书类
 *  ISBN，作者，书名，价格，销量，评论数
 *      自然顺序：按照isbn从小到大
 * 2.设计比较器
 * 3.打印并且排序
 */
public class Book implements Comparable<Book> {
    String ISBN;
    String writer;
    String name;
    int price;
    int sales;
    int comments;

    public Book(String ISBN, String writer, String name, int  price, int sales, int comments) {
        this.ISBN = ISBN;
        this.writer = writer;
        this.name=name;
        this.price=price;
        this.sales=sales;
        this.comments=comments;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", writer='" + writer + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", sales=" + sales +
                ", comments=" + comments +
                '}';
    }
    @Override
    public int compareTo(Book o) {
        return ISBN.compareTo(o.ISBN);
    }

}
class NameCom implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.name.compareTo(o2.name);
    }
}
class SalesCom implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.sales-o2.sales;
    }
}
class CommetsCom implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.comments-o2.comments;
    }
}
class PriceCom implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return  o1.price-o2.price;
    }
}
class MultipleCom implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.price<o2.price){
            return -1;
        }else if(o1.price>o2.price){
            return 1;
        }
        if(o1.sales<o2.sales){
            return -1;
        }else if(o1.sales>o2.sales){
            return 1;
        }
        return o1.comments-o2.comments;
    }
}