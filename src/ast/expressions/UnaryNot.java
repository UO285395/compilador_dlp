package ast.expressions;

import ast.locatable.AbstractLocatable;

public class UnaryNot extends AbstractLocatable implements Expression {
    String operator;
    Expression expression;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
