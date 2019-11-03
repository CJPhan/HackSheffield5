package com.hacksheffield5.hacksheffield5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.hacksheffield5.hacksheffield5.R;
import java.util.List;

public class arrayAdapter extends ArrayAdapter<Cards> {

    Context context;

    public arrayAdapter(Context context, int resourceId, List<Cards> items) {
        super(context, resourceId, items);

    }
    /*
    public View getView(int position, View convertView, ViewGroup parent) {
        Cards card_item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        if (convertView != null) {

            TextView name = (TextView) convertView.findViewById(R.id.name);
            ImageView image = (ImageView) convertView.findViewById(R.id.image);

            name.setText(card_item.getName());
            image.setImageResource(card_item.getImage());

            return convertView;
        }

        return convertView;
    }
    */
}
