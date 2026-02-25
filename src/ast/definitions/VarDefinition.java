package ast.definitions;

import ast.locatable.AbstractLocatable;
import ast.statements.Statement;
import ast.types.Type;

public class VarDefinition extends AbstractLocatable implements Definition, Statement {

    String name;
    Type type;

    public VarDefinition(int line, int column) {
        super(line, column);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
