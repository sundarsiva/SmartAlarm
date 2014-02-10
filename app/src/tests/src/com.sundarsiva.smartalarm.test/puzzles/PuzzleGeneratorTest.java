package com.sundarsiva.smartalarm.test.puzzles;

import android.content.Context;
import android.test.AndroidTestCase;
import android.test.mock.MockApplication;

import com.sundarsiva.smartalarm.puzzles.Puzzle;
import com.sundarsiva.smartalarm.puzzles.PuzzleGenerator;

public class PuzzleGeneratorTest extends AndroidTestCase{

    PuzzleGenerator instance;
    Context mContext;
    @Override
    protected void setUp() throws Exception {
        instance = PuzzleGenerator.getInstance();
        mContext = getContext();
        super.setUp();
    }

    public void testGenerateMathPuzzle(){
        Puzzle puzzle = instance.generateMathPuzzle(mContext);
        assertNotNull(puzzle);
        assertTrue(puzzle.generatePuzzle().length() > 0);
        assertTrue(puzzle.getAnswer().length() > 0);
    }
}