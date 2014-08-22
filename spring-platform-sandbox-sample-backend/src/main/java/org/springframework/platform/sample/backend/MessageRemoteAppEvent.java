package org.springframework.platform.sample.backend;

import lombok.Data;
import org.springframework.platform.bus.event.RemoteApplicationEvent;

/**
 * @author Spencer Gibb
 */
@Data
public class MessageRemoteAppEvent extends RemoteApplicationEvent {
    private String message;

    public MessageRemoteAppEvent(Object source, String originService, String message) {
        super(source, originService);
        this.message = message;
    }
}
