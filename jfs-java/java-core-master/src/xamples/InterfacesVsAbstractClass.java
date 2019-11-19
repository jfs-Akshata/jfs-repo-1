package xamples;
//Pascal Casing
public class InterfacesVsAbstractClass {
	public static void main(String[] args) {
		Training training = null;
		// abstract classes cannot be instantiated
		// training = new Training();
		training = new WebExTraining();
		// training = new ClassRoomTraining();
		// overriding takes place, dynamic polymorphism is used here.
		//use camel casing for methods.
		training.useComputer();

		WebExTraining webExTraining = new WebExTraining();
		// overriding takes place, static polymorphism is used here.
		webExTraining.useComputer();

		VoiceConnect voiceConnect = new WebExTraining();
		voiceConnect.connectToAduio();
		// connectToVideo is not declared in the interface.
		// voiceConnect.connectToVideo();
	}
}

interface RemoteAccess {
	void dialIn();

	void connectToVideo();
}

interface VoiceConnect {
	void connectToAduio();
}

interface TrainingSystem extends VoiceConnect {

}

abstract class Training {
	public void useComputer() {
		System.out.println("Use you computer!");
	}

	public abstract void shareNote();
}

class ClassRoomTraining extends Training {
	public void useProjecter() {

	}

	@Override
	public void shareNote() {
	}
}

class WebExTraining extends Training implements RemoteAccess, VoiceConnect {
	@Override
	public void useComputer() {
		System.out.println("Using laptop");
	}

	public void useWebExScreen() {

	}

	@Override
	public void dialIn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void connectToVideo() {
		System.out.println("Vidoe through WebEx");
	}

	@Override
	public void connectToAduio() {
		System.out.println("Through System, Mobile, or LandLine, or Laptop");

	}

	@Override
	public void shareNote() {

	}

}