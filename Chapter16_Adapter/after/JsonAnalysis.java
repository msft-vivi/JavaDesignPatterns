package Adapter.after;

import Adapter.after.ohters.JSONData;

/**
 * 遗留接口的实现类
 */
public class JsonAnalysis implements IAdaptee{
    @Override
    public void showDigram(JSONData data) {
        // ... 用 JSONData 呈现图表
    }
}
