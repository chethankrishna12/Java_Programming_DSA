package dsa.stack;

import java.util.Stack;

class Web {
	private String currentPage;
	private Stack<String> bws, fws;

	public Web() {
		bws = new Stack<String>();
		fws = new Stack<String>();
		this.currentPage = "Home Page";
	}
	public void visitPage(String newPage) {// Flipkart
		bws.push(currentPage);
		currentPage = newPage;

		fws.clear();
	}
	public void previousPage() {
		if (!bws.isEmpty()) {
			fws.push(currentPage);
			currentPage = bws.pop();
		}
	}
	public void nextPage() {
		if (!fws.isEmpty()) {
			bws.push(currentPage);
			currentPage = fws.pop();
		}
	}
	public String getCurrentPage() {
		return currentPage;
	}
}

public class Web_MainClass {

	public static void main(String[] args) {
		Web web = new Web();
		web.visitPage("Flipkart");
		web.visitPage("Flipkart Home Page");
		web.visitPage("Rc Toys");
		web.previousPage();
		System.out.println(web.getCurrentPage());
	}
} 