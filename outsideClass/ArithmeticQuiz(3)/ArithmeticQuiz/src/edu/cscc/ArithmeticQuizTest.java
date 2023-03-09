package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticQuizTest {

    @Test
    public void testConstuctor() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.getMax() == 12);
    }

    @Test
    public void computeTestAdd() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.compute(1, 1, "+") == 2);
        Assert.assertTrue(quiz.compute(1, 12, "+") == 13);
    }

    @Test
    public void computeTestSubtract() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.compute(10, 10, "-") == 0);
        Assert.assertTrue(quiz.compute(10, 2, "-") == 8);
        Assert.assertTrue(quiz.compute(1, 7, "-") == -6);
    }

    @Test
    public void computeTestMultiply() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.compute(1, 1, "x") == 1);
        Assert.assertTrue(quiz.compute(10, 12, "x") == 120);
        Assert.assertTrue(quiz.compute(12, 12, "x") == 144);
    }
}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */