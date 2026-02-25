package ast.statements;

import ast.expressions.Expression;
import ast.locatable.AbstractLocatable;

import java.util.List;

public class WhileStatement extends AbstractLocatable implements Statement {
    Expression condition;
    List<Statement> body;

    public WhileStatement(int line, int column) {
        super(line, column);
    }
}
