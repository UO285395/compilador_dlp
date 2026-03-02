package ast.statements;

import ast.expressions.Expression;
import ast.locatable.AbstractLocatable;

public class Return extends AbstractLocatable implements Statement {
    Expression expression;

    public Return(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }
}
