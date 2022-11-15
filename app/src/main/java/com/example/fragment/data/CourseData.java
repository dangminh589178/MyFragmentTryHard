package com.example.fragment.data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Create by Minh at 12/11/2022
 **/
public class CourseData  {
    private final String[] listName = {"atuanusemobile", "haugai", "keyboard", "livelesson", "main"};

    public ArrayList<Course> courseList(){
        ArrayList<Course> list = new ArrayList<>();
        for (int i = 0; i < listName.length ; i++) {
            Course course = new Course(listName[i], listName[i].replace(" ", "").toLowerCase());
            list.add(course);
        }
        return list;
    }
}
