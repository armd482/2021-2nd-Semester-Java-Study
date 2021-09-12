package Section_1;

public class Browser implements OnDownloadListener {
	
	public void imgClick() {
		Downloader loader = new Downloader(this);
		loader.Start();
	}
	
	@Override
	public void onDownFinish() {
		
		System.out.println("Browser: onDownFinish()");
		
	}
	
	@Override
	public void onDownFailed() {
		System.out.println("Browser: onDownFailed()");
	}

}
