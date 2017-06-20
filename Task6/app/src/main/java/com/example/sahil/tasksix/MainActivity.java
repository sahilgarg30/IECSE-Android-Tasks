package com.example.sahil.tasksix;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    private FragmentManager mFragmentManager;
    private FirstFragment mFirstFrag;
    private SecondFrament mSecFrag;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSecFrag = new SecondFrament();
        mFirstFrag = new FirstFragment();
        mFragmentManager = getFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.myframe,mFirstFrag);
        mFragmentTransaction.commit();

    }

    public void changeFragment(View view) {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        if(mFirstFrag.isResumed())
            mFragmentTransaction.replace(R.id.myframe,mSecFrag);
        else
            mFragmentTransaction.replace(R.id.myframe,mFirstFrag);
        mFragmentTransaction.commit();
    }
}
