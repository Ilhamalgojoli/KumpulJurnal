import java.util.ArrayList;
import java.util.Collections;

public class GenericBarang <E extends Comparable<? super E>>{
    public ArrayList<E> list;

    public GenericBarang() {
        this.list = new ArrayList<E>();
    }

    public void addItem(E data){
        list.add(data);
    }

    public void removeItem(int index){
        list.remove(index);
    }

    public void editItem(int index, E data){
        list.add(index, data);
    }
    public void print(){
        Collections.sort(list); //untuk ngesort
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}