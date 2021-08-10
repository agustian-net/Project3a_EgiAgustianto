package vsga.mobile.project3_egiagustianto;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private final String[] namanegara = new String[]{
            "Indonesia", "Malaysia", "Singapore",
            "Italia", "Inggris", "Belanda",
            "Argentina", "Chile", "Mesir", "Uganda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menampilkan judul
        getSupportActionBar().setTitle("ListView Sederhana");

        //memformat data
        ListView lvItem = (ListView) findViewById(R.id.listNegara);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namanegara);

        //menset data didalam list view
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(MainActivity.this, "Memilih : "+namanegara[position], Toast.LENGTH_LONG).show());
    }
}