package de.timmi6790.mpstats.api.versions.v1.common.player;

import de.timmi6790.mpstats.api.versions.v1.common.player.models.RepositoryPlayer;

import java.util.Optional;

public interface PlayerService<P extends RepositoryPlayer> {
    boolean hasPlayer(final String playerName);

    Optional<P> getPlayer(final int repositoryId);

    Optional<P> getPlayer(final String playerName);
}
