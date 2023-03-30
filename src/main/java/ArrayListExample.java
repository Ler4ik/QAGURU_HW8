import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    List<Cat> cats = new ArrayList<>();

    public void addCat(String name){
        Cat cat = new Cat(name);
        cats.add(cat);
        System.out.println("Мы взяли нового котика: " + cat.getName());
    }

    public void getSize(){
        System.out.println("У нас есть " + cats.size() + " котиков");
    }

    public void getCat(Integer index){
        System.out.println("Для котика " + cats.get(index).getName() + " приготовлены аппартаменты номер " + index);
    }

    public void getAllCats(){
        System.out.println("Список всех котиков:");
       for(Cat cat:cats){
           System.out.println("имя котика: " + cat.getName());
       }
    }

    public void setCats(Integer index){
        for (int i = 0; i < index; i++){
            addCat("Pushok" + i);
        }
    }
}

