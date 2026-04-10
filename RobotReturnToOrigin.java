import java.util.Scanner;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter move sequence (U, D, L, R): ");
        String moves = sc.nextLine().toUpperCase();
        
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'U') y++;
            else if (move == 'D') y--;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }

        if (x == 0 && y == 0) {
            System.out.println("True: Robot returned to origin.");
        } else {
            System.out.println("False: Robot is at (" + x + ", " + y + ")");
        }
        
        sc.close();
    }
}
