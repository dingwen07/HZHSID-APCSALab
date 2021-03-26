package app;

/**
 * Student
 */
public class Student {

    private int student_id;
    private int grade;
    private String name;
    private boolean isPig;


    public Student(int student_id, int grade, String name, boolean isPig){
        setStudent_id(student_id);
        setGrade(grade);
        setName(name);
        setPig(isPig);
    }


    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
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
     * @return the grade
     */
    public int getGrade() {
        return grade;
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
    
    public String toString(){
        return "Name: " + getName() + "\n" + "StudentID: " + getStudent_id();
    }


}