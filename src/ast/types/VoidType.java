package ast.types;

public class VoidType implements Type {
    private static final VoidType INSTANCE = new VoidType();

    private VoidType() {
        super();
    }

    public static VoidType getInstance() {
        return INSTANCE;
    }
}
