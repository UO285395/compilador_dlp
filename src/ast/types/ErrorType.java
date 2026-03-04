package ast.types;

import ast.locatable.Locatable;
import errorhandler.ErrorHandler;

public class ErrorType implements Type{
    String cause;
    Locatable location;

    public ErrorType(String cause, Locatable location) {
        this.cause = cause;
        this.location = location;
        ErrorHandler.getInstance().addError(this);
    }

    public ErrorType() {

    }

    @Override
    public String toString() {
        return "Error in line " + location.getLine() + " and Column " + location.getColumn() + " caused by " + cause;
    }
}
