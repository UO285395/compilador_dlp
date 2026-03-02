package ast.statements;

import ast.expressions.Expression;
import ast.locatable.AbstractLocatable;

public class Assignment extends AbstractLocatable implements Statement {
    Expression left, right;

    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

}
