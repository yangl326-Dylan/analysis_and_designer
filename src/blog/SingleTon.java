package blog;

/**
 * Created with IntelliJ IDEA.
 * User: zhoudylan
 * Date: 13-9-7
 * Time: 下午10:20
 * To change this template use File | Settings | File Templates.
 */
public class SingleTon {

    private volatile static SingleTon singleTon;

    private SingleTon(){
    }

    public static SingleTon getInstance(){
        if(singleTon==null){
            synchronized (SingleTon.class){
                if(singleTon==null){
                       singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

}
