package dev.wendel.start.infrastructure;

import dev.wendel.start.domain.entities.User;
import dev.wendel.start.domain.repositories.UserRepository;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class StartupService {

    private final Logger log = LoggerFactory.getLogger(StartupService.class);

    @Inject
    private UserRepository userRepository;

    @EventListener
    public void onStartupEvent(StartupEvent startupEvent) {
        User user = userRepository.save(new User(
                "00299620212",
                "12345"
        ));
        log.info("usuário adicionado: {}", user);
    }

}
