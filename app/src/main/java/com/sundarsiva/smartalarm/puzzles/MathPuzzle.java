package com.sundarsiva.smartalarm.puzzles;

import android.content.Context;
import com.sundarsiva.smartalarm.R;

import java.util.Random;

/**
 * Created by Sundar on 2/6/14.
 */
public class MathPuzzle implements Puzzle {

    enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY;
    }

    private static Random rand = new Random();
    private Context mContext;
    private int mArg1;
    private int mArg2;
    private Operator mOperator;

    public MathPuzzle(Context context){
        mContext = context;
    }

    @Override
    public String generatePuzzle() {
        int arg1 = randInt(10);
        int arg2 = randInt(10);
        int tempArg;
        if(arg1 < arg2){
            tempArg = arg1;
            arg1 = arg2;
            arg2 = tempArg;
        }
        mArg1 = arg1;
        mArg2 = arg2;
        Operator operator = getRandomOperator();
        mOperator = operator;

        String strOperator = "";

        switch (operator){
            case ADD:
                strOperator = "+";
                break;
            case SUBTRACT:
                strOperator = "-";
                break;
            case MULTIPLY:
                strOperator = "*";
                break;
        }
        String question = mContext.getString(R.string.math_puzzle_question, arg1, strOperator, arg2);
        return question;
    }

    public Operator getRandomOperator(){
        int pick = new Random().nextInt(Operator.values().length);
        return Operator.values()[pick];
    }

    public static int randInt(int max) {
        int randomNum = rand.nextInt(max + 1);
        return randomNum;
    }

    public int getArg1() {
        return mArg1;
    }

    public int getArg2() {
        return mArg2;
    }

    public Operator getOperator(){
        return mOperator;
    }

    public String getAnswer(){
        int answer = 0;
        switch (mOperator){
            case ADD:
                answer = mArg1 + mArg2;
                break;
            case SUBTRACT:
                answer = mArg1 - mArg2;
                break;
            case MULTIPLY:
                answer = mArg1 * mArg2;
                break;
        }
        return ""+answer;
    }

}
