package com.example.learntocode.ui.html_paragraphs;

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

public class HtmlParagraphsFragment extends Fragment {

    private HtmlParagraphsViewModel htmlParagraphsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        htmlParagraphsViewModel =
                ViewModelProviders.of(this).get(HtmlParagraphsViewModel.class);
        View root = inflater.inflate(R.layout.activity_html_heading, container, false);
        final TextView textView = root.findViewById(R.id.text_html_heading);
        htmlParagraphsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}