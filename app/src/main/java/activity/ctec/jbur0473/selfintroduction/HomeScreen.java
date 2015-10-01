package activity.ctec.jbur0473.selfintroduction;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class HomeScreen extends ActionBarActivity
{
    private Button Food;
    private Button School;
    private Button Future;
    private Button Hobbies;
    private Button Family;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Food = (Button) findViewById(R.id.Food);
        School = (Button) findViewById(R.id.School);
        Future = (Button) findViewById(R.id.Future);
        Hobbies = (Button) findViewById(R.id.Hobbies);
        Family = (Button) findViewById(R.id.Family);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        Food.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), FoodScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });

        School.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), SchoolScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Future.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), FoodScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Hobbies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), FoodScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Family.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), FoodScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
