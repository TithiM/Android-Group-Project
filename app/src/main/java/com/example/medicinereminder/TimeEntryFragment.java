package com.example.medicinereminder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;

public class TimeEntryFragment extends DialogFragment {
    private int frequency;

    public TimeEntryFragment(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        // Find the LinearLayout in the fragment layout
        LinearLayout layout = view.findViewById(R.id.timeEntriesLayout);

        // Create frequency number of TextViews dynamically
        TextView textView = view.findViewById(R.id.timeEntryText);
        textView.setText("Medicine 1: " + frequency + " times");

        return view;
    }
}
