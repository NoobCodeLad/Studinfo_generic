import java.util.ArrayList;

public class StudentList<Type> {
    ArrayList<Type> stArrayList = new ArrayList<>();

    public void addElement(Type type) {
        stArrayList.add(type);
    }

    public void removeElement(Type type) {
        stArrayList.remove(type);
    }

    public void getElement(int index) {
        stArrayList.get(index);
    }

    public ArrayList<String> beginWith(String data) {
        ArrayList<String> names = new ArrayList<>();
        for (Type name : stArrayList) {
            if (name.toString().startsWith(data.toLowerCase()) || name.toString().startsWith(data.toUpperCase())) {
                names.add(name.toString());
            }
        }
        return names;
    }

    public ArrayList<String> bloodGroupOf(String[] groups, String group) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < groups.length; i++) {
            if (groups[i].equals(group)) {
                names.add(stArrayList.get(i).toString());
            }
        }
        return names;
    }

    public int thresholdScore(int score) {
        int i = 0;
        for (Type score1 : stArrayList) {
            Object obj = score1;
            double scoreInt = (double) obj;
            if (scoreInt >= score) {
                i++;
            }
        }
        return i;
    }
}
