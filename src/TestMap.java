import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-10
 * Time:19:43
 **/
public class TestMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("小卤蛋","鲁班");
        map.put("奶妈","蔡文姬");
        for (Map.Entry<String,String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
