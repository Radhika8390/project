public class Demo {
    public static void main(String[] args)
    {
        System.out.println(add(30.2f,90.0f));
        System.out.println(sub(40,20));
        System.out.println(mult(3,5));
        System.out.println(div(2,5));
        System.out.println(div(2,5));

    }
    public static float add(float x,float y){
        return x+y;
    }
    public static int sub(int x,int y){
        return x-y;
    }
    public static int mult(int a,int b) {
        return a*b;
    }
    public static float div(int a,int b) {
        return a/b;
    }
}
