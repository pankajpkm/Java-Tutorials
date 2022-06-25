package src.main.java.tutorials.algo;
/*
 * Author : Pankaj Kumar
 *
 */

public class RecursiveRemoveAdjacentDupChar {

    public String removeAdjDupChar(String str, int currIndex, int len){
        if(currIndex==len || len==1)
            return str;
        if(currIndex!=0 && !(str.charAt(currIndex)!=str.charAt(currIndex-1))){
            str = str.substring(0, currIndex - 1).concat(str.substring(currIndex+1));
            return removeAdjDupChar(str, currIndex-1, str.length());
        }
        return removeAdjDupChar(str, currIndex+1, len);
    }

    public static void main(String[] args) {
        String s = "geeksforgeeg";
        RecursiveRemoveAdjacentDupChar rmAdjDupChar = new RecursiveRemoveAdjacentDupChar();
        System.out.println(rmAdjDupChar.removeAdjDupChar(s,0, s.length()));
    }
}
