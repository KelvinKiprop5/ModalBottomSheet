package com.example.kevoh3.modalbottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Kevoh3 on 8/6/2018.
 */

public class ExampleBottomSheetDialog extends BottomSheetDialogFragment {

    private BottomSheetListener bottomSheetListener;

    public ExampleBottomSheetDialog() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.bottom_sheet_layout, container, false);

        Button button1 = view.findViewById(R.id.btn1);
        Button button2 = view.findViewById(R.id.btn2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetListener.onButtonClicked("Button one clicked");
                dismiss();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetListener.onButtonClicked("Button Two clicked");
                dismiss();
            }
        });


        return view;
    }

    public interface BottomSheetListener{
        void onButtonClicked(String text); //You can return anything e.g int, double etc
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            bottomSheetListener = ( BottomSheetListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+" Must implement Bottom sheee listener");

        }

    }
}