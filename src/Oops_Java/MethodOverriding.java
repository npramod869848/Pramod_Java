package Oops_Java;

class MethodOverriding 
{
    void show() 
    {
        System.out.println("1");
    }
}

class Test extends MethodOverriding 
{
    @Override
    void show() 
    {
        System.out.println("2");
    }



    public static void main(String[] args) 
    {
        Test test = new Test();
        test.show(); // Output will be "2"
        
        MethodOverriding met=new MethodOverriding();
        met.show();
    }
}
