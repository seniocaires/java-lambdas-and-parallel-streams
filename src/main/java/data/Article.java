package data;

public class Article {
	private final int _articleNo;
	String _name;
	Money _price;
	int _maxSell;
	int _probability;

	public Article(String articleData, int articleNo) {
		_articleNo = articleNo;
		try {
			String[] parts = articleData.split(";");
			_name = parts[0];
			_price = new Money(parts[1]);
			_maxSell = Integer.parseInt(parts[2]);
			_probability = Integer.parseInt(parts[3]);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Money getPrice() {
		return _price;
	}

	public void setPrice(Money price) {
		_price = price;
	}

	public int getMaxSells() {
		return _maxSell;
	}

	public void setMaxSell(int maxSell) {
		_maxSell = maxSell;
	}

	public int getProbability() {
		return _probability;
	}

	public void setProbability(int probability) {
		_probability = probability;
	}
}