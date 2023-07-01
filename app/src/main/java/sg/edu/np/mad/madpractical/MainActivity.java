package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
        super.onStart();

        // set up user
        User user = new User();
        user.followed = false;

        // attach listener to the button
        Button but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.followed == false){
                    but.setText("UNFOLLOW");
                    user.followed = true;
                }
                else{
                    but.setText("FOLLOW");
                    user.followed = false;
                }
            }
        });
    }

}
