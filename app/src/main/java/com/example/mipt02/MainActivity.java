package com.example.mipt02;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import utilities.TextCounter;
public class MainActivity extends AppCompatActivity {

    public Spinner spSelectionOptions;
    public EditText edPhrase;
    public TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvMain = findViewById(R.id.tvMain);

        this.spSelectionOptions = (Spinner) findViewById(R.id.spSelectionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selection_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectionOptions.setAdapter(adapter);

    }

    public void onBtnCountClick(View view){
        String selectedOption = this.spSelectionOptions.getSelectedItem().toString();
        String charactersSelectedOption = getResources().getString(R.string.character_selection);
        String wordsSelectedOption = getResources().getString(R.string.words_selection);
        String emptyInputError = getResources().getString(R.string.empty_input_error);

        String userInput = this.edPhrase.getText().toString();
        if(TextUtils.isEmpty(userInput)){
            Toast.makeText(getBaseContext(),emptyInputError, Toast.LENGTH_SHORT).show();
        }
        else {
            if(selectedOption.equals(charactersSelectedOption)){
                this.tvMain.setText(TextCounter.getCharacterCount(userInput));
            }
            if(selectedOption.equals(wordsSelectedOption)){
                this.tvMain.setText(TextCounter.getWordCount(userInput));
            }
        }
    }
}