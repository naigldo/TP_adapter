package fr.mds.tpadapter.apdapter;

import fr.mds.tpadapter.classes.Mp4Player;
import fr.mds.tpadapter.classes.VlcPlayer;
import fr.mds.tpadapter.interfaces.AdvancedMediaPlayer;
import fr.mds.tpadapter.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer amp;

	public MediaAdapter() {
		//not useful
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			VlcPlayer vlcPlayer = new VlcPlayer();
			vlcPlayer.playVlc(fileName);
			
		} else if (audioType.equalsIgnoreCase("mp4")) {
			Mp4Player mp4Player = new Mp4Player();
			mp4Player.playMp4(fileName);
		}
	}
}
