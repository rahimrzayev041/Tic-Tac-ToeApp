//Name: Rahim
//Surname: Rzayev
/*Description: Players can choose between single and double player modes. 
In double player mode, a name screen appears to obtain player names. 
Single player option is also available. 
User interacts with the computer to play the game. 
Symbol selection happens after choosing the game mode. 
Game starts only after selecting symbols. 
Player scores are displayed on a board.
*/
 


package tic.tac.toe;

import java.awt.Color; /* The Color class is a part of Java Abstract Window Toolkit(AWT) package. The Color class creates color by using the given RGBA values where RGBA stands for RED, GREEN, BLUE, ALPHA  */
import javax.swing.JFrame; /* The javax. swing. JFrame class is a type of container which inherits the java. ... JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI. */
import javax.swing.JOptionPane; /* The class JOptionPane is a component which provides standard methods to pop up a standard dialog box for a value or informs the user of something. */


public class TicTacToe extends javax.swing.JFrame {

    
    public TicTacToe() {
        initComponents();
    }
    private String playerone="Player one"; /* In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string */
    private String playertwo="Player two"; /* Java String class provides a lot of methods to perform operations on strings */
    int count1=0;/* An integer in Java is a memory location that can hold an integer, a positive or negative non-decimal number. It is denoted by the keyword, 'int' */
    int count2=0;/* An integer in Java is a memory location that can hold an integer, a positive or negative non-decimal number. It is denoted by the keyword, 'int' */
    int count3=0;/* An integer in Java is a memory location that can hold an integer, a positive or negative non-decimal number. It is denoted by the keyword, 'int' */
    int player=0;/* An integer in Java is a memory location that can hold an integer, a positive or negative non-decimal number. It is denoted by the keyword, 'int' */
    int doubleplayer=0;// these codes are for playing double player
    int singleplayer=0;//these codes are for playing single player
    int drawby=0; // these codes are for match scores
    int symbolx=0;// these codes are for "x"
    int symboly=0;// these codes are for "y"
    String value; /* String method is used to declare a variable and this variable is value */
    int symbol=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
    int computer=0;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
    int a=1,b=1,c=1,d=1,e=1,f=1,g=1,h=1,i=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
    int computerwin=0;// these codes are for computer
    int win=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
    
    
    private void computerMove(){
        
        if(five.getText().equals("")) //these codes are for getting text
        {
             if(value=="X")   // these codes are for "x"
                five.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                five.setForeground(Color.blue); // i typed these codes for changing the colour of the button to blue
            five.setText(value);//These codes are for uploading text on the button
            e=0;//It defines e variable named "e" and initializes it with 0
            change();//When e is passed to the change() method, a copy of value of x  is passed.
        }
        else if(one.getText().equals(""))//these codes are for getting text
        {
             if(value=="X") // these codes are for "x" 
                one.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                one.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            one.setText(value);//These codes are for uploading text on the button
            a=0;//It defines a variable named "a" and initializes it with 0
            change();//When a is passed to the change() method, a copy of value of x  is passed.
        }
        else if(three.getText().equals(five.getText())&&seven.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")   // these codes are for "x"
                seven.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                seven.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            seven.setText(value);//These codes are for uploading text on the button
            g=0;//It defines g variable named "g" and initializes it with 0
            change();//When g is passed to the change() method, a copy of value of x  is passed.
        }
        else if(one.getText().equals(five.getText())&&nine.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                nine.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                nine.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            nine.setText(value);//These codes are for uploading text on the button
            i=0;//It defines i variable named "i" and initializes it with 0
            change();//When i is passed to the change() method, a copy of value of x  is passed.
        }
        else if(three.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                three.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                three.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            three.setText(value);//These codes are for uploading text on the button
            c=0;//It defines c variable named "c" and initializes it with 0
            change();//When c is passed to the change() method, a copy of value of x  is passed.
        }
        else if(five.getText().equals(six.getText())&&four.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                seven.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                seven.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            seven.setText(value);//These codes are for uploading text on the button
            g=0;//It defines g variable named "g" and initializes it with 0
            change();//When g is passed to the change() method, a copy of value of x  is passed.
        }
        else if(four.getText().equals(five.getText())&&six.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                six.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                six.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            six.setText(value);//These codes are for uploading text on the button
            f=0;//It defines f variable named "f" and initializes it with 0
            change();//When f is passed to the change() method, a copy of value of x  is passed.
        }
        else if(one.getText().equals(three.getText())&&two.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                two.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                two.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            two.setText(value);//These codes are for uploading text on the button
            b=0;//It defines b variable named "b" and initializes it with 0
            change();//When b is passed to the change() method, a copy of value of x  is passed.
        }
        else if(one.getText().equals(two.getText())&&three.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                three.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                three.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            three.setText(value);//These codes are for uploading text on the button
            c=0;//It defines c variable named "c" and initializes it with 0
            change();//When c is passed to the change() method, a copy of value of x  is passed.
        }
        else if(one.getText().equals(four.getText())&&seven.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                seven.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                seven.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            seven.setText(value);//These codes are for uploading text on the button
            g=0;//It defines g variable named "g" and initializes it with 0
            change();//When g is passed to the change() method, a copy of value of x  is passed.
        }
        else if(three.getText().equals(six.getText())&&nine.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                nine.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                nine.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            nine.setText(value);//These codes are for uploading text on the button
            i=0;//It defines i variable named "i" and initializes it with 0
            change();//When i is passed to the change() method, a copy of value of x  is passed.
        }
        else if(three.getText().equals(nine.getText())&&six.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                seven.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                seven.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            seven.setText(value);//These codes are for uploading text on the button
            g=0;//It defines g variable named "g" and initializes it with 0
            change();//When g is passed to the change() method, a copy of value of x  is passed.
        }
        else if(three.getText().equals(nine.getText())&&nine.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                nine.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                nine.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            nine.setText(value);//These codes are for uploading text on the button
            i=0;//It defines i variable named "i" and initializes it with 0
            change();//When i is passed to the change() method, a copy of value of x  is passed.
        }
        else if(eight.getText().equals(nine.getText())&&seven.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                seven.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                seven.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            seven.setText(value);//These codes are for uploading text on the button
            g=0;//It defines g variable named "g" and initializes it with 0
            change();//When g is passed to the change() method, a copy of value of x  is passed.
        }
        else if(seven.getText().equals(eight.getText())&&nine.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                nine.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                nine.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            nine.setText(value);//These codes are for uploading text on the button
            i=0;//It defines i variable named "i" and initializes it with 0
            change();//When i is passed to the change() method, a copy of value of x  is passed.
        }
        else if(seven.getText().equals(nine.getText())&&eight.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                eight.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                eight.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            eight.setText(value);//These codes are for uploading text on the button
            h=0;//It defines h variable named "h" and initializes it with 0
            change();//When h is passed to the change() method, a copy of value of x  is passed.
        }
        else if(two.getText().equals(five.getText())&&eight.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                eight.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                eight.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            eight.setText(value);//These codes are for uploading text on the button
            h=0;//It defines h variable named "h" and initializes it with 0
            change();//When h is passed to the change() method, a copy of value of x  is passed.
        }
        else if(two.getText().equals(eight.getText())&&five.getText().equals(""))//these codes are for getting text
        {
             if(value=="X")  // these codes are for "x"
                five.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                five.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            five.setText(value);//These codes are for uploading text on the button
            e=0;//It defines e variable named "e" and initializes it with 0
            change();//When e is passed to the change() method, a copy of value of x  is passed.
        }
        else if(three.getText().equals(""))//these codes are for getting text
        {
           if(value=="X")  // these codes are for "x"
                three.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                three.setForeground(Color.blue);// I have written these codes for changing colour of the button  to blue
            three.setText(value);//These codes are for uploading text on the button
            c=0;//It defines c variable named "c" and initializes it with 0
            change();  //When c is passed to the change() method, a copy of value of x  is passed.
        }
        else if(nine.getText().equals(""))//these codes are for getting text
        {
           if(value=="X")  // these codes are for "x"
                nine.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                nine.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            nine.setText(value);//These codes are for uploading text on the button
            i=0;//It defines i variable named "i" and initializes it with 0
            change();  //When i is passed to the change() method, a copy of value of x  is passed.
        }
        else if(seven.getText().equals(""))//these codes are for getting text
        {
           if(value=="X")  // these codes are for "x"
                seven.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                seven.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            seven.setText(value);//These codes are for uploading text on the button
            g=0;//It defines g variable named "g" and initializes it with 0
            change();  //When g is passed to the change() method, a copy of value of x  is passed.
        }
        else if(four.getText().equals(""))//these codes are for getting text
        {
           if(value=="X")  // these codes are for "x"
                four.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                four.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            four.setText(value);//These codes are for uploading text on the button
            d=0;//It defines d variable named "d" and initializes it with 0
            change();  //When d is passed to the change() method, a copy of value of x  is passed.
        }
        else if(two.getText().equals(""))//these codes are for getting text
        {
           if(value=="X")  // these codes are for "x"
                two.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                two.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            two.setText(value);//These codes are for uploading text on the button
            b=0;//It defines b variable named "b" and initializes it with 0
            change();  //When b is passed to the change() method, a copy of value of x  is passed.
        }
        else if(six.getText().equals(""))//these codes are for getting text
        {
           if(value=="X")  // these codes are for "x"
                six.setForeground(Color.red);// I have written these codes for changing colour of the button to red
            else// these codes are for "y"
                six.setForeground(Color.blue);// I have written these codes for changing colour of the button to blue
            six.setText(value);//These codes are for uploading text on the button
            f=0;//It defines f variable named "f" and initializes it with 0
            change();  //When f is passed to the change() method, a copy of value of x  is passed.
        }
       
    }
    private void playerName(){
        try//A try statement is used to catch exceptions that might be thrown as your program executes. ... The statements that might throw an exception within a try block.
        {
        if(computer==1)// These codes are for computer
        {
           playerone=JOptionPane.showInputDialog(this,"Enter your name  :","player Name",JOptionPane.INFORMATION_MESSAGE).toUpperCase(); //these codes are for demonstrating message to user
           playertwo="Computer"; // these codes are for playing with computer
        }
        else// These codes are for player
        {
        playerone=JOptionPane.showInputDialog(this,"Enter the name of First Player :","player Name",JOptionPane.INFORMATION_MESSAGE).toUpperCase();//these codes are for demonstrating message to user
        playertwo=JOptionPane.showInputDialog(this,"Enter the name of Second Player :","player Name",JOptionPane.INFORMATION_MESSAGE).toUpperCase();//these codes are for demonstrating message to user
        }
        if(playerone.equals(""))// These codes are for player
        {
            playerone="Player one";// These codes are for player
        }
        if(playertwo.equals(""))// These codes are for player
        {
            playertwo="Player two";// These codes are for player
        }
        playernameone.setText(String.valueOf(playerone)+"'s Point :");//these codes are for uploading text
        playernametwo.setText(String.valueOf(playertwo)+"'s Point :");//these codes are for uploading text
        }
        catch(Exception e)//'e' is just a variable.  The 'e' variable stores an exception-type object in this case.
        {}
        
    }
    private void resetBackgound(){
        jPanel2.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel3.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel4.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel5.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel6.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel7.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel8.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel9.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
        jPanel10.setBackground(Color.WHITE);// These codes are for changing the colour of background to white
    }
    private void resetGame(){
       one.setText(""); // These codes are for clearing
        two.setText("");// These codes are for clearing
        three.setText("");// These codes are for clearing
        four.setText("");// These codes are for clearing
        five.setText("");// These codes are for clearing
        six.setText("");// These codes are for clearing
        seven.setText("");// These codes are for clearing
        eight.setText("");// These codes are for clearing
        nine.setText("");// These codes are for clearing
        a=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        b=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        c=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        d=1;e=1;f=1;g=1;h=1;i=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        
        change();//When these are passed to the change() method, a copy of value of they are passed.
        
    }
    private void xWin()//I wrote these codes because when "x" won the game demonstrating "x" will start the game and "x" won the game
    {
       turn.setText("");//these codes are for starting the game again
       JOptionPane.showMessageDialog(null, String.valueOf(playerone)+" wins the Match");//These codes are for showing the message that "X" won the game
       JOptionPane.showMessageDialog(null, String.valueOf(playerone)+" starts the Game");//These codes are for showing the message that "X" start the game
       count1++;//count++ is post increment where ++count is pre increment. suppose you write count++ means value increase after execute this statement. but in case ++count value will increase while executing this line.
       point1.setText(String.valueOf(count1));// I wrote these codes for uploading the text 
       resetGame();//these codes are for starting the game again
       resetBackgound();//These codes are for reseting background again
       win=0;//these codes are for player who won the match
    }
    private void yWin()//I wrote these codes because when "y" won the game demonstrating "x" will start the game and "y" won the game
    {
       turn.setText("");//these codes are for starting the game again
       JOptionPane.showMessageDialog(null, String.valueOf(playertwo)+" wins the Match");//These codes are for showing the message that "Y" won the game
       JOptionPane.showMessageDialog(null, String.valueOf(playertwo)+" starts the Game");//These codes are for showing the message that "Y" start the game
       count2++;//count++ is post increment where ++count is pre increment. suppose you write count++ means value increase after execute this statement. but in case ++count value will increase while executing this line.
       point2.setText(String.valueOf(count2));// I wrote these codes for uploading the text 
       resetGame();//these codes are for starting the game again
       resetBackgound();//These codes are for reseting background again
       win=0;//these codes are for player who won the match
       if(singleplayer==1)// These codes are for computer
       {
           computerMove();// When user clicked on single player for playing with computer
       }
    }
    private void whowin(){
       String label1=one.getText();//These codes are for geting text from one
       String label2=two.getText();//These codes are for geting text from two
       String label3=three.getText();//These codes are for geting text from three
       String label4=four.getText();//These codes are for geting text from four
       String label5=five.getText();//These codes are for geting text from five
       String label6=six.getText();//These codes are for geting text from six
       String label7=seven.getText();//These codes are for geting text from seven
       String label8=eight.getText();//These codes are for geting text from eight
       String label9=nine.getText();//These codes are for geting text from nine
       
       if(label1=="X" &&label2=="X" &&label3=="X") // If X won the match for changing colour of the labels
       {
           jPanel2.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel3.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel4.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label4=="X" &&label5=="X" &&label6=="X")// If X won the match for changing colour of the labels
       {
           jPanel5.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel8.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label7=="X" &&label8=="X" &&label9=="X")// If X won the match for changing colour of the labels
       {
           jPanel6.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel9.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel10.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label1=="X" &&label4=="X" &&label7=="X")// If X won the match for changing colour of the labels
       {
           jPanel2.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel5.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel6.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label2=="X" &&label5=="X" &&label8=="X")// If X won the match for changing colour of the labels
       {
           jPanel3.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel9.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label3=="X" &&label6=="X" &&label9=="X")// If X won the match for changing colour of the labels
       {
           jPanel4.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel8.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel10.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label1=="X" &&label5=="X" &&label9=="X")// If X won the match for changing colour of the labels
       {
           jPanel2.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel10.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label3=="X" &&label5=="X" &&label7=="X")// If X won the match for changing colour of the labels
       {
           jPanel4.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel6.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==1)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       
       
       else if(label1=="O" &&label2=="O" &&label3=="O")// If O won the match for changing colour of the labels
       {
           jPanel2.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel3.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel4.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label4=="O" &&label5=="O" &&label6=="O")// If O won the match for changing colour of the labels
       {
           jPanel5.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel8.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label7=="O" &&label8=="O" &&label9=="O")// If O won the match for changing colour of the labels
       {
           jPanel6.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel9.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel10.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label1=="O" &&label4=="O" &&label7=="O")// If O won the match for changing colour of the labels
       {
           jPanel2.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel5.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel6.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label2=="O" &&label5=="O" &&label8=="O")// If O won the match for changing colour of the labels
       {
           jPanel3.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel9.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label3=="O" &&label6=="O" &&label9=="O")// If O won the match for changing colour of the labels
       {
           jPanel4.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel8.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel10.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label1=="O" &&label5=="O" &&label9=="O")// If O won the match for changing colour of the labels
       {
           jPanel2.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel10.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(label3=="O" &&label5=="O" &&label7=="O")// If O won the match for changing colour of the labels
       {
           jPanel4.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel6.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           jPanel7.setBackground(Color.YELLOW);//These codes are for setting the colour of background to yellow
           if(drawby==0)//When "X" completed one line user who choosed the "X" will win the match
              xWin();// These codes are for showing that x win
           else//When "O" completed one line user who choosed the "O" will win the match
              yWin();// These codes are for showing that y win
       }
       else if(!(one.getText()=="" || two.getText()=="" || three.getText()=="" || four.getText()=="" || five.getText()=="" || six.getText()=="" || seven.getText()=="" || eight.getText()=="" || nine.getText()==""))//these codes are for geting text
       {
        JOptionPane.showMessageDialog(null, "Match is Draw");//These codes are for showing that "Match is draw"
        win=0;//these codes are showing that no one has won the match
        turn.setText("");//these codes are for deleting turn
        if(drawby==1)// who won the last match this player will start the game
        {
           if(value=="X")// If x won the last match "X" will start the game
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");//These codes are for demonstrating that player two will start the game
              resetGame();//These codes are for reseting the game
              if(singleplayer==1)// these codes are for single player
              {
                  computerMove();// I have written these codes for showing that computer will move
              }
           }
           else// these codes are for double player
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game");//These codes are for demonstrating that player one will start the game
              resetGame();//These codes are for reseting the game
           }
        }
        else//these codes are for player two
        {
           if(value=="O")// If O won the last match "O" will start the game
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");//These codes are for demonstrating that player two will start the game
              resetGame();//These codes are for reseting the game
              if(singleplayer==1)// these codes are for single player
              {
                  computerMove();// I have written these codes for showing that computer will move
              }
           }
           else// these codes are for double player
           {
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game"); //These codes are for demonstrating that player one will start the game
              resetGame();
           }
        }
           count3++;//count++ is post increment where ++count is pre increment. suppose you write count++ means value increase after execute this statement. but in case ++count value will increase while executing this line.
           draw.setText(String.valueOf(count3));// These codes are for setting text on the draw
       }
    }
    
    
    private void change(){
        if(doubleplayer==1)// I wrote these codes for playing another player
        {
            if(drawby==1)// these codes are for filling the line
            {
                if(value=="X")//These codes are for player who choosed "X"
                {
                    turn.setForeground(Color.blue);//These codes are for "X" when player played  in the screen he/she will see colour is blue
                    turn.setText(playertwo+"'s turn");// These coes are for showing that now player two's turn it is.
                }
                else//These codes are for player who choosed "O"
                {
                    turn.setForeground(Color.red);//These codes are for "X" when player played  in the screen he/she will see colour is red
                    turn.setText(playerone+"'s turn");// These coes are for showing that now player one's turn it is.
                }  
            }
            else// these codes are for double player
            {
                //
                if(value=="O") // these codes are for "O"
                {
                    turn.setForeground(Color.red); // This code is written for changing the color of foreground
                    turn.setText(playertwo+"'s turn"); //setText( ) method is used to set this message
                }
                else//these codes are for "X"
                {
                    turn.setForeground(Color.blue); // This code is written for changing the color of foreground
                    turn.setText(playerone+"'s turn"); // //setText( ) method is used to set this message
                }
            }
        }
            if(value.equals("X"))// these codes are for writing "X" in fifth line
            {
                value="O";// these codes are for "O"
               
            }   
            else// these codes are for writing "O" in fifth line
            {
                value="X";// these codes are for "X"
                
            }
          
    }
    private void checksymbol(){
       
        JOptionPane.showMessageDialog(null, String.valueOf(playerone)+" Select symbol firstly"); /*
                                                                                                   This code is written for poping up message on the user's screen.
                                                                                                   When the user starts the game without choosing symbol.It will be displayed.
                                                                                                 */
    }
    private void checkplayer(){
       JOptionPane.showMessageDialog(null, "Firstly select single player or double player"); /*
                                                                                                This code is written for poping up message on the user's screen.
                                                                                                When the user starts the game without choosing single or double player options. It will be displayed.
                                                                                              */
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reset = new javax.swing.JButton();
        restart = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        playernameone = new javax.swing.JLabel();
        playernametwo = new javax.swing.JLabel();
        point1 = new javax.swing.JLabel();
        point2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        draw = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        one = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        two = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        three = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        four = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        seven = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        five = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        six = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        eight = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        nine = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        single = new javax.swing.JRadioButton();
        doublep = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        x = new javax.swing.JRadioButton();
        o = new javax.swing.JRadioButton();
        turn = new javax.swing.JLabel();
        showsymbolo = new javax.swing.JLabel();
        showsymbolx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe by Rahim");
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        reset.setBackground(new java.awt.Color(0, 0, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET TABLE");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(0, 102, 51));
        restart.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        restart.setForeground(new java.awt.Color(255, 255, 255));
        restart.setText("START AGAIN");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(0, 204, 204));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));

        playernameone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playernameone.setForeground(new java.awt.Color(255, 255, 51));
        playernameone.setText("Player One's Point :");

        playernametwo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playernametwo.setForeground(new java.awt.Color(255, 153, 0));
        playernametwo.setText("Player two's Point:");

        point1.setBackground(new java.awt.Color(255, 255, 255));
        point1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        point1.setForeground(new java.awt.Color(255, 255, 0));
        point1.setText("0");

        point2.setBackground(new java.awt.Color(255, 255, 255));
        point2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        point2.setForeground(new java.awt.Color(255, 153, 0));
        point2.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("SCORE BOARD");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Match Draw :");

        draw.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        draw.setText("0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(playernametwo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(point2))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(playernameone, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(point1))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(draw)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(point1)
                    .addComponent(playernameone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(point2)
                    .addComponent(playernametwo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(draw))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        one.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        three.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 30, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        four.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        four.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 148, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        seven.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        seven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 266, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        five.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        five.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 148, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        six.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        six.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 148, -1, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        eight.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        eight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 266, -1, 100));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        nine.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        nine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nine, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 266, -1, -1));

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Select Players");

        single.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        single.setForeground(new java.awt.Color(51, 255, 51));
        single.setText("Single Player");
        single.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleActionPerformed(evt);
            }
        });

        doublep.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        doublep.setForeground(new java.awt.Color(255, 0, 0));
        doublep.setText("Double Players");
        doublep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublepActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Select Symbol :");

        x.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        x.setForeground(new java.awt.Color(255, 0, 0));
        x.setText(" X");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        o.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        o.setForeground(new java.awt.Color(51, 51, 255));
        o.setText(" O");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(single, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(doublep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(single)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doublep)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(x)
                            .addComponent(o))
                        .addContainerGap(109, Short.MAX_VALUE))))
        );

        turn.setFont(new java.awt.Font("Engravers MT", 3, 18)); // NOI18N
        turn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        showsymbolo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        showsymbolo.setForeground(new java.awt.Color(0, 0, 255));
        showsymbolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        showsymbolx.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        showsymbolx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("Tic Tac Toe by Rahim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(restart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(exit)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(showsymbolx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(showsymbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(reset))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(restart)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showsymbolx, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showsymbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
//This "Reset Table" belongs to only table
        
        one.setText(""); //setText("") is used clearing the data
       
        two.setText(""); //setText("") is used clearing the data
      
        three.setText(""); //setText("") is used clearing the data
       
        four.setText(""); //setText("") is used clearing the data
        
        five.setText(""); //setText("") is used clearing the data
        
        six.setText(""); //setText("") is used clearing the data
        
        seven.setText(""); //setText("") is used clearing the data
       
        eight.setText(""); //setText("") is used clearing the data
         
        nine.setText(""); //setText("") is used clearing the data
        
        change();
        a=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        b=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        c=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        d=1;e=1;f=1;g=1;h=1;i=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
       
        if(drawby==1)
        {
          if(value=="X")  // if to specify a block of code to be executed, if a specified condition is true
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game");  /*
                                                                                                        This code is written for poping up the message on the user's screen 
                                                                                                        JOptionPane is used for this purpose
                                                                                                     */ 
          else //else is used to specify a block of code to be executed, if the same condition is false
             JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");  /*
                                                                                                       This code is written for poping up the message on the user's screen 
                                                                                                       JOptionPane is used for this purpose
                                                                                                    */
        }
        else //else is used to specify a block of code to be executed, if the same condition is false
        {
          if(value=="X") // if to specify a block of code to be executed, if a specified condition is true
              JOptionPane.showMessageDialog(null,String.valueOf(playertwo)+" will start the game");/*
                                                                                                     This code is written for poping up the message on the user's screen 
                                                                                                     JOptionPane is used for this purpose
                                                                                                   */ 
          else //else is used to specify a block of code to be executed, if the same condition is false
              JOptionPane.showMessageDialog(null,String.valueOf(playerone)+" will start the game"); /*
                                                                                                      This code is written for poping up the message on the user's screen 
                                                                                                      JOptionPane is used for this purpose
                                                                                                    */ 
        }
        count3++;
        draw.setText(String.valueOf(count3));// These codes are for uploading text on the textfield
        if(singleplayer==1)// these codes are for player one
        {
            computerMove();// These codes are for playing with computer
        }
    }//GEN-LAST:event_resetActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
 frame=new JFrame(); // this code is written for creating new JFrame 

// if is written to specify a block of code to be executed, if a specified condition is true
 if(JOptionPane.showConfirmDialog(frame,"Are you sure want to restart the game ? Your previous game and data is lost","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)/*
                                                                                                                                                                                             This code is written for poping up the message on the user's screen 
                                                                                                                                                                                             JOptionPane is used for this purpose
                                                                                                                                                                                           */  
     {
        one.setText(""); //setText("") is used clearing the data
        two.setText(""); //setText("") is used clearing the data
        three.setText(""); //setText("") is used clearing the data
        four.setText(""); //setText("") is used clearing the data
        five.setText(""); //setText("") is used clearing the data
        six.setText("");//setText("") is used clearing the data
        seven.setText(""); //setText("") is used clearing the data
        eight.setText(""); //setText("") is used clearing the data
        nine.setText(""); //setText("") is used clearing the data
        a=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        b=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        c=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        d=1;e=1;f=1;g=1;h=1;i=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        count1=0;count2=0;count3=0;
        point1.setText("0"); //setText("") is used to set "0"
        point2.setText("0");  //setText( ) is used to set "0"
        draw.setText("0"); //setText( ) is used to set "0"
        value="";//These codes are for resseting value
        player=0; //the data will be cleared
        doubleplayer=0; //the data will be cleared
        singleplayer=0; //the data will be cleared
        drawby=0; //the data will be cleared
        symbol=1; //If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        resetBackgound();//These codes are for reseting background
        o.setSelected(false);  //setSelected(false) method means this button is not to be selected
        x.setSelected(false); //setSelected(false) method means this button is not to be selected
        single.setSelected(false); //setSelected(false) method means this button is not to be selected
        doublep.setSelected(false); //setSelected(false) method means this button is not to be selected
        playernameone.setText("Player one's point"); // setText( ) is used to set "Player one's point" on the playernameone 
        playernametwo.setText("Player two's point"); // setText( ) is used to set "Player two's point" on the playernametwo
        computer=0; //the data will be cleared
        win=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
        turn.setText(""); //setText("") is used clearing the data
        showsymbolx.setText(""); //setText("") is used clearing the data
        showsymbolo.setText(""); //setText("") is used clearing the data
        playerone="Player One"; //the data will be deleted and it will be convereted to Player One
        playertwo="Player Two"; //the data will be deleted and it will be convereted to Player Two
        }
    }//GEN-LAST:event_restartActionPerformed

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        
        
        if(player==1)//these codes are for player 1
        {
          if(symbol==0) // These codes are for "0"
          {
          if(a==1)//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          { 
            if(value=="X")  //These codes are for "X"
                one.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else//These codes are for "0"
                one.setForeground(Color.blue);// these codes are for setting the colour of background
            one.setText(value);//These codes are for uploading text on the textfield
            a=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// These codes are for changing
            whowin();// These codes are for showing who win
            if(singleplayer==1&&win==1)//These codes are for play who choosed single player
                computerMove();//These codes are for playing with computer
          }
          }
          else//These codes are for player who choosed double player
              checksymbol();// these codes are for checking symbol
        }
        else//These codes are for player who choosed single player
            checkplayer();// I wrote these codes for checking player
        whowin();//These codes are for showing who win
    }//GEN-LAST:event_oneMouseClicked

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
       
        if(player==1)//these codes are for player 1
        {
          if(symbol==0)// These codes are for "0"
          {    
          if(b==1)//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // These codes are for player who choosed "X"
                two.setForeground(Color.red);// These codes are for changing foreground colour to red
            else//these codes are for player who choose "0"
                two.setForeground(Color.blue);// These codes are for changing the colour of foreground to blue  
            two.setText(value);// These codes are for uploading text on a textfield
            b=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change(); //these codes are for changing
            whowin();//these codes are for finding who win the match
            if(singleplayer==1&&win==1)//these codes are for player one and who win the match
                computerMove();// These codes are for playing with computer
          }
          }
          else//these codes are player two and who win the match
              checksymbol();// these codes are for checking symbol
        }
        else//these codes are for player who play with another player
            checkplayer();// These codes are for checking player
         whowin();//these codes are for checking who win the match
    }//GEN-LAST:event_twoMouseClicked

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
      
         if(player==1)//these codes are for player one
        {
          if(symbol==0)// these codes are for player who choosed "0"
          {
          if(c==1)////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
                three.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else//these codes are for player who choosed "O"
                three.setForeground(Color.blue);// these codes are for changing the colour of foreground to blue
            three.setText(value);//these codes are for uploading text to the textfield
            c=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for single player and who win the match
                computerMove();// These codes are for playing with computer
          }
          }
          else//these codes are playing with another player and at the same time win the match
              checksymbol();//these codes are for checking the symbol
        }
        else// these codes are for playing with computer and win the match
            checkplayer();//these codes are for checking the player 
         whowin();// these codes are fot for checking who win the match
    }//GEN-LAST:event_threeMouseClicked

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
       
         if(player==1)//these codes are for player one
        {
          if(symbol==0)// these codes are for player who choosed "O"
            {
          if(d==1)//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
                four.setForeground(Color.red);//these codes are for changing the colour of foregrounf to red
            else//these codes are for player who chossed "O"
                four.setForeground(Color.blue);// these codes are for changing the colour of foregrounf to blue
            four.setText(value);// these codes are for setting text on the textfield
            d=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;//If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for  single player and who win the match 
                computerMove();// these codes are for playing with computer
          }
          }
          else// these codes are for playing with another player and for player who win the match
              checksymbol();// these codes are for checking the symbol
        }
        else// these codes are for player who play with another person
            checkplayer();// these codes are for checking player
         whowin();// these codes are for checking who win the match
    }//GEN-LAST:event_fourMouseClicked

    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
       
         if(player==1)// these codes are for player 1
        {
          if(symbol==0)// these codes are for player who chossed "O"
          {
          if(e==1)////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
                five.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else// these codes are for player who choosed "O"
                five.setForeground(Color.blue);// these codes are for changing the colour of foreground to blue
            five.setText(value);//these codes are for uploading the text to the textfield or button
            e=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for player who choosed single player and win the match
                computerMove();// these codes are for playing with computer
          }
          }
          else// these codes are for player who play with another player and win the match
              checksymbol();// these codes are for checking the symbol
        }
        else// these codes are for player who play with another player
            checkplayer();// these codes are for checking the player
         whowin();// these codes are for checking who win the match
    }//GEN-LAST:event_fiveMouseClicked

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
       
            if(player==1)// these codes are for player 1
        {
          if(symbol==0)// these codes are for player who chossed "O"
          {
          if(f==1)////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
              six.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else// these codes are for player who choosed "O"
               six.setForeground(Color.blue);// these codes are for changing the colour of foreground to blue
            six.setText(value);//these codes are for uploading the text to the textfield or button
            f=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for player who choosed single player and win the match
                computerMove();// these codes are for playing with computer
          }
          }
          else// these codes are for player who play with another player and win the match
              checksymbol();// these codes are for checking the symbol
        }
        else// these codes are for player who play with another player
            checkplayer();// these codes are for checking the player
         whowin();// these codes are for checking who win the match
    }//GEN-LAST:event_sixMouseClicked

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
      
           if(player==1)// these codes are for player 1
        {
          if(symbol==0)// these codes are for player who chossed "O"
          {
          if(g==1)////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
                seven.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else// these codes are for player who choosed "O"
                seven.setForeground(Color.blue);// these codes are for changing the colour of foreground to blue
           seven.setText(value);//these codes are for uploading the text to the textfield or button
            g=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for player who choosed single player and win the match
                computerMove();// these codes are for playing with computer
          }
          }
          else// these codes are for player who play with another player and win the match
              checksymbol();// these codes are for checking the symbol
        }
        else// these codes are for player who play with another player
            checkplayer();// these codes are for checking the player
         whowin();// these codes are for checking who win the match
    }//GEN-LAST:event_sevenMouseClicked

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
       
           if(player==1)// these codes are for player 1
        {
          if(symbol==0)// these codes are for player who chossed "O"
          {
          if(h==1)////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
                eight.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else// these codes are for player who choosed "O"
                eight.setForeground(Color.blue);// these codes are for changing the colour of foreground to blue
            eight.setText(value);//these codes are for uploading the text to the textfield or button
            h=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for player who choosed single player and win the match
                computerMove();// these codes are for playing with computer
          }
          }
          else// these codes are for player who play with another player and win the match
              checksymbol();// these codes are for checking the symbol
        }
        else// these codes are for player who play with another player
            checkplayer();// these codes are for checking the player
         whowin();// these codes are for checking who win the match
    }//GEN-LAST:event_eightMouseClicked

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
          if(player==1)// these codes are for player 1
        {
          if(symbol==0)// these codes are for player who chossed "O"
          {
          if(i==1)////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
          {
            if(value=="X")  // these codes are for player who choosed "X"
                nine.setForeground(Color.red);// these codes are for changing the colour of foreground to red
            else// these codes are for player who choosed "O"
                nine.setForeground(Color.blue);// these codes are for changing the colour of foreground to blue
            nine.setText(value);//these codes are for uploading the text to the textfield or button
            i=0;//'0' is the char value of zero. When you write a string, you're writing an array of 'char' datatypes which the compiler translates into ASCII 
            win=1;////If you cast the letters to an int , add 1, and then cast back to a char , the letter will increase by 1 
            change();// these codes are for changing
            whowin();// these codes are for checking who win the match
            if(singleplayer==1&&win==1)// these codes are for player who choosed single player and win the match
                computerMove();// these codes are for playing with computer
          }
          }
          else// these codes are for player who play with another player and win the match
              checksymbol();// these codes are for checking the symbol
        }
        else// these codes are for player who play with another player
            checkplayer();// these codes are for checking the player
         whowin();// these codes are for checking who win the match
    }//GEN-LAST:event_nineMouseClicked

    private JFrame frame; //private variable is declared
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
     
        frame = new JFrame("Exit"); // this code is written for creating new JFrame 
        
       //if is written to specify a block of code to be executed, if a specified condition is true
        if(JOptionPane.showConfirmDialog(frame,"Are you sure want to Exit"," Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) /*
                                                                                                                                                   This code is written for poping up the message on the user's screen 
                                                                                                                                                   JOptionPane is used for this purpose
                                                                                                                                                 */
        {
       
            System.exit(0); //System will be closed
        
        }
    }//GEN-LAST:event_exitActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed

        if(symbol==1) /*
        Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
        */

        {
            value="O"; //this code means that value string is equal to "O"

            symbol=0; // denotes the empty set or null set

            drawby=0; //denotes the empty set or null set

            o.setSelected(true); //setSelected(true) method means this button is to be selected

            x.setSelected(false); //setSelected(false) method means this button is not to be selected

            JOptionPane.showMessageDialog(null,playerone+" selected symbol 'O' and "+playertwo+" selected symbol 'X'\n"+playerone+" ,plese, start the game.");
            /*
            This code is written for displaying message on the user's screen.
            It is written with the help of JOptionPane method.
            */

            turn.setForeground(Color.blue); // This code is written for changing the color of foreground

            turn.setText(String.valueOf(playerone+" turn")); /*
            valueOf returns the string representation of the boolean argument.
            In the turn label it will be displayed what is written as a player one string and turn message
            */
            showsymbolx.setForeground(Color.blue); // This code is written for changing the color of foreground of showsymbolx label to blue

            showsymbolo.setText(playerone+" = 'O'");/*
            setText( ) method is written to set the message on the showsymbolo label
            It will display the integer playerone = 'O'
            */

            showsymbolx.setForeground(Color.red);  // This code is written for changing the color of foreground of showsymbolx label to red

            showsymbolx.setText(playertwo+" = 'X'");/*
            setText( ) method is written to set the message on the showsymbolx label
            It will display the integer playertwo = 'X'
            */

        }
        else
        {

            o.setSelected(false); //setSelected(false) method means this button is not to be selected

            JOptionPane.showMessageDialog(null,"Once it is selected"); /*
            This code is written for displaying message on the user's screen.
            It will be displayed when the user clicks it for the second after selecting it
            */
        }

        if(doubleplayer==1)

        {
            if(value=="X") // if to specify a block of code to be executed, if a specified condition is true
            {
                turn.setForeground(Color.red);// This code is written for changing the color of foreground of turn label to red

                turn.setText(playerone+"'s turn");/*
                setText( ) method is written to set the message on the turn label
                It will display the integer playerone turn
                */
            }
            else //else to specify a block of code to be executed, if the same condition is false
            {
                turn.setForeground(Color.blue); // This code is written for changing the color of foreground of turn label to blue

                turn.setText(playerone+"'s turn"); /*
                setText( ) method is written to set the message on the turn label
                It will display the integer playerone turn
                */
            }
        }

    }//GEN-LAST:event_oActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed

        if(symbol==1)/*
        Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
        */
        {
            value="X";//this code means that value string is equal to "X"

            symbol=0; // denotes the empty set or null set

            drawby=1; //this code means that value string is equal to "1"

            x.setSelected(true); //setSelected(true) method means this button is to be selected

            o.setSelected(false); //setSelected(false) method means this button is not to be selected

            JOptionPane.showMessageDialog(null,playerone+" selected symbol 'X' and "+playertwo+" selected symbol 'O'\n"+playerone+",plese, start the game.");  /*
            This code is written for displaying message on the user's screen.
            It is written with the help of JOptionPane method.
            */

            showsymbolx.setForeground(Color.red); // This code is written for changing the color of foreground of showsymbolx label to red

            showsymbolx.setText(playerone+" = 'X'");/*
            setText( ) method is written to set the message on the showsymbolx label
            It will display the integer playerone = 'X'
            */

            showsymbolo.setForeground(Color.blue); // This code is written for changing the color of foreground of showsymbolo label to blue

            showsymbolo.setText(playertwo+" = 'O'"); /*
            setText( ) method is written to set the message on the showsymbolo label
            It will display the integer playertwo = 'O'
            */

            turn.setForeground(Color.red); // This code is written for changing the color of foreground

            turn.setText(String.valueOf(playerone+"'s turn")); /*
            valueOf returns the string representation of the boolean argument.
            In the turn label it will be displayed what is written as a player one string and turn message
            */
        }

        else//These codes are for "0"

        {

            x.setSelected(false); //setSelected(false) method means this button is not to be selected

            JOptionPane.showMessageDialog(null,"Once it is selected"); /*
            This code is written for displaying message on the user's screen.
            It will be displayed when the user clicks it for the second after selecting it
            */
        }

        if(doubleplayer==1)

        {
            if(value=="X") // if to specify a block of code to be executed, if a specified condition is true
            {
                turn.setForeground(Color.red); // This code is written for changing the color of foreground of turn label to red

                turn.setText(playerone+"'s turn");/*
                setText( ) method is written to set the message on the turn label
                It will display the integer playerone turn
                */
            }

            else //else to specify a block of code to be executed, if the same condition is false

            {
                turn.setForeground(Color.blue); // This code is written for changing the color of foreground of turn label to blue

                turn.setText(playerone+"'s turn"); /*
                setText( ) method is written to set the message on the turn label
                It will display the integer playerone turn
                */
            }
        }

    }//GEN-LAST:event_xActionPerformed

    private void doublepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doublepActionPerformed

        if(singleplayer==0)  // if to specify a block of code to be executed, if a specified condition is true
        {
            player=1; //player will be executed
            doubleplayer=1; //doubleplayer will be executed
            playerName();
            doublep.setSelected(true);   //setSelected(true) method means this button is to be selected
            single.setSelected(false);  //setSelected(true) method means this button is not to be selected
            turn.setForeground(Color.blue);// This code is written for changing the color of foreground of turn label to blue
            turn.setText(String.valueOf(playerone)+",plese, select symbol");/*
            valueOf returns the string representation of the boolean argument.
            In the turn label it will be displayed what is written as a player one string and plese, select symbol! message
            */
        }
        else //else to specify a block of code to be executed, if the same condition is false

        {
            doublep.setSelected(false); //setSelected(true) method means this button is not to be selected

            JOptionPane.showMessageDialog(null,"Once it is selected"); /*
            This code is written for poping up the message on the user's screen
            JOptionPane is used for this purpose
            */

        }
    }//GEN-LAST:event_doublepActionPerformed

    private void singleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleActionPerformed

        if(doubleplayer==0) // if to specify a block of code to be executed, if a specified condition is true
        {
            computer=1; //computer will be executed
            player=1; //player will be executed
            singleplayer=1; //singleplayer will be executed
            single.setSelected(true); //setSelected(true) method means this button is to be selected
            doublep.setSelected(false); //setSelected(true) method means this button is not to be selected
            playerName();
            turn.setForeground(Color.blue); // This code is written for changing the color of foreground of turn label to blue
            turn.setText(String.valueOf(playerone)+" plese, select symbol!");/*
            valueOf returns the string representation of the boolean argument.
            In the turn label it will be displayed what is written as a player one string and plese, select symbol! message
            */
        }
        else //else to specify a block of code to be executed, if the same condition is false

        {
            single.setSelected(false); //setSelected(true) method means this button is not to be selected

            JOptionPane.showMessageDialog(null,"Once it is selected"); /*
            This code is written for poping up the message on the user's screen
            JOptionPane is used for this purpose
            */
        }

    }//GEN-LAST:event_singleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton doublep;
    private javax.swing.JLabel draw;
    private javax.swing.JLabel eight;
    private javax.swing.JButton exit;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel nine;
    private javax.swing.JRadioButton o;
    private javax.swing.JLabel one;
    private javax.swing.JLabel playernameone;
    private javax.swing.JLabel playernametwo;
    private javax.swing.JLabel point1;
    private javax.swing.JLabel point2;
    private javax.swing.JButton reset;
    private javax.swing.JButton restart;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel showsymbolo;
    private javax.swing.JLabel showsymbolx;
    private javax.swing.JRadioButton single;
    private javax.swing.JLabel six;
    private javax.swing.JLabel three;
    private javax.swing.JLabel turn;
    private javax.swing.JLabel two;
    private javax.swing.JRadioButton x;
    // End of variables declaration//GEN-END:variables
}
