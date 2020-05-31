package com.codeForces;

import java.util.*;
import java.text.*;
import java.io.*;

class TestClass
{

    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        int N=k.nextInt();

        int xcor[]=new int[N];
        int ycor[]=new int[N];
        int zcor[]=new int[N];
        int corval[]=new int[N];
        int i=0;
        int total=0;
        int Q=k.nextInt();


        for(int x=0;x<N;x++)
        {
            xcor[x]=0;
            ycor[x]=0;
            zcor[x]=0;
            corval[x]=0;
        }

        for(int p=0;p<Q;p++)
        {
            int ch=k.nextInt();

            if(ch==1)
            {
                xcor[i]=k.nextInt();
                ycor[i]=k.nextInt();
                zcor[i]=k.nextInt();

                corval[i]=k.nextInt();
                total+=corval[i];

                i++;

            }
            else if(ch==2)
            {
                int x=k.nextInt();
                int y=k.nextInt();
                int z=k.nextInt();

                int X=k.nextInt();
                int Y=k.nextInt();
                int Z=k.nextInt();
                int cnt=0;

                for(int j=0;j<i;j++)
                {
                    if(xcor[j]>=x && xcor[j]<=X)
                        if(ycor[j]>=y && ycor[j]<=Y)
                            if(zcor[j]>=z && zcor[j]<=Z)
                                cnt+=corval[j];

                }

                System.out.println(total-cnt);

            }

        }

    }

}