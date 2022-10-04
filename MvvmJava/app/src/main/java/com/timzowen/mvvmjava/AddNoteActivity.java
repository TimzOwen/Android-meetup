package com.timzowen.mvvmjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

public class AddNoteActivity extends AppCompatActivity {

    private EditText mTitleEdit, mDescEdit;
    private Button mSaveBtn;
    private NumberPicker numberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        mTitleEdit = findViewById(R.id.editTextTitle);
        mDescEdit = findViewById(R.id.editTextDesc);
        mSaveBtn = findViewById(R.id.saveBtn);
        numberPicker = findViewById(R.id.number_picker);

        numberPicker.setMinValue(1);
        numberPicker.setMinValue(10);


    }
}