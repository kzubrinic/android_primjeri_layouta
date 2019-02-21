package hr.unidu.kz.primjerilayouta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void grid(View view) {
        Intent i = new Intent(this, GridActivity.class);
        // Pokreće se odredišna aktivnost
        startActivity(i);
    }

    public void constraint(View view) {
        Intent i = new Intent(this, ConstraintActivity.class);
        // Pokreće se odredišna aktivnost
        startActivity(i);
    }

    public void linearniHorizontalni(View view) {
        Intent i = new Intent(this, LinearniActivity.class);
        // Pokreće se odredišna aktivnost
        startActivity(i);

    }
}
