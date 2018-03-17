package com.lei.service.Impl;

import com.lei.service.Utils.HttpClientUtil;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Lei on 2017/11/25.
 */
public class BT1024ServiceImpl {

    private static Logger logger = Logger.getLogger(HttpClientUtil.class);

    private String URL = "http://w2.aqu1024.rocks/pw/thread.php";
    private String MAINTITLE = "国产"; //国产无码 国产高清
    private String name = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    private String fileName = "H:\\资源\\" + name + ".html";
    private FileWriter outputStream = new FileWriter(new File(fileName), true);

    public BT1024ServiceImpl() throws IOException {
    }


    public String getBt(String page, String endDate) throws Exception {
        HashMap<String, String> params = new HashMap<>();
        params.put("fid", "3");
        params.put("page", page);
        String s = HttpClientUtil.doGet(URL, params);

        Document document = Jsoup.parse(s);
        Element body = document.body();
  /*      Element wrapA = body.getElementById("wrapA");
        Element main = wrapA.getElementById("main");
        Element elementsByClasstz = main.getElementsByAttributeValue("class","t z").get(0);
        Element table = elementsByClasstz.getElementsByTag("table").get(0);
        Element element1 = table.getElementsByTag("tbody").get(1);*/
        // Elements aClass = element1.getElementsByAttributeValue("class", "tr3 t_one");
        Elements aClass = body.getElementsByAttributeValue("class", "tr3 t_one");

        for (Element element : aClass) {
            Elements td = element.getElementsByTag("td");
            Element element2 = td.get(1);
            Elements h3s = element2.getElementsByTag("h3");
            if (h3s.size() == 0) {
                continue;
            }
            Element h3 = h3s.get(0);
            String html = h3.html();
            if (html.contains(MAINTITLE)) {
                if (html.contains(endDate)) {
                    return "1";
                }
                Element a = h3.getElementsByTag("a").get(0);
                getPage2(a);
            }
        }

        return "0";
    }

    public void getPage2(Element a) throws IOException {
        String baseUri = a.baseUri();
        String href = a.attr("href");
        String page2url = baseUri + href;

        String s = HttpClientUtil.doGet(page2url);

        Document parse = Jsoup.parse(s);
        Element body = parse.body();

        Element subject_tpc = body.getElementById("subject_tpc");
        String biaoTi = subject_tpc.text();
        outputStream.write(biaoTi);
        outputStream.write("<br>");

        Element tr1 = body.getElementsByAttributeValue("class", "tr1").get(0);
        Elements as = tr1.getElementsByTag("a");
        for (Element abiaoqian : as) {
            if (abiaoqian.hasAttr("href")) {
                String href1 = abiaoqian.attr("href");
                if (href1.endsWith("html")) {
                    outputStream.write(abiaoqian.toString());
                    outputStream.write("<br>");
                    outputStream.flush();
                }
            }
        }

    }


    public void downLoadBt(String href) {
        href = "http://www3.uptorrentfilespacedownhostabc.org/updowm/file.php/P44VPLn.html";
        String s = HttpClientUtil.doGet(href);

        Document parse = Jsoup.parse(s);
        Element body = parse.body();
        Element form = body.getElementsByTag("form").get(0);
        Elements elementsByAttributeValue = form.getElementsByAttributeValue("type", "hidden");
        HashMap<String, String> paramMap = new HashMap();
        for (Element input : elementsByAttributeValue) {
            String name = input.attr("name");
            String value = input.attr("value");
            paramMap.put(name, value);
        }

        String downLoadUrl = "http://www3.uptorrentfilespacedownhostabc.org/updowm/down.php";

        String s1 = HttpClientUtil.downLoad(downLoadUrl, paramMap);
        System.out.println(form.toString());

    }

    public void getElementbyMap(List<Element> elementList, Map map) {

    }
}
