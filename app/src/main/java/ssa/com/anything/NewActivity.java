package ssa.com.anything;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {


    private TextView textView;
    private Button btn;
    private String textTheUserCameWith;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);



        textView = findViewById(R.id.text_new);
        btn = findViewById(R.id.take_me_back);



        textTheUserCameWith = getIntent().getStringExtra("STRING_AM_GOING_WITH");


        textView.setText(textTheUserCameWith);
        



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NewActivity.this.finish();

            }
        });



    }



}
