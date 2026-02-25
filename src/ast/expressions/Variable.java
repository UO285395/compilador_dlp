package ast.expressions;

import ast.locatable.AbstractLocatable;

public class Variable extends AbstractLocatable implements Expression {

    String name;

    public Variable(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }
}
