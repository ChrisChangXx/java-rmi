package com.chris;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.time.LocalDateTime;

/**
 * consumer
 *
 * @author chris
 */
public class App {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            WorldClock worldClock = (WorldClock) registry.lookup("WorldClock");
            LocalDateTime localDateTime = worldClock.getLocalDateTime("Asia/Shanghai");
            System.out.println(localDateTime);
        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
