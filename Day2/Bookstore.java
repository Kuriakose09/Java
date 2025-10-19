
public class Bookstore {
	public static void main(String[] args) {
		int num_books = 3;
		System.out.println("number of books : "+num_books);
		int price = 275;
		System.out.println("price of one book : "+price);
		double tot_amount = num_books * price;
		System.out.println("Total amount : "+tot_amount);
		int int_discount = 50;
		double double_discount = int_discount;
		System.out.println("discount : "+double_discount);
		double final_price = tot_amount - double_discount;
		System.out.println("Final Price : "+final_price);
	}
}
