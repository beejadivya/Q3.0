import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
class BookOutOfStockException extends Exception
{
    public BookOutOfStockException(String message)
    {
        super(message);
    }
}

class Book
{
    String bookName;
    int prnNumber;
    int stockLeft;
    int price;
    Book(String bookName,int prnNumber,int stockLeft,int price)
    {
        this.bookName=bookName;
        this.prnNumber=prnNumber;
        this.stockLeft=stockLeft;
        this.price=price;
    }
    static void toOrder(User user,Book book,int quantity,List<Book> CartOfBooks) throws BookOutOfStockException
    {
        if (quantity <= book.stockLeft) {
            user.userCart.put(book.prnNumber, quantity * book.price);
            user.totalCartCost+=user.userCart.get(book.prnNumber);
            book.stockLeft -= quantity;
            if (book.stockLeft == 0) {
                CartOfBooks.remove(book);
            }

        } else {
            throw new BookOutOfStockException("Book out of stock!!");
        }

    }
    static void calculateCartCost(User user)
    {
        if(user.totalCartCost>0) {
            System.out.println(user.name+" ,Your Total cart Amount is :- " + user.totalCartCost);
        }
        else
            System.out.println(user.name+" your Cart is Empty");
    }
}
class User
{
    String name;
    HashMap<Integer,Integer> userCart=new HashMap<>();
    int totalCartCost=0;
    User(String name)
    {
        this.name=name;
    }


}


public class CartOfBooks {
    public static void main(String[] args) {
        List<Book> CartOfBooks=new ArrayList<>();
        CartOfBooks.add(new Book("Maths",1000,4,1999));
        CartOfBooks.add(new Book("Physics",1001,3,550));
        CartOfBooks.add(new Book("Chemistry",1002,4,699));
        CartOfBooks.add(new Book("Botany",1003,5,850));
        CartOfBooks.add(new Book("Economics",1004,1,759));
        User userOne=new User("Divya");
        try
        {
            Book.toOrder(userOne,CartOfBooks.get(0),2,CartOfBooks);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        Book.calculateCartCost(userOne);
    }
}
