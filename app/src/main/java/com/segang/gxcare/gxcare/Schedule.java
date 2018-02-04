package com.segang.gxcare.gxcare;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Schedule extends Fragment {

    public static int [] IMAGES = {R.mipmap.ic_launcher};

    public static String [] NAMES = {"Tylenol"};

    public static String [] DESCRIPTIONS = {"Pain killer"};

    public Schedule() {
        // Required empty public constructor
    }

    public static Schedule newInstance() {
        Schedule schedule = new Schedule();
        return schedule;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        ListView listView = view.findViewById(R.id.schedule_list);

        CustomAdapter customAdapter = new CustomAdapter(getContext());

        listView.setAdapter(customAdapter);

        // Inflate the layout for this fragment
        return view;
    }

}
