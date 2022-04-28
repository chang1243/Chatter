package com.example.chatter.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.chatter.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentStatus#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentStatus extends Fragment {



    public fragmentStatus() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_status, container, false);







        return view;
    }
}