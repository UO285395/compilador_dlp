package ast.types;

import ast.locatable.AbstractLocatable;

public class ArrayType extends AbstractLocatable implements Type {
    int size;
    Type type;

    public ArrayType(int line, int column, int size, Type ast) {
        super(line,column);
        this.size = size;
        type = ast;
    }
}
