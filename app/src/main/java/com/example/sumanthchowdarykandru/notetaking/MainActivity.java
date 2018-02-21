package com.example.sumanthchowdarykandru.notetaking;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

   static ArrayList<String> noteTakingArrayList = new ArrayList<>();
    static ArrayAdapter noteTakingArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView noteListView = (ListView) findViewById(R.id.noteListView);
         noteTakingArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,noteTakingArrayList);
        noteListView.setAdapter(noteTakingArrayAdapter);
        noteTakingArrayList.add("Sumanth's note");
        noteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent goToNoteEditTakingActivity = new Intent(MainActivity.this,NotesEdit.class);
                goToNoteEditTakingActivity.putExtra("noteTakingId",i);
                startActivity(goToNoteEditTakingActivity);
            }
        });
    }
}
