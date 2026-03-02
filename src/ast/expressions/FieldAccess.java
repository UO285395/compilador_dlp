package ast.expressions;

import ast.locatable.AbstractLocatable;

public class FieldAccess extends AbstractLocatable implements Expression {
    Expression field;
    String access;

    public FieldAccess(int line, int column, Expression field, String access) {
        super(line, column);
        this.field = field;
        this.access = access;
    }

}
