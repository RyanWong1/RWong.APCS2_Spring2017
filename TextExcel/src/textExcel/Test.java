package textExcel;

import static org.junit.Assert.assertEquals;

import textExcel.TestsALL.Helper;
import textExcel.TestsALL.TestLocation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spreadsheet grid=new Spreadsheet();
		  for (int i = 0; i < grid.getRows(); i++)
              for (int j = 0; j < grid.getCols(); j++)
              {
                  Cell cell = grid.getCell(new TestLocation(i, j));
                  System.out.println(cell.getClass().getName());
                  System.out.println(i+","+j+":"+"-expect- " + Helper.format("") + " - " + Helper.format("").length());
                  System.out.println(i+","+j+":"+"-output- " + cell.abbreviatedCellText()+ " - "+cell.abbreviatedCellText().length() );
                  //assertEquals("empty cell text", Helper.format(""), cell.abbreviatedCellText());
                  //assertEquals("empty inspection text", "", cell.fullCellText());
              }
	}

}
