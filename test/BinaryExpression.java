package test;

public abstract class BinaryExpression implements Expression {
    public Expression left;
    public final Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;

    }

}