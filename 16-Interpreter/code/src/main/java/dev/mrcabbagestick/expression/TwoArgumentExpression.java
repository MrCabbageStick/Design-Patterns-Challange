package dev.mrcabbagestick.expression;

public abstract class TwoArgumentExpression<T> implements Expression<T>{
    private final Expression<T> arg1;
    private final Expression<T> arg2;

    public TwoArgumentExpression(Expression<T> arg1, Expression<T> arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public Expression<T> getArg1() {
        return arg1;
    }

    public Expression<T> getArg2() {
        return arg2;
    }
}
