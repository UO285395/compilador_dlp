package ast.expressions;

import ast.locatable.AbstractLocatable;

public class CompareOp extends AbstractLocatable implements Expression {
    Expression left, right;
    String operator;

    public CompareOp(int line, int column, Expression left, String op, Expression right) {
        super(line, column);
        this.left = left;
        this.operator = op;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
