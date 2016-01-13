package com.pablos.adapterpattern;

public class AdapterPatternMain {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "boys.mp3");
		audioPlayer.play("mp4", "lol.mp4");
		audioPlayer.play("vlc", "go.vlc");
		audioPlayer.play("avi", "yesman.avi");
	}

}
