package com.example.anmcustomerfeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText mEtNumOfRadioBtns;
    Button mBtnAdd;
    String TAG = "TestActivity";
    RadioGroup mRgAllButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtNumOfRadioBtns = findViewById(R.id.et_no);
        mBtnAdd = findViewById(R.id.btn);
        mRgAllButtons = findViewById(R.id.radiogroup);

        Edit_text();
        text_view();
        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(mEtNumOfRadioBtns.getText().toString().trim());
                addRadioButtons(number);
            }
        });
    }

    public void addRadioButtons(int number) {
        mRgAllButtons.setOrientation(LinearLayout.VERTICAL);
        //
        for (int i = 1; i <= number; i++) {
            RadioButton rdbtn = new RadioButton(this);
            rdbtn.setId(View.generateViewId());
            rdbtn.setText("Radio " + rdbtn.getId());
            mRgAllButtons.addView(rdbtn);
        }
    }




    private void Edit_text() {
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linear_layout);

        EditText editText = new EditText(this);

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        editText.setLayoutParams(p);

        linearLayout.addView(editText);
    }

    private void text_view() {
        LinearLayout linearLayout1 = (LinearLayout)findViewById(R.id.linear_layout1);

        TextView textView= new TextView(this);

        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textView.setText("This text view is created Dynamically by set text");
        textView.setLayoutParams(p);
        linearLayout1.addView(textView);


    }
}