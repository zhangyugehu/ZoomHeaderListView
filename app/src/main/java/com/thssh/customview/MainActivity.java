package com.thssh.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ZoomListView zlv_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zlv_list = (ZoomListView) findViewById(R.id.zlv_list);
        zlv_list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{
                "白百何被爆出轨——你这次的暧昧真的伤了我的心",
                "\"偷窥\" 窗口",
                "回忆曾经的互联网巨头亿唐网",
                "《史记·吴太伯世家第一》细读（上）",
                "护肤体验课招募|今天起，我们终结你的祛痘烦恼",
                "大学四年，如果可以重新来过……",
                "给简书找BUG赢好礼17.04.11——简书iOS 3.5.0 公测【 App内支持提现/创作流程优化】",
                "如何使用RestTemplate访问restful服务",
                "Android无埋点数据收集SDK关键技术",
                "Android 撸起袖子，自己封装 DialogFragment",
                "JNI技术规范 - 第一章 介绍",
                "Android Library打造自己的SDK，并Maven发布",
                "RecyclerView的拖动排序与侧滑删除",
                "我所了解的 Dagger2（一）",
                "Android App包瘦身优化实践(转自美团)",
                "Android Studio发布Android库到JCenter",
                "万年漏洞王Struts2是如何炼成的",
                "RocketMQ实战（一）",
                "源码分析之ThreadPoolExecutor",
                "愤怒的鸡蛋——美联航暴力驱客事件",
                "在形如猪狗的日子里，活出一股子人味来",
                "那些永远记不住的单词｜Metabolism 新陈代谢【101】",
                "极致素颜系列：如何用30天丑小鸭变白天鹅完成容颜逆袭",
                "爬行者江一燕：美丽的心灵和有趣的灵魂，让她活成别人羡慕的样子",
                "上床越早，爱情越少",
                "大学，在旅行| 我的武汉尬旅"
        }));

        View headerView = LayoutInflater.from(this).inflate(R.layout.view_listview_header, null);
        ImageView iv = (ImageView) headerView.findViewById(R.id.iv_headerview);
        zlv_list.addHeaderView(headerView);
        zlv_list.setImageView(iv);
    }
}
