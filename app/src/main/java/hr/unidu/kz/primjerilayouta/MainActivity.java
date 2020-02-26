package hr.unidu.kz.primjerilayouta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b = (Button)findViewById(R.id.gumbGrid);
        b.setText("Prikaz Grid Layouta");
        // Drugi način kako se može postaviti listener na komponentu
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // POratak na izvorni tekst
                b.setText("Grid layout");
                grid(b);
            }
        });
    }

    public void grid(View view) {
        Button b = (Button)view;
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
