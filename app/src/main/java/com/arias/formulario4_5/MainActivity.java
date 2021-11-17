package com.arias.formulario4_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Añadimos los atributos de los tipos de controles introducidos

    //botones
    public Button enviar;
    //editText & TextView
    public EditText nombre;
    public EditText apellido;
    public TextView preferencias;
    public TextView estadoCivil;
    public TextView resultado;
    //checkBox
    public CheckBox belleza, libros, familia, comidas;
    //radioButton
    public RadioButton soltero, casado, divorciado, viudo;
    //Strings
    public String pref="";
    public String estado="";
    public String nom="";
    public String ape="";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //asignar a cada variable el control diseñado anteriormente (en el layout)
        //Button
        enviar=(Button) findViewById(R.id.btnEnviar);
        //EditText & TextView
        nombre=(EditText) findViewById(R.id.etNombre);
        apellido=(EditText) findViewById(R.id.etApellido);
        preferencias=(TextView) findViewById(R.id.tvPreferencias);
        estadoCivil=(TextView) findViewById(R.id.tvEstadoCivil);
        resultado=(TextView) findViewById(R.id.tvResultado);
        //CheckBox
        belleza=(CheckBox) findViewById(R.id.cbBelleza);
        libros=(CheckBox) findViewById(R.id.cbLibros);
        familia=(CheckBox) findViewById(R.id.cbFamilia);
        comidas=(CheckBox) findViewById(R.id.cbComidas);
        //RadioButton
        soltero=(RadioButton) findViewById(R.id.rbSoltero);
        casado=(RadioButton) findViewById(R.id.rbCasado);
        divorciado=(RadioButton) findViewById(R.id.rbDivorciado);
        viudo=(RadioButton) findViewById(R.id.rbViudo);
    }
    /*
    public void checkBoxClicked(View view){
        String preferencia="";
        if()
    }
    */

    public void btnEnviarClicked(View view){
        //obtencion del nombre y apellidos
        nom=nombre.getText().toString();
        ape=apellido.getText().toString();
        //comprobacion de que checkbox estan marcados
        if (belleza.isChecked()){
            pref= pref + " -" + belleza.getText().toString();
        }
        if (libros.isChecked()){
            pref= pref + " -" + libros.getText().toString();
        }
        if (familia.isChecked()){
            pref= pref + " -" + familia.getText().toString();
        }
        if (comidas.isChecked()){
            pref= pref + " -" + comidas.getText().toString();
        }

        //comprobacion de que radioButton esta marcado
        if(soltero.isChecked()){
            estado=soltero.getText().toString();
        }else if(casado.isChecked()){
            estado=casado.getText().toString();
        }else if(divorciado.isChecked()){
            estado=divorciado.getText().toString();
        }else if(viudo.isChecked()){
            estado=viudo.getText().toString();
        }

        //mostrando la informacion en un TextView
        resultado.setText("Usted es "+nom+" "+ ape+" y está "+estado+". Sus preferencias son: "+
                pref);

        /*
        public void onRadioButtonClicked(View view) {
        boolean marcado = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rb_corporativo:
                if (marcado) {
                    mostrarParticular(false);
                }
                break;

            case R.id.rb_particular:
                if (marcado) {
                    mostrarParticular(true);
                }
                break;
        }
    }
         */
    }
}
