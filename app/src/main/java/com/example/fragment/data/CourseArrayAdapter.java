package com.example.fragment.data;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.fragment.R;

import java.util.List;

/**
 * Create by Minh at 12/11/2022
 **/
public class CourseArrayAdapter extends ArrayAdapter<Course> {
    private Context context;
    private List<Course> courses;

    public CourseArrayAdapter(@NonNull Context context, int resource, @NonNull List<Course> course) {
        super(context, resource, course);
        this.context = context;
        this.courses = course;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.course_listitem,null);
        Course course = courses.get(position);

        ImageView imageView = view.findViewById(R.id.imgCourse);
        imageView.setImageResource(course.getImageResourceId(context));

        TextView textView = view.findViewById(R.id.tvCourseName);
        textView.setText(course.getCourseName());
        return view;
    }
}
