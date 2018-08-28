package com.example.kevoh3.modalbottomsheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleBottomSheetDialog.BottomSheetListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_btn_x_clicked);


        final Button btnOpenBottomSheet = findViewById(R.id.open_bottom_modal_sheet);
        btnOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ExampleBottomSheetDialog exampleBottomSheetDialog = new ExampleBottomSheetDialog();
                exampleBottomSheetDialog.show(getSupportFragmentManager(), "Example bottom sheet");

            }
        });
    }


    //Get data from exampleBottomSheetDialog interface
    @Override
    public void onButtonClicked(String text) {
        textView.setText(text);

    }
}
