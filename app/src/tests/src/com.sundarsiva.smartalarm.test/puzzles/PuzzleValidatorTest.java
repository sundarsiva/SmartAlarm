package com.sundarsiva.smartalarm.test.puzzles;

import android.content.Context;
import android.test.AndroidTestCase;
import android.test.mock.MockApplication;
import android.util.Log;

import com.sundarsiva.smartalarm.puzzles.MathPuzzle;
import com.sundarsiva.smartalarm.puzzles.PuzzleValidator;

/**
 * Created by Sundar on 2/9/14.
 */
public class PuzzleValidatorTest extends AndroidTestCase {

    private static String TAG = PuzzleValidatorTest.class.getSimpleName();

    Context mContext;
    @Override
    protected void setUp() throws Exception {
        mContext = getContext();
        super.setUp();
    }

    public void testIsValidAnswer(){
        MathPuzzle p = new MathPuzzle(mContext);
        String question = p.generatePuzzle();
        Log.d(TAG, "Question: "+question+" Answer: "+p.getAnswer());
        assertTrue(question.length() > 0);

        int arg1 = p.getArg1();
        int arg2 = p.getArg2();

        int tempArg;
        if(arg1 < arg2){
            tempArg = arg1;
            arg1 = arg2;
            arg2 = tempArg;
        }

        MathPuzzle.Operator o = p.getOperator();

        int answer = 0;
        switch (o){
            case ADD:
                answer = arg1 + arg2;
                break;
            case SUBTRACT:
                answer = arg1 - arg2;
                break;
            case MULTIPLY:
                answer = arg1 * arg2;
                break;
        }

        boolean isValidAnswer = PuzzleValidator.isValidAnswer(p, ""+answer);
        assertTrue(isValidAnswer);

        answer = 5000000;
        isValidAnswer = PuzzleValidator.isValidAnswer(p, ""+answer);
        assertFalse(isValidAnswer);

    }

}
