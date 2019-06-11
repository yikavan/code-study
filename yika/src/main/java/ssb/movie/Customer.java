package ssb.movie;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 租客
 */

public class Customer {

	/**
	 * 描述:姓名
	 */
	private String name;

	/**
	 * 描述:租赁记录
	 */
	private Vector<Rental> rentalVector = new Vector<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentalVector.add(rental);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 描述:打印报表
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	public String statement() {
		// 总消费金额
		double totalAmount = 0;
		// 常客积分点
		int renterPointer = 0;
		Enumeration<Rental> rental = rentalVector.elements();
		StringBuffer result = new StringBuffer();
		while (rental.hasMoreElements()) {
			double amount = 0;
			Rental temp = rental.nextElement();
			switch (temp.getMovie().getPriceCode()) {
			// 如果是儿童片:前3天1.5,超过3天每天1.5
			case Movie.CHILDRENS:
				amount += 1.5;
				//
				if (temp.getDaysRented() > 3) {
					amount += (temp.getDaysRented() - 3) * 1.5;
				}
				break;
			// 如果是普通片:不超过2天2块钱,超过2天每天1.5
			case Movie.REGULAR:
				amount += 2;
				if (temp.getDaysRented() > 2) {
					amount += (temp.getDaysRented() - 2) * 1.5;
				}
				break;
			// 如果是新片:每天3块S
			case Movie.NEW_MOVIE:
				amount += temp.getDaysRented() * 3;
				break;
			}
			renterPointer++;
			// 如果是新片,且租赁时间超过1天积分+1
			if (temp.getMovie().getPriceCode() == Movie.NEW_MOVIE && temp.getDaysRented() > 1) {
				renterPointer++;
			}
			// result拼接....
			totalAmount += amount;
		}
		// result拼接...
		return result.toString();
	}
}
