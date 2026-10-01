class A{
    public int sum(int a, int b){
        return a+b;
    }
}

class B extends A{
    public int diff(int a, int b){
        return a-b;
    }
}

public class inherit {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Sum: " + obj.sum(10, 5));
        System.out.println("Difference: " + obj.diff(10, 5));
    }
}