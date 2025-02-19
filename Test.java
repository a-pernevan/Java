public class Test {
    String appName;
    double appVersion;

    Test() {
        System.out.println("Constructor called");
        appName = "JavaX";
        appVersion = 1.0;
    }

    public static void main (String[] args) {
        Test test = new Test();
        System.out.println("App Name: " + test.appName);
        System.out.println("App Version: " + test.appVersion);
    }
}
