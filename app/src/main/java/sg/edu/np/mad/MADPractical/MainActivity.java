package sg.edu.np.mad.MADPractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    User newUser = new User("Griffin", "Year 2 student in School of Infocomm Technology", 1, true );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.user);
        username.setText(newUser.Name);

        TextView description = findViewById(R.id.description);
        description.setText(newUser.Description);

        followCheck();
        Button follow = findViewById(R.id.followButton);
        follow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                followCheck();
            }
        });
    }

    public void followCheck(){
        Button follow = findViewById(R.id.followButton);
        if (newUser.Followed){
            follow.setText("Follow");
            newUser.Followed = false;
        }
        else{
            follow.setText("Unfollow");
            newUser.Followed = true;
        }
    }







}
