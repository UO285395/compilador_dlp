package ast.types;

import ast.definitions.VarDefinition;

import java.util.List;

public class FuncType implements Type{
    Type returnType;
    List<VarDefinition> params;

    public FuncType(List<VarDefinition> params,Type returnType) {
        this.params = params;
        this.returnType = returnType;
    }

}
