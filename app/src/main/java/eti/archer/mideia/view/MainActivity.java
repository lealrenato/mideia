package eti.archer.mideia.view;

import static eti.archer.mideia.core.AppUtil.TAG;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import eti.archer.mideia.R;


public class MainActivity extends AppCompatActivity {

    TextView textNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        Bundle bundle = getIntent().getExtras();

        textNome = findViewById(R.id.nome);
        textNome.setText(bundle.getString("nome"));

        textNome = findViewById(R.id.textEmail);
        textNome.setText(bundle.getString("email"));

        Log.d(TAG, "onCreate: tela trocada ");


    }



}