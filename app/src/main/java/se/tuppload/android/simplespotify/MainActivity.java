package se.tuppload.android.simplespotify;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_MESSAGE = "se.tuppload.android.simplespotify";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showPop(View view) {
        Intent intent = new Intent(this, ShowNewMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "bajs");
        Toast.makeText(this, "this works!", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }
}
