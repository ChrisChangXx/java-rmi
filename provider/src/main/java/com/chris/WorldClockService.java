package com.chris;

import java.rmi.RemoteException;
import java.time.LocalDateTime;

/**
 * @author chris
 */
public class WorldClockService implements WorldClock {
    @Override
    public LocalDateTime getLocalDateTime(String zoneId) throws RemoteException {
        return LocalDateTime.now();
    }
}
