package app;

/**
 * Student
 */
public class Student {

    private int student_id;
    private double gradePoint;
    private String name;
    private boolean isPig;
    private double[] grades;

    public Student(int student_id, int gradePoint, String name, boolean isPig) {
        setStudent_id(student_id);
        setgradePoint(gradePoint);
        setName(name);
        setPig(isPig);
    }

    public Student(String name, double[] grades) {
        setName(name);
        setgrades(grades);
    }

    /**
     * @param gradePoint the gradePoint to set
     */
    public void setgradePoint(int gradePoint) {
        this.gradePoint = gradePoint;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    /**
     * @param isPig the isPig to set
     */
    public void setPig(boolean isPig) {
        this.isPig = isPig;
    }

    /**
     * @param grades the grades to set
     */
    public void setgrades(double[] grades) {
        this.grades = grades;
    }

    /**
     * @return the gradePoint
     */
    public double getgradePoint() {
        return gradePoint;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the student_id
     */
    public int getStudent_id() {
        return student_id;
    }

    /**
     * @return the isPig
     */
    public boolean isPig() {
        return isPig;
    }

    /**
     * @return the grades
     */
    public double[] getgrades() {
        return grades;
    }

    public String getGradeString() {
        String str = name;
        str+=" ";
        for (double d : grades) {
            str+=d;
            str+=" ";
        }
        return str;
    }

    public String toString() {
        return "Name: " + getName() + "\n" + "StudentID: " + getStudent_id();
    }

}