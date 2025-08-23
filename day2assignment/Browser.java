package week1.day2assignment;

public class Browser {

	void  launchBrowser(String browserName)
	{
		System.out.println(browserName +" Browser is Launched");
	}
	void  loadUrl(String url)
	{
		System.out.println(url +" Url loaded successfully ");
	}
	public static void main(String[] args) {
		
		Browser B=new Browser();
		B.launchBrowser("Chrome");
		B.loadUrl("https://www.travels.com/");

	}

}
