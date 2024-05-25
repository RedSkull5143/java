package BasicJavaPrograms;

public class TypeConversionTango {
    public static void main(String[] args) {
        double number1=50.45;
        int number2=5;

        int parsed_number1=(int) number1;
        double parsed_number2=(double) number2;

        System.out.println("Int - "+number2+" after parsing into double is - "+parsed_number2);
        System.out.println("Double - "+number1+" after parsing into integer is - "+parsed_number1);
    }
}
