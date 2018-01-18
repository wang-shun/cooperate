package com.maoding.Notice;

import com.maoding.Bean.CoreMessageDTO;
import com.maoding.Bean.CoreReceiverDTO;
import com.zeroc.Ice.ObjectPrx;

/**
 * 深圳市卯丁技术有限公司
 * 作    者 : 张成亮
 * 日    期 : 2018/1/3 9:39
 * 描    述 :
 */
public interface CoreNotice {
    final static Short NOTICE_SERVER_TYPE_STORM = 0;

    /** 创建通告频道 */
    default void createTopic(String topic){}
    /** 订阅通告频道 */
    default void subscribeTopic(String topic, ObjectPrx handler){}
    /** 取消订阅 */
    default void unSubscribeTopic(String topic, ObjectPrx handler){}
    /** 发布通告 */
    default void sendMessage(CoreMessageDTO msg, CoreReceiverDTO receiver){}
}