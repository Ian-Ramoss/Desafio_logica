package application;

public class Program {
	 
	public static void main(String[] args) {
/* Desenvolver a tabuada do 1 ao 10 de forma que a saída seja em 
 * um quadrado grande com cada tabuada separada lateralmente, 5 em cima e 
 * 5 em baixo. -->   ---------
 * 					| |	| | | | 
 * 					 ---------	
 *                  | | | | | |  
 *                   ---------     */	
		
		
		for (int i = 1; i <= 40; i++ ) {
			System.out.print(" _");
			for (int j = 0; j <= 40; j++ ) {
				
			}
		}
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.println();
			for (int j = 1; j <= 5; j++) {
				System.out.print("|  " + j + " * " + i + " = "); 
				if (i <= 9) {
					if ((i * j) >= 10) {
						System.out.print(i * j + "   ");
					}else {
						System.out.print(i * j + "    ");
					}
				} else {
					System.out.print(i * j + "  ");
				}
			}
			System.out.print(" |");
		}
			
		System.out.println();
		for (int i = 1; i <= 40; i++ ) {
			System.out.print(" _");
			for (int j = 0; j <= 40; j++ ) {
				
			}
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.println();
			for (int j = 6; j <= 10; j++) {
				System.out.print("|  " + j + " * " + i + " = "); 
				if (i <= 9) {
					if ((i * j) >= 10) {
						if (j >= 10) {
							System.out.print(i * j + "  ");
						} else {
							System.out.print(i * j + "   ");
						}
					} else {
						System.out.print(i * j + "    ");
					}
				} else if ((i * j) >= 99){
					System.out.print(i * j + "");
				} else {
					System.out.print(i * j + "  ");
				}
			}
			System.out.print(" |");
		}		
	}
}
