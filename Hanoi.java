public class Hanoi {
    public static void Hanoi(int n,char beg,char aux,char end)
    {
        if(n>=1)
        {
            Hanoi(n-1, beg, end, aux);
            System.out.println(beg+" "+end);
            Hanoi(n-1, aux, beg, end);
        }
    }
   public static void main(String[] args) {
       
       char a='A';
       char b='B';
       char c='C';
        Hanoi(3,a,b,c);
    }
}