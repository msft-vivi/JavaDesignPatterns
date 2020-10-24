package State.after;

public class ReadyState extends State{

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    protected String onLock() {
        player.changeState(new LockedState(player));;
        return "Locked...";
    }

    @Override
    protected String onPlay() {
        String action = player.startPlayBack(); // 返回当前放的歌曲
        player.changeState(new PlayingState(player));

        return action;
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
