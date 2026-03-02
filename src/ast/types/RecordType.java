package ast.types;

import ast.RecordField;
import ast.definitions.VarDefinition;
import ast.locatable.AbstractLocatable;
import ast.statements.Statement;

import java.util.List;

public class RecordType extends AbstractLocatable implements Type, Statement {
    List<RecordField> fields;

    public RecordType(int line, int column, List<RecordField> fields) {
        super(line, column);
        this.fields = fields;
    }
}
