import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    static List<Student> student;
    static List<University> universitie;


    public static String jsonUnSerialStudentList(List<Student> st) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(st);
        return json;
    }

    public static String jsonUnSerialStudent(Student stu) {
        Gson gson = new Gson();
        String json = gson.toJson(stu);
        return json;
    }

    public static String jsonUnSerialUniversityList(List<University> unl) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(unl);
        return json;
    }


    public static String jsonUnSerialUniversity(University un) {
        Gson gson = new Gson();
        String json = gson.toJson(un);
        return json;
    }


    public static List<University> jsonSerialUniversity(String sun) {
        Gson gson = new Gson();
        return gson.fromJson(sun, new TypeToken<List<University>>() {
        }.getType());

    }
    public static University jsonOneSerialUniversity(String sun) {
        Gson gson = new Gson();
        return gson.fromJson(sun, University.class);

    } public static Student jsonOneSerialStudent(String sun) {
        Gson gson = new Gson();
        return gson.fromJson(sun, Student.class);

    }


}


