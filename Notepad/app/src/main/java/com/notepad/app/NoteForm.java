package com.notepad.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NoteForm extends AppCompatActivity {

    private EditText notepad;
    private Button buttonsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_note_form);
        notepad=(EditText)findViewById(R.id.notepad);
        buttonsave=(Button)findViewById(R.id.buttonsave);
    }
    public void Home (View view){
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
