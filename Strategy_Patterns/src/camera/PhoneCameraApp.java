package camera;

public abstract class PhoneCameraApp {
	ShareMethod shareMethod;
	public PhoneCameraApp() {
	}
	
	public void take() {
		System.out.println("Take the picture.");
	};
	
	abstract void edit();
	
	public void save() {
		System.out.println("Saved.");
	}
	
	public void setShare(ShareMethod sm) {
		shareMethod = sm;
	}
	
	public void performShare() {
		shareMethod.share();
	}
	
	
}
