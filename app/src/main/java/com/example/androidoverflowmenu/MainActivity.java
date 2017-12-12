package com.example.androidoverflowmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.toolbar);

        toolbar.setTitle("Android Overflow Menu Icon Tutorial");

        toolbar.setTitleTextColor(Color.WHITE);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.toolbar_main_menu,menu);

        if(menu instanceof MenuBuilder){

            MenuBuilder menuBuilder = (MenuBuilder) menu;
            menuBuilder.setOptionalIconsVisible(true);
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.ADD:
                Toast.makeText(getApplicationContext(),"Add Clicked",Toast.LENGTH_LONG).show();
                return true;

            case R.id.CALL_BACK:
                Toast.makeText(getApplicationContext(),"Call Back Clicked",Toast.LENGTH_LONG).show();
                return true;

            case R.id.CAMERA:
                Toast.makeText(getApplicationContext(),"Camera Clicked",Toast.LENGTH_LONG).show();
                return true;

            case R.id.CART:
                Toast.makeText(getApplicationContext(),"Cart Clicked",Toast.LENGTH_LONG).show();
                return true;

            case R.id.VIDEO:
                Toast.makeText(getApplicationContext(),"Video Clicked",Toast.LENGTH_LONG).show();
                return true;

            default:

                super.onOptionsItemSelected(item);

        }
        return true;

    }
}
