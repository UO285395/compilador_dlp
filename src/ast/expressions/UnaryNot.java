package ast.expressions;

import ast.locatable.AbstractLocatable;

public class UnaryNot extends AbstractLocatable implements Expression {
    Expression expression;

    public UnaryNot(int line, int column, Expression expression) {
        super(line, column);
        this.expression =  expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
