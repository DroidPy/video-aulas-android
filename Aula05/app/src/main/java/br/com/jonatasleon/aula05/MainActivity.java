package br.com.jonatasleon.aula05;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("AULA", "onCreate(Bundle)");

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(onClickListener);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("AULA", "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("AULA", "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("AULA", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("AULA", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("AULA", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("AULA", "onDestroy()");
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
            startActivity(intent);
        }
    };

}
