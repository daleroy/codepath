package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditTextSave;
    int position;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etEditTextSave = (EditText) findViewById(R.id.etEditTextSave);
        position = getIntent().getIntExtra("position", 0);
        value = getIntent().getStringExtra("value");
        etEditTextSave.setText(value);
        etEditTextSave.setSelection(value.length());
    }

    public void onSaveItem(View view) {
        Intent main = new Intent();

        main.putExtra("position", position);
        main.putExtra("value", etEditTextSave.getText().toString());

        setResult(RESULT_OK, main);
        finish();
    }
}
