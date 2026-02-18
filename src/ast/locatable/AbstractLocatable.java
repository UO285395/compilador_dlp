package ast.locatable;

public abstract class AbstractLocatable implements Locatable {
    int line;
    int column;

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }
}
