package Assignment2;

public class Curtain {
	private boolean isOpen;
	public Curtain(){
		isOpen = false;
	}
	public void openCurtain() {
		if(isOpen == false) {
			isOpen = true;
			System.out.println("curtain is opening");
		}
	}
	public void closeCurtain() {
		if(isOpen == true) {
			isOpen = false;
			System.out.println("curtain is closing");
		}
	}
	public boolean getState() {
		return isOpen;
	}
}
