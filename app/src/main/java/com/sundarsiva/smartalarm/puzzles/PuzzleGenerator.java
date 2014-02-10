package com.sundarsiva.smartalarm.puzzles;

import android.content.Context;

/**
 * Created by Sundar on 2/6/14.
 */
public class PuzzleGenerator {

    private static PuzzleGenerator instance = new PuzzleGenerator();

    public static PuzzleGenerator getInstance(){
        return instance;
    }

    public Puzzle generateMathPuzzle(Context context){
        Puzzle puzzle = new MathPuzzle(context);
        return puzzle;
    }


}
