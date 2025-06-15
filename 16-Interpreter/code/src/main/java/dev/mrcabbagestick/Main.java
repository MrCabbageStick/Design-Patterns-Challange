package dev.mrcabbagestick;

import dev.mrcabbagestick.boolean_expressions.And;
import dev.mrcabbagestick.boolean_expressions.ComplexExpressions;
import dev.mrcabbagestick.boolean_expressions.Negation;
import dev.mrcabbagestick.boolean_expressions.Or;
import dev.mrcabbagestick.expression.Constant;
import dev.mrcabbagestick.expression.ExpressionContext;
import dev.mrcabbagestick.expression.Variable;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        var varA = new Variable<Boolean>("A");
        var varB = new Variable<Boolean>("B");
        var xor = new Or(
                new And(varA, new Negation(varB)),
                new And(varB, new Negation(varA))
        );

        for(var arg1 : List.of(false, true))
            for(var arg2 : List.of(false, true)) {
                var context = new ExpressionContext<>(Map.of(
                        "A", arg1,
                        "B", arg2
                ));

                System.out.printf("%5b %5b | %5b\n", arg1, arg2, xor.getValue(context));
            }
    }
}