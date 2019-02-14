package com.andela.meetup.androidmeetup;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class NotesViewHolder extends RecyclerView.ViewHolder {

    private TextView noteTextView;

    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
        noteTextView = itemView.findViewById(R.id.note_text_view);
    }

    public void bind(NoteItem item) {
        noteTextView.setText(item.getName());
    }
}
