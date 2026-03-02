package ast.types;

public class NumType implements Type {
    private static final NumType INSTANCE = new NumType();

    private NumType() {
        super();
    }

    public static NumType getInstance() {
        return INSTANCE;
    }
}
