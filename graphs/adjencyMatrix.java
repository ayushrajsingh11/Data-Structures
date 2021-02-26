import java.util.*;
public class adjencyMatrix{
    static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v)
    {
        a.get(u).add(v);
        a.get(v).add(u);
    }
    static void print(ArrayList<ArrayList<Integer>> a)
    {
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size();j++)
            {
                System.out.print(a.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<ArrayList<Integer>> a=new ArrayList<>(5);
        for(int i=0;i<v;i++)
        {
            a.add(new ArrayList<Integer>());
        }
        addEdge(a,0,1);
        addEdge(a,0,2);
        addEdge(a,1,2);
        addEdge(a,1,3);
        print(a);
    }
}