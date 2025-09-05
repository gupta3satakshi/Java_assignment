package Assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import Assignment6.Toy;
import Assignment7.Predicate;



public class Tweeter_Website {
	
	public static List<Tweet> createTweetLists(){
		List<Tweet> tweet_list = new ArrayList<>();
		Set<String> hashtags1 = new TreeSet<>();
		hashtags1.add("#flood");
		hashtags1.add("#SH");
		Set<String> hashtags2 = new TreeSet<>();
		hashtags2.add("#weatherupdate");
		hashtags2.add("#trending");
		Set<String> hashtags3 = new TreeSet<>();
		hashtags3.add("#punerains");
		hashtags3.add("#popular");
		Set<String> hashtags4 = new TreeSet<>();
		hashtags4.add("#flood");
		hashtags4.add("#punerains");
		
		tweet_list.add(new Tweet("Earthquake", 2, 5000,hashtags1));
		tweet_list.add(new Tweet("Headline", 5, 300,hashtags1));
		tweet_list.add(new Tweet("Rain", 7, 40000,hashtags2));
		tweet_list.add(new Tweet("Netizen", 9, 90000000,hashtags3));
		tweet_list.add(new Tweet("Headline", 8, 55000,hashtags3));
		tweet_list.add(new Tweet("Kpop", 12, 9000,hashtags4));
		
		return tweet_list;
	
	}


	public static void main(String[] args) {
		List<Tweet> tweet_list = new ArrayList<>();
		Stream<Tweet> st = tweet_list.stream();
		
		System.out.println("_____________List all the tweets that are posted in current month_______________");
		//st.filter((t) -> t.getMonth_of_post() == 9).forEach(System.out::println);
		st.filter((t -> t.getMonth()== st.getMonthValue(8)).forEach(System.out::println);
	
	}

}
