import java.util.Scanner;

//import java.util.Scanner;
//
//public class Findmax {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

////
////        int max=a;
////        if (b>max){
////            max=b;
////
////        }
////        if (c>max){
////            max=c;
//    }
//
//        System.out.println(Math.max(34, 57));
//    }
public class Findmax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}