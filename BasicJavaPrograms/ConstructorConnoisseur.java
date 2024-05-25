package BasicJavaPrograms;

class number{
    int a;

    public number(int input){
        this.a=input;
    }

    public void print(){
        System.out.println("Input is "+a);
    }
}
public class ConstructorConnoisseur {
    public static void main(String[] args) {
        number number=new number(10);
        System.out.println(number.a);
        number.print();
    }
}
