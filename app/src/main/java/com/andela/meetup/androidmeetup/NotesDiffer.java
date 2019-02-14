package com.andela.meetup.androidmeetup;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

public class NotesDiffer extends DiffUtil.ItemCallback<NoteItem> {
    @Override
    public boolean areItemsTheSame(@NonNull NoteItem item, @NonNull NoteItem t1) {
        return item.equals(t1);
    }

    @Override
    public boolean areContentsTheSame(@NonNull NoteItem item, @NonNull NoteItem t1) {
        return item.getName().equals(t1.getName());
    }
}
