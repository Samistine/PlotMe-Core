package com.worldcretornica.plotme_core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public class PlayerList {

    private HashMap<String, UUID> playerList = new HashMap<>();

    public void put(String name) {
        put(name, null);
    }

    public void put(String name, UUID uuid) {
        playerList.put(name, uuid);
    }

    public UUID remove(String name) {
        String found = "";
        for (String key : playerList.keySet()) {
            if (key.equalsIgnoreCase(name)) {
                found = key;
            }
        }
        UUID uuid = null;
        if (!found.isEmpty()) {
            uuid = playerList.get(found);
            playerList.remove(found);
        }
        return uuid;
    }

    public String remove(UUID uuid) {
        for (String name : playerList.keySet()) {
            if (playerList.get(name).equals(uuid)) {
                playerList.remove(name);
                return name;
            }
        }
        return "";
    }

    public Set<String> getPlayerNames() {
        return playerList.keySet();
    }

    public String getPlayerNamesAsString() {
        StringBuilder list = new StringBuilder();

        for (String s : getPlayerNames()) {
            list = list.append(s).append(", ");
        }
        if (list.length() > 1) {
            list = list.delete(list.length() - 2, list.length());
        }
        return list.toString();
    }

    public boolean contains(String name) {
        for (String key : playerList.keySet()) {
            if (key.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(UUID uuid) {
        return playerList.values().contains(uuid);
    }

    public HashMap<String, UUID> getAllPlayers() {
        return playerList;
    }

    public void clear() {
        playerList.clear();
    }

    public int size() {
        return playerList.size();
    }

    public void replace(UUID uuid, String newName) {
        if (uuid != null && playerList != null) {
            if (contains(uuid)) {
                Iterator<String> it = playerList.keySet().iterator();
                while (it.hasNext()) {
                    String name = it.next();

                    if (playerList.get(name) != null && playerList.get(name).equals(uuid)) {
                        playerList.remove(name);
                        playerList.put(newName, uuid);
                        return;
                    }
                }
            }
        }
    }

    public void replace(String oldname, String newname, UUID newUuid) {
        if (newUuid != null && playerList != null) {
            if (contains(oldname)) {
                Iterator<String> it = playerList.keySet().iterator();
                while (it.hasNext()) {
                    String key = it.next();

                    if (key.equalsIgnoreCase(oldname)) {
                        playerList.remove(key);
                        playerList.put(newname, newUuid);
                        return;
                    }
                }
            }
        }
    }
}
