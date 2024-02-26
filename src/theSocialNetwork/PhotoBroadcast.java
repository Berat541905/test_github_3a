package theSocialNetwork;
 
 
public class PhotoBroadcast extends Submissions{
	private String fileName;
	private String headline;
	
	public PhotoBroadcast(String username, String headline, String fileName) {
		super(username);
		this.headline = headline;
		}
 
	public String getHeadline() {
		return headline;
	}
 
	public void setHeadline(String headline) {
		this.headline = headline;
	}
 
	public String getFileName() {
		return fileName;
	}
 
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
 
	@Override
	public String toString() {
		return super.toString() + "/n/t fileName=" + fileName + "/n/t headline=" + headline;
	}

}