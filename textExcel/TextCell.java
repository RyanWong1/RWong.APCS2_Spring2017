package textExcel;

public abstract class TextCell implements Cell {
	String contents;
	
	//sets original contents then the data to the cell
	public TextCell(String temp) {
		contents = temp;
		temp = temp.substring(1, temp.length() - 1);
		contents = temp;
	}
	
	public String toString(Spreadsheet ss){
		return(contents);
	}
}