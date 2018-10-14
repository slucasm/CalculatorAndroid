package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView screen;
    Button btn_0, btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_punt,btn_clear,btn_igual,btn_suma,btn_resta,btn_mult,btn_div,btn_cos,btn_sin,btn_tan;
    CheckBox btn_rad,btn_deg;
    boolean suma,resta,multiplicacio,divisio,sin,cos,tan,rad = false;
    boolean deg = true;
    float reserva, actual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView)findViewById(R.id.screen);

        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_punt = (Button)findViewById(R.id.btn_punt);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_igual = (Button)findViewById(R.id.btn_igual);
        btn_suma = (Button)findViewById(R.id.btn_suma);
        btn_resta = (Button)findViewById(R.id.btn_resta);
        btn_mult = (Button)findViewById(R.id.btn_mult);
        btn_div = (Button)findViewById(R.id.btn_div);
        btn_sin = (Button)findViewById(R.id.btn_sin);
        btn_cos = (Button)findViewById(R.id.btn_cos);
        btn_tan = (Button)findViewById(R.id.btn_tan);

        btn_rad = (CheckBox)findViewById(R.id.check_rad);
        btn_deg = (CheckBox)findViewById(R.id.check_deg);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +"9");
            }
        });
        btn_punt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() +".");
            }
        });
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    suma = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("");
                }
            }
        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    resta = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("");
                }
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    multiplicacio = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("");
                }
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    divisio = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("");
                }
            }
        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    sin = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("sin("+screen.getText()+ ")");
                }
            }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    cos = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("cos("+screen.getText()+ ")");
                }
            }
        });
        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    tan = true;
                    reserva = Float.parseFloat(screen.getText() + "");
                    screen.setText("tan("+screen.getText()+")");
                }
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!screen.getText().equals("")) {
                    screen.setText("");
                }
            }
        });
        btn_deg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_deg.isChecked())
                {
                    deg = true;
                    rad = false;
                    btn_rad.setChecked(false);
                }
            }
        });

        btn_rad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_rad.isChecked())
                {
                    deg = false;
                    rad = true;
                    btn_deg.setChecked(false);
                }
            }
        });




        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (suma == true) {
                    actual = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(reserva+actual));
                    suma = false;
                }
                else if (resta == true) {
                    actual = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(reserva-actual));
                    resta = false;
                }
                else if (multiplicacio == true) {
                    actual = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(reserva*actual));
                    multiplicacio = false;
                }
                else if (divisio == true) {
                    actual = Float.parseFloat(screen.getText() + "");
                    screen.setText(String.valueOf(reserva/actual));
                    divisio = false;
                }
                else if (sin == true) {
                    //actual = Float.parseFloat(screen.getText() + "");
                    if (deg == true) {
                        screen.setText(String.valueOf(Math.sin(Math.toRadians(reserva))));
                    }
                    else {
                        screen.setText(String.valueOf(Math.sin(reserva)));
                    }
                        sin = false;
                }
                else if (cos == true) {
                    //actual = Float.parseFloat(screen.getText() + "");
                    if (deg == true) {
                        screen.setText(String.valueOf(Math.cos(Math.toRadians(reserva))));
                    }
                    else {
                        screen.setText(String.valueOf(Math.cos(reserva)));
                    }
                    cos = false;
                }
                else if (tan == true) {
                    //actual = Float.parseFloat(screen.getText() + "");
                    if (deg == true) {
                        screen.setText(String.valueOf(Math.tan(Math.toRadians(reserva))));
                    }
                    else {
                        screen.setText(String.valueOf(Math.tan(reserva)));
                    }
                    tan = false;
                }

                reserva = 0;
                actual = 0;
            }
        });
    }
}
