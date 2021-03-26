package app;

public class App {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment(2);
        counter.decrement();
        System.out.println(counter);
        counter.reset();
        System.out.println(counter);
    }

    public static String convertLowercase(String s) {
        return s.toLowerCase();
    }

    public static void question2() {
        System.out.println("Peri\tArea");
        for (int height = 1; height <= 10; height++) {
            for (int width = 1; width <= 10; width++) {
                int perimeter = (height + width) * 2;
                int area = height * width;
                System.out.println(perimeter + "\t" + area);
            }
        }
    }
}