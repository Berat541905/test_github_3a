package theSocialNetwork;
 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
 
public abstract class Submissions {
	private String username;
	private LocalDate timeStamp;
	private int like;
	private ArrayList<Comment> comments;

	public Submissions(String userName) {
		super();
		this.username = userName;
		this.timeStamp = LocalDate.now();
		this.like = 0;
		this.comments = new ArrayList<>();
	}
 
 
	public String getUserName() {
		return username;
	}
 
 
	public void setUserName(String userName) {
		this.username = userName;
	}
 
 
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
 
 
	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}
 
 
	public int getLike() {
		return like;
	}
 
 
	public void setLike(int like) {
		this.like = like;
	}
 
 
	public ArrayList<Comment> getComments() {
		return comments;
	}
 
 
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	 
	
	 @Override
	public String toString() {
		return "Submissions [userName=" + username + ", timeStamp=" + timeStamp + ", like=" + like + ", comments="
				+ comments + "]";
	}
 
 
	 /**
	  * adds a comment
	  * @param comments
	  */
	public void addComment(Comment comments) {
	        this.comments.add(comments);
	    }
	
	 /**
	  * removes a comment
	  * @param comments
	  */
	 public void removeComment(Comment comments) {
	        this.comments.remove(comments);
	    }
 
	 
	 /**
	  * prints every comment
	  */
	 public void printAllComments() {
		 for(Comment c : this.comments) {
			 System.out.println(c);
		 }
	 }

	 /**
	  * calculates the time when the post was posted
	  * @param millis
	  */
	 public static void getTimeAgo(long millis) {
	        long currentTime = System.currentTimeMillis();
	        long diff = currentTime - millis;
	        
	        long second = TimeUnit.MILLISECONDS.toSeconds(diff);
	        long minute = TimeUnit.MILLISECONDS.toMinutes(diff);
	        long hour = TimeUnit.MILLISECONDS.toHours(diff);
	        long day = TimeUnit.MILLISECONDS.toDays(diff);
	        long month = TimeUnit.MILLISECONDS.toDays(diff)*30;
	        long year = TimeUnit.MILLISECONDS.toDays(diff)*365;
	        
	        if(second < 60) {
	        	System.out.println("vor" + second + "Sekunden erstellt");
		     }
	        else if(minute < 3600){
		    	 System.out.println("vor" + minute + "Minuten erstellt");   	
		     } 
		    else if(hour < 86400) {
		    	 System.out.println("vor" + hour + "Stunden erstellt");
		     } 
		    else if (day < 604800) {
		    	 System.out.println("vor" + day + "Tagen erstellt");
		     } 
		    else if(month < 604800*30) {
		    	 System.out.println("vor" + month + "Monaten erstellt");
		     }
		    else if(year < 604800*365) {
		    	 System.out.println("vor" + year + "Jahren erstellt");
	 }
}
	 
}