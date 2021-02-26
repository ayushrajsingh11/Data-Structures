public class insertDeleteSearch{
   static  int[] table=new int[1000];
    static void insert(int i)
    {
       table[i]=1;
    }
    static void delete(int i)
    {
        table[i]=0;
    }
    static int search(int i)
    {
        return table[i];
    }
    public static void main(String[] args) {
       insert(10);
       insert(20);
       insert(30);
      System.out.println(search(20));
    }
}



