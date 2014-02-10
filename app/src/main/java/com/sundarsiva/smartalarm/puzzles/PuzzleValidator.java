package com.sundarsiva.smartalarm.puzzles;

/**
 * Created by Sundar on 2/6/14.
 */
public class PuzzleValidator {

    public static boolean isValidAnswer(Puzzle puzzle, String answer) {
        if(answer == null) {
            return false;
        }
        if(puzzle.getAnswer().equalsIgnoreCase(answer)){
            return true;
        } else {
            return false;
        }
    }
}
