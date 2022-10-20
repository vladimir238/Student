package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Student;
import model.University;

import java.util.List;

public class JsonUtil {




    public static String jsonUnSerialStudent(Student stu) {
        Gson gson = new Gson();
        String json = gson.toJson(stu);
        return json;
    }




    public static String jsonUnSerialUniversity(University un) {
        Gson gson = new Gson();
        String json = gson.toJson(un);
        return json;
    }




    public static University jsonOneSerialUniversity(String sun) {
        Gson gson = new Gson();
        return gson.fromJson(sun, University.class);

    } public static Student jsonOneSerialStudent(String sun) {
        Gson gson = new Gson();
        return gson.fromJson(sun, Student.class);

    }
    public static String writeListToJson(List<?> list) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(list);
    }


}


