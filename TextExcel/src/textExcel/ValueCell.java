package textExcel;

public class ValueCell extends RealCell {
	public ValueCell(String input) {
		setValue(input);
	}
	public double getDoubleValue() {
		double temp = Double.parseDouble(this.getValue());
		return temp;
	}

}