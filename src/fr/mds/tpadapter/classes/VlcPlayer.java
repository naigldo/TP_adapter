package fr.mds.tpadapter.classes;

import fr.mds.tpadapter.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("On play : " + fileName+" - vlc");
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}
}
