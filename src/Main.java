import java.util.*;

public class Main {


    public static void main(String[] args) {

        NoteBook Acer = new NoteBook("Acer", "1666", "Windows_7", "Black");
        NoteBook Mac = new NoteBook("Macbook", "1333", "MacOS", "White");
        NoteBook Samsung = new NoteBook("Samsung", "2400", "Windows_10", "Red");
        NoteBook Asus = new NoteBook("Asus", "3200", "Windows_11", "Black");
        NoteBook Asus1 = new NoteBook("Asus", "3300", "Windows_XP", "Blue");
        List<NoteBook> noteBooks = new ArrayList<>();
        noteBooks.add(Acer);
        noteBooks.add(Mac);
        noteBooks.add(Samsung);
        noteBooks.add(Asus);
        noteBooks.add(Asus1);
        NoteBook.SortNootBooks(noteBooks);

        Map<Integer, String> filterNootbooks = new HashMap<>();

        filterNootbooks.put(1, Acer.getName());
        filterNootbooks.put(2, Acer.getRAM());
        filterNootbooks.put(3, Acer.getOS());
        filterNootbooks.put(4, Acer.getColor());

        System.out.println(NoteBook.filter(noteBooks));


    }


}