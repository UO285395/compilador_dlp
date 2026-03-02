package ast.types;

import ast.locatable.AbstractLocatable;

public class CharType  implements Type{
    private static final CharType INSTANCE = new CharType();

    private CharType() {
        super();
    }

    public static CharType getInstance() {
        return INSTANCE;
    }
}
