package State.after;

/**
 * 所有状态通用接口
 */
public abstract class State {
    protected Player player;

    /**
     * 上下文对象通过 Stae 构造器传入，方便状态获取有用的上下文信息（这也是和 Strategy 的区别）
     */
    public State(Player player) {
        this.player = player;
    }

    protected abstract String onLock();
    protected abstract String onPlay();
    protected abstract String onNext();
    protected abstract String onPrevious();
}
