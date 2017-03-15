package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int columns = 12;
	private char[] alphabet = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
	private Cell[][] sheet = new Cell[rows][columns];
	private String name = "";

	public Spreadsheet() {
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				sheet[i][j]=new EmptyCell();
			}
		}
	}
	

	@Override
	public String processCommand(String command)
	{
		
		String[] breakcommand = command.split(" ");
		breakcommand[0] = breakcommand[0].toUpperCase();
		if(command.length()==0){
			return "";
		} else if(breakcommand.length >= 3){
			String userInput = breakcommand[2];
			int counter = 3;
			while(counter < breakcommand.length){
				userInput += " " + breakcommand[counter];
				counter++;
			}
			String cell = breakcommand[0];
			SpreadsheetLocation x = new SpreadsheetLocation(cell);
			sheet[x.getRow()][x.getCol()] = new TextCell(userInput);
			return getGridText();
		}else if(command.length() < 3){
			return cellInspection(breakcommand[0]);
		} else if (breakcommand[0].contains("CLEAR")){
			if(breakcommand.length == 1){
				for(int i = 0; i < rows; i++){
					for(int j = 0; j < columns; j++){
						sheet[i][j] = new EmptyCell();
					}
				}
				 return getGridText();
			} else{
				sheet[breakcommand[1].getRow()][breakcommand[1].toUpperCase().getCol()] = new EmptyCell();
				return getGridText();
			}
		} 
		return "";
	}
	

	@Override
	public int getRows()
	{
		
		return rows;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return columns;
	}

	@Override
	public Cell getCell(Location loc){
		return sheet[loc.getRow()][loc.getCol()];
	}
	
	public String cellInspection(String cell){
		//makes new spreadsheetlocation object to get the rows and col
		SpreadsheetLocation a = new SpreadsheetLocation(cell);
		String result = sheet[a.getRow()][a.getCol()].fullCellText();
		return result;
	}

	@Override
	public String getGridText()
	{
		String grid = "   |";
		
		//fills in the top row with the letters
		for(int i = 0; i < columns; i++){
			//cast to character type for letters, add the 10 spaces between this and the next one
			grid += (char) ('A' + i) + "         |";
		}
		
		//fills in the grid
		for(int i = 1; i <= rows; i++){
			//makes new line at end of row and adds the number
			grid += "\n" + i;
			//fixes the spacing when the numbers hit double digits
			if(i >= 10){
				grid += " |";
			}else{
				grid += "  |";
			}
			
			//sets all the values of each part of the array
			for(int k = 0; k < columns; k++){
				//includes the dashed lines at the end, only lets first 10 characters show
				//Puts the cell with its values in the grid
				//i-1 because i started at 1 for numbering but arrays are zero based
				grid += sheet[i-1][k].abbreviatedCellText() + "|";
			}
		}
		grid += "\n";// adds a new line after finishing creating the grid
		return grid;

		
	}

}