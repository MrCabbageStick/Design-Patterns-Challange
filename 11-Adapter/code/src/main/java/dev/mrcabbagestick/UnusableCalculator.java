package dev.mrcabbagestick;

public class UnusableCalculator {
    private float num1;
    private float num2;
    private Operation operation;

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public float calculate(){
        return switch (operation){
            case Sum -> num1 + num2;
            case Subtract -> num1 - num2;
            case Multiply -> num1 * num2;
            case Divide -> num1 / num2;
        };
    }
}
