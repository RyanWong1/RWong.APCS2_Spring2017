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
		// TODO Auto-generated method stub
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
	public Cell getCell(Location loc)
	{
		
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
