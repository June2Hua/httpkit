package com.lnwazg.httpkit.client;

import java.util.Map;

import com.lnwazg.kit.http.HttpUtils;
import com.lnwazg.kit.testframework.TF;
import com.lnwazg.kit.testframework.anno.Benchmark;
import com.lnwazg.kit.testframework.anno.TestCase;

/**
 * 客户端访问的工具
 * @author nan.li
 * @version 2016年12月7日
 */
public class AjaxUtils
{
    /**
     * 获取ajax交互的结果内容
     * @author nan.li
     * @param url
     * @param params
     * @return
     */
    public static String getContent(String url, Map<String, String> params)
    {
        return HttpUtils.doGet(url, params);
    }
    
    @TestCase
    @Benchmark(5000)
    void test1()
    {
        getContent("http://10.13.69.28:7777/root/c/1.txt", null);
    }
    
    public static void main(String[] args)
    {
        TF.l(AjaxUtils.class);
    }
}
