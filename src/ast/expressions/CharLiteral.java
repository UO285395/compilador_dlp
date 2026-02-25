package ast.expressions;

import ast.locatable.AbstractLocatable;

public class CharLiteral extends AbstractLocatable implements Expression {

    char value;

    public CharLiteral(int line, int column, char value) {
        super(line, column);
        this.value = value;
    }

}
