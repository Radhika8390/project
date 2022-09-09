public class primitiveToWrapper {
    public static void main(String[] args) {
        int a=5;

        Integer data=Integer.valueOf(a);

        if(data instanceof Integer){
            System.out.println("An object of Integer is created");
        }

    }
}
