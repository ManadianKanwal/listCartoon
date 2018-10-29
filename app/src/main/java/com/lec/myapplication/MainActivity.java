package com.lec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] CartoonsNames={"Kitacso","Dorae","Frozon","Ice_bears","Rupanzel","oggy","Raju"};
    String[] DESCRIPTION={"Kitracso teen ka Daba","Doraemone","Frozon","We_are_bears","Rupanzel","oggy_and cockroaches","Mighty_Raju"};
    int [] IMAGES={R.drawable.kit,R.drawable.dore,R.drawable.froz,R.drawable.bear,R.drawable.rapun,R.drawable.oggy,R.drawable.raju};
    private Object ListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView) ;

        ListAdapter listAdapter = new ListAdapter() ;
        listView.setAdapter(listAdapter);
    }

    public class ListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.list_view,null) ;
            ImageView imageView = convertView.findViewById(R.id.imageView) ;
            TextView textView_name = convertView.findViewById(R.id.textView_name) ;
            TextView textView_description = convertView.findViewById(R.id.textView_description) ;

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(CartoonsNames[position]);
            textView_description.setText(DESCRIPTION[position]);

            return convertView;
        }
    }
}

