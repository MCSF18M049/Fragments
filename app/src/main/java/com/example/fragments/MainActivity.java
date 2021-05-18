package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
   //instance of fragnence
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fragment1(View view) {
        fragmentTransaction= getSupportFragmentManager().beginTransaction();
        BlankFragment blankFragment=new BlankFragment();
        fragmentTransaction.replace(R.id.fragment,blankFragment);
        fragmentTransaction.commit();
    }

    public void fragment2(View view) {
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        Fragment2 fragment2=new Fragment2();
        fragmentTransaction.replace(R.id.fragment,fragment2);
        fragmentTransaction.commit();
    }
}