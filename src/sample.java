//import java.util.Scanner;

//import static java.lang.Integer.sum;

import java.util.Scanner;

public class sample {
    public static void main(String[] args) {


       /*int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter:1-12");
        int month = sc.nextInt();

        if (month == 1||month==3||month==5||month==7||month==9||month==11) {
            System.out.println("31 days");
        }
        else if(month==2) {
            System.out.println("28 days");
        }
        else {
            System.out.println("30 days");
        }
        System.out.println("end");

        /*int sum = sum(2, 2);
        System.out.println("The sum is" + sum);
        int sub = sub(4, 4);
        System.out.println("The sub is" + sub);
        int mul = mul(5, 1);
        System.out.println("the mul is" + mul);
        int div = div(5, 6);
        System.out.println("The div is" + div);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }*/
/*int number;
        System.out.println("Enter No:");
        number=990;

        if (number % 2==0)
            System.out.println("Number even");
        else if(number%2!==0)
            System.out.println("odd");*/
        /*int month;
        System.out.println("Enter Month:");
        Scanner sc=new Scanner(System.in);
        month=sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==9||month==11)
        {
            System.out.println("NUMBER OF DAYS IS 31");
        } else if (month==2)
        {
            System.out.println("NUMBER OF DAYS IS 28");
        }
        else
        {
            System.out.println("NUMBER OF DAYS IS 30");
        }
*/
        /*int a, b, c;
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a > b && a > c)) {
            System.out.println("A is largest");
        } else if ((b > a && b > c)) {
            System.out.println("B is largest");
        } else if ((c > a && c > b)) {
            System.out.println("C is largest");
        } else {
            System.out.println("Invalid");
        }*/
        /*int num;
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num>0)
            System.out.println("Number is positive");
        if(num<0)
            System.out.println("Number is negative");*/
        /*int num;
        num=13;
        if(num%2==0)
            System.out.println("Even");
        else {
            System.out.println("odd");
        }*/
     /* int i;
      int fact=1;
      int number=10;

      for(i=1;i<=number;i++)
      {
          fact=fact*i;
      }
        System.out.println("The Factorial of"+ number+ "is"+fact);*/
           /* int i = 1;
            System.out.println("Output is:");
            while (i <= 100) {
                System.out.println(i);
                i++;
            }

        }*/
       /* System.out.println("Print even number");
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }*/
      /*  int i=1;
        int sum=0;
        while(i<=10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);*/

      /* int rand=(int) (Math.random()*100);
        System.out.println(rand);
        boolean flag=true;
        while(flag){
            System.out.println("guess the number:");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            if(guess==rand){
                System.out.println("Right");
                flag=false;
            }
            else{
                System.out.println("wrong");
                if(guess>rand){
                    System.out.println("number is less than guess");
                }
                else{
                    System.out.println("number is greater than guess");
                }
            }
        }*/

       /* int month=8;
        String monthString;
        switch (month) {
                case 1:
                    monthString = "jan";
                    break;
                case 2:
                    monthString = "feb";
                    break;
                case 3:
                    monthString = "mar";
                    break;
                case 4:
                    monthString = "apr";
                    break;
                case 5:
                    monthString = "may";
                    break;
                case 6:
                    monthString = "jun";
                    break;
                case 7:
                    monthString = "july";
                    break;
                case 8:
                    monthString = "aug";
                    break;
                case 9:
                    monthString = "sep";
                    break;
                case 10:
                    monthString = "oct";
                    break;
                case 11:
                    monthString = "nov";
                    break;
                case 12:
                    monthString = "dec";
                    break;

            default:monthString="Invalid";

                    break;
            }
        System.out.println(monthString);*/

       /* Scanner sc=new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[5];
        int[] arr3=new int[5];

        System.out.println("enter number:");
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<arr3.length;i++) {
            arr3[i] = sc.nextInt();
        }

        int sum1=0;
        for (int i=0;i<arr1.length;i++)
        sum1=sum1+arr1[i];
        int sum2=0;
        for (int i=0;i<arr2.length;i++)
            sum2=sum2+arr2[i];
        int sum3=0;
        for (int i=0;i<arr3.length;i++)
            sum3=sum3+arr3[i];
        {
            System.out.println("student1" +" "+ sum1);
            System.out.println("average is" +" "+ sum1 / arr1.length);
            System.out.println("student2" + " "+sum2);
            System.out.println("average is" +" "+sum2 / arr2.length);
            System.out.println("student3" +" " +sum3);
            System.out.println("average is" +" " +sum3 / arr3.length);


        }*/
       /*int[][] arr2d={
               {10,22,33,22,11},
               {20,22,33,22,11},
               {30,22,33,22,11}
       };
       //column
int s;
for(int i=0;i<3;i++){
    s=0;
    for(int j=0;j<5;j++)
    {
        s=s+arr2d[i][j];
    }
    System.out.println(s);
}//row
int sum;
for(int col=0;col<5;col++){
    sum=0;
    for(int row=0;row<3;row++){
        sum=sum+arr2d[row][col];
    }
    System.out.println(sum);
}*/
        /*int[] marks={100,90,80};
        System.out.println(marks.length);
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }*/


        //char[] name={'r','a','m','a'};
        //System.out.println(name.length);

        //String[] names={"asad","dsdsd","sadfdf"};
        //System.out.println(names.length);

   /* int[] a={10,20,30};
    int[] b={30,90};
    int len=a.length+b.length;
            int[] c=new int[len];
            for(int i=0;i<a.length;i++)
            {
                c[i]=a[i];
            }
            int j=0;
            for (int i=a.length;i< c.length;i++)
            {
                c[i]=b[j];
                j++;
            }
            for(int i=0;i<c.length;i++)
            {
                System.out.println(c[i]);
            }*/

       /* String s="abc";
        System.out.println(s);
        System.out.println(s.hashCode());

        s="kld";
        System.out.println(s);
        System.out.println(s.hashCode());*/

       /* for(int i=0;i<5;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                System.out.print(" * ");

            }
            for(int k=0;k<i;k++)
            {
                System.out.print(" j ");
            }
            System.out.println("  ");

        }*/

        int a=10,b=5;
        System.out.println("a value is " +a);
        System.out.println("b value is "+b);
        int temp;
        temp=a;
         a=b;
         b=temp;
        System.out.println("a value is " +a);
        System.out.println("b value is " +b);
    }
        }





