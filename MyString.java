import java.util.Arrays;

/**
 * @author yolo
 * @date 2019/10/19-9:34
 */
public class MyString {
    private final char[] value;

    //创建字符串
    public MyString(char[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }
    public MyString(char[] value,int offset,int count){
        this.value=Arrays.copyOfRange(value,offset,offset+count);
    }
    //charAt方法
    public char charAt(int index){
        return value[index];
    }
    //toCharArray方法
    public char[] toCharArray(){
        return Arrays.copyOf(value,value.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyString myString = (MyString) o;
        return Arrays.equals(value, myString.value);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }
    //toUpperCase方法
    public MyString toUpperCase(){
        char[] newValue=toCharArray();
        for(int i=0;i<newValue.length;i++){
            if(Character.isLowerCase(newValue[i])){
                newValue[i]=Character.toUpperCase(newValue[i]);
            }
        }
        return new MyString(newValue);
    }
    //忽略大小写判等
    public boolean equalsIgnoreCase(MyString o){
        if(o==null){
            return false;
        }
        if(value.length!=o.value.length){
            return false;
        }
        for (int i = 0; i < value.length; i++) {
            char c=Character.toUpperCase(value[i]);
            char d=Character.toUpperCase(o.value[i]);
            if(c!=d){
                return false;
            }
        }
        return true;
    }
}
