package ast;

import ast.locatable.AbstractLocatable;
import ast.types.Type;

public class RecordField extends AbstractLocatable {
    String name;
    Type type;

    public RecordField(int line, int column) {
        super(line, column);
    }
}
