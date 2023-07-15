import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseMacro {

  public static void main(String[] args) {
    try {
      // 로봇 객체 생성
      Robot robot = new Robot();

      // 반복 횟수 설정
      int repeatCount = 1000;

      // 반복 작업
      for (int i = 0; i < repeatCount; i++) {
        // 3초 대기
        robot.delay(500);

        // 마우스 클릭 이벤트
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      }
    } catch (AWTException e) {
      e.printStackTrace();
    }
  }
}
