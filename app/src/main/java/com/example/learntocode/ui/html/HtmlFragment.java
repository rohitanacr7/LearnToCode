package com.example.learntocode.ui.html;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.learntocode.R;
import com.example.learntocode.ui.html_editor.HtmlEditorFragment;

public class HtmlFragment extends Fragment {

    private HtmlViewModel htmlViewModel;

    Button b1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        htmlViewModel =
                ViewModelProviders.of(this).get(HtmlViewModel.class);
        View root = inflater.inflate(R.layout.activity_page1, container, false);
        final TextView textView = root.findViewById(R.id.text_html);
        htmlViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

            }
        });


        return root;
    }
}