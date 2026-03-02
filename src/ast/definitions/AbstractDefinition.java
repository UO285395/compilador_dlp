package ast.definitions;

import ast.locatable.AbstractLocatable;
import ast.types.Type;

public class AbstractDefinition extends AbstractLocatable implements Definition {

    String name;
    Type type;

    public AbstractDefinition(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
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
