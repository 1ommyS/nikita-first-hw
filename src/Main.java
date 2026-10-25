import exceptions.ApiException;
import exceptions.BadCredentialsException;

import java.io.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;

public class Main {
    interface A {
        int sum(int a, int b, int c);
    }

    class Job {
        public Job() {
            // параметры джобы, например, размер выборки, расписание запуска и тд
        }

        /*
        нужно скачать актуальный каталог Магнита на текущий момент.
        Ограничения: у магнаит 150.000 магазинов. В каждом магазине порядка 5000 позиций. Для каждой позиции нужно знать всю информацию по ней + кол-во этой позиции в этом магазине.
         */
        void run() {
            // выбрать записи из БД
            // применить логику
            // сохранить
        }
    }


//    // bad
//    interface UserInterface {
//        void saveUser();
//
//        void deleteUser();
//    }
//
//    class UserInterfaceImpl implements UserInterface {
//
//    }
//
//    // good
//    interface SaveUserInterface {
//        void save();
//    }
//
//    interface DeleteUserInterface {
//        void delete();
//    }
//
//    class UserInterfaceImpl implements SaveUserInterface, DeleteUserInterface {
//
//    }

    static void divide(int a, int b) {
        System.out.println(a / b);
    }


    static void РЕАЛИСТИЧНАЯ_СИТУАЦИЯ() {
        throw new BadCredentialsException();
    }

    static void handleExceptionAndBeautifyLog(RuntimeException exception) {
        if (exception instanceof ApiException apiException) {
            System.out.println("ХА ХА ХА ХА ХА ХА, это апи исключение, нам пофиг. Метод: " + apiException.getApiMethod());
        }
    }


    public static void main(String[] args) throws Exception {
        try {
            РЕАЛИСТИЧНАЯ_СИТУАЦИЯ();
        } catch (RuntimeException exception) {
            handleExceptionAndBeautifyLog(exception);
        }
    }
}