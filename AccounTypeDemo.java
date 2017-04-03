import javax.swing.JOptionPane;
public class AccounTypeDemo{
	public enum AccountType{December, January, February,March, April, May, June,July, August, September, October, November}
	public static void main(String [] args){
		AccountType[] choices={ AccountType.December, AccountType.January, AccountType.February, AccountType.April, AccountType.May, AccountType.June, AccountType.July, AccountType.August, AccountType.September, AccountType.October, AccountType.November};
		while(true){
			AccountType input=(AccountType) JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
			switch(input){
				case December: case January : case February:
					JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
					break;
				case March: case April: case May:
					JOptionPane.showMessageDialog(null, "Happy Spring days!");
					break;
				case June: case July: case August:
					JOptionPane.showMessageDialog(null, "It's summer time.");
					break;
				case September: case October: case November:
					JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Wrongchoice");
			}
		}
	}
}

