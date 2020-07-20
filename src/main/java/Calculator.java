public class Calculator {

    private int firstNum;
    private int secondNum;
    private double firstDecNum;
    private double secondDecNum;


    public Calculator(int firstNum, int secondNum, double firstDecNum, double secondDecNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.firstDecNum = firstDecNum;
        this.secondDecNum = secondDecNum;
    }
    public int addNum() {
        return this.firstNum + this.secondNum;

    }
    public int subtractNum() {
        return this.firstNum - this.secondNum;

    }
    public int multiplyNum() {
        return this.firstNum * this.secondNum;

    }
    public double divideNum() {
        return this.firstDecNum / this.secondDecNum;

    }
}
