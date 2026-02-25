package ast.expressions;

import ast.locatable.AbstractLocatable;
import ast.statements.Statement;

public class Invocation extends AbstractLocatable implements Expression, Statement {
    Expression function;
    Expression arguments;

    public Invocation(int line, int column) {
        super(line, column);
    }

    public Expression getFunction() {
        return function;
    }

    public void setFunction(Expression function) {
        this.function = function;
    }

    public Expression getArguments() {
        return arguments;
    }

    public void setArguments(Expression arguments) {
        this.arguments = arguments;
    }
}
