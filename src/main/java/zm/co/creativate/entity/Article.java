package zm.co.creativate.entity;

public class Article {
	private int articleID;
	private String articleTitle;
	private String artcileContent;

	public Article(int articleID, String articleTitle, String artcileContent) {
		super();
		this.articleID = articleID;
		this.articleTitle = articleTitle;
		this.artcileContent = artcileContent;
	}

	public int getArticleID() {
		return articleID;
	}

	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArtcileContent() {
		return artcileContent;
	}

	public void setArtcileContent(String artcileContent) {
		this.artcileContent = artcileContent;
	}

}
