package ast.statements;

import ast.expressions.Expression;
import ast.locatable.AbstractLocatable;

import java.util.List;

public class Log extends AbstractLocatable implements Statement{
    List<Expression> expressions;


    public Log(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }
}
