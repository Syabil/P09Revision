package com.example.a16019990.moviecustomarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Contacts> alContacts;
    CustomAdapter caContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        alContacts = new ArrayList<>();

        Contacts item1 = new Contacts("Mary", 65, 65442334);
        Contacts item2 = new Contacts("Ken", 65, 97442437);
        alContacts.add(item1);
        alContacts.add(item2);

        caContacts = new CustomAdapter(this, R.layout.contacts_item, alContacts);

        lvMovie.setAdapter(caContacts);
    }

}
