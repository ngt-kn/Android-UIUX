package com.ngtkn.bottomsheetdialog;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout bottomSheetLayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView share;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomSheetLayout = findViewById(R.id.design_bottom_sheet);
        share = findViewById(R.id.shareimg);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetLayout);
        // set initial state to hidden
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the bottom sheet
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}
