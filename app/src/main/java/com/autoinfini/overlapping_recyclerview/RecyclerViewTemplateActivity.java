package com.autoinfini.overlapping_recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class RecyclerViewTemplateActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;

    // @BindView(R.id.recycler_view)
    // RecyclerView recyclerView;


    private RecyclerViewAdapter mAdapter;

    private ArrayList<AbstractModel> modelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_template);

        // ButterKnife.bind(this);
        findViews();
        setAdapter();


    }

    private void findViews() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView2 = (RecyclerView) findViewById(R.id.recycler_view_2);
    }


    private void setAdapter() {

        String img = "http://lorempixel.com/400/200/people/";


        modelList.add(new AbstractModel("Android", "Hello " + " Android",img));
        modelList.add(new AbstractModel("Beta", "Hello " + " Beta",img));
        modelList.add(new AbstractModel("Cupcake", "Hello " + " Cupcake",img));
        modelList.add(new AbstractModel("Donut", "Hello " + " Donut",img));
        modelList.add(new AbstractModel("Eclair", "Hello " + " Eclair",img));
        modelList.add(new AbstractModel("Froyo", "Hello " + " Froyo",img));
        modelList.add(new AbstractModel("Gingerbread", "Hello " + " Gingerbread",img));
        modelList.add(new AbstractModel("Honeycomb", "Hello " + " Honeycomb",img));
        modelList.add(new AbstractModel("Ice Cream Sandwich", "Hello " + " Ice Cream Sandwich",img));
        modelList.add(new AbstractModel("Jelly Bean", "Hello " + " Jelly Bean",img));
        modelList.add(new AbstractModel("KitKat", "Hello " + " KitKat",img));
        modelList.add(new AbstractModel("Lollipop", "Hello " + " Lollipop",img));
        modelList.add(new AbstractModel("Marshmallow", "Hello " + " Marshmallow",img));
        modelList.add(new AbstractModel("Nougat", "Hello " + " Nougat",img));
        modelList.add(new AbstractModel("Android O", "Hello " + " Android O,",img));


        mAdapter = new RecyclerViewAdapter(RecyclerViewTemplateActivity.this, modelList, "Footer");


        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new OverlapDecoration());

        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new OverlapDecoration());

        // For first layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(layoutManager);

        // For Second layout
        recyclerView2.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        recyclerView.setAdapter(mAdapter);
        recyclerView2.setAdapter(mAdapter);


        mAdapter.SetOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position, AbstractModel model) {

                //handle item click events here
                Toast.makeText(RecyclerViewTemplateActivity.this, "Clicked Position " + position, Toast.LENGTH_SHORT).show();


            }
        });


        mAdapter.SetOnHeaderClickListener(new RecyclerViewAdapter.OnHeaderClickListener() {
            @Override
            public void onHeaderClick(View view, String headerTitle) {

                //handle item click events here
                Toast.makeText(RecyclerViewTemplateActivity.this, "Clicked Header", Toast.LENGTH_SHORT).show();

            }
        });


    }


}
