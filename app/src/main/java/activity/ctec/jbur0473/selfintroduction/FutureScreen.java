package activity.ctec.jbur0473.selfintroduction;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class FutureScreen extends ActionBarActivity
{

    private Button Home;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_screen);

        Home = (Button) findViewById(R.id.Home);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_future_screen, menu);
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
        Home.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent();
                setResult(RESULT_OK, myIntent);
                finish();
            }
        });

    }
}
