package com.example.diginews.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.diginews.MainActivity;
import com.example.diginews.Popup4Activity;
import com.example.diginews.Popup5Activity;
import com.example.diginews.PopupActivity;
import com.example.diginews.R;

public class HomeFragment extends Fragment {
    private Button btn_popup1, btn_popup2, btn_popup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_fragment, container, false);
        btn_popup1 = v.findViewById(R.id.bnt_popup1);
        btn_popup2 = v.findViewById(R.id.bnt_popup2);
        btn_popup = v.findViewById(R.id.bnt_popup);
        btn_popup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Popup4Activity.class);
                startActivity(intent);

            }
        });
        btn_popup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getContext(), Popup5Activity.class);
                startActivity(intent);

            }
        });

        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment.this.getContext(), PopupActivity.class);
                startActivity(intent);

            }
        });
        return v;
    }
}
