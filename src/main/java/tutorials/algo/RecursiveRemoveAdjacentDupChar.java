package src.main.java.tutorials.algo;
/*
 * Author : Pankaj Kumar
 *
 */

public class RecursiveRemoveAdjacentDupChar {

    public String removeAdjDupChar(String str, int currIndex, int len){
        int firstEndIndex=0;
        if(currIndex==len || len==1)
            return str;
        if(currIndex!=0){
            if((str.charAt(currIndex)==str.charAt(currIndex-1))) {
                firstEndIndex=currIndex-1;
                for(int i=firstEndIndex; i<len-1; i++){
                    if(str.charAt(i)==str.charAt(currIndex))
                        currIndex++;
                    else
                        break;
                }
                str = str.substring(0, firstEndIndex).concat(str.substring(currIndex));
                return removeAdjDupChar(str, firstEndIndex, str.length());
            }

        }
        return removeAdjDupChar(str, currIndex+1, len);
    }

    public static void main(String[] args) {
        String s = "geeksforgeeg";
        //String s = "acaaabbbacdddd";
        RecursiveRemoveAdjacentDupChar rmAdjDupChar = new RecursiveRemoveAdjacentDupChar();
        System.out.println(rmAdjDupChar.removeAdjDupChar(s,0, s.length()));
    }
}
