package ast.expressions;

import ast.locatable.AbstractLocatable;
import ast.statements.Statement;

import java.util.List;

public class Invocation extends AbstractLocatable implements Expression, Statement {
    Variable invoked;
    List<Expression> arguments;

    public Invocation(int line, int column, Variable invoked, List<Expression> arguments) {
        super(line, column);
        this.invoked = invoked;
        this.arguments = arguments;
    }

    public Invocation(int line, int column, Variable invoked) {
        super(line, column);
        this.invoked = invoked;
    }



}
