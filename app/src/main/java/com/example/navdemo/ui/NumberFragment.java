package com.example.navdemo.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdemo.R;

public class NumberFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";

    private String mParam1;

    public NumberFragment() {
        // Required empty public constructor
    }

    public static NumberFragment newInstance(String param1) {
        return new NumberFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_number, container, false);
    }
}