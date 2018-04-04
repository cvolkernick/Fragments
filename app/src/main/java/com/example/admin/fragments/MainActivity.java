package com.example.admin.fragments;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.admin.fragments.fragments.BlueFragment;
import com.example.admin.fragments.fragments.RedFragment;

public class MainActivity extends AppCompatActivity {

    private static final String BLUE_FRAG_TAG = "bluefragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddingFragments(View view) {


        switch(view.getId()) {
            case R.id.btnAddBlue:
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.flHolder1, new BlueFragment(), BLUE_FRAG_TAG)
                        .addToBackStack(BLUE_FRAG_TAG)
                        .commit();
                break;
            case R.id.btnAddRed:
                RedFragment redFragment = RedFragment.newInstance("FirstName", "LastName");

                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.flHolder2, redFragment, "REDTAG")
                        .addToBackStack("REDTAG")
                        .commit();
                break;
        }
    }
}
