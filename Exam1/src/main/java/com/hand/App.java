package com.hand;

import com.hand.api.controller.FilmController;
import com.hand.domain.entity.Film;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Context Start");
        App app=new App();
        app.createConnection();

        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml","applicationContext-mybatis.xml"});

        FilmController controller = (FilmController) ctx.getBean("filmController");

        Film film=new Film();
        film.setTitle(System.getenv("TITLE"));
        film.setLanguage_id(Integer.parseInt(System.getenv("LANGUAGEID")));
        film.setDescription(System.getenv("DESCRIPTION"));

        try {
            controller.insertOneWithException(film);    // 有异常的方法
        }catch (Exception e){
            System.out.println("[INFO]error And rolled back");
//            e.printStackTrace();
        }

        try {
            controller.insertOne(film);                  // 无异常的方法
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Context Stop");
    }

    // 测试连接是否可用
    public void createConnection() {
        boolean flag = true;
        Connection connection=null;

        try {
            Class.forName(System.getenv("DRIVERCLASSNAME"));
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        while (flag) {
//            System.out.println("try connect");
            try {
                connection = DriverManager.getConnection(System.getenv("URL"), System.getenv("USERNAME"), System.getenv("PASSWORD"));
                flag = false;
            }
            catch (Exception e) {
                flag = true;
            }
        }
    }
}
