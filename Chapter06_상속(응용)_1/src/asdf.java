import java.util.Scanner;
class Item {
	String name;
	int price;
	public void display() {
		System.out.println("이름:"+name);
		System.out.println("가격:"+price);
	}
	
}
class Book extends Item {
	String author;
	String isbn;
	public void Book(String author , int isbn ,String name , int price) {
		System.out.println("저자:"+author);
		System.out.println("isbn:"+isbn);
	}
}
class Album extends Item {
	String artist;
	public void display() {
		System.out.println("아티스트:"+artist);
	}
}
class Movie extends Item {
	String actor;
	String director;
}
public class asdf {
	public static void main(String[] args) {
		Book book = new Book("", "");
	}

}
