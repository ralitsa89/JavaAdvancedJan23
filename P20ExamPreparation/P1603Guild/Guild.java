package P20ExamPreparation.P1603Guild;

import java.util.*;

public class Guild {
    private String name;
    private int capacity;
    Map<String, Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new LinkedHashMap<>();
    }

    public void addPlayer(Player player) {
        if (capacity > roster.size()) {
            this.roster.put(player.getName(), player);
        }
    }

    public int count() {
        return this.roster.size();
    }

    public boolean removePlayer(String name) {
        return this.roster.remove(name) != null;
    }

    public void promotePlayer(String name) {
        Player player = this.roster.get(name);
        if (player != null) {
            player.setRank("Member");
        }
    }

    public void demotePlayer(String name) {
        Player player = this.roster.get(name);
        if (player != null) {
            player.setRank("Trial");
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<String> names = new ArrayList<>();
        for (var entry : roster.entrySet()) {
            Player player = entry.getValue();
            if (player.getClazz().equals(clazz)) {
                names.add(entry.getKey());
            }
        }
        Player[] removedPlayers = new Player[names.size()];
        for (int i = 0; i < names.size(); i++) {
            Player player = this.roster.remove(names.get(i));
            removedPlayers[i] = player;
        }
        return removedPlayers;
    }

    public String report() {
        StringBuilder sb = new StringBuilder(String.format("Players in the guild: %s:%n", name));
        for (Player p : roster.values()) {
            sb.append(p).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
