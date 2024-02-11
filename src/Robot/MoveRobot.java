package Robot;

public class MoveRobot {
    public static void moveRobot(Robot robot, int toX, int toY) {
        turnRobot(robot, robot.getX() < toX ? Direction.RIGHT : Direction.LEFT);
        stepRobot(robot, toX, true);

        turnRobot(robot, robot.getY() < toY ? Direction.UP : Direction.DOWN);
        stepRobot(robot, toY, false);
    }

    private static void turnRobot(Robot robot, Direction targetDirection) {
        while (robot.getDirection() != targetDirection) {
            robot.turnRight();
        }
    }

    private static void stepRobot(Robot robot, int target, boolean isX) {
        while ((isX ? robot.getX() : robot.getY()) != target) {
            robot.stepForward();
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        int toX = 3;
        int toY = 5;

        moveRobot(robot, toX, toY);

        System.out.println("Текущая позиция робота: (" + robot.getX() + ", " + robot.getY() + ")");
    }
}
