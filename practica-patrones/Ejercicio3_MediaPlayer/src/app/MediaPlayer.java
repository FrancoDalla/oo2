package app;
import java.util.ArrayList;

public class MediaPlayer {
	private ArrayList<Media> media;

	public MediaPlayer() {
		media = new ArrayList<>();
		Adaptador adaptador = new Adaptador();
		Audio audio = new Audio();
		VideoFile videoFile = new VideoFile();

		media.add(videoFile);
		media.add(adaptador);
		media.add(audio);
		media.add(videoFile);
	}


	public void play() {
		media.stream().forEach(actual_media -> actual_media.play());
	}
}
