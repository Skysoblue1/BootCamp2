
public class BootCamp02 {

	public static void main(String[] args) {
		
	}
		
	//Task 1
	public static int smallest(int[] smallnumber){
		int min = smallnumber[0];
		
		for (int a = 0; a<smallnumber.length; a++){
			if (smallnumber[a] < min);
				min = smallnumber[a];
		}	
		return min;
	}
	//Task 2
	public static int[] populateArray(int left, int right, int count){
		int[] together = new int[count];
		for (int i = 0; i< count; i++){
			together [i] = left+i;
		}
		return together;
	}
	//Task 3 
	public static double[] populateArray(double left, double right, int count){
		double[] blue = new double[count];
		for(int b = 0; b< count; b++){
			blue[b] = left+b;
		}
		return blue;
	}
	//Task 4
	public static int[] grow(int[] large){
		int[] huge = new int [large.length*2];  
			for (int m = 0; m<large.length; m++){
				huge[m] = large[m]; 
			}
		return huge;
	}
	//Task 5 
	public static int[] shrink (int[] small){
		int[] xsmall = new int [small.length/2];
			for (int n = 0; n<small.length; n++){
				xsmall[n]= small[n];
		}
		return xsmall; 		
	}
	//Task 6 
	public static double[] grow(double[] large){
		double[] huge = new double [large.length*2];
			for(int s = 0; s< large.length; s++){
				huge[s] = large[s];
			}
		return huge;
	}
	//Task  7 
	public static double[] shrink(double[] small){
		double[] xsmall = new double [small.length/2];
			for( int w = 0; w< xsmall.length; w++){
				xsmall[w] = small[w];
			}
		return xsmall;
	}

}