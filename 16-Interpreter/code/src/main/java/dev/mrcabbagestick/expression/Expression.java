package dev.mrcabbagestick.expression;

import dev.mrcabbagestick.expression.exceptions.NoVariableException;
import dev.mrcabbagestick.expression.exceptions.NullConstantException;

public interface Expression<T> {
    T getValue(ExpressionContext<T> ctx) throws NoVariableException, NullConstantException;
}
