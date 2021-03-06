import java.util.ArrayList;
import java.util.Formatter;

public class StudentClass<Type> {
    public String getQuery(String studentData, String query) {
        String[] queryArray = query.split(",");
        String str = "";
        int queryType = Integer.parseInt(queryArray[0]);
        if (queryType == 1) {
            StudentList<String> studentList = new StudentList<>();
            String[] names = studentData.split(" ");
            for (int i = 0; i < names.length; i++) {
                studentList.addElement(names[i]);
            }
            ArrayList<String> namesList = studentList.beginWith(queryArray[1]);
            for (String name : namesList) {
                str += (name + "\n");
            }
        }else if (queryType == 2) {
            StudentList<String> studentList = new StudentList<>();
            String[] names = studentData.split(" ");
            for (int i = 0; i < names.length; i++) {
                studentList.addElement(names[i]);
            }
            String[] groups = queryArray[1].split(" ");
            ArrayList<String> namesList = studentList.bloodGroupOf(groups, queryArray[2]);
            for (String name : namesList) {
                str+= (name + "\n");
            }
        } else if (queryType == 3) {
            StudentList<Double> studentList = new StudentList<>();
            String[] scores = studentData.split(" ");
            for (String score : scores) {
                studentList.addElement(Double.parseDouble(score));
            }
            int count = studentList.thresholdScore(Integer.parseInt(queryArray[1]));
            System.out.println(count + " students scored " + queryArray[1] + " above");
        } else if (queryType == 4) {
            ScoreList<Double> scoreList = new ScoreList<>();
            String[] scores = studentData.split(" ");
            for (String score : scores) {
                scoreList.addElement(Double.parseDouble(score));
            }
            double average = scoreList.averageValues();
            Formatter f = new Formatter();
            f.format("%.2f",average);
            str = String.valueOf(f);
        } else if (queryType == 5) {
            ScoreList<Double> scoreList = new ScoreList<>();
            String[] scores = studentData.split(" ");
            for (String score : scores) {
                scoreList.addElement(Double.parseDouble((score)));
            }
            double average = scoreList.averageValues();
            Formatter f = new Formatter();
            f.format("%.2f",average);
            str = String.valueOf(f);
        }
        return str;
    }
}
