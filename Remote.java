package Assignment2;

public class Remote {
		Curtain curtain;
		public Remote(Curtain curtain) {
			this.curtain = curtain;
		}
		public void pressButton() {
			if(curtain.getState()) {
				curtain.closeCurtain();
			}else {
				curtain.openCurtain();
			}
		}
		
}
