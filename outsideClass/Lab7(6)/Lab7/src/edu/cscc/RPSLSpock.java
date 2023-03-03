package edu.cscc;
import java.util.Random;

// TODO remove this comment and  document this class. Be sure to include an @author tag

/**
 * @author Levi Lorenzo Diaz
 * This class contains all the necessary variables, methods, and calculations necessary to play rock, paper, scissors, lizard, spock.
 */
public class RPSLSpock {

    static Random rand = new Random(System.currentTimeMillis());

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";

    /**
     *
     * @param pick is what the user picks, being either rock, paper, scissors, lizard, or spock
     * @return boolean, false if null/no answer and true if rock, paper, scissors, lizard, or spock is pick
     * This is to check whether what the user picked is valid
     */
    public static boolean isValidPick(String pick) {
        if (pick == null) {
            return false;
        }
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    /**
     * This method picks a random number integer between 0 and 4 to decide which of the 5 options it will pick
     * @return returns pick, what the computer picked based on the random number
     */
    public static String generatePick() {
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        return pick;
    }

    /**
     *This method returns a boolean of whether or not the computer won, if it won it returns true
     * @param c_pick This is what the computer decided to pick
     * @param h_pick This is what the user decided to pick
     * @return boolean, checks to see if computer won, true means that computer won, false means that the user won and computer lost
     */
    public static boolean isComputerWin(String c_pick,String h_pick) {
        h_pick = h_pick.toLowerCase().trim();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
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