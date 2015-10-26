package com.example.usuario.freelancerp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void  MostrarValor (View view) {
//        Toast Toast = Toast.makeText(getApplicationContext(),"Has hecho un click",Toast.LENGTH_LONG);
        EditText Mes = (EditText) findViewById(R.id.SalarioIdealMes);
        SeekBar Barra = (SeekBar) findViewById(R.id.seekBar);
        TextView Cobrar = (TextView) findViewById(R.id.Cobrar);

        Integer Horas = Barra.getProgress();

        Cobrar.setText(Mes.getText()+ Horas.toString() );




    }
}
