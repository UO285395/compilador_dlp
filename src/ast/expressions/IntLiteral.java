package ast.expressions;

import ast.locatable.AbstractLocatable;
import ast.locatable.Locatable;

public class IntLiteral extends AbstractLocatable implements Expression{

    int value;

    public IntLiteral(int line, int column, int value) {
        super(line, column);
        this.value = value;
    }
}
