import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        Male dung = new Male();
        Male dax = new Male();
        Female anh1 = new Female();
        Female anh2 = new Female();
        Male dat = new Male();
        Female anh3 = new Female();
        Male nam = new Male();
        Female anh4 = new Female();
        System.out.println(Female.studentsList);
        Female.studentsList = test.sortList(Female.studentsList);
        System.out.println(Female.studentsList);
    }

    public ArrayList<Student> sortList(ArrayList<Student> studentList){
        Queue<Female> queueFemale = new LinkedList<>();
        Queue<Male> queueMale = new LinkedList<>();
        ArrayList<Student> newList = new ArrayList<>();

        for(int i = 0; i < studentList.size(); i++){
            Student element = studentList.get(i);
            if(element instanceof Female){
                queueFemale.add((Female) element);
            }
            if(element instanceof Male){
                queueMale.add((Male) element);
            }
        }


        while(0 < queueFemale.size()){
            newList.add(queueFemale.remove());

        }
        while(0 < queueMale.size()){
            newList.add(queueMale.remove());
        }
        return newList;
    }
}
