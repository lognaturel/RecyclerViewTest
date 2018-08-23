package org.admintest.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.Arrays;
import java.util.List;

public class RVActivitySV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_sv);

        List<String> items = Arrays.asList(getResources().getStringArray(R.array.words));
        //List<String> items = Arrays.asList(getResources().getStringArray(R.array.less_than_200_words));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new RVAdapter(items));

        // If we have more than 200 elements, only let the RecyclerView take up 80% of the screen height
        if (recyclerView.getAdapter().getItemCount() > 200) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

            recyclerView.getLayoutParams().height = (int) (displayMetrics.heightPixels * .80);
        }
    }
}
