package Assignment8;

import java.util.Set;

public class Tweet {
	private String subject;
	private String	date_of_post;
	private int view;
	private Set<String> hashtags;
	public Tweet(String subject, String date_of_post, int view, Set<String> hashtags) {
		this.subject = subject;
		this.date_of_post = date_of_post;
		this.view = view;
		this.hashtags = hashtags;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDate_of_post() {
		return date_of_post;
	}
	public void setDate_of_post(String date_of_post) {
		this.date_of_post = date_of_post;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public Set<String> getHashtags() {
		return hashtags;
	}
	public void setHashtags(Set<String> hashtags) {
		this.hashtags = hashtags;
	}
	@Override
	public String toString() {
		return "Tweet [subject=" + subject + ", month_of_post=" + date_of_post + ", view=" + view + ", hashtags="
				+ hashtags + "]";
	}
	
	
	
}
