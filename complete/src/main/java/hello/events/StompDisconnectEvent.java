package hello.events;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
public class StompDisconnectEvent implements ApplicationListener<SessionDisconnectEvent> {


  @Override
  public void onApplicationEvent(SessionDisconnectEvent event) {
    StompHeaderAccessor sha = StompHeaderAccessor.wrap(event.getMessage());

    //String  company = sha.getNativeHeader("company").get(0);
    System.out.println("Disconnected event [sessionId: " + sha.getSessionId() + "]");
  }
}
