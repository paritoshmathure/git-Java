// LeetCode 657
import java.util.Scanner;

public class judgeCircle {
    public static void main(String[] args) {
        Solution circleobj = new Solution();
        System.out.println(circleobj.circle("UD"));
    }
}

class Solution{
    public boolean circle(String moves){
        int updown = 0 ;
        int leftright = 0;
        for(char move : moves.toCharArray()){
            if(move == 'U'){
                updown++;
            }
            if(move == 'D'){
                updown--;
            }
            if(move == 'R'){
                leftright++;
            }
            if(move == 'L'){
                leftright--;
            }
        }
        return updown == 0 && leftright == 0 ;
    }

}