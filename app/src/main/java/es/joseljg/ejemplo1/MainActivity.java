package es.joseljg.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int cont = 0;
private TextView txt_numero = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("prueba", "esto es para segir el programa");
        cont = 0;
        txt_numero = (TextView) findViewById(R.id.txt_numero);
    }

    public void prueba(View view) {
        Toast.makeText(this,"ESTO ES UNA PRUEBA", Toast.LENGTH_LONG).show();
        cont++;
        txt_numero.setText(String.valueOf(cont));

    }
}