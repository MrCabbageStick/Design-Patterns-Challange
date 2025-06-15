package dev.mrcabbagestick.boolean_expressions;

import dev.mrcabbagestick.expression.Expression;
import dev.mrcabbagestick.expression.ExpressionContext;
import dev.mrcabbagestick.expression.SingleArgumentExpression;
import dev.mrcabbagestick.expression.exceptions.NoVariableException;
import dev.mrcabbagestick.expression.exceptions.NullConstantException;

public class Negation extends SingleArgumentExpression<Boolean> {

    public Negation(Expression<Boolean> arg1) {
        super(arg1);
    }

    @Override
    public Boolean getValue(ExpressionContext<Boolean> ctx) throws NoVariableException, NullConstantException {
        return !getArg1().getValue(ctx);
    }
}
