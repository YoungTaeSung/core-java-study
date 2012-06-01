package core.interfaces;

public class MusicBox {
	public void playMusic(MusicPlayable mp) {
		mp.play();
	}
	public void stopMusic(MusicPlayable mp) {
		mp.stop();
	}
	public void selectMusic(MusicPlayable mp) {
		mp.rewind();
	}
}
