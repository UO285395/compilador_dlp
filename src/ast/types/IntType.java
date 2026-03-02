package ast.types;

import ast.locatable.AbstractLocatable;
import ast.types.Type;

public class IntType implements Type {
    private static final IntType INSTANCE = new IntType();

    private IntType() {
        super();
    }

    public static IntType getInstance() {
        return INSTANCE;
    }
}