import java.util.Scanner;

public class PriorityBased {
    public static void priorityBased(int n, int[] at, int[] bt, int[] priority) {
        int[] wt = new int[n];
        int[] ct = new int[n];
        int[] tat = new int[n];
        int totalbt = 0;
        int currentTime = 0;
        int[] rt = new int[n];
        for (int i = 0; i < n; i++) {
            rt[i] = bt[i];
            totalbt += bt[i];
        }
        int highPriority;
        while (totalbt != 0) {
            highPriority = -1;
            for (int i = 0; i < n; i++) {
                if (at[i] < currentTime && rt[i] > 0 && (highPriority == -1 || priority[highPriority] > priority[i])) {
                    highPriority = i;
                }
            }
            if (highPriority == -1) {
                currentTime++;
                continue;
            }
            rt[highPriority]--;
            totalbt--;
            if (rt[highPriority] == 0) {
                ct[highPriority] = currentTime;
                tat[highPriority] = ct[highPriority] - at[highPriority];
                wt[highPriority] = tat[highPriority] - bt[highPriority];
            }
            currentTime++;
        }
        float awt = 0.0f, atat = 0.0f;
        System.out.println("pid\tpriority\tat\tbt\twt\tct\ttat");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t\t%d\t%d\t%d\t%d\t%d\t%d\n", i + 1, priority[i], at[i], bt[i], wt[i], ct[i], tat[i]);
            awt += wt[i];
            atat += tat[i];
        }
        System.out.printf("avg wt: %.2f\navg atat: %.2f\n", awt / n, atat / n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter process: ");
        int n = sc.nextInt();
        int[] at = new int[n];
        int[] bt = new int[n];
        int[] priority = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter priority, at and bt of %dth process: ", i + 1);
            priority[i] = sc.nextInt();
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
        }
        priorityBased(n, at, bt, priority);
    }
}
