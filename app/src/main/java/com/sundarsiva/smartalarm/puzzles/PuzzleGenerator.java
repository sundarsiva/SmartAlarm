package com.sundarsiva.smartalarm.puzzles;

import android.content.Context;

/**
 * Created by Sundar on 2/6/14.
 */
public class PuzzleGenerator {

    public String generateMathPuzzle(Context context){
        Puzzle puzzle = new MathPuzzle(context);
        return puzzle.generatePuzzle();
    }


}
