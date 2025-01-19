package week3.day2;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("endpoint is" +endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
		System.out.println("endpoint is:" +endpoint);
		System.out.println("requestBody is:" +requestBody);
		System.out.println("requestStatus is:" +requestStatus);
	}
public static void main(String[] args) {
	APIClient a=new APIClient();
	a.sendRequest("EndPoint");
	a.sendRequest("EndPoint", "Request", "Success");
	
}
}
