package chapter6_STL;


import java.io.*;
import java.util.*;
import java.util.Comparator;




public class javaset
{
   /*public static void main (String[] args)
    {
        javaset prog=new javaset();
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


    void run()
    {
       // System.out.println("sdf");
        my m=new my(1);
        my n=new my("goto hell");



        Comparator<my> c1=new cmp();

        SortedSet<my> s=new TreeSet<my>(c1);

        int i;


        for(i=0;i<=10;i++)
        {
            n=new my( (i+15*i*i)%7 );
            s.add(n);
        }




        //access via Iterator
        Iterator iterator = s.iterator();
        while(iterator.hasNext())
        {
            m = (my)iterator.next();
            System.out.println(m.a);
        }

        System.out.println("");
        //access via new for-loop
        for(my t : s)
        {
            System.out.println(t.a);
        }

        //m=new my(0);
        //s.remove(m);
        
        
        System.out.println("");


        n=new my(6);
        s.remove(n);


        //access via new for-loop
        for(my t : s)
        {
            System.out.println(t.a);
        }


        n=s.first();
        s.remove(n);

        System.out.println("");
        //access via new for-loop

        n=new my(100);
        s.add(n);


        n=new my(100);
        s.add(n);

        
        for(my t : s)
        {
            System.out.println(t.a);
        }
    }
}
