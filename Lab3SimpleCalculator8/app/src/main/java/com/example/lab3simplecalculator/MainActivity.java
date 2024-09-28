package com.example.lab3simplecalculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void btn00Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");

    }

    public void btn01Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");

    }

    public void btn02Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");

    }

    public void btn03Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");

    }

    public void btn04Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");

    }

    public void btn05Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");

    }

    public void btn06Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");

    }

    public void btn07Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");

    }

    public void btn08Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");

    }

    public void btn09Click(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");

    }

    public void btnAddClick(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        num1=Double.parseDouble(eText.getText().toString());
        currentOp=Ops.add;
        eText.setText("");
    }

    public void btnSubClick(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        num1=Double.parseDouble(eText.getText().toString());
        currentOp=Ops.sub;
        eText.setText("");
    }

    public void btnMulClick(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        num1=Double.parseDouble(eText.getText().toString());
        currentOp=Ops.mult;
        eText.setText("");
    }

    public void btnDivClick(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        num1=Double.parseDouble(eText.getText().toString());
        currentOp=Ops.div;
        eText.setText("");
    }


    public void btnDotClick(View view){
        TextView eText=(TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");

    }

    public void btnequalClick(View view){
        if(currentOp!=Ops.none){
            TextView eText=(TextView)findViewById(R.id.resultEdit);
            num2=Double.parseDouble(eText.getText().toString());
            double result=0;
            if(currentOp==Ops.add){
                result=num1+num2;
            }
            else if(currentOp==Ops.sub){
                result=num1-num2;
            }
            else if(currentOp==Ops.mult){
                result=num1*num2;
            }
            else if(currentOp==Ops.div){
                result=num1/num2;
            }

            currentOp=Ops.none;

            num1=result;
            if((result-(int)result)!=0){
                eText.setText(String.valueOf(result));
            }else{
                eText.setText(String.valueOf((int)result));
            }
        }
    }
}
