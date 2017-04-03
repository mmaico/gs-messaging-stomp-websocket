package hello.events;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;

@Component
public class StompConnectEvent implements ApplicationListener<SessionConnectedEvent> {

  @Override
  public void onApplicationEvent(SessionConnectedEvent event) {
    StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());

    //String  company = sha.getNativeHeader("company").get(0);
    System.out.println("Connected event [sessionId: " + sha.getSessionId() + "]");
  }
}
