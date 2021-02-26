public class Recu1 {
  public static int foo(int n)
  {
    if(n!=0)
    {
    int c=n%10;
    return (c+foo(n/10));
    }
    else
    {
     return 0;
  }  }
 public static void main(String[] args) {
   int n=253;
   System.out.println(foo(n));

}
}