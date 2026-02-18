package ast;

import ast.locatable.AbstractLocatable;
import ast.types.Type;

public class RecordField extends AbstractLocatable {
    String name;
    Type type;
}
