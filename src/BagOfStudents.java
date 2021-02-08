import com.company.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class BagOfStudents <T,U>{
    private HashMap<T,U> BagOfStudents = new LinkedHashMap<T, U>();


    public void addStudent(T index, U obj){
        BagOfStudents.put(index, obj);     //Add student
    }

    public void removeStudent(T index){
        BagOfStudents.remove(index);   //removes student by Level Id
    }

    public void clear(){
        BagOfStudents.clear();   //clear the hashmap
    }

    public HashMap<T,U> getBagOfStudents(){
        return BagOfStudents;
    }
}
