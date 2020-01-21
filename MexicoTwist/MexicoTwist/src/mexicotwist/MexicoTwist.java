/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mexicotwist;

import javax.swing.JOptionPane;

/**
 *
 * @teajayy007 In this game of two players , each player
 * has Five lives total and will be rolling three dice , two dice, and finally
 * one die , with the aim of getting the maximum die from each roll . Each
 * maximum is added to the next maximum number of die which ever player has
 * lesser total of maximum die loses a life until all life is lost then the
 * player with the highest life remaining is declared winner!! ;
 *
 */
public class MexicoTwist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiating the player one and player two objects
        player playerOne = new player();
        player playerTwo = new player();
        // instatiating the three dice objects
        dice dice1 = new dice();
        dice dice2 = new dice();
        dice dice3 = new dice();
        // the players life variable 
        int Life = 5;
        // welcome message

        JOptionPane.showMessageDialog(null, " Welcome to mexico Twist . In this game of two players , each player has \n"
                + " Five lives total and will be rolling three dice , two dice, and finally one die , \n with the aim of getting the maximum"
                + " die from each roll . \n Each maximum is added to the next maximum number of die and which ever player \n has lesser total of"
                + " maximum die loses a life untill all life is lost \n then the player with the highest life remaining is declared winner!!");
        // this dialog asks for First player's name 
        String name1 = JOptionPane.showInputDialog("First player enter your name");
        // sets the player one name
        playerOne.setName(name1);

        JOptionPane.showMessageDialog(null, " welcome to the mexico Twist game " + playerOne.getName());
        // this ask for seconds player's  name
        String name2 = JOptionPane.showInputDialog("Second player enter your name");

        playerTwo.setName(name2);

        JOptionPane.showMessageDialog(null, " welcome to the mexico Twist game " + playerTwo.getName());

        // do while for the confirm dialog condition
        do {

            playerOne.setLife(Life);
            playerTwo.setLife(Life);

            // loop thats executce game while life is not less or equals 0
            do {
                // variable sets the players total score
                int max1 = 0;
                int max2 = 0;
                // three dice for playerone rolls for player one
                JOptionPane.showMessageDialog(null, playerOne.getName() + "'s Turn");
                dice1.rollDice();
                dice2.rollDice();
                dice3.rollDice();
                // This gets the maximum of the three dice and set the value to max
                max1 += Math.max(Math.max(dice1.getdiceRoll(), dice2.getdiceRoll()), dice3.getdiceRoll());

                JOptionPane.showMessageDialog(null, dice1.getdiceRoll() + " " + dice2.getdiceRoll() + " " + dice3.getdiceRoll() + " "
                        + "\n total = " + max1);
                // two dice rolls
                dice1.rollDice();
                dice2.rollDice();
                // thi gets the maximum and adds it to player one's total score
                max1 += Math.max(dice1.getdiceRoll(), dice2.getdiceRoll());

                JOptionPane.showMessageDialog(null, dice1.getdiceRoll() + " " + dice2.getdiceRoll() + " "
                        + "\n total = " + max1);
                // This rolls one die
                dice1.rollDice();
                // adds the die to player one's total dice
                max1 += dice1.getdiceRoll();

                JOptionPane.showMessageDialog(null, dice1.getdiceRoll() + " "
                        + "\n total = " + max1);
                // this displays player one's total die
                JOptionPane.showMessageDialog(null, playerOne.getName() + " has a total of " + max1 + " dice ");
                // player two's turn
                JOptionPane.showMessageDialog(null, "Now its " + playerTwo.getName() + "'s turn ");

                // player two rolls three dice
                dice1.rollDice();
                dice2.rollDice();
                dice3.rollDice();
                // This gets the maximum of the three dice and set the value to max
                max2 += Math.max(Math.max(dice1.getdiceRoll(), dice2.getdiceRoll()), dice3.getdiceRoll());

                JOptionPane.showMessageDialog(null, dice1.getdiceRoll() + " " + dice2.getdiceRoll() + " " + dice3.getdiceRoll() + " "
                        + "\n total = " + max2);
                // rolls two dice
                dice1.rollDice();
                dice2.rollDice();
                // gets the maximum and adds it to player's two total dice
                max2 += Math.max(dice1.getdiceRoll(), dice2.getdiceRoll());

                JOptionPane.showMessageDialog(null, dice1.getdiceRoll() + " " + dice2.getdiceRoll() + " "
                        + "\n total = " + max2);
                // rolls one die
                dice1.rollDice();
                // adds the die to total dice
                max2 += dice1.getdiceRoll();

                JOptionPane.showMessageDialog(null, dice1.getdiceRoll() + " "
                        + "\n total = " + max2);
                // displayes player's two total dice
                JOptionPane.showMessageDialog(null, playerTwo.getName() + " has a total of " + max2 + " dice ");

                // this reduces player's two life if player one's total dice is greater
                if (max1 > max2) {
                    playerTwo.setLife(playerTwo.getLife() - 1);

                } // this reduces player's one life if player two's total dice is greater
                else if (max2 > max1) {
                    playerOne.setLife(playerOne.getLife() - 1);
                } // nothing is deducted if players total dice are equal
                else {
                    playerTwo.setLife(playerTwo.getLife());
                    playerOne.setLife(playerOne.getLife());

                }
                // this displays how many lives each player has
                JOptionPane.showMessageDialog(null, playerOne.getName() + " has " + playerOne.getLife()
                        + " lives left and " + playerTwo.getName() + " has " + playerTwo.getLife() + " lives left");
                // this displays winners if players life reaches 0 
                if (playerOne.getLife() <= 0) {
                    JOptionPane.showMessageDialog(null, "sorry " + playerOne.getName() + " but " + playerTwo.getName() + " " + " won this round better Luck next time");
                } else if (playerTwo.getLife() <= 0) {
                    JOptionPane.showMessageDialog(null, "sorry " + playerTwo.getName() + " but " + playerOne.getName() + " " + " won this round better luck next time");
                }

            } while (!(playerOne.getLife() <= 0 || playerTwo.getLife() <= 0)); // this checks and executes while players life is not less or equals 0

        } while (JOptionPane.showConfirmDialog(null, " would you like to play again ?") == 0); // game executes if players want to play again

        JOptionPane.showMessageDialog(null, " Thank you for playing !!! Bring another friend next time :)"); // closing message

    }

}
