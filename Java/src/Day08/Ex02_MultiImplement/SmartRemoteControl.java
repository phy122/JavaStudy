package Day08.Ex02_MultiImplement;

//인터페이스 다중 상속
public interface SmartRemoteControl extends Remotecontrol, Microphone{
	
	// 터치패드 가능
	// - x, y 좌표 위치에 터치패드를 클릭
	void touch(int x, int y);
}
