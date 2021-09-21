package es.joseljg.cuadradonumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt_numero = null;
    private TextView txt_resultado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero = (EditText) findViewById(R.id.edt_numero);
        txt_resultado = (TextView) findViewById(R.id.txt_resultado_cuadrado);

    }

    public void cuadrado(View v) {
      //  Button boton = (Button) v;
      //  boton.setText("cambio el texto");

        String textonumero = String.valueOf(edt_numero.getText());
        double numero = Double.valueOf(textonumero);
        double resultado = numero * numero;
        txt_resultado.setText(String.valueOf(resultado));
        Toast.makeText(this,"el cuadrado vale " + String.valueOf(resultado),Toast.LENGTH_LONG).show();
    }
}