package ast.expressions;

import ast.locatable.AbstractLocatable;

public class Assignment extends AbstractLocatable implements Expression {
    Variable variable;
    Expression expression;

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
