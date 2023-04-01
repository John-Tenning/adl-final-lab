import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int MAX_PROGRESS = 10;

    private TextView resultTextView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        progressBar = findViewById(R.id.progressBar);

        Button startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LongOperationTask().execute();
            }
        });
    }

    private class LongOperationTask extends AsyncTask<Void, Integer, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressBar.setMax(MAX_PROGRESS);
            progressBar.setProgress(0);
            resultTextView.setText("Calculating...");
        }

        @Override
        protected String doInBackground(Void... voids) {
            // Perform a long-running operation here
            Random random = new Random();
            int sum = 0;
            for (int i = 0; i < MAX_PROGRESS; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Log.e(TAG, "Error during long operation", e);
                }
                sum += random.nextInt(10);
                publishProgress(i + 1);
            }
            return String.valueOf(sum);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            progressBar.setProgress(values[0]);
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            resultTextView.setText("Result: " + result);
        }
    }
}
