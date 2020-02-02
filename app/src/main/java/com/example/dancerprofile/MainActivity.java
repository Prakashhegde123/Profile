package com.example.dancerprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private RecyclerView recyclerView;
    private static ArrayList<String> arrayList = new ArrayList<>();
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.nested);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle("PROFILE");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Name");

        recyclerView = (RecyclerView) findViewById(R.id.recycler_profile_id);

        getURL();

        RecyclerViewSpacing spacing = new RecyclerViewSpacing(20, 20);
        recyclerView.setAdapter(new RecyclerViewAdapter(this, arrayList));
        ViewCompat.setNestedScrollingEnabled(recyclerView, false);
        recyclerView.addItemDecoration(spacing);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fab.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(MainActivity.this, R.color.fabbutn)));
                Snackbar.make(view, "Liked Respective profile", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resource, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item1) {
            Toast.makeText(this,"Settings clicked",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.item2) {
            Toast.makeText(this,"About clicked",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static void getURL() {
        arrayList.add("https://images.pexels.com/photos/1701195/pexels-photo-1701195.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1886694/pexels-photo-1886694.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1105666/pexels-photo-1105666.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1450116/pexels-photo-1450116.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/270789/pexels-photo-270789.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1638051/pexels-photo-1638051.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1701194/pexels-photo-1701194.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1709920/pexels-photo-1709920.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1701209/pexels-photo-1701209.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/2285932/pexels-photo-2285932.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1510540/pexels-photo-1510540.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1164975/pexels-photo-1164975.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/3370598/pexels-photo-3370598.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/3185323/pexels-photo-3185323.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/175658/pexels-photo-175658.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1701198/pexels-photo-1701198.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/1226740/pexels-photo-1226740.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        arrayList.add("https://images.pexels.com/photos/339352/carnival-fasnet-swabian-alemannic-wooden-mask-339352.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
    }
}
