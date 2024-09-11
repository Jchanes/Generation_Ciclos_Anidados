import javax.print.attribute.standard.PrinterLocation;

public class TrianguloCiclo {
	public static void main(String[] args) {
//		do {
//			for(x=6; x>=1 ; x --) {
//				System.out.print("*");
//				for(y=1;y<=6;y++){
//					System.out.print("+");
//				}//for y
//			}//for x
//			
//		} while(x>0);//dowhile
		
		for(int x=6 ; x>=0 ; x--) {
			for(int y=0 ; y<=x ; y++){
				System.out.print("* ");
			}//fory
			System.out.println();
		}//forx

		
	}//main
}//class TrianguloCiclo
