package dev.mrcabbagestick.expression;

public abstract class SingleArgumentExpression<T> implements Expression<T>{
    private final Expression<T> arg1;

    public SingleArgumentExpression(Expression<T> arg1) {
        this.arg1 = arg1;
    }

    public Expression<T> getArg1() {
        return arg1;
    }
}
