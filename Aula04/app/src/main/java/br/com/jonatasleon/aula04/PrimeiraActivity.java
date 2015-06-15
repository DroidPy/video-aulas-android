package br.com.jonatasleon.aula04;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by jonatasleon on 14/06/15.
 */
public class PrimeiraActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeiro_layout);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Outro texto");
        }
    };
}
