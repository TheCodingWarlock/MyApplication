package com.andela.meetup.androidmeetup;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final NotesAdapter notesAdapter = new NotesAdapter();
        final EditText noteEditText = findViewById(R.id.note_input_edit_text);
        RecyclerView notesRecyclerView = findViewById(R.id.notes_recyler_view);
        notesRecyclerView.setAdapter(notesAdapter);

        final ArrayList<NoteItem> notes = new ArrayList<>();

        FloatingActionButton fab = findViewById(R.id.add_note_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = noteEditText.getText().toString();
                notes.add(new NoteItem(input));
                notesAdapter.notifyDataSetChanged();
            }
        });
        notesAdapter.submitList(notes);
    }

}
