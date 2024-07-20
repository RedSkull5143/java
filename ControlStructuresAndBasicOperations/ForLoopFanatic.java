package ControlStructuresAndBasicOperations;

public class ForLoopFanatic {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int count = 10;

        for(int i=2;i<count;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c );
        }

    }
}
