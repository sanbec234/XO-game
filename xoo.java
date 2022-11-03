import java.util.Scanner;
import java.lang.*;

class check
{
    public int winner(char x[][], int y[]){
        int flag = 0;
        char symbol [] = new char[9];
        for(int i = 0; i<9; i++){
            if(y[i] == 1)
            {
                if(i == 0)
                {
                    symbol[i] = x[0][0];
                }
                if(i == 1){
                    symbol[i] = x[0][1];
                }
                if(i == 2){
                    symbol[i] = x[0][2];
                }
                if(i == 3){
                    symbol[i] = x[1][0];
                }
                if(i == 4){
                    symbol[i] = x[1][1];
                }
                if(i == 5){
                    symbol[i] = x[1][2];
                }
                if(i == 6){
                    symbol[i] = x[2][0];
                }
                if(i == 7){
                    symbol[i] = x[2][1];
                }
                if(i == 8){
                    symbol[i] = x[2][2];
                }
            }
        }
        if(y[0] == 1 && y[4] == 1 && y[8] == 1){
            if(symbol[0] == 'x' && symbol[4] == 'x' && symbol[8] == 'x'){
                flag = 1;
            }
            else if(symbol[0] == 'o' && symbol[4] == 'o' && symbol[8] == 'o'){
                flag = 2;
            }
        }
        if(y[0] == 1 && y[1] == 1 && y[2] == 1){
            if(symbol[0] == 'x' && symbol[1] == 'x' && symbol[2] == 'x'){
                flag = 1;
            }
            else if(symbol[0] == 'o' && symbol[1] == 'o' && symbol[2] == 'o'){
                flag = 2;
            }
        }
        if(y[0] == 1 && y[3] == 1 && y[6] == 1){
            if(symbol[0] == 'x' && symbol[3] == 'x' && symbol[6] == 'x'){
                flag = 1;
            }
            else if(symbol[0] == 'o' && symbol[3] == 'o' && symbol[6] == 'o'){
                flag = 2;
            }
        }
        if(y[2] == 1 && y[4] == 1 && y[6] == 1){
            if(symbol[2] == 'x' && symbol[4] == 'x' && symbol[6] == 'x'){
                flag = 1;
            }
            else if(symbol[2] == 'o' && symbol[4] == 'o' && symbol[6] == 'o'){
                flag = 2;
            }
        }
        if(y[2] == 1 && y[5] == 1 && y[8] == 1){
            if(symbol[2] == 'x' && symbol[5] == 'x' && symbol[8] == 'x'){
                flag = 1;
            }
            else if(symbol[2] == 'o' && symbol[5] == 'o' && symbol[8] == 'o'){
                flag = 2;
            }
        }
        if(y[6] == 1 && y[7] == 1 && y[8] == 1){
            if(symbol[6] == 'x' && symbol[7] == 'x' && symbol[8] == 'x'){
                flag = 1;
            }
            else if(symbol[6] == 'o' && symbol[7] == 'o' && symbol[8] == 'o'){
                flag = 2;
            }
        }
        if(y[3] == 1 && y[4] == 1 && y[5] == 1){
            if(symbol[3] == 'x' && symbol[4] == 'x' && symbol[5] == 'x'){
                flag = 1;
            }
            else if(symbol[3] == 'o' && symbol[4] == 'o' && symbol[5] == 'o'){
                flag = 2;
            }
        }
        return flag;
    }
}

public class xoo
{   
	public static void main(String[] args) {
        check ch = new check();
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter player A name and he will be x: ");
	    String pa = sc.nextLine(); 
	    System.out.println("enter player B name and he will be O: ");
	    String pb = sc.nextLine();
	    
		char[][] board = new char[3][3];
		int[][] board1 = new int[3][3];
		int[] flag = new int[9];
		int k = 0;
		for(int i = 0; i<3; i++){
		    for(int j = 0; j<3; j++){
		        k++;
		        board1[i][j] = k;
		    }
		}
		for(int i = 0; i<3; i++){
		        for(int j = 0; j<3; j++){
		            System.out.print(board1[i][j] + " ");
		        }
		    System.out.print("\n");   
		}
		int s = 1;
        char letter = ' ';
		while(s <= 9){
            if(s%2 == 0){
                System.out.println("\n");
                System.out.println("It's your your turn, " + pb);
            }
            if(s%2 != 0){
                System.out.println("It's your your turn, " + pa);
            }
		    System.out.println("enter the position to insert:  ");
		    int pos = sc.nextInt();

		    while(flag[pos - 1] == 1)
            {
		        System.out.println("You have already entered this position, try another position:  ");
		        pos = sc.nextInt();
		    }
            if(s%2 == 0){
                letter = 'o';
            }
            if(s%2 != 0){
                letter = 'x';
            }

		    flag[pos - 1] = 1;
		    if(pos == 1){
		        board[0][0] = letter;
		    }
		    if(pos == 2){
		        board[0][1] = letter;
		    }
		    if(pos == 3){
		        board[0][2] = letter;
		    }
		    if(pos == 4){
		        board[1][0] = letter;
		    }
		    if(pos == 5){
		        board[1][1] = letter;
		    }
		    if(pos == 6){
		        board[1][2] = letter;
		    }
		    if(pos == 7){
		        board[2][0] = letter;
		    }
		    if(pos == 8){
		        board[2][1] = letter;
		    }
		    if(pos == 9){
		        board[2][2] = letter;
		    }
		   
		    for(int i = 0; i<3; i++){
		        for(int j = 0; j<3; j++){
		            System.out.print(board[i][j] + " ");
		        }
		    System.out.print("\n");   
		    }
		 s++;
		 if(s >= 5){
		    if(ch.winner(board, flag) == 1){
                System.out.print(pb + " x is the winner! ");
                System.exit(0);
            }
            if(ch.winner(board, flag) == 2){
                System.out.print(pa + "o is the winner! ");
                System.exit(0);
            }
		 }
		}
	}
}

