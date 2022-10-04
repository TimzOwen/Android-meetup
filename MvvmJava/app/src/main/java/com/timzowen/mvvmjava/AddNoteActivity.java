package com.timzowen.mvvmjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

public class AddNoteActivity extends AppCompatActivity {

    private EditText mTitleEdit, mDescEdit;
    private Button mSaveBtn;
    private NumberPicker numberPicker;

    public static final String EXTRA_TITLE = "com.timzowen.mvvmjava.EXTRA_TITLE";
    public static final String EXTRA_DESC = "com.timzowen.mvvmjava.EXTRA_DESC";
    public static final String EXTRA_PRIORITY = "com.timzowen.mvvmjava.EXTRA_PRIORITY";

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

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_close_24);

        mSaveBtn.setOnClickListener(view -> {
            String title = mTitleEdit.getText().toString();
            String desc = mDescEdit.getText().toString();
            int priority = numberPicker.getValue();

            if (title.trim().isEmpty() || desc.trim().isEmpty()){
                Toast.makeText(this,"Empty fields not allowed",Toast.LENGTH_SHORT).show();
            }

            Intent dataIntent = new Intent();
            dataIntent.putExtra(EXTRA_TITLE,title);
            dataIntent.putExtra(EXTRA_DESC, desc);
            dataIntent.putExtra(EXTRA_PRIORITY,priority);

            setResult(RESULT_OK, dataIntent);
            finish();
        });

    }
}