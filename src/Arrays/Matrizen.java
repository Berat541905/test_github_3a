package Arrays;

public class Matrizen {

public static int[][] magnify(int[][] array, int factor) {
    if (factor <= 0) {
        throw new IllegalArgumentException("Der Faktor muss größer als 0 sein.");
    }

    int originalHeight = array.length;
    int originalWidth = array[0].length;
    int newHeight = originalHeight * factor;
    int newWidth = originalWidth * factor;
    int[][] Image = new int[newHeight][newWidth];

    for (int i = 0; i < newHeight; i++) {
    	 for (int j = 0; j < newWidth; j++) {
    	         [i][j] = array[i / factor][j / factor];
    	    }
    	}

    	return Image;
    }


public static void main(String[] args) {
	int[][] originalImage = {
	        {1, 2, 3},
	        {4, 5, 6}
	    };
		int factor = 2;
	    int[][] Image = magnify(originalImage, factor);
	    for (int i = 0; i < Image.length; i++) {
	        for (int j = 0; j < Image[i].length; j++) {
	            System.out.print(Image[i][j] + " ");
	        }
	        System.out.println();
	    }
}












}









