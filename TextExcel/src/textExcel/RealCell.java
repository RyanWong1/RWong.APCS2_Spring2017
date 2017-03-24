package textExcel;

public class RealCell implements Cell {

	private String str;
	
	public RealCell(String str1){
		str=str1;
	}
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return (str + "            ").substring(0, 10);
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return str;
	}
	
	public String getDoubleValue(){
		
	}

}
