//Used for thngs related to the grid part of java102

package java102;


import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	public final int sideLength;

private static int maxSideLength = 0;

	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
        for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
		}
        if (sideLength > maxSideLength) {
            maxSideLength = sideLength;
        }
	}
   

    
	public T get(int row, int col) {
		return grid.get(row).get(col);
        //It gets the row, the first value which is the array list and then it gets the colum, the elelemt of that list.
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
         // Here it does the same thing as above except it modifies a value in a spot using set function
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}
    // Grid Diagonal practice problem
    public ArrayList<T> diagonal(Grid<Integer> g) {
        ArrayList<T> diagonal = new ArrayList<>();
        for(int i = 0; i < grid.size(); i++) {
            diagonal.add(grid.get(i).get(i));
        }
        return diagonal;
    }
public static int maxSideLength() {
    return maxSideLength;
}

}




    

