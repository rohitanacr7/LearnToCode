package com.example.learntocode.ui.html_heading;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.learntocode.R;

public class HtmlHeadingFragment extends Fragment {

    private HtmlHeadingViewModel htmlHeadingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        htmlHeadingViewModel =
                ViewModelProviders.of(this).get(HtmlHeadingViewModel.class);
        View root = inflater.inflate(R.layout.activity_html_paragraphs, container, false);
        final TextView textView = root.findViewById(R.id.text_html_paragraphs);
        htmlHeadingViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}