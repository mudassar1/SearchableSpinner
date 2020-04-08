package com.androidtrip.plugins.searchablespinnerexample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.androidtrip.plugins.searchablespinner.SearchableSpinner;
import com.androidtrip.plugins.searchablespinner.interfaces.IStatusListener;
import com.androidtrip.plugins.searchablespinner.interfaces.OnItemSelectedListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<String>      mStrings                = new ArrayList<>();
    private       SearchableSpinner      mSearchableSpinner;
    private       SearchableSpinner      mSearchableSpinner1;
    private       SearchableSpinner      mSearchableSpinner2;
    private       SearchableSpinner      mSearchableSpinner3;
    private       SimpleListAdapter      mSimpleListAdapter;
    private       SimpleArrayListAdapter mSimpleArrayListAdapter;
    private       OnItemSelectedListener mOnItemSelectedListener = new OnItemSelectedListener() {
        @Override
        public void onItemSelected(View view, int position, long id) {
            Toast.makeText(MainActivity.this, "Item on position " + position + " : " + mSimpleListAdapter.getItem(position) + " Selected", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected() {
            Toast.makeText(MainActivity.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initListValues();
        mSimpleListAdapter      = new SimpleListAdapter(this, mStrings);
        mSimpleArrayListAdapter = new SimpleArrayListAdapter(this, mStrings);

        mSearchableSpinner = findViewById(R.id.SearchableSpinner);
        mSearchableSpinner.setAdapter(mSimpleArrayListAdapter);
        mSearchableSpinner.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner1.hideEdit();
                mSearchableSpinner2.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });

        mSearchableSpinner1 = findViewById(R.id.SearchableSpinner1);
        mSearchableSpinner1.setAdapter(mSimpleListAdapter);
        mSearchableSpinner1.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner1.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner.hideEdit();
                mSearchableSpinner2.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });

        mSearchableSpinner2 = findViewById(R.id.SearchableSpinner2);
        mSearchableSpinner2.setAdapter(mSimpleListAdapter);
        mSearchableSpinner2.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner2.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner.hideEdit();
                mSearchableSpinner1.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });

        mSearchableSpinner3 = findViewById(R.id.SearchableSpinner3);
        mSearchableSpinner3.setAdapter(mSimpleListAdapter);
        mSearchableSpinner3.setOnItemSelectedListener(mOnItemSelectedListener);
        mSearchableSpinner3.setStatusListener(new IStatusListener() {
            @Override
            public void spinnerIsOpening() {
                mSearchableSpinner.hideEdit();
                mSearchableSpinner3.hideEdit();
            }

            @Override
            public void spinnerIsClosing() {

            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!mSearchableSpinner.isInsideSearchEditText(event)) {
            mSearchableSpinner.hideEdit();
        }
        if (!mSearchableSpinner1.isInsideSearchEditText(event)) {
            mSearchableSpinner1.hideEdit();
        }
        if (!mSearchableSpinner2.isInsideSearchEditText(event)) {
            mSearchableSpinner2.hideEdit();
        }
        return super.onTouchEvent(event);
    }

    private void initListValues() {
        mStrings.add("Brigida Kurz");
        mStrings.add("Tracy Mckim");
        mStrings.add("Iesha Davids");
        mStrings.add("Ozella Provenza");
        mStrings.add("Florentina Carriere");
        mStrings.add("Geri Eiler");
        mStrings.add("Tammara Belgrave");
        mStrings.add("Ashton Ridinger");
        mStrings.add("Jodee Dawkins");
        mStrings.add("Florine Cruzan");
        mStrings.add("Latia Stead");
        mStrings.add("Kai Urbain");
        mStrings.add("Liza Chi");
        mStrings.add("Clayton Laprade");
        mStrings.add("Wilfredo Mooney");
        mStrings.add("Roseline Cain");
        mStrings.add("Chadwick Gauna");
        mStrings.add("Carmela Bourn");
        mStrings.add("Valeri Dedios");
        mStrings.add("Calista Mcneese");
        mStrings.add("Willard Cuccia");
        mStrings.add("Ngan Blakey");
        mStrings.add("Reina Medlen");
        mStrings.add("Fabian Steenbergen");
        mStrings.add("Edmond Pine");
        mStrings.add("Teri Quesada");
        mStrings.add("Vernetta Fulgham");
        mStrings.add("Winnifred Kiefer");
        mStrings.add("Chiquita Lichty");
        mStrings.add("Elna Stiltner");
        mStrings.add("Carly Landon");
        mStrings.add("Hans Morford");
        mStrings.add("Shawanna Kapoor");
        mStrings.add("Thomasina Naron");
        mStrings.add("Melba Massi");
        mStrings.add("Sal Mangano");
        mStrings.add("Mika Weitzel");
        mStrings.add("Phylis France");
        mStrings.add("Illa Winzer");
        mStrings.add("Kristofer Boyden");
        mStrings.add("Idalia Cryan");
        mStrings.add("Jenni Sousa");
        mStrings.add("Eda Forkey");
        mStrings.add("Birgit Rispoli");
        mStrings.add("Janiece Mcguffey");
        mStrings.add("Barton Busick");
        mStrings.add("Gerald Westerman");
        mStrings.add("Shalanda Baran");
        mStrings.add("Margherita Pazos");
        mStrings.add("Yuk Fitts");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_reset) {
            mSearchableSpinner.setSelectedItem(0);
            mSearchableSpinner1.setSelectedItem(0);
            mSearchableSpinner2.setSelectedItem(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
