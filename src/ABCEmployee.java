public class ABCEmployee implements EmployeeRules{

    public static void main(String[] args) {
        ABCEmployee abc=new ABCEmployee();
        abc.maintainHours();
        abc.relocate();
        abc.report();
        abc.dress();

    }

    public void maintainHours()
    {
        System.out.println("40 hours");
    }
    public void relocate()
    {
        System.out.println("other city");
    }
    public void report()
    {
        System.out.println("Manager");
    }
    public void dress()
    {
        System.out.println("Professionally");
    }
}
