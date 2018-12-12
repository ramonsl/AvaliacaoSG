package com.example.android.dicionario;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context,   List<Word> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView= convertView;

        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.word_view,parent,false);

        }

        Word current =getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.textView);
        TextView textView2 = (TextView) listItemView.findViewById(R.id.textView2);


        textView.setText(current.getWord().toString());
        textView2.setText(current.getTranslate().toString());


        return  listItemView;



    }
}
