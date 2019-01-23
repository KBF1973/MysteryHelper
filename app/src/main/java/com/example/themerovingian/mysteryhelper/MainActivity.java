package com.example.themerovingian.mysteryhelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> plots;
    ArrayList<String> newPlots = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plots = new ArrayList<>();
        plots.add("you get knocked out");
        plots.add("you go somewhere else");
        plots.add("you find a dead man");
        plots.add("you find a dead woman");
        plots.add("you meet a buxom blond");
        plots.add("someone has searched the place");
        plots.add("a crooked cop warns you");
        plots.add("you are arrested");
        plots.add("you find a gun");
        plots.add("you find a knife");
        plots.add("you find a frayed rope");
        plots.add("a bullet whizzes past your ear!");
        plots.add("you are almost run over");
        plots.add("you are being followed");
        plots.add("you smell familiar perfume");
        plots.add("the telephone rings");
        plots.add("there is a knock at the door");
        plots.add("you hear footsteps behind you ...");
        plots.add("you hear a gunshot!");
        plots.add("you hear a scream!");
        plots.add("you are not alone ...");
        plots.add("... forget this story, it stinks");

        for(int i = 0; i < plots.size(); i++){
            newPlots.add(plots.get(i));
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    public void generatePlot(View view) {

        Random ran = new Random();

        ((TextView) findViewById(R.id.mysteryPlot)).setText(newPlots.remove(ran.nextInt(newPlots.size())));

        if(newPlots.isEmpty()){
            for(int i = 0; i < plots.size(); i++){
                newPlots.add(plots.get(i));
            }
        }

        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}










