package Section_1;
import java.lang.*;

public class Downloader {
	
	private OnDownloadListener mListener;
	
	public Downloader(OnDownloadListener listener) {
		mListener = listener;
	}
 
	public void Start() {
		
		System.out.println("Download Start");
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		mListener.onDownFinish();
		
	}
	
}
