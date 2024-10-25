import java.lang.StringBuffer;

public class StringBuff {
    public static void init() {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb.toString());
        System.out.println(sb.charAt(0));
        System.out.println(sb.substring(1));
        System.out.println(sb.substring(0,1));
        System.out.println(sb.delete(0,2));
    }
}
