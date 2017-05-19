package com.beijing.zzu.zsxy.utils;

import android.util.Log;

import com.beijing.zzu.zsxy.model.GirlItemData;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiayongkai on 2017/5/8.
 */

public class JsoupUtil {

    /**
     * 解析每一页妹子的数据
     * @param response
     * @return
     */
    public static List<GirlItemData> parseGirls(String response){
        Document document = Jsoup.parse(response);
        Elements elements = document.select("div[class=img_single] > a");
        List<GirlItemData> list=new ArrayList<>();
        GirlItemData data;
        for (Element element:elements){
            data=new GirlItemData();
            data.setId(element.attr("href").substring(element.attr("href").lastIndexOf("/")+1));
            data.setTitle(element.select("img").attr("title"));
            data.setUrl(element.select("img").attr("src"));
            list.add(data);
        }

        return list;
    }

    /**
     * 解析妹子数据的详情
     * @param response
     * @return
     */
    public static List<String> parseGirlDetail(String response){
        Document document = Jsoup.parse(response);
        Elements elements = document.select("div[class= topic-figure cc] > img");
        List<String> list=new ArrayList<>();
        for (Element e : elements) {
            list.add(e.select("img").attr("src"));
        }

        return list;
    }
}
