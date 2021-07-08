package com.example.tik_tac_teo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView Player1, Player2, turn, Result;
    ImageView Iv1, Iv2, Iv3, Iv4, Iv5, Iv6, Iv7, Iv8, Iv9;
    LinearLayout Box1, Box2, Box3, Box4, Box5, Box6, Box7, Box8, Box9;
    boolean b1 = false, b2 = false, b3 = false, b4 = false, b5 = false, b6 = false, b7 = false, b8 = false, b9 = false;
    int box1 = 0, box2 = 0, box3 = 0, box4 = 0, box5 = 0, box6 = 0, box7 = 0, box8 = 0, box9 = 0;
    Boolean player1 = true, player2 = false;
    Button Retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FullScreen();
        Box1 = (LinearLayout) findViewById(R.id.Box1);
        Box2 = (LinearLayout) findViewById(R.id.Box2);
        Box3 = (LinearLayout) findViewById(R.id.Box3);
        Box4 = (LinearLayout) findViewById(R.id.Box4);
        Box5 = (LinearLayout) findViewById(R.id.Box5);
        Box6 = (LinearLayout) findViewById(R.id.Box6);
        Box7 = (LinearLayout) findViewById(R.id.Box7);
        Box8 = (LinearLayout) findViewById(R.id.Box8);
        Box9 = (LinearLayout) findViewById(R.id.Box9);

        Iv1 = (ImageView) findViewById(R.id.Iv1);
        Iv2 = (ImageView) findViewById(R.id.Iv2);
        Iv3 = (ImageView) findViewById(R.id.Iv3);
        Iv4 = (ImageView) findViewById(R.id.Iv4);
        Iv5 = (ImageView) findViewById(R.id.Iv5);
        Iv6 = (ImageView) findViewById(R.id.Iv6);
        Iv7 = (ImageView) findViewById(R.id.Iv7);
        Iv8 = (ImageView) findViewById(R.id.Iv8);
        Iv9 = (ImageView) findViewById(R.id.Iv9);

        Player1 = (TextView) findViewById(R.id.player1);
        Player2 = (TextView) findViewById(R.id.player2);
        turn = (TextView) findViewById(R.id.turn);
        Result = (TextView) findViewById(R.id.Result);
        Retry = (Button) findViewById(R.id.btn_Retry);




        Retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1 = true;
                if (player1) {
                    box1 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv1.setImageResource(R.drawable.tik);
                } else {
                    box1 = 1;
                    setPlayer2();
                    Result(1);
                    Iv1.setImageResource(R.drawable.cross);
                }
                Box1.setOnClickListener(null);
            }
        });
        Box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2 = true;
                if (player1) {
                    box2 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv2.setImageResource(R.drawable.tik);
                } else {
                    box2 = 1;
                    setPlayer2();
                    Result(1);
                    Iv2.setImageResource(R.drawable.cross);
                }
                Box2.setOnClickListener(null);
            }
        });
        Box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3 = true;
                if (player1) {
                    box3 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv3.setImageResource(R.drawable.tik);
                } else {
                    box3 = 1;
                    setPlayer2();
                    Result(1);
                    Iv3.setImageResource(R.drawable.cross);
                }
                Box3.setOnClickListener(null);
            }
        });
        Box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4 = true;
                if (player1) {
                    box4 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv4.setImageResource(R.drawable.tik);
                } else {
                    box4 = 1;
                    setPlayer2();
                    Result(1);
                    Iv4.setImageResource(R.drawable.cross);
                }
                Box4.setOnClickListener(null);
            }
        });
        Box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5 = true;
                if (player1) {
                    box5 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv5.setImageResource(R.drawable.tik);
                } else {
                    box5 = 1;
                    setPlayer2();
                    Result(1);
                    Iv5.setImageResource(R.drawable.cross);
                }
                Box5.setOnClickListener(null);
            }
        });
        Box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6 = true;
                if (player1) {
                    box6 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv6.setImageResource(R.drawable.tik);
                } else {
                    box6 = 1;
                    setPlayer2();
                    Result(1);
                    Iv6.setImageResource(R.drawable.cross);
                }
                Box6.setOnClickListener(null);
            }
        });
        Box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7 = true;
                if (player1) {
                    box7 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv7.setImageResource(R.drawable.tik);
                } else {
                    box7 = 1;
                    setPlayer2();
                    Result(1);
                    Iv7.setImageResource(R.drawable.cross);
                }
                Box7.setOnClickListener(null);
            }
        });
        Box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8 = true;
                if (player1) {
                    box8 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv8.setImageResource(R.drawable.tik);
                } else {
                    box8 = 1;
                    setPlayer2();
                    Result(1);
                    Iv8.setImageResource(R.drawable.cross);
                }
                Box8.setOnClickListener(null);
            }
        });
        Box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9 = true;
                if (player1) {
                    box9 = -1;
                    setPlayer1();
                    Result(-1);
                    Iv9.setImageResource(R.drawable.tik);
                } else {
                    box9 = 1;
                    setPlayer2();
                    Result(1);
                    Iv9.setImageResource(R.drawable.cross);
                }
                Box9.setOnClickListener(null);
            }
        });

    }

    public void setPlayer1() {
        player1 = false;
        player2 = true;
        Player1.setBackgroundResource(R.color.red_bg);
        Player2.setBackgroundResource(R.color.greenbg);
        turn.setText("Player 2 Turn");
    }

    public void setPlayer2() {
        player1 = true;
        player2 = false;
        Player1.setBackgroundResource(R.color.greenbg);
        Player2.setBackgroundResource(R.color.red_bg);
        turn.setText("Player 1 Turn");

    }

    public void Result(int Box_num) {
        if (Result_Inner(Box_num) && Box_num == -1) {
            Result.setText("Player 1 Wins!");
            All_Null();
            turn.setText("Player 1 Wins!");
            Retry.setVisibility(View.VISIBLE);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.7f, 1.1f, 0.7f, 1.1f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                    ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
            scaleAnimation.setDuration(600);
            scaleAnimation.setRepeatCount(Animation.INFINITE);
            scaleAnimation.setRepeatMode(Animation.REVERSE);
            Retry.startAnimation(scaleAnimation);
        } else if (Result_Inner(Box_num) && Box_num == 1) {
            Result.setText("Player 2 Wins!");
            All_Null();
            turn.setText("Player 2 Wins!");
            Retry.setVisibility(View.VISIBLE);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.7f, 1.1f, 0.7f, 1.1f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                    ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
            scaleAnimation.setDuration(600);
            scaleAnimation.setRepeatCount(Animation.INFINITE);
            scaleAnimation.setRepeatMode(Animation.REVERSE);
            Retry.startAnimation(scaleAnimation);
        } else if (Null_Checker()) {
            turn.setText("Draw!");
            Result.setText("Draw!");
            Retry.setVisibility(View.VISIBLE);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.7f, 1.1f, 0.7f, 1.1f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                    ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
            scaleAnimation.setDuration(600);
            scaleAnimation.setRepeatCount(Animation.INFINITE);
            scaleAnimation.setRepeatMode(Animation.REVERSE);
            Retry.startAnimation(scaleAnimation);
        }

    }

    public boolean Null_Checker() {
        if ((b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9)) {
            Log.wtf("-this", "Null Checker True");
            return true;
        }
        Log.wtf("-this", "Null Checker False");
        return false;
    }

    public void All_Null() {
        Box1.setOnClickListener(null);
        Box2.setOnClickListener(null);
        Box3.setOnClickListener(null);
        Box4.setOnClickListener(null);
        Box5.setOnClickListener(null);
        Box6.setOnClickListener(null);
        Box7.setOnClickListener(null);
        Box8.setOnClickListener(null);
        Box9.setOnClickListener(null);
    }

    public boolean Result_Inner(int player) {
        return (
                (box1 + box2 + box3 == player * 3) ||
                        (box4 + box5 + box6 == player * 3) ||
                        (box7 + box8 + box9 == player * 3) ||
                        (box1 + box4 + box7 == player * 3) ||
                        (box2 + box5 + box8 == player * 3) ||
                        (box3 + box6 + box9 == player * 3) ||
                        (box1 + box5 + box9 == player * 3) ||
                        (box7 + box5 + box3 == player * 3)
        );
    }

    public void FullScreen() {
        final View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
//                                int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
//
//                            int a=SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
//                                decorView.setSystemUiVisibility(a);
                            decorView.setSystemUiVisibility(
                                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                                            | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);


                        }
                    }
                });
    }

    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

    }
}

