package app;

public class StudentMaker {
    public static void main(String[] args) throws Exception {
        Student charles = new Student(-1, 12, "Charles", false);
        System.out.println(charles.isPig());
        charles.setPig(true);
        System.out.println(charles.isPig());
        System.out.println(charles);
    }
}