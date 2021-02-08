import com.company.Lecture;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class BagOfLectures <T, U>{
    private HashMap<T, U> bagOfLectures = new LinkedHashMap<T,U>();

    public void AddLecture(T index, U obj){     //addes lecture to the bag
        bagOfLectures.put(index, obj);
    }

    public void removeLecture(T index){
        bagOfLectures.remove(index);       //removes lecture from the bag
    }

    public void  clearLecture(){
        bagOfLectures.clear();    //clears the lecture bag
    }
}
