package com.company;
class myType
{
int myData = 5;

    public void myMethod()
    {
        myData *=5; //myData=mydata*5
        System.out.println(myData);
    }
}

public class Main {

    public static void main(String[] args) {

        myType myVariable1 = new myType();
        myVariable1.myData = 123;
        myVariable1.myMethod();

        myType myVariable2 = new myType();
        myVariable2.myMethod();

        myType myVariable3 = new myType();
        myVariable3.myMethod();
        myVariable3 = myVariable1;
        myVariable3.myMethod();

        myVariable1.myMethod();
        myVariable2.myMethod();

        String s1 = "text1";
        String s2 = "text2";
        String s3;
        s1 = s1 + s2;
        s3 = s1;
        s1 = "First";
        System.out.println(s1);
        System.out.println(s3);
    }
}
