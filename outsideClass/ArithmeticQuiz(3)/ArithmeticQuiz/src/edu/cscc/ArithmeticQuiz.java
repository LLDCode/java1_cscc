package edu.cscc;

import java.util.Scanner;
import java.lang.Math;

/**
 * Quiz students on addition, subtraction, and multiplication problems
 * Use integer values between 1 and max
 */
public class ArithmeticQuiz {
    private int max;
    private Scanner input = new Scanner(System.in);

    /**
     * Constructor
     *
     * @param max largest number to use in quiz
     */
    public ArithmeticQuiz(int max) {
        this.max = max;
    }

    /**
     * Getter for max
     *
     * @return maximum value
     */
    public int getMax() {
        return max;
    }

    /**
     * Get a random operand from 1 to max
     *
     * @return random operand value
     */
    private int getOperand() {
        return (int) (Math.random() * max + 1);
    }

    /**
     * Get random arithmetic operator
     *
     * @return operator
     */
    private String getOperator() {
        String[] operators = {"+", "-", "x"};
        int irand = (int) (Math.random() * 3);
        return operators[irand];
    }

    /**
     * Compute the result of op1 operator op2
     *
     * @param op1      first operand
     * @param op2      second operand
     * @param operator arithmetic operator
     * @return result of computation
     */
    public int compute(int op1, int op2, String operator) {
        int result = 0;
        switch (operator) {
            case "+":
                result = op1 + op2;
                break;
            case "-":
                result = op1 - op2;
                break;
            case "x":
                result = op1 * op2;
                break;
            default:
                // Stop program if there's an error
                System.out.println("Error - bad operator");
                System.exit(-1);
        }
        return result;
    }

    /**
     * Quiz student on one arithmetic expression
     *
     * @return true if student is correct, false otherwise
     */
    public boolean doQuiz() {
        int op1 = getOperand();
        int op2 = getOperand();
        String operator = getOperator();
        boolean isCorrect;

        // Ask student to compute result of arithmetic expression
        System.out.print("Compute " + op1 + " " + operator + " " + op2 + " = ");
        int response = input.nextInt();
        // Check if correct
        int answer = compute(op1, op2, operator);
        if (response == answer) {
            System.out.println("Correct!");
            isCorrect = true;
        } else {
            System.out.println("Wrong! The answer is " + answer);
            isCorrect = false;
        }

        return isCorrect;
    }}

/*
 * Copyright Notice: Columbus State Community College and its employees hold the copyright for this course material. This material is
 * made available to students for their personal use only and may not be distributed for commercial purposes without the College’s
 * express written consent. Uploading this copyrighted material to "tutoring" or other non-Columbus State web sites is prohibited and
 * may result in referral to the Office of Student Conduct and disciplinary action up to and including dismissal.
 *
 * Course ID: 40A9B085A383430396E7BACF467DE6E0
 */