package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        System.out.println(firstLast6(new int[]{6,1,2,3}));
    }

    public static boolean firstLast6(int[] ints){
        return ints[0] == 6 || ints[ints.length-1] == 6;
    }
}