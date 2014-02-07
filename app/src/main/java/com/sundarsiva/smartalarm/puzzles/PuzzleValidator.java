package com.sundarsiva.smartalarm.puzzles;

/**
 * Created by Sundar on 2/6/14.
 */
public class PuzzleValidator {

    public boolean isValidAnswer(PuzzleAndAnswer puzzleAndAnswer, Answer answer) {
        if(answer == null) {
            return false;
        }
        if(puzzleAndAnswer.getAnswer().getAnswer().equalsIgnoreCase(answer.getAnswer())){
            return true;
        } else {
            return false;
        }
    }
}
