package org.darshan.FunctionalProgramming.Custom.SquareDemo.WithoutLambda;


import org.darshan.FunctionalProgramming.Custom.SquareDemo.ISquare;

public class Square implements ISquare {
    @Override
    public int findSquare(int num) {
        return num * num;
    }
}
