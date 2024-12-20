// CSE-111 LAB - 6 TASK - 5     []
// T-5 Circle class

public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  
    public String name;

    public Borrower(String nk_0){
        name = nk_0;
    }

    public static void borrowBook(String nbk_0) {
        boolean be = false;
        int count_0 = 0;
        
        for (int i = 0; i < book_name.length; i++) {
            if (book_name[i].equals(nbk_0)) {
                count_0 = i;
                be = true;
                break;
            }
            else{}
        }

        if (be) {
            book_count[count_0] -= 1;
        }
        else{
            System.out.println("This book is not available.");
        }
    }

    public void borrowerDetails() {
        System.out.println("Name : " + name);
        System.out.println("Books Borrowed : ");

        for (int j = 0; j < book_count.length; j++) {
            if (book_count[j] < 3) {
                System.out.println(book_name[j]);
            }
            else{}
        }
    }

    public static int remainingBooks(String nbk_1) {
        int count_1 = 0;
        
        for (int j = 0; j < book_name.length; j++) {
            if (book_name[j].equals(nbk_1)) {
                count_1 = j;
                break;
            }
            else{}
        }

        return book_count[count_1];
    }

    public static void bookStatus() {
        System.out.println("Available Books : ");
        for (int i = 0; i < book_name.length; i++) {
            System.out.println(book_name[i] + " : " + book_count[i]);
        }
    }

}
  