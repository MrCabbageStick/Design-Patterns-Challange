package dev.mrcabbagestick.expression;

import java.util.Map;

public class ExpressionContext<T> {
    private final Map<String, T> variables;

    public ExpressionContext() {
        this.variables = Map.of();
    }

    public ExpressionContext(Map<String, T> variables) {
        this.variables = variables;
    }

    public Map<String, T> variables() {
        return variables;
    }
}
