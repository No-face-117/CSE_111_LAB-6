// CSE-111 LAB - 6 TASK - 3     []
// T-3 Book class

public class Book {
    
    public String name = "Something.";
    public static double B_price = 150.00;
    public static double B_price_n = 0.00;

    public static int total_books_sold = 0;
    public static double total_revenue = 0.00;

    public Book(String nk_0, int dk_0) {
        name = nk_0;
        booker(dk_0);
    }

    public static void booker(int dk_1){
        B_price_n = (B_price / 100) * (100 - dk_1);

        total_books_sold ++;
        total_revenue += B_price_n;
    }

    public void bookDetails() {
        System.out.println("Title : " + name);
        System.out.println("Price after Discount : " + B_price_n + " TK");
    }

}


