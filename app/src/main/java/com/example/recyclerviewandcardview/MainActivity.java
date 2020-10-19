package com.example.recyclerviewandcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Person> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        people=new ArrayList<Person>();
        people.add(new Person(R.drawable.p1,"Лосяш","Лесное животное"));
        people.add(new Person(R.drawable.p1,"Фимишин","Японский террорист"));
        people.add(new Person(R.drawable.p1,"Фимишин","Японский террорист"));
        people.add(new Person(R.drawable.p1,"Фимишин","Японский террорист"));
        people.add(new Person(R.drawable.p1,"Фимишин","Японский террорист"));
        LinearLayoutManager linearLayout=new LinearLayoutManager(this);
        rv=findViewById(R.id.rv);
        rv.setLayoutManager(linearLayout);
        OurAdapter adapter=new OurAdapter(people,this);
        rv.setAdapter(adapter);
    }
}