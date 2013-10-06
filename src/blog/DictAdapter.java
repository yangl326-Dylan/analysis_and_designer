package blog;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudylan
 * Date: 13-10-6
 * Time: 下午12:09
 * 适配器 把字典接口转化为书籍接口
 */
public class DictAdapter implements Book {
    Dictionary dictionary;

    @Override
    public void getContents() {
        //字典 单词列表 转化为书籍目录
        dictionary.getItems();
    }

    @Override
    public void getAuthor() {
        dictionary.getAuthor();
    }

}
