package BasicJavaPrograms;

public class ClassCreator {
    static class InnerClass{
        public void InnerMethod(){
            System.out.println("Hello from inner class");
        }
    }

    public static void main(String[] args) {
        InnerClass ic=new InnerClass();
        ic.InnerMethod();
    }
}
