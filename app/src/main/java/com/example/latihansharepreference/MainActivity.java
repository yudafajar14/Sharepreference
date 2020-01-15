package com.example.latihansharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button btn_applyText;
    private Button btnSave;
    private Button btnClear;
    private Switch switch1;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static final String SWITCH1 = "switch1";

    private String text;
    private Boolean switchOnOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);
        btn_applyText = findViewById(R.id.apply_text_button);
        btnSave = findViewById(R.id.save_button);
        btnClear = findViewById(R.id.clear_button);
        switch1 = findViewById(R.id.switch1);

        btn_applyText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });
        loadData();
        updateViews();
    }

    private void clear() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        sharedPreferences.edit().remove(TEXT).apply(); /*for spesifikasi*/
//        sharedPreferences.edit().remove(SWITCH1).commit(); /*for spesifikasi*/
        sharedPreferences.edit().clear().apply(); /*for all*/
        textView.setText("");
    }

    private void updateViews() {
        textView.setText(text);
        switch1.setChecked(switchOnOff);
    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT,"");
        switchOnOff = sharedPreferences.getBoolean(SWITCH1,false);

    }

    private void saveData() {

        SharedPreferences sharedPreferences  = getSharedPreferences(SHARED_PREFS,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT,textView.getText().toString());
        editor.putBoolean(SWITCH1, switch1.isChecked());

        editor.apply();

        Toast.makeText(this, "Data was save", Toast.LENGTH_SHORT).show();

    }
}
