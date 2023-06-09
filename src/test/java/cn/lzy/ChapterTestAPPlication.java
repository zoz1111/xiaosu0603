package cn.lzy;
/**
 * 测试类
 */

import cn.lzy.controller.ChapterController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestAPPlication {
    String TAG = "ChapterTestAPPlication";

    @Autowired
    ChapterController mChapterController;

    @Test
    public void getHello() {
        String result = mChapterController.sayHello();
        System.out.println(TAG + "--- 单元测试返回的数据 ---" + result);
    }

}
