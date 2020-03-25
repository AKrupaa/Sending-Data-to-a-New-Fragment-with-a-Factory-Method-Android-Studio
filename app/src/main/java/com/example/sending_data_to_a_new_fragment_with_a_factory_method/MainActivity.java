package com.example.sending_data_to_a_new_fragment_with_a_factory_method;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        wyślij dane do fragmentu poprzez argumenty ;)
//        pyk "konstruktor" dokladnie -> metoda statyczna, ktora ma obiekt klasy w sobie i na niej zarzadzamy :)
//        potem zwrocona, i działamy tutaj ;)
        ExampleFragment fragment = ExampleFragment.newInstance_dowolna_nazwa("example text", 2);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }
}
