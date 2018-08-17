package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    boolean isInWord(char a, String b){
        return .contains(Character.toString(a));
    }
    void reveal(char a){
        int i = 0;
        for( letter : guess){
            if (a== revealed.charAt(letter))
        }
    }
    String guess;
    String revealed;

}
class word{
    public char[] getTheWord() {
        return theWord;
    }

    public void setTheWord(char[] theWord) {
        this.theWord = theWord;
    }

    public char[] getRevealed() {
        return revealed;
    }

    public void setRevealed(char[] revealed) {
        this.revealed = revealed;
    }

    char[] theWord;
    char[] revealed;
    word(String a){
        theWord = new char[a.size()];
        revealed = new char[a.size()];
        theWord = a.toCharArray();
        for(character:revealed)character = "-";

    }
}
