package textExcel;

public class EmptyCell implements Cell {
	//initial cell with no data
	String contents = "";
	
	//sets the original contents to empty
	public EmptyCell() {
		contents = "<empty>";
	}
	
	public String abbreviatedCellText(){
		return "";
	}
	public String fullCellText(){
		return "";
	}
}