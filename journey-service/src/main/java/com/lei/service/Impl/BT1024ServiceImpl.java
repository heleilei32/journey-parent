package com.lei.service.Impl;

import com.lei.service.Utils.HttpClientUtil;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Lei on 2017/11/25.
 */
public class BT1024ServiceImpl {



    private static Logger logger = Logger.getLogger(HttpClientUtil.class);

    private String URL="http://z3.xm1024p.net/pw/thread.php?fid=3";

    public void getBt() throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("fid","3");
        params.put("page","2");
        String s = HttpClientUtil.doGet(URL,params);
        logger.info(s);


        Document document = Jsoup.connect(URL).get();
        Elements elementsByClass = document.getElementsByClass(".tr3 t_one");

        for (Element element: elementsByClass) {
            logger.info(element.toString());
        }

    }
}
