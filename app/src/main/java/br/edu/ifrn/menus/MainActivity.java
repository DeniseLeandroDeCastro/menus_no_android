package br.edu.ifrn.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.itemSalvar:
                Toast.makeText(MainActivity.this,
                        "Item salvar", Toast.LENGTH_SHORT).show();
                break;

            case R.id.itemEditar:
                Toast.makeText(MainActivity.this,
                        "Item editar", Toast.LENGTH_SHORT).show();
                break;

            case R.id.itemConfiguracao:
                Toast.makeText(MainActivity.this,
                        "Item configurações", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}