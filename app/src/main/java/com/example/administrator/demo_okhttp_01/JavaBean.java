package com.example.administrator.demo_okhttp_01;

import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */
public class JavaBean {
    /**
     * resultCode : 200
     * responseTime : 2016-06-18 22:17:30
     * data : {"newsItem":[{"id":1,"title":"高盛：中国房地产可能在6-9个月内迎来\u201c拐点","content":"6月14日，王逸等高盛分析师在报告中写道，预计2017年房价将疲弱，因为该行业因杠杆率上升、需求减弱，不久将见到拐点。"},{"id":2,"title":"国产大飞机C919首飞时间曝光 已接517架次订单","content":"《经济参考报》记者日前从多个权威渠道获悉，我国自主研制的C919大型客机将于今年下半年首飞，最快2017年完成后续各项技术验证，并开始正式交付。"},{"id":3,"title":"解放军大批巨炮同时开火 现场升硕大火球","content":"　6月10日，陆军第42集团军某防空旅全员全装在粤东某陌生地域展开战场机动、侦察预警、陆空对抗、实弹射击等课目训练，锤炼部队实战本领。"},{"id":4,"title":"拳王邹市明，一场比赛460万奖金，只开90万的车","content":"中国拳王邹市明，一年的收入有多少？和帕奎奥，梅威瑟这种级别的相比，邹市明的收入只能算是小收入，从最初打职业比赛时的30万美金的奖金，到最高70万美金奖金，这其中受了多少伤只有他自己最清楚。如果能7场比赛速成世界拳王，奖金不过也就100万美金，或许他\u201d永远\u201c也不能成为梅威瑟这样的拳王。"},{"id":5,"title":"40万人看杨毅直播讲道理？？？","content":"　由总决赛第四场比赛中，杨毅对于詹姆斯和格林的一次冲突而进行的评述，引发的一系列事件，还在持续发酵中。"},{"id":11,"title":"女王杯穆雷双抢7险胜 瓦林卡爆冷止步首轮","content":"腾讯体育6月15日讯 ATP500赛伦敦女王杯草地公开赛今日继续男单首轮比赛的争夺，赛会头号种子、英国名将穆雷通过两盘抢7以7-6（8）和7-6（1）险胜法国选手马胡特，惊险晋级次轮；而2号种子瑞士名将瓦林卡则连丢两盘以2-6和6-7（3）不敌西班牙选手沃达斯科，爆冷止步首轮。"}]}
     */

    private int resultCode;
    private String responseTime;
    private DataBean data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<NewsItemBean> newsItem;

        public List<NewsItemBean> getNewsItem() {
            return newsItem;
        }

        public void setNewsItem(List<NewsItemBean> newsItem) {
            this.newsItem = newsItem;
        }

        public static class NewsItemBean {
            /**
             * id : 1
             * title : 高盛：中国房地产可能在6-9个月内迎来“拐点
             * content : 6月14日，王逸等高盛分析师在报告中写道，预计2017年房价将疲弱，因为该行业因杠杆率上升、需求减弱，不久将见到拐点。
             */

            private int id;
            private String title;
            private String content;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
