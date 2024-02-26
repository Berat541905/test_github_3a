package theSocialNetwork;
 
public class NewsBroadcast extends Submissions{
 
	private String contentsOfNews;
	
	public NewsBroadcast(String username,String contentsOfNews) {
		super(username);
		this.contentsOfNews = contentsOfNews;
	}
 
	public String getContentsOfNews() {
		return contentsOfNews;
	}
 
	public void setContentsOfNews(String contentsOfNews) {
		this.contentsOfNews = contentsOfNews;
	}
 
	@Override
	public String toString() {
		return super.toString() + "/n/t contentsOfNews: " + contentsOfNews;
	}

}