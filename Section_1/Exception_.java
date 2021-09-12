package Section_1;

public class Exception_ {
	
	/*
	 * void method() throws Exception {
	 * 
	 *	if (isInternetOff){
	 *		throw new Exception("인터넷 안됨");
	 *	}
	 *	else if (isWrongInput) {
	 *		throw new Exception("잘못된 입력");
	 *	}
	 * 
	 * }
	 * 
	 * 
	 * try {
	 * 	method();
	 * }
	 * catch (Exception e) {           -> Exception e: 위의 해당 사항의 Exception 지정
	 * 	showAlert(e.getMessage());     -> 메소드가 잘못 시행될 때 showAlert (해당 내용을 출력)실행
	 * }
	 */

	public static void main(String[] args) {
		try {
			boolean isSuccess = login("Ddd","asdfasdf");
			if (isSuccess)
				System.out.println("Login Success");
			else
				System.out.println("Login Failed");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Copyright");
		}

	}
	
	static boolean login(String id, String pw) throws Exception {
		
		boolean isNoId = false;
		boolean isPasswordWrong = false;
		boolean isNetworkFailed = true;
		boolean isPWExpired = false;
		
		if(isNetworkFailed)
			throw new Exception("Network Failed");
		else if(isNoId)
			throw new Exception("Network Failed");
		else if(isPasswordWrong)
			throw new Exception("Network Failed");
		else if(isPWExpired)
			throw new Exception("Network Failed");
		
		return true;
	}

}
