package app.main;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import app.lib.Test;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView textView = (TextView) findViewById(R.id.test_msg);
        textView.setText(Test.getText());
    }
}
