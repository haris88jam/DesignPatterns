package camera;

public class Camera {

	public static void main(String[] args) {
		BasicCameraApp basic = new BasicCameraApp();
		basic.take();
		basic.save();
		basic.setShare(new ShareText());
		basic.performShare();
		basic.edit();
	}

}
