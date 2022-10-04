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
    public static final String EXTRA_ID = "com.timzowen.mvvmjava.EXTRA_ID";
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
        numberPicker.setMaxValue(10);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_close_24);
        setTitle("Add Note.");

        Intent editIntent = getIntent();
        if (editIntent.hasExtra(EXTRA_ID)){
            setTitle("Edit Note");
            mTitleEdit.setText(editIntent.getStringExtra(EXTRA_TITLE));
            mDescEdit.setText(editIntent.getStringExtra(EXTRA_DESC));
            numberPicker.setValue(editIntent.getIntExtra(EXTRA_PRIORITY,1));
        }

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

            int id = getIntent().getIntExtra(EXTRA_ID,-1);
            if (id != -1){
                dataIntent.putExtra(EXTRA_ID,id);
            }

            setResult(RESULT_OK, dataIntent);
            finish();
        });

    }
}