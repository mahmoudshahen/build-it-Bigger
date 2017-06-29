package shahen.mahmoud.showjoke;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by harty on 6/28/2017.
 */

public class JokeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity);
        TextView textViewJoke = (TextView) findViewById(R.id.tv_joke);
        String joke = getIntent().getStringExtra("joke");
        textViewJoke.setText(joke);
    }
}
