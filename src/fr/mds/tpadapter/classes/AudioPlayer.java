package fr.mds.tpadapter.classes;

import fr.mds.tpadapter.apdapter.MediaAdapter;
import fr.mds.tpadapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("On play : "+fileName+" - mp3");
			
		} else if (audioType.equalsIgnoreCase("avi")) {
			System.out.println("Can't play 'avi'.");
			
		} else if (audioType.equalsIgnoreCase("mp4")) {
			MediaAdapter medAdapt = new MediaAdapter();
			medAdapt.play(audioType, fileName);
		} else if(audioType.equalsIgnoreCase("vlc")) {
			MediaAdapter medAdapt = new MediaAdapter();
			medAdapt.play(audioType, fileName);
			
		} else {
			System.out.println("Can't play this type of file.");
		}
	}
}
