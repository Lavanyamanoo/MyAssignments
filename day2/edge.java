package week1.day2;

public class edge {
		
	public void launchBrowser(String browserName) {
		System.out.println("THis is to launchbrowser");
	}
	
	public static void main(String[] args) {
		Browser L=new Browser();
		L.loadUrl();
		edge E=new edge();
		E.launchBrowser(null);
		}

}
