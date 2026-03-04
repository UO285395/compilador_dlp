package ast.statements;

import ast.expressions.Expression;
import ast.locatable.AbstractLocatable;

import java.util.List;

public class IfStatement extends AbstractLocatable implements Statement{
    Expression condition;
    List<Statement> body;
    List<Statement> bodyElse;

    public IfStatement(int line, int column, Expression condition, List<Statement> body, List<Statement> bodyElse) {
        super(line, column);
        this.condition = condition;
        this.body = body;
        this.bodyElse = bodyElse;
    }

}
