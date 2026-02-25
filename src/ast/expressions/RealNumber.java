package ast.expressions;

import ast.locatable.AbstractLocatable;

public class RealNumber extends AbstractLocatable implements Expression {
    double value;

    public RealNumber(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }
}
