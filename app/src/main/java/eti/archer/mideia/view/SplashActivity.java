package eti.archer.mideia.view;

import static eti.archer.mideia.core.AppUtil.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import eti.archer.mideia.R;
import eti.archer.mideia.controller.ClienteController;
import eti.archer.mideia.core.AppUtil;
import eti.archer.mideia.model.Cliente;

public class SplashActivity extends AppCompatActivity {

    Cliente objetoCliente;
    ClienteController clienteController;
    TextView textView;
    TextView textView2;
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView = findViewById(R.id.textView);
        textView.setText(AppUtil.nomeEmpresa());
        textView2 = findViewById(R.id.textView2);
        textView2.setText(AppUtil.versaoDoAplicativo());
        textView3 = findViewById(R.id.textView2);
        textView3.setText(AppUtil.versaoDoAplicativo());



        clienteController = new ClienteController();
        trocarTela();
    }

    private void trocarTela() {
        Log.d(TAG,"trocarTela: Mudando de tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                objetoCliente = new Cliente("Renato Leal da Silva","renatolealhiss@gmail.com","87991600796",39,true);

                Log.d(TAG,"trocarTela: Esperando o tempo...");
                Intent trocaDeTela = new Intent(SplashActivity.this,MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("nome",objetoCliente.getNome());
                bundle.putString("email",objetoCliente.getEmail());

                trocaDeTela.putExtras(bundle);

                startActivity(trocaDeTela);
                finish();
            }
        },tempoDeEspera(5));

    }

    private int tempoDeEspera(int segundos){
        int mil = 1000;
        return mil * segundos;
    }

}