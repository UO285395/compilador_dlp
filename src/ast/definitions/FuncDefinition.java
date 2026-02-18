package ast.definitions;

import ast.locatable.AbstractLocatable;
import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class FuncDefinition extends AbstractLocatable implements Definition {
    String name;
    Type type;
    List<Statement> statements;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
