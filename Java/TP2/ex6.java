import java.util.Scanner;

/*
Stefany Lisboa 3005551
 */

public class ex6 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);

 String[][] mat = new String[2][3];

for(int i=0; i<2; i++){
 
    for(int j=0; j<3; j++){
        System.out.println("Digite o valor da linha " + i + " coluna " + j);
        mat[i][j] = scanner.next();

    }
}
 
System.out.println("");
System.out.println("Matriz");
for(int i=0; i<2; i++){
    
    for(int j=0; j<3; j++){
        System.out.print( mat[i][j] +  " ");
    }
    System.out.println("");
}


 scanner.close();
    }
}