public class Calculator{
    public static void main(String[] args)
    {
        int sum=sum(3,1);
        System.out.println(sum);
        int mul=mul(5,6);
        System.out.println(mul);
        int div=div(10,2);
        System.out.println(div);
        int diff=diff(5,4);
        System.out.println(diff);

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int diff(int a,int b){
        return a-b;
    }

}