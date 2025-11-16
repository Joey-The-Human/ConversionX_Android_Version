package com.android.myapplication;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // final VideoView videoView = view.findViewById(R.id.tutorial_video_view);
        // final ProgressBar videoProgressBar = view.findViewById(R.id.video_progress_bar);

        // // Show the progress bar while the video prepares
        // videoProgressBar.setVisibility(View.VISIBLE);

        // // --- The Simple, Correct Way to Play from res/raw ---
        // String videoPath = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.sample_1_5;
        // Uri uri = Uri.parse(videoPath);
        // videoView.setVideoURI(uri);

        // // Add playback controls
        // MediaController mediaController = new MediaController(getActivity());
        // videoView.setMediaController(mediaController);
        // mediaController.setAnchorView(videoView);

        // // Set a listener to be notified when the video is ready to play
        // videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
        //     @Override
        //     public void onPrepared(MediaPlayer mp) {
        //         // Video is loaded and ready to play
        //         videoProgressBar.setVisibility(View.GONE); // Hide the spinner
        //         videoView.start(); // Start the video
        //     }
        // });

        // // Set an error listener to catch any problems
        // videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
        //     @Override
        //     public boolean onError(MediaPlayer mp, int what, int extra) {
        //         Log.e(TAG, "MediaPlayer Error: " + what + ", " + extra);
        //         videoProgressBar.setVisibility(View.GONE); // Hide spinner on error
        //         Toast.makeText(getContext(), "Cannot play this video.", Toast.LENGTH_SHORT).show();
        //         return true; // True indicates we've handled the error
        //     }
        // });

        return view;
    }
}