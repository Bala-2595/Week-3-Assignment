package week3.day2;

public class Elements extends Button{
	public static void main(String[] args) {
		WebElement w=new WebElement();
		Button b=new Button();
		TextField t=new TextField();
		CheckBoxButton c=new CheckBoxButton();
		RadioButton r=new RadioButton();
		
		w.click();
		w.setText("Hello");
		b.submit();
		t.getText();
		c.clickCheckButton();
		r.selectRadioButton();
		
	}

}
