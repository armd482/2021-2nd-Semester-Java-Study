package Section_1;

public class Exception_ {
	
	/*
	 * void method() throws Exception {
	 * 
	 *	if (isInternetOff){
	 *		throw new Exception("���ͳ� �ȵ�");
	 *	}
	 *	else if (isWrongInput) {
	 *		throw new Exception("�߸��� �Է�");
	 *	}
	 * 
	 * }
	 * 
	 * 
	 * try {
	 * 	method();
	 * }
	 * catch (Exception e) {           -> Exception e: ���� �ش� ������ Exception ����
	 * 	showAlert(e.getMessage());     -> �޼ҵ尡 �߸� ����� �� showAlert (�ش� ������ ���)����
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
