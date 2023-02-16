package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class addPlayers extends AppCompatActivity {

    private MediaPlayer click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        final EditText playerOne = findViewById(R.id.playerOneName);
        final EditText playerTwo = findViewById(R.id.playerTwoName);
        final Button startGameBtn = findViewById(R.id.startGameButton);

        click = MediaPlayer.create(this, R.raw.click_sound);


        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.start();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        final String getPlayerOneName = playerOne.getText().toString();
                        final String getPlayerTwoName = playerTwo.getText().toString();
                        if(getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty())
                        {
                            Toast.makeText(addPlayers.this, "Lütfen oyuncu adlarını girin", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Intent intent = new Intent(addPlayers.this, MainActivity.class);
                            intent.putExtra("playerOne",getPlayerOneName);
                            intent.putExtra("playerTwo",getPlayerTwoName);
                            startActivity(intent);
                            System.exit(0);
                        }
                    }
                }, 500);

            }
        });
    }
}