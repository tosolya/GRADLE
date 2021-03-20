package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    @Test
    void changeCount() {
        CartService service = new CartService();

 //функцианальный интерфейс заменяем на лямбду
   //     assertThrows(UnsupportedOperationException.class, new Executable() {
    //                @Override
      //              public void execute() throws Throwable {

               //     }
            //    });
    //    service.changeCount(1,1);

        assertThrows(UnsupportedOperationException.class,() -> service.changeCount(1,1));
    }
}