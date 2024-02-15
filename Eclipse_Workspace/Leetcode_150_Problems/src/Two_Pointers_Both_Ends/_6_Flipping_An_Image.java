package Two_Pointers_Both_Ends;

import java.util.Arrays;

public class _6_Flipping_An_Image {
	
	public int[][] flipAndInvertImage (int[][] image) {

			int row = image.length;
			int col = image [0].length;

			for (int k=0; k < row; k++) {
			/* using two pointers */ 
			int i=0; //First Pointer In 
			int j= col-1; // Second Poi 
			while (i <=j) {
			int c = image[k][i]; 
			image[k][i]= image[k][j]; 
			image[k][j] = c;
			i++;
			j--;
			}
			}
			for (int i=0;i<row;i++) {
                for (int j=0;j<col;j++) { 
                	 if (image[i][j]==0) { image[i][j]=1;}
                	 else{
             			image[i][j]=0;
                	 }
                }
			}

			return image;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_6_Flipping_An_Image obj = new _6_Flipping_An_Image();

		int[][] imagel ={{1,1,0}, {1,0,1}, {0,0,0}};
		int[] [] image2 ={{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}};

		System.out.println("Before Flipping 1="+Arrays.deepToString (imagel)); 
		int[][] flippedArrl= obj.flipAndInvertImage(imagel);
		System.out.println("After Flipping 1 ="+Arrays.deepToString(flippedArrl));

		System.out.println("Before Flipping 2="+Arrays.deepToString (image2));
		int[][] flippedArr2=obj.flipAndInvertImage(image2); 
		System.out.println("After Flipping 2="+Arrays.deepToString(flippedArr2));
	}

}
