import java.util.Comparator;
import java.util.List;

/**
 * @author yolo
 * @date 2019/9/28-17:16
 */
public class Sort {
    private static void sort(List<Book>books){
        for(int i=1;i<books.size();i++){
            Book book=books.get(i);
            int j;
            for(j=i-1;j>=0 && books.get(j).compareTo(book)>0;j--){

            }
        }
    }
    private static void sort(List<Book>books,Comparator comparator){

    }
}
