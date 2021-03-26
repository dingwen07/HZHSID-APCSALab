package app;

public class Counter {
    private int value;

    public Counter() {
        value = 0;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Increase the counter by 1
     */
    public void increment(){
        value++;
    }

    /**
     * Increase the counter
     * @param increment the value to add
     */
    public void increment(int increment){
        value+=increment;
    }

    /**
     * Decrease the counter by 1
     */
    public void decrement(){
        value--;
    }

    /**
     * Decrease the counter
     * @param decrement the value to decrease
     */
    public void decrement(int decrement){
        value-=decrement;
    }

    /**
     * Reset the counter
     */
    public void reset(){
        value = 0;
    }

    public String toString(){
        return ""+value;
    }
}