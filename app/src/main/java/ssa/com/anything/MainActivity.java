package ssa.com.anything;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toast, move, counter;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toast = findViewById(R.id.toast_btn);
        move = findViewById(R.id.move_btn);
        counter = findViewById(R.id.count_btn);
        textView = findViewById(R.id.textview);


        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cValue = textView.getText().toString();

                Toast.makeText(MainActivity.this,"Current Value is "+cValue,Toast.LENGTH_LONG).show();;

            }
        });



        counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int curValue = Integer.parseInt( textView.getText().toString() );


                curValue = curValue + 1;


                textView.setText( String.valueOf(curValue) ) ;


            }
        });


        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                intent.putExtra("STRING_AM_GOING_WITH",textView.getText().toString());

                startActivity(intent);


            }
        });






    }








}
