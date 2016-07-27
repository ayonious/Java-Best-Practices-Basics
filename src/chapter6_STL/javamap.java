package chapter6_STL;


import java.io.*;
import java.util.*;
import java.util.Comparator;




public class javamap
{
    /*public static void main (String[] args)
    {
        javamap prog=new javamap();
        prog.run();
    }*/


    class cmp implements Comparator <my>
    {
        @Override
        public int compare(my x, my y)
        {

            // 3 ta line e lagbe
            if(x.a>y.a) return 1;
            if(x.a<y.a) return -1;
            else return 0;

        }
    }


    class my
    {
        int a;
        String s;

        my(String st,int i)
        {
            s=st;
            a=i;
        }
        my(int i)
        {
            s="nothing here :P";
            a=i;
        }
        my(String st)
        {
            s=st;
            a=0;
        }
        int gcd(int x,int y)
        {
            if(x==0) return y;
            else return gcd(y,x%y);
        }
    }
    class key
    {
        int k;
        key(int i)
        {
            k=i;
        }
    }


    void run()
    {
       // System.out.println("sdf");
        


        Comparator<my> c1=new cmp();

        Map<my,key> s=new TreeMap<my,key>(c1);

        int i;

        my m;
        key k;
        
        for(i=0;i<=10;i++)
        {

            m=new my( i );
            k=new key(2*i);
            s.put(m,k);
        }

        
        m=new my(4);

        k=s.get(m);
        System.out.println(k.k);



        for(key kk : s.values())
        {
            System.out.println(kk.k);

            //do someting to anObject...
        }
        System.out.println("");


        for(my mn : s.keySet())
        {
            k = s.get(mn);
            System.out.println(mn.a+" "+k.k);

            //do something to value
        }

        
    }
}
