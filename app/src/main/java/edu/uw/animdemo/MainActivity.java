package edu.uw.animdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main";

    private DrawingView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (DrawingView)findViewById(R.id.drawingView);

    }



    /** Menus **/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.menu_pulse:
                //make the ball change size!

                return true;
            case R.id.menu_button:
                startActivity(new Intent(MainActivity.this, ButtonActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
