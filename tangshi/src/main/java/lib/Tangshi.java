package lib;

/**
 * @author yolo
 * @date 2020/1/9-19:49
 * 主要流程：
 *  1.下载详情页：webClient
 *  项目中要实现能够在windows service中调用指定项目的链接页面。由于访问页面时候使用的是ie浏览器或其他浏览器，所以想起用webclient类。
 *  2.解析详情页：HtmlPage，HtmlElement
 *  3.计算SHA-256
 *  4.计算分词：NlpAnalysis
 *  5.保存数据库jdbc
 *
 * 注意考虑线程安全（遇到共享对象时）
 *  1.加锁
 *  2.每个线程由自己的对象
 *
 * 如何让线程池停下来：
 * 条件：1.CountDownLatch
 *      2.计数：AtomicInteger（原子类）
 */
public class Tangshi {

}
