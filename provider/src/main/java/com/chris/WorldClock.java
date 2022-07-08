package com.chris;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;

/**
 * @author chris
 */
public interface WorldClock extends Remote {
    LocalDateTime getLocalDateTime(String zoneId) throws RemoteException;
}
