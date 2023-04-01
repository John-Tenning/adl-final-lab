import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the GUI components
        TextView headerText = (TextView) findViewById(R.id.headerText);
        EditText inputText = (EditText) findViewById(R.id.inputText);
        Button submitButton = (Button) findViewById(R.id.submitButton);
        ImageView logoImage = (ImageView) findViewById(R.id.logoImage);

        // Customize the fonts and colors of the GUI components
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        headerText.setTypeface(typeface);
        inputText.setTypeface(typeface);
        submitButton.setTypeface(typeface);

        headerText.setTextColor(getResources().getColor(R.color.colorAccent));
        submitButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        logoImage.setImageResource(R.drawable.logo);
    }
}
