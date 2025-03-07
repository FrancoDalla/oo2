package ar.edu.unlp.info.oo1.Ejercicio1Oo2;

import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		tweets = new ArrayList<Tweet>();
	}
	
	
	public void agregarTweet(Tweet tweet) {
		tweets.add(tweet);
	}
	
	public boolean corresponde(String value) {
		return this.screenName == value;
	}

	public String getScreenName() {
		return screenName;
	}
	
	public void eliminar() {
		tweets.clear();
	}
	
	public int publicaciones() {
		return tweets.size();
	}
}
