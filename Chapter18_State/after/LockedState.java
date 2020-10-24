package State.after;

public class LockedState extends State{
    public LockedState(Player player) {
        super(player);
        player.setPlaying(false); // 设置为没有播放
    }

    @Override
    protected String onLock() {
        if(player.isPlaying()){
            player.changeState(new ReadyState(player));
            return "Stop playing...";
        }
        else {
            return "Locked...";
        }
    }

    @Override
    protected String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    protected String onNext() {
        return "Locked...";
    }

    @Override
    protected String onPrevious() {
        return "Locked...";
    }
}
