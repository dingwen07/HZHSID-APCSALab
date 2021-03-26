package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        Champion tony = new Champion("保护我方易云龙", 1000000);
        tony.setScore(2200);
        tony.setHitRate(0.13);
        tony.setUltimateSkillPerGame(1);
        

        System.out.println(tony);
        // System.out.println(tony.toString());

    }
}