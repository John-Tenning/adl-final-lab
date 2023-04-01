import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to a new instance of your custom view
        setContentView(new MyView(this));
    }

    // Define a custom view that extends View
    public class MyView extends View {

        public MyView(MainActivity context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            // Draw a line
            Paint paint = new Paint();
            paint.setColor(Color.BLACK);
            canvas.drawLine(50, 50, 200, 200, paint);

            // Draw a rectangle
            paint.setColor(Color.BLUE);
            canvas.drawRect(100, 100, 300, 400, paint);

            // Draw a circle
            paint.setColor(Color.RED);
            canvas.drawCircle(400, 400, 100, paint);
        }
    }
}
