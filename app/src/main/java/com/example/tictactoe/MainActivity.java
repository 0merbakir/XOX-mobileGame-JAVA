package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaActionSound;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    public MediaPlayer click, zor, win, back_music;
    private final List<int[]> combinationlist = new  ArrayList<>();

    private int[] boxPositions = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    private int playerTurn = 1;

    private int playerOneScore, playerTwoScore;

    private int multiscore = 0;

    private int lastWinner = 1;

    private int totalSelectedBox = 1;

    private LinearLayout playerOneLayout, playerTwoLayout;
    private TextView playerOneName,playerTwoName, playerOneScoreText, playerTwoScoreText;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9,image10, image11, image12, image13, image14, image15, image16, image17, image18,image19, image20, image21, image22, image23, image24, image25, image26, image27,image28, image29, image30, image31, image32, image33, image34, image35, image36;
    private ImageView sound_on, sound_off;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         playerOneName = findViewById(R.id.playerOneName);
         playerTwoName = findViewById(R.id.playerTwoName);
         playerOneScoreText = findViewById(R.id.playerOneScore);
         playerTwoScoreText = findViewById(R.id.playerTwoScore);

        playerOneLayout = findViewById(R.id.playerOneLayout);
        playerTwoLayout = findViewById(R.id.playerTwoLayout);

        click = MediaPlayer.create(this, R.raw.click_sound);
        back_music = MediaPlayer.create(this, R.raw.back_music);
        win = MediaPlayer.create(this, R.raw.win);
        zor = MediaPlayer.create(this, R.raw.zor);

        sound_on = findViewById(R.id.sound_on);
        sound_off = findViewById(R.id.sound_off);
        sound_on.setVisibility(View.INVISIBLE);


        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);
        image17 = findViewById(R.id.image17);
        image18 = findViewById(R.id.image18);
        image19 = findViewById(R.id.image19);
        image20 = findViewById(R.id.image20);
        image21 = findViewById(R.id.image21);
        image22 = findViewById(R.id.image22);
        image23 = findViewById(R.id.image23);
        image24 = findViewById(R.id.image24);
        image25 = findViewById(R.id.image25);
        image26 = findViewById(R.id.image26);
        image27 = findViewById(R.id.image27);
        image28 = findViewById(R.id.image28);
        image29 = findViewById(R.id.image29);
        image30 = findViewById(R.id.image30);
        image31 = findViewById(R.id.image31);
        image32 = findViewById(R.id.image32);
        image33 = findViewById(R.id.image33);
        image34 = findViewById(R.id.image34);
        image35 = findViewById(R.id.image35);
        image36 = findViewById(R.id.image36);


        // yukarıdan aşağıya
        combinationlist.add(new int[]{0, 1, 2});
        combinationlist.add(new int[]{1, 2, 3});
        combinationlist.add(new int[]{2, 3, 4});
        combinationlist.add(new int[]{3, 4, 5});
        combinationlist.add(new int[]{6, 7, 8});
        combinationlist.add(new int[]{7, 8, 9});
        combinationlist.add(new int[]{8, 9, 10});
        combinationlist.add(new int[]{9, 10, 11});
        combinationlist.add(new int[]{12, 13, 14});
        combinationlist.add(new int[]{13, 14, 15});
        combinationlist.add(new int[]{14, 15, 16});
        combinationlist.add(new int[]{15, 16, 17});
        combinationlist.add(new int[]{18, 19, 20});
        combinationlist.add(new int[]{19, 20, 21});
        combinationlist.add(new int[]{20, 21, 22});
        combinationlist.add(new int[]{21, 22, 23});
        combinationlist.add(new int[]{24, 25, 26});
        combinationlist.add(new int[]{25, 26, 27});
        combinationlist.add(new int[]{26, 27, 28});
        combinationlist.add(new int[]{27, 28, 29});
        combinationlist.add(new int[]{30, 31, 32});
        combinationlist.add(new int[]{31, 32, 33});
        combinationlist.add(new int[]{32, 33, 34});
        combinationlist.add(new int[]{33, 34, 35});

        // aşağıdan yukarıya
        combinationlist.add(new int[]{0, 6, 12});
        combinationlist.add(new int[]{6, 12, 18});
        combinationlist.add(new int[]{12, 18, 24});
        combinationlist.add(new int[]{18, 24, 30});
        combinationlist.add(new int[]{1, 7, 13});
        combinationlist.add(new int[]{7, 13, 19});
        combinationlist.add(new int[]{13, 19, 25});
        combinationlist.add(new int[]{19, 25, 31});
        combinationlist.add(new int[]{2, 8, 14});
        combinationlist.add(new int[]{8, 14, 20});
        combinationlist.add(new int[]{14, 20, 26});
        combinationlist.add(new int[]{20, 26, 32});
        combinationlist.add(new int[]{3, 9, 15});
        combinationlist.add(new int[]{9, 15, 21});
        combinationlist.add(new int[]{15, 21, 27});
        combinationlist.add(new int[]{21, 27, 33});
        combinationlist.add(new int[]{4, 10, 16});
        combinationlist.add(new int[]{10, 16, 22});
        combinationlist.add(new int[]{16, 22, 28});
        combinationlist.add(new int[]{22, 28, 34});
        combinationlist.add(new int[]{5, 11, 17});
        combinationlist.add(new int[]{11, 17, 23});
        combinationlist.add(new int[]{17, 23, 29});
        combinationlist.add(new int[]{23, 29, 35});

        // ilk 4x1 ilk çapraz
        combinationlist.add(new int[]{2, 7, 12});
        combinationlist.add(new int[]{3, 10, 17});
        combinationlist.add(new int[]{18, 25, 32});
        combinationlist.add(new int[]{23, 28, 33});

        // ikinci 4x2 ikinci capraz
        combinationlist.add(new int[]{3, 8, 13});
        combinationlist.add(new int[]{8, 13, 18});
        combinationlist.add(new int[]{2, 9, 16});
        combinationlist.add(new int[]{9, 16, 23});
        combinationlist.add(new int[]{12, 19, 26});
        combinationlist.add(new int[]{19, 26, 33});
        combinationlist.add(new int[]{17, 22, 27});
        combinationlist.add(new int[]{22, 27, 32});

        // üçüncü 4x3 üçüncü çapraz
        combinationlist.add(new int[]{1, 8, 15});
        combinationlist.add(new int[]{8, 15, 22});
        combinationlist.add(new int[]{15, 22, 29});
        combinationlist.add(new int[]{4, 9, 14});
        combinationlist.add(new int[]{9, 14, 19});
        combinationlist.add(new int[]{14, 19, 24});
        combinationlist.add(new int[]{31, 26, 21});
        combinationlist.add(new int[]{26, 21, 16});
        combinationlist.add(new int[]{21, 16, 11});
        combinationlist.add(new int[]{34, 27, 20});
        combinationlist.add(new int[]{27, 20, 13});
        combinationlist.add(new int[]{20, 13, 6});

        // 4x2 dördüncü çapraz
        combinationlist.add(new int[]{0, 7, 14});
        combinationlist.add(new int[]{7, 14, 21});
        combinationlist.add(new int[]{14, 21, 28});
        combinationlist.add(new int[]{21, 28, 35});
        combinationlist.add(new int[]{5, 10, 15});
        combinationlist.add(new int[]{10, 15, 20});
        combinationlist.add(new int[]{15, 20, 25});
        combinationlist.add(new int[]{20, 25, 30});

        final String getPlayerOneName = getIntent().getStringExtra("playerOne");
        final String getPlayerTwoName = getIntent().getStringExtra("playerTwo");

        playerOneName.setText(getPlayerOneName);
        playerTwoName.setText(getPlayerTwoName);

        Handler handler = new Handler();



        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(0)){
                            performAction((ImageView)view, 0);
                        }
                    }
                }, 500);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(1)){
                            performAction((ImageView)view, 1);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(2)){
                            performAction((ImageView)view, 2);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(3)){
                            performAction((ImageView)view, 3);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(4)){
                            performAction((ImageView)view, 4);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(5)){
                            performAction((ImageView)view, 5);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(6)){
                            performAction((ImageView)view, 6);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(7)){
                            performAction((ImageView)view, 7);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(8)){
                            performAction((ImageView)view, 8);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(9)){
                            performAction((ImageView)view, 9);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(10)){
                            performAction((ImageView)view, 10);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(11)){
                            performAction((ImageView)view, 11);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(12)){
                            performAction((ImageView)view, 12);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(13)){
                            performAction((ImageView)view, 13);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(14)){
                            performAction((ImageView)view, 14);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(15)){
                            performAction((ImageView)view, 15);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(16)){
                            performAction((ImageView)view, 16);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(17)){
                            performAction((ImageView)view, 17);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(18)){
                            performAction((ImageView)view, 18);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(19)){
                            performAction((ImageView)view, 19);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(20)){
                            performAction((ImageView)view, 20);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(21)){
                            performAction((ImageView)view, 21);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(22)){
                            performAction((ImageView)view, 22);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(23)){
                            performAction((ImageView)view, 23);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(24)){
                            performAction((ImageView)view, 24);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(25)){
                            performAction((ImageView)view, 25);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(26)){
                            performAction((ImageView)view, 26);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(27)){
                            performAction((ImageView)view, 27);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(28)){
                            performAction((ImageView)view, 28);
                        }
                        click.start();
                    }
                }, 500);

            }
        });

        image30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(29)){
                            performAction((ImageView)view, 29);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(30)){
                            performAction((ImageView)view, 30);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(31)){
                            performAction((ImageView)view, 31);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(32)){
                            performAction((ImageView)view, 32);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(33)){
                            performAction((ImageView)view, 33);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(34)){
                            performAction((ImageView)view, 34);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

        image36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.postDelayed(new Runnable() {
                    public void run() {
                        if(isBoxSelectable(35)){
                            performAction((ImageView)view, 35);
                        }
                        click.start();
                    }
                }, 500);
            }
        });

    }

    private boolean isBoxSelectable(int boxPosition){

        boolean response = false;

        if(boxPositions[boxPosition] == 0){
            response = true;
        }
        return response;
    }

    public void back(View view){
        Intent intent = new Intent(MainActivity.this, addPlayers.class);
        startActivity(intent);
        System.exit(0);
    }

    public void close(View view){

        System.exit(0);
    }

    public void stopMusic(View view){
        sound_on.setVisibility(View.INVISIBLE);
        sound_off.setVisibility(View.VISIBLE);
        back_music.pause();
    }

    public void playMusic(View view){
        sound_off.setVisibility(View.INVISIBLE);
        sound_on.setVisibility(View.VISIBLE);
        back_music.start();
    }

    private void performAction(ImageView imageView, int selectedBoxPosition) {

        boxPositions[selectedBoxPosition] = playerTurn;

        if (playerTurn == 1) {
            imageView.setImageResource(R.drawable.cross);

            if (checkPlayerWin()) {

                playerOneScore = multiscore;
                multiscore = 0;
                playerOneScoreText.setText(Integer.toString(playerOneScore));
                lastWinner = 1;

            }if (totalSelectedBox == 36) {

                if(playerOneScore > playerTwoScore){

                    WinDialog winDialog = new WinDialog(MainActivity.this, playerOneName.getText().toString() + " Kazandı!", MainActivity.this);
                    winDialog.show();
                }
                else if(playerOneScore < playerTwoScore){

                    WinDialog winDialog = new WinDialog(MainActivity.this, playerTwoName.getText().toString() + " Kazandı!", MainActivity.this);
                    winDialog.show();
                }
                else{
                    WinDialog winDialog = new WinDialog(MainActivity.this, "Berabere!", MainActivity.this);
                    winDialog.setCancelable(false);
                    winDialog.show();
                }
            }
                changePlayerTurn(2);
                totalSelectedBox++;
        }

        else {

            imageView.setImageResource(R.drawable.zero);

            if(checkPlayerWin()){

                playerTwoScore = multiscore;
                multiscore = 0;
                playerTwoScoreText.setText(Integer.toString(playerTwoScore));
                lastWinner = 2;
            }
            if(totalSelectedBox == 36){
                if(playerOneScore > playerTwoScore){

                    WinDialog winDialog = new WinDialog(MainActivity.this, playerOneName.getText().toString() + " Kazandı!", MainActivity.this);
                    winDialog.show();
                }
                else if(playerOneScore < playerTwoScore){

                    WinDialog winDialog = new WinDialog(MainActivity.this, playerTwoName.getText().toString() + " Kazandı!", MainActivity.this);
                    winDialog.show();
                }
                else{
                    WinDialog winDialog = new WinDialog(MainActivity.this, "Berabere!", MainActivity.this);
                    winDialog.setCancelable(false);
                    winDialog.show();
                }
            }
                changePlayerTurn(1);
                totalSelectedBox++;
        }
        win.stop();
    }

        private void changePlayerTurn ( int currentPlayerTurn){

            playerTurn = currentPlayerTurn;

            if (playerTurn == 1) {
                playerOneLayout.setBackgroundResource(R.drawable.round_back_border);
                playerTwoLayout.setBackgroundResource(R.drawable.round_black_blue);
            } else {
                playerTwoLayout.setBackgroundResource(R.drawable.round_back_border);
                playerOneLayout.setBackgroundResource(R.drawable.round_black_blue);
            }
        }

    private boolean checkPlayerWin(){

        boolean response  = false;

        for (int i= 0; i < combinationlist.size();i++){

            final int[] combination = combinationlist.get(i);

            if(boxPositions[combination[0]] == playerTurn && boxPositions[combination[1]] ==playerTurn && boxPositions[combination[2]] == playerTurn){
                multiscore++;
                response = true;

            }
        }
        return response;
    }

    public void restartMatch(){
        boxPositions = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        if(lastWinner == 1){
            playerTurn = 2;
        }
        else {
            playerTurn = 1;
        }

        totalSelectedBox = 1;
        playerOneScore = 0;
        playerTwoScore = 0;
        playerOneScoreText.setText(Integer.toString(0));
        playerTwoScoreText.setText(Integer.toString(0));
        multiscore = 0;

        image1.setImageResource(R.drawable.transparent_back);
        image2.setImageResource(R.drawable.transparent_back);
        image3.setImageResource(R.drawable.transparent_back);
        image4.setImageResource(R.drawable.transparent_back);
        image5.setImageResource(R.drawable.transparent_back);
        image6.setImageResource(R.drawable.transparent_back);
        image7.setImageResource(R.drawable.transparent_back);
        image8.setImageResource(R.drawable.transparent_back);
        image9.setImageResource(R.drawable.transparent_back);
        image10.setImageResource(R.drawable.transparent_back);
        image11.setImageResource(R.drawable.transparent_back);
        image12.setImageResource(R.drawable.transparent_back);
        image13.setImageResource(R.drawable.transparent_back);
        image14.setImageResource(R.drawable.transparent_back);
        image15.setImageResource(R.drawable.transparent_back);
        image16.setImageResource(R.drawable.transparent_back);
        image17.setImageResource(R.drawable.transparent_back);
        image18.setImageResource(R.drawable.transparent_back);
        image19.setImageResource(R.drawable.transparent_back);
        image20.setImageResource(R.drawable.transparent_back);
        image21.setImageResource(R.drawable.transparent_back);
        image22.setImageResource(R.drawable.transparent_back);
        image23.setImageResource(R.drawable.transparent_back);
        image24.setImageResource(R.drawable.transparent_back);
        image25.setImageResource(R.drawable.transparent_back);
        image26.setImageResource(R.drawable.transparent_back);
        image27.setImageResource(R.drawable.transparent_back);
        image28.setImageResource(R.drawable.transparent_back);
        image29.setImageResource(R.drawable.transparent_back);
        image30.setImageResource(R.drawable.transparent_back);
        image31.setImageResource(R.drawable.transparent_back);
        image32.setImageResource(R.drawable.transparent_back);
        image33.setImageResource(R.drawable.transparent_back);
        image34.setImageResource(R.drawable.transparent_back);
        image35.setImageResource(R.drawable.transparent_back);
        image36.setImageResource(R.drawable.transparent_back);


    }

}