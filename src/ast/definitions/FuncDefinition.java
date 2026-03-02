package ast.definitions;

import ast.locatable.AbstractLocatable;
import ast.locatable.Locatable;
import ast.statements.Statement;
import ast.types.Type;

import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Locatable {
    List<Statement> statements;
    List<VarDefinition> definitions;

    public FuncDefinition(int line, int column, String name, Type type, List<VarDefinition> definitions, List<Statement> statements) {
        super(line, column,name, type);
        this.statements = statements;
        this.definitions = definitions;
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
