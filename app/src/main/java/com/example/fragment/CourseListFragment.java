package com.example.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.fragment.data.Course;
import com.example.fragment.data.CourseArrayAdapter;
import com.example.fragment.data.CourseData;
import com.example.fragment.util.ScreenUtility;

import java.util.List;

/**
 * Create by Minh at 10/11/2022
 **/
public class CourseListFragment extends ListFragment {

    List<Course> courseList = new CourseData().courseList();

    public CourseListFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CourseArrayAdapter courseArrayAdapter = new CourseArrayAdapter(getActivity(), R.layout.course_listitem, courseList);
        setListAdapter(courseArrayAdapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.course_list_fragment, container, false);
        return view;
    }
}
