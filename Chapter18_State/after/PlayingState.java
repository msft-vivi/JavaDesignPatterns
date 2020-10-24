package State.after;

public class PlayingState extends State{
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    protected String onLock() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop(); // 歌曲索引重置为0 ，并停止播放
        return "Stop playing";
    }

    @Override
    protected String onPlay() {
        player.changeState(new ReadyState(player));
        return "Paused...";
    }

    @Override
    protected String onNext() {
        return player.nextTrack();
    }

    @Override
    protected String onPrevious() {
        return player.previousTrack();
    }
}
