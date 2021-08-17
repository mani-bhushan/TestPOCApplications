package app.org.com.main;

public class Main {
	public static void main(String... args) {
        Main.<Integer>print();
//        Main.<Short>print();
//        Main.<Byte>print();
//        Main.<Void>print();
    }

    public static <T extends Integer> int print() {
        System.out.println("here - Integer");
        return 0;
    }
//    public static <T extends Short> short print() {
//        System.out.println("here - Short");
//        return 0;
//    }
//    public static <T extends Byte> byte print() {
//        System.out.println("here - Byte");
//        return 0;
//    }
//    public static <T extends Void> void print() {
//        System.out.println("here - Void");
//    }

}
