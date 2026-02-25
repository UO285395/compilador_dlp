package ast.expressions;

import ast.locatable.AbstractLocatable;
import ast.types.Type;

public class Cast extends AbstractLocatable implements Expression {
    Expression expression;
    Type type;

    public Cast(int line, int column, Expression expression, Type type) {
        super(line, column);
        this.expression = expression;
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
