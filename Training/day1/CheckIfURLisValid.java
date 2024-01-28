package Training;
import java.util.Scanner;
public class CheckIfURLisValid {
	
	public static boolean isValidDomain(String domain) {
		for(char c : domain.toCharArray()) {
			if(!Character.isLetterOrDigit(c) && c != '.') {
				return false;
			}
		}
		return domain.contains(".");
	}
	
	
	public static boolean isValidURL(String url) {
		if(!url.startsWith("http://") && !url.startsWith("https://")) {
			return false;
		}
		String withoutProtocol = url.substring(url.indexOf("://") + 3);
		int domainEndIndex = withoutProtocol.indexOf('/');
		if(domainEndIndex == -1) {
			domainEndIndex = withoutProtocol.length();
		}
		String domain = withoutProtocol.substring(0,domainEndIndex);
		if(!isValidDomain(domain)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String url = "https://www.bigohtech.com/";
		System.out.print(isValidURL(url));
	}
}
