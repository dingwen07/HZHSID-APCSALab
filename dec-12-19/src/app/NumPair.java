package app;

public class NumPair {
    private int number1;
    private int number2;

    public NumPair() {
        number1 = 0;
        number2 = 0;
    }

    public NumPair(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * @param number1 the number1 to set
     */
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * @param number2 the number2 to set
     */
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    /**
     * @return the number1
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * @return the number2
     */
    public int getNumber2() {
        return number2;
    }

    @Override
    public String toString() {
        return "" + number1 + " " + number2;
    }
}