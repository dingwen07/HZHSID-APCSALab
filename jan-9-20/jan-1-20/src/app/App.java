package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Student[] students = new Student[100];
        for(int i=0;i<100;i++){
            double[] grades = new double[5];
            for(int j=0;j<5;j++){
                grades[j]=Math.random()*100;
            }
            students[i]=new Student("Tony" + i, grades);
        }
        
        for (Student student : students) {
            System.out.println(student.getGradeString());
        }
    }
}