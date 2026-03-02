package ast;

import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.locatable.AbstractLocatable;
import ast.types.Type;

public class RecordField extends AbstractLocatable {
    String name;
    Type type;

    public RecordField(int line, int column, String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }
}
