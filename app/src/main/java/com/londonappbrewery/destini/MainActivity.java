package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView story;
    private Button buttonTop;
    private Button buttonBottom;

    private int storyIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        story = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);

        storyIndex = R.string.T1_Story;

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == R.string.T1_Story || storyIndex == R.string.T2_Story) {
                    storyIndex = R.string.T3_Story;
                    story.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                } else if (storyIndex == R.string.T3_Story) {
                    storyIndex = R.string.T6_End;
                    story.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (storyIndex == R.string.T1_Story) {
                    storyIndex = R.string.T2_Story;
                    story.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                } else if (storyIndex == R.string.T2_Story) {
                    storyIndex = R.string.T4_End;
                    story.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);
                } else if (storyIndex == R.string.T3_Story) {
                    storyIndex = R.string.T5_End;
                    story.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
