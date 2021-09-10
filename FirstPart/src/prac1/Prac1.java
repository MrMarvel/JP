package prac1;

//Упражнение 3
public class Prac1 {
    public static void main(String[] args) {
        TestBook.test();
    }
}

class Book {
    private String name = "";
    public Book(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Book{name="+name+"}";
    }
}

class TestBook {
    static void test() {
        Book b = new Book("Один дома");
        System.out.println(b);
        b.setName(b.getName()+" 2");
        System.out.println(b);
    }
}
