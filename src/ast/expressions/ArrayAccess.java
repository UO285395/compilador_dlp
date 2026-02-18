package ast.expressions;

import ast.locatable.AbstractLocatable;

public class ArrayAccess extends AbstractLocatable implements Expression {
    Expression array, index;

    public Expression getArray() {
        return array;
    }

    public void setArray(Expression array) {
        this.array = array;
    }

    public Expression getIndex() {
        return index;
    }

    public void setIndex(Expression index) {
        this.index = index;
    }
}
