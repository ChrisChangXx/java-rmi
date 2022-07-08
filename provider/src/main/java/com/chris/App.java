package com.chris;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * provider
 *
 * @author chris
 */
public class App {
    public static void main(String[] args) {
        System.out.println("create World clock remote service...");
        WorldClock worldClock = new WorldClockService();
        try {
            WorldClock skeleton = (WorldClock) UnicastRemoteObject.exportObject(worldClock, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("WorldClock", skeleton);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
