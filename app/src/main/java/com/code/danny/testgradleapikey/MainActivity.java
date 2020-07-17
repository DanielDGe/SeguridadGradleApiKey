package com.code.danny.testgradleapikey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*Gradle API Key
    * Nos soluciona el problema de subir las claves a repositoriso publicos
    * como github, a traves de las propiedas se le especifica no cargarles.
    * Eso ofrece en seguridad.
    *
    * Lo que no ofrece es que cuando subas tu apk a la playstore, algun hacker
    * se la descargue, decompile y podrá extraer las key.
    *
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String pruebaAPIKEY = BuildConfig.FacebookAppId;
        Log.d("TAG", pruebaAPIKEY);

    }
}
