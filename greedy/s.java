import java.util.*;
public class s{
    static String s(String st)
    {
        String ss=st.charAt(st.length()-1)+st.substring(1,st.length()-1)+st.charAt(0);
         //System.out.println();
        return ss;
    }

public static void main(String[] args) {
    String s="ginni";
    System.out.print(s(s));
}
}