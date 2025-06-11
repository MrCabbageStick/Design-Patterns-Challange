package dev.mrcabbagestick;

public class UsableCalculator implements Calculator{
    private final UnusableCalculator calc;

    public UsableCalculator(){
        calc = new UnusableCalculator();
    }

    @Override
    public float sum(float num1, float num2) {
        calc.setNum1(num1);
        calc.setNum2(num2);
        calc.setOperation(Operation.Sum);
        return calc.calculate();
    }

    @Override
    public float subtract(float num1, float num2) {
        calc.setNum1(num1);
        calc.setNum2(num2);
        calc.setOperation(Operation.Subtract);
        return calc.calculate();
    }

    @Override
    public float multiply(float num1, float num2) {
        calc.setNum1(num1);
        calc.setNum2(num2);
        calc.setOperation(Operation.Multiply);
        return calc.calculate();
    }

    @Override
    public float divide(float num1, float num2) {
        calc.setNum1(num1);
        calc.setNum2(num2);
        calc.setOperation(Operation.Divide);
        return calc.calculate();
    }
}
