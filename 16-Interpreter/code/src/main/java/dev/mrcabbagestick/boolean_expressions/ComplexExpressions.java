package dev.mrcabbagestick.boolean_expressions;

import dev.mrcabbagestick.expression.Expression;

public class ComplexExpressions {
    public static Expression<Boolean> nor(Expression<Boolean> arg1, Expression<Boolean> arg2){
        return new Negation(new Or(arg1, arg2));
    }

    public static Expression<Boolean> nand(Expression<Boolean> arg1, Expression<Boolean> arg2){
        return new Negation(new And(arg1, arg2));
    }
}
