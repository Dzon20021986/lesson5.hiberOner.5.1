package ru.geekbrains.lesson5.hiberDz;

public class MainApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);
            System.out.println(productDao.findById(2L));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sessionFactoryUtils.shotdown();
        }
    }
}
