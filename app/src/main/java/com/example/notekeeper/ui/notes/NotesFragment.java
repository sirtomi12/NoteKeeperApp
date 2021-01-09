package com.example.notekeeper.ui.notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.notekeeper.R;

public class NotesFragment extends Fragment {

    private NotesViewModel mNotesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mNotesViewModel =
                ViewModelProviders.of(this).get(NotesViewModel.class);
        View root = inflater.inflate(R.layout.item_note_list, container, false);
        mNotesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}