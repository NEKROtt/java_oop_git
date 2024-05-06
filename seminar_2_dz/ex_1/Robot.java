package seminar_2_dz.ex_1;

public class Robot implements Athletics{

    private final int maxLength;
    private final int maxHeight;
    boolean isActive; 

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.isActive = true;
    }

    @Override
    public void run(int length) {
        if (isActive) {
            System.out.printf("Робот %s пробежал %d\n", maxLength < length ? "не" : "", length);
        }
        if (maxLength < length) {
            isActive = false;
        }
    }

    @Override
    public void jump(int height) {
        if (isActive) {
            System.out.printf("Робот %s прыгнул %d\n", maxHeight < height ? "не" : "", height);
        }
        if (maxHeight < height) {
            isActive = false;
        }
    }
}
