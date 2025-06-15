package dev.mrcabbagestick.expression;

import dev.mrcabbagestick.expression.exceptions.NullConstantException;

public class Constant<T> implements Expression<T>{
    private final T value;

    public Constant(T value) {
        this.value = value;
    }

    @Override
    public T getValue(ExpressionContext<T> ctx) throws NullConstantException {
        if(value == null)
            throw new NullConstantException();

        return value;
    }
}
