package theSocialNetwork;
 
import java.util.ArrayList;
 
public class NewsFeed {
 
    private ArrayList<Submissions> submission;
    public NewsFeed() {
    	this.submission = new ArrayList<>();
    }
    /*
     * Adds a Submission
     */
    public void addSubmission (Submissions submission) {
    	this.submission.add(submission);
    }
    
    /*
     * Prints all submission
     */
    public void printAllSubmission() {
    	for (Submissions s : submission) {
    		System.out.println(s);
    	}
    }

    /*
     * Prints all submission by user
     */
    public void printSubmissionByUser(String userName) {
    	for (Submissions s : submission) {
    		if (s.getUsername().equals(userName)) {
    			System.out.println(s);
    		}
    	}
    }
    
    /*
     * Deletes a submission
     */
    public void deleteSubmission(Submissions submission) {
    	this.submission.remove(submission);
    }
    
   /*
    *  Finds a user in class submission from her or his post
    */
   ArrayList<Submissions> findUser(String userName, boolean onlyPhotos) {
	   ArrayList<Submissions> result = new ArrayList<>();
	   for (Submissions s : submission) {
		   if (s.getUsername().equals(userName) && (!onlyPhotos || s instanceof PhotoBroadcast)) {
			   result.add(s);
		   }
	   }
	   System.out.println("Die User " + result);
	   return result;
   }
}