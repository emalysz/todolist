package com.example.emalysz.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class editItemActivity extends AppCompatActivity {

    EditText etEditItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etEditItem = (EditText)findViewById(R.id.etEditItem);

        String item = getIntent().getStringExtra("item_to_edit");
        etEditItem.setText(item);
        etEditItem.setSelection(item.length());
    }

    public void onSave(View v){
        Intent i = new Intent();
        String item = etEditItem.getText().toString();
        i.putExtra("edited_listitem", item);
        setResult(RESULT_OK, i);
        finish();
    }
}
