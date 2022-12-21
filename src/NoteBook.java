import java.util.*;

/**
 * * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 * * Создать множество ноутбуков.
 * * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 * * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * * “Введите цифру, соответствующую необходимому критерию:
 * * 1 - ОЗУ
 * * 2 - Объем HHD или SSD
 * * 3 - Операционная система
 * * 4 - Цвет …
 * * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 * * отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */


public class NoteBook {

    public String name;
    public String RAM;
    public String OS;
    public String color;


    public String getName() {
        return name;
    }

    public String getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }


    public NoteBook(String name, String RAM, String OS, String color) {

        this.name = name;
        this.RAM = RAM;
        this.OS = OS;
        this.color = color;
    }


    public static List<NoteBook> SortNootBooks(List<NoteBook> listbook) {

        listbook.sort(new Comparator<NoteBook>() {
            @Override
            public int compare(NoteBook o1, NoteBook o2) {
                int a = Integer.parseInt(o1.getRAM());
                int b = Integer.parseInt(o2.getRAM());

                return -a + b;
            }
        });


        return listbook;
    }

    public static List<NoteBook> filter(List<NoteBook> listbook) {

        Scanner sc = new Scanner(System.in);

        List<NoteBook> newlist = new ArrayList<>();

        int number = sc.nextInt();

        if (number == 1) {
            String str = sc.next();
            for (int i = 0; i < listbook.size(); i++) {
                if (str.equals(listbook.get(i).getName())) {
                    newlist.add(listbook.get(i));
                }
            }


        } else if (number == 2) {

            System.out.println("Введите размер ОЗУ:");
            int OZU = sc.nextInt();
            for (NoteBook noteBook : listbook) {
                if (Integer.parseInt(noteBook.getRAM()) >= OZU) {
                    newlist.add(noteBook);
                }
            }
        } else if (number == 3) {
            System.out.println("Введите номер ОS ");
            String OS = sc.next();
            for (int i = 0; i < listbook.size(); i++) {
                if (OS.equals(listbook.get(i).getOS())) {
                    newlist.add(listbook.get(i));
                }
            }

        } else {
            System.out.println("Введите цвет ");
            String color = sc.next();
            for (int i = 0; i < listbook.size(); i++) {
                if (color.equals(listbook.get(i).getColor())) {
                    newlist.add(listbook.get(i));
                }
            }
        }


        return newlist;
    }


    public String toString() {
        return name + " / " + RAM + " / " + OS + " / " + color + "\n";
    }
}
