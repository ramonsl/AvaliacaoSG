package com.example.android.dicionario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> MyList = new ArrayList<Word>();


        MyList.add(new Word("One", "Um", "Eu vi um gato"));
        MyList.add(new Word("Two", "dois", "Eu vi dois gatos"));

        final WordAdapter adapter = new WordAdapter(this, MyList);
        ListView list = (ListView) findViewById(R.id.ListaNumeros);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word c = (Word) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), c.getPhrase(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                intent.putExtra("word", c);
                startActivity(intent);

            }
        });
    }


}
