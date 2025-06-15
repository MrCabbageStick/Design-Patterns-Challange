package dev.mrcabbagestick.boolean_expressions;

import dev.mrcabbagestick.expression.Expression;
import dev.mrcabbagestick.expression.ExpressionContext;
import dev.mrcabbagestick.expression.TwoArgumentExpression;
import dev.mrcabbagestick.expression.exceptions.NoVariableException;
import dev.mrcabbagestick.expression.exceptions.NullConstantException;

public class And extends TwoArgumentExpression<Boolean> {
    public And(Expression<Boolean> arg1, Expression<Boolean> arg2) {
        super(arg1, arg2);
    }

    @Override
    public Boolean getValue(ExpressionContext<Boolean> ctx) throws NoVariableException, NullConstantException {
        return getArg1().getValue(ctx) && getArg2().getValue(ctx);
    }
}
