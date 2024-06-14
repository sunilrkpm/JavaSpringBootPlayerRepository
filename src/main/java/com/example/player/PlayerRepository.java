// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player addPlayer(Player player);

    Player getPlayer(int playerId);

    Player updatePlayer(int playerId, Player player);
    void deletePalyer(int playerId);
}