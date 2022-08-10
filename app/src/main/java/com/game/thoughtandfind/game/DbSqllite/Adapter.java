package com.game.thoughtandfind.game.DbSqllite;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.game.thoughtandfind.R;

public class Adapter extends ArrayAdapter<String> {
    public Adapter(Context context, String[] string) {
        super(context, 0, string);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);}
        TextView tvName = (TextView) convertView.findViewById(R.id.textViewuyfehkhwfk);
        tvName.setText(user);
        return convertView;
    }
}