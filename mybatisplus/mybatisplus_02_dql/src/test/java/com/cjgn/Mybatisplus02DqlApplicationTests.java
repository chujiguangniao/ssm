package com.cjgn;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cjgn.mapper.UserMapper;
import com.cjgn.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testGetAll() {
        //按条件查询\
        //方式一
        /*QueryWrapper wrapper = new QueryWrapper();
        wrapper.lt("age", 18);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);*/

        //方式二：lambda格式按条件查询
        /*QueryWrapper<User> wrapper = new QueryWrapper();
        wrapper.lambda().lt(User::getAge, 18);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);*/

      /*  //方法三：
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        //十岁到18岁之间
//        wrapper.lt(User::getAge,18).gt(User::getAge,10);
        //小于十岁或者大于十八岁
        wrapper.lt(User::getAge,10).or().gt(User::getAge,15);
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList);
    }*/

      /*  //模拟页面传递过来的查询数据
        UserQuery userQuery = new UserQuery();
        //最小值
        userQuery.setAge(10);
        //最大值
        userQuery.setAge2(null);

        //null的判定
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        //先判定第一个条件是否为true
        wrapper.lt(null!=userQuery.getAge2(),User::getAge, userQuery.getAge2());
        wrapper.gt(null!=userQuery.getAge(),User::getAge, userQuery.getAge());
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList);*/


        /*//TODO 查询投影
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        wrapper.select(User::getId,User::getName,User::getAge);
        List<User> userList = userMapper.selectList(wrapper);
        System.out.println(userList);*/

        /*//TODO 查询投影聚合函数
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.select("count(*) as count");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        System.out.println(maps);*/

      /*  //TODO 等于匹配
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        //等同于等号
        wrapper.eq(User::getName, "Jerry").eq(User::getPassword, "jerry");
        List<User> user = userMapper.selectList(wrapper);
        System.out.println(user);*/

        /*//TODO 范围查询 lt le gt ge eq between
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        //等同于等号
        wrapper.between(User::getAge,10,18);
        List<User> user = userMapper.selectList(wrapper);
        System.out.println(user);*/


//        //TODO 模糊匹配 like
//        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
//        wrapper.likeRight(User::getName,"J");
//        List<User> user = userMapper.selectList(wrapper);
//        System.out.println(user);


    }


    @Test
    void testSelect() {
        //TODO 模糊匹配 like
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void add(){
        User user = new User();
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setAge(12);
        user.setTel("4006184000");
        userMapper.insert(user);
    }

    @Test
    void testDelete(){
        List<Long> list = new ArrayList<>();
        list.add(1590989493467410433l);
        list.add(1590991879363657730l);
        userMapper.deleteBatchIds(list);
    }

    @Test
    void testSelectIds(){
        Long[] ids = new Long[]{666l,667l};
        List<Long> list = Arrays.asList(ids);
        userMapper.selectBatchIds(list);
    }

    @Test
    void testDeleteOne(){
        userMapper.deleteById(2l);
    }


    @Test
    void testUpdate(){
//        User user = new User();
//        user.setId(3l);
//        user.setName("Jock666");
//        user.setVersion(1);
//        userMapper.updateById(user);
//        User user = userMapper.selectById(3l);
//        user.setName("Jock888");
//        userMapper.updateById(user);
        User user1 = userMapper.selectById(3l);//verison=3
        User user2 = userMapper.selectById(3l);//version=3
        user2.setName("Jockaaa");
        userMapper.updateById(user2);//verison=>4

        user1.setName("Jockbbb");
        userMapper.updateById(user1);//version=3条件不成立
    }


}
