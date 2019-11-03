package com.hacksheffield5.hacksheffield5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.widget.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;
import android.R.*;
import android.widget.ArrayAdapter;


public class SwipeActivity extends AppCompatActivity {

    //private Cards cards_data[];
    private ArrayList<String> al;
    private ArrayAdapter<String> arrayAdapter;
    private int i;

    //ListView listView;

    // List<Cards> rowItems;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);

        al = new ArrayList<>();

        /*
        Cards card1 = new Cards("Cosmo","Dog","Male",R.drawable.ic_dog1);
        Cards card2 = new Cards("Bugs","Rabbit","Male",R.drawable.ic_rabbit1);
        Cards card3 = new Cards("Kiko","Cat","Female",R.drawable.ic_cat2);
        Cards card4 = new Cards("Squirtle","Turtle","Male",R.drawable.ic_turtle1);
        Cards card5 = new Cards("Spot","Dog","Female",R.drawable.ic_dog2);
        Cards card6 = new Cards("Tweety","Bird","Female",R.drawable.ic_bird1);
        Cards card7 = new Cards("Tom","Cat","Male",R.drawable.ic_cat1);
        Cards card8 = new Cards("Snuffles","Rabbit","Female",R.drawable.ic_rabbit2);
        Cards card9 = new Cards("Ryan","Dog","Male",R.drawable.ic_dog3);
        Cards card10 = new Cards("Tiger","Turtle","Male",R.drawable.ic_turtle2);
        Cards card11 = new Cards("Rio","Bird","Male",R.drawable.ic_bird2);

        rowItems.add(card1);
        rowItems.add(card2);
        rowItems.add(card3);
        rowItems.add(card4);
        rowItems.add(card5);
        rowItems.add(card6);
        rowItems.add(card7);
        rowItems.add(card8);
        rowItems.add(card9);
        rowItems.add(card10);
        rowItems.add(card11);
        */

        al.add("Cosmo");
        al.add("Max");
        al.add("Squirtle");
        al.add("Rachel");
        al.add("Lily");
        al.add("Snuffles");
        al.add("Tweety");
        al.add("Kiko");
        al.add("Rafael");

        /*
        for(i=0; i<rowItems.size(); i++){
            TextView name = (TextView) convertView.findViewById(rowItems[i].getName());
            ImageView image = (ImageView) convertView.findViewById(R.id.image);

            name.setText(card_item.getName());
            image.setImageResource(card_item.getImage());
        }
        */

        arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.name, al);
        SwipeFlingAdapterView flingContainer = (SwipeFlingAdapterView) findViewById(R.id.frame);

        flingContainer.setAdapter(arrayAdapter);
        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                al.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject
                Toast.makeText(SwipeActivity.this,"left",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightCardExit(Object dataObject) {
                Toast.makeText(SwipeActivity.this,"right",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
            }

            @Override
            public void onScroll(float scrollProgressPercent) {

            }
        });


        // Optionally add an OnItemClickListener
        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
            @Override
            public void onItemClicked(int itemPosition, Object dataObject) {
                Toast.makeText(SwipeActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
