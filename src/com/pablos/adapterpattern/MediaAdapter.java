package com.pablos.adapterpattern;

public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer adMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc"))
			adMusicPlayer = new VlcPlayer();
		else if(audioType.equalsIgnoreCase("mp4"))
			adMusicPlayer = new Mp4Player();
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc"))
			adMusicPlayer.playVlc(fileName);
		else if(audioType.equalsIgnoreCase("mp4"))
			adMusicPlayer.playMp4(fileName);
	}

}
