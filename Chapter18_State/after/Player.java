package State.after;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state; //持有所有状态的引用
    private boolean playing = false;
    private List<String> playList = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        // 播放器刚启动，默认为准备播放状态
        this.state = new ReadyState(this);
        setPlaying(true);
        for(int i = 1; i <= 12; ++i){
            playList.add("Track " + i);
        }
    }

    // 提供一个改变播放器状态的共有方法，在其他状态中可以通过上下文调用该方法，从而改变状态
    public void changeState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void setPlaying(boolean playing){
        this.playing = playing;
    }

    public boolean isPlaying(){
        return playing;
    }

    // 开始播放
    public String startPlayBack(){
        return "Play " + playList.get(currentTrack);
    }

    public String nextTrack(){
        currentTrack++;
        // 下一首歌曲索引大于列表长度时，播放第一首,否则播放下一首
        if(currentTrack > playList.size()-1){
            currentTrack = 0;
        }
        return "Playing " + playList.get(currentTrack);
    }

    public String previousTrack(){
        currentTrack--;
        if(currentTrack < 0){
            currentTrack = playList.size()-1;
        }
        return "Playing " + playList.get(currentTrack);
    }

    // 重置歌曲索引
    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
