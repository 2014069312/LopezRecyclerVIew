package com.example.myrecycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_AndroidVersions;
    int[] logo;
    String[] codename, version, api, release;
    ArrayList<AndroidVersion> list;
    CustomAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_AndroidVersions = (RecyclerView) findViewById(R.id.rvAndroidVersions);
        logo = new int[]{R.drawable.cupcake, R.drawable.donut, R.drawable.eclair, R.drawable.froyo, R.drawable.gingerbread,
                        R.drawable.honeycomb, R.drawable.icecreamsandwhich, R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop,
                        R.drawable.marshmallow, R.drawable.nougat, R.drawable.oreo};
        codename = getResources().getStringArray(R.array.codename);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        release = getResources().getStringArray(R.array.release);

        list = new ArrayList<AndroidVersion>();

        layoutManager = new LinearLayoutManager(this);
        rv_AndroidVersions.setLayoutManager(layoutManager);
        rv_AndroidVersions.setHasFixedSize(true);

        for (int i=0; i < codename.length; i++) {
            list.add(new AndroidVersion(logo[i], codename[i], version[i], api[i], release[i]));

        }

        adapter = new CustomAdapter(list);

        rv_AndroidVersions.setAdapter(adapter);

    }
}
