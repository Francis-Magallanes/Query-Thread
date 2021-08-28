package com.example.qt_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment
{
    TextView titleQuestion;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home_layout, container, false);
        titleQuestion= (TextView) view.findViewById(R.id.textView_titleq);

        if(titleQuestion != null){
            titleQuestion.setOnClickListener( new View.OnClickListener(){
                @Override
                public void onClick(View V){
                    Intent intent = new Intent(view.getContext(), AnswerActivity.class);
                    startActivity(intent);
                }
            });
        }



        return view;
    }
}
