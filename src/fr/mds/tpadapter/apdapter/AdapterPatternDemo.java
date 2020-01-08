package fr.mds.tpadapter.apdapter;

import fr.mds.tpadapter.classes.AudioPlayer;
import fr.mds.tpadapter.interfaces.MediaPlayer;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
		
		MediaPlayer player = new MediaAdapter();
		player.play("mp4", "mp4Test.mp4");
		player.play("vlc", "vlcTest.vlc");

		MediaPlayer player1 = new AudioPlayer();
		player1.play("mp4", "test1.mp4");
	}
}
