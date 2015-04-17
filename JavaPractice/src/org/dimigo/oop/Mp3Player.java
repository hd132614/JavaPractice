package org.dimigo.oop;

import sun.jvm.hotspot.utilities.BitMap;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by HIPERCUBE on 15. 4. 17..
 */
public class Mp3Player {

    public interface OnMusicFinishListener {
        public void onMusicFinish();
    }

    public ArrayList<Music> mPlayList;
    private String mMp3PlayerName;
    public boolean mIsLock;
    public Date mCurrentTime;
    public float mCurrentBattery;
    public int mPlayMode;
    public OnMusicFinishListener mOnMusicFinishListener;

    public void setOnMusicFinishListener(OnMusicFinishListener onMusicFinishListener) {
        this.mOnMusicFinishListener = onMusicFinishListener;
    }

    public void startMusic() {
        //TODO implement here
        return;
    }

    public void stopMusic() {
        //TODO implement here
        return;
    }

    public void addPlayList(Music music) {
        mPlayList.add(music);
        //TODO implement here
        return;
    }

    public void removePlayList(int position) {
        mPlayList.remove(position);
        //TODO implement here
        return;
    }

    public void clearPlayList() {
        mPlayList.clear();
        //TODO implement here
        return;
    }

    public void setLock(boolean lock) {
        this.mIsLock = lock;
        //TODO implement here
        return;
    }

    public Date getCurrentTime() {
        return this.mCurrentTime;
    }

    public float getCurrentBattery() {
        return this.mCurrentBattery;
    }

    public int getPlayMode() {
        return this.mPlayMode;
    }

    public void setPlayMode(int mode) {
        this.mPlayMode = mode;
    }

    public void goBack(float range) {
        //TODO implement here
        return;
    }

    public void goForward(float range) {
        //TODO implement here
        return;
    }

    public static class PLAY_MODE {
        public static final int LOOP_CURRENT_MUSIC = 0;
        public static final int LOOP_WHOLE_MUSIC = 1;
        public static final int NO_LOOP = 2;
        public static final int RANDOM = 3;
    }

    public class Music {
        public File file;
        public String musicName;
        public String albumName;
        public float length;
        public BitMap albumImage;
    }
}
