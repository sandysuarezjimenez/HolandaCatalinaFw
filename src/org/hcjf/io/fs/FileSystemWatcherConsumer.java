package org.hcjf.io.fs;

import org.hcjf.service.ServiceConsumer;

import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;

/**
 * This class must be implemented if tou want to
 * consume the file system watcher service.
 * @author javaito
 * @email javaito@gmail.com
 */
public abstract class FileSystemWatcherConsumer implements ServiceConsumer {

    private final Path basePath;
    private final WatchEvent.Kind[] evetKinds;

    /**
     * Constructor
     * @param basePath Base path, all the paths bellow of the base are wached by the consumer
     * @param evetKinds Kinds of events that this consumer are listening
     */
    public FileSystemWatcherConsumer(Path basePath, WatchEvent.Kind... evetKinds) {
        this.basePath = basePath;
        this.evetKinds = evetKinds;
    }

    /**
     * Return the base path.
     * @return Base path.
     */
    public final Path getBasePath() {
        return basePath;
    }

    /**
     * Return an array of the event kinds.
     * @return Event kinds.
     */
    public final WatchEvent.Kind[] getEvetKinds() {
        return evetKinds;
    }

    /**
     * This method must be implemented if you want to
     * listen the create event over the base path.
     * @param event Event information.
     */
    protected void create(WatchEvent event) {}

    /**
     * This method must be implemented if you want to
     * listen the update event over the base path.
     * @param event Event information.
     */
    protected void update(WatchEvent event) {}

    /**
     * This method must be implemented if you want to
     * listen the delete event over the base path.
     * @param event Event information.
     */
    protected void delete(WatchEvent event) {}

    /**
     * This method must be implemented if you want to
     * listen the overflow event over the base path.
     * @param event Event information.
     */
    protected void overflow(WatchEvent event) {}

}
