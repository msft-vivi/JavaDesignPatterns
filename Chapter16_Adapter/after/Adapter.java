package Adapter.after;

import Adapter.after.ohters.JSONData;
import Adapter.after.ohters.XMLData;

/**
 * Adapter 实现对旧接口类型兼容:
 * 一般需要把新接口传过来的参数，在Adapter的实例方法中变成兼容老接
 * 口的参数类型(convertXML2Json : XMLData -> JSONData)
 * 然后调用老接口的实例化对象的旧方法(showDigram)，实现新旧兼容
 */
public class Adapter implements ITarget{
    IAdaptee service; // 对旧的接口的引用

    public Adapter(IAdaptee service) {
        this.service = service;
    }

    // 转换XML数据为Json类型，以支持旧的接口
    public JSONData convertXML2Json(XMLData data){
        // ...
        return new JSONData(); // 假设已经成功转换
    }

    @Override
    public void showData(XMLData data) {
        // 先把新接口使用的数据类型转换为兼容老接口的数据类型（XMLData -> JSONData）
        JSONData jsonData = convertXML2Json(data);

        // 使用旧类的接口实例对象 service 调用旧类的方法
        service.showDigram(jsonData);
    }
}
