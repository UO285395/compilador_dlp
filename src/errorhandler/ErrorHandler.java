package errorhandler;

import ast.types.ErrorType;
import ast.types.IntType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private static final ErrorHandler INSTANCE = new ErrorHandler();

    List<ErrorType> errors = new ArrayList<>();


    private ErrorHandler() {
    }


    public static ErrorHandler getInstance() {
        return INSTANCE;
    }

    public boolean anyError() {
        return !errors.isEmpty();
    }

    public void showErrors(PrintStream systemErr) {
        for(ErrorType err : errors){
            systemErr.println(err.toString());
        }
    }

    public void addError(ErrorType err){
        errors.add(err);
    }

}
