package week3.day2;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("CommonTasks is success");
	}
public static void main(String[] args) {
	LoginPage l=new LoginPage();
	l.findElement();
	l.clickElement();
	l.enterText();
	l.performCommonTasks();
}
}
