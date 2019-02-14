package com.andela.meetup.androidmeetup;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NotesAdapter extends ListAdapter<NoteItem, NotesViewHolder> {

    public NotesAdapter() {
        super(new NotesDiffer());
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewToBeInflated = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.note_list_item, viewGroup, false);
        return new NotesViewHolder(viewToBeInflated);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder notesViewHolder, int position) {
        notesViewHolder.bind(getItem(position));
    }
}
