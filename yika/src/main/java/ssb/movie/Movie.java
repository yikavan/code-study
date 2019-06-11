package ssb.movie;

/**
 * 影片实体
 */

public class Movie {
	public static final int CHILDRENS = 0;
	public static final int REGULAR = 1;
	public static final int NEW_MOVIE = 2;
	private String title;
	private int priceCode; // 代号

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
}
