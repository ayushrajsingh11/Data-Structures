
import java.util.*;

public class balancedString {

    static boolean boolea(String str)
    {
        Stack<Character> s=new Stack<>();
       int i;
       for(i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='[')
           {
               s.push(str.charAt(i));
               
           }
           else
           {
             if(s.isEmpty()==true)//if my stack is empty,mtlb koi opening brackert nai hai toh stack khali hai
             return false;
             else if(str.charAt(i)==s.pop())
             {
                    return true;
             }
            

             
           }
       }
       return(s.isEmpty());
        
    }
    static boolean matching(char a,char b)
    {
        return((a=='(')&&(b==')')||(a=='{')&&(b=='}')||(a=='[')&&(b==']'));
    }
    public static void main(String[] args) {
        String str="{[()]}";
        System.out.print("False if the string is not matched andTrue if yes "+boolea(str));
    }
}