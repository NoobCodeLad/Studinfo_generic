import java.util.*;

public class ScoreList <Type extends Number>{

    //Write your code
    ArrayList<Type> scArrayList = new ArrayList<>();

    public void addElement(Type type) {
        scArrayList.add(type);
    }

    public void removeElement(Type type) {
        scArrayList.remove(type);
    }

    public void getElement(int index) {
        scArrayList.get(index);
    }

    public double averageValues() {
        double sum = 0;
        for (Type score1 : scArrayList) {
            Object obj = score1;
            double score = (double)obj;
            sum = sum + score;
        }
        return sum / scArrayList.size();

    }
}
