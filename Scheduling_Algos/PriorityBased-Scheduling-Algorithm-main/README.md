# Priority Based Scheduling

This program implements the Priority Based Scheduling algorithm for CPU scheduling. It takes the arrival time, burst time and priority of each process as input and outputs the waiting time, completion time, turnaround time and average waiting time and turnaround time.

## How to Use

1. Compile the java file
```
javac priorityBased.java
```

2. Run the compiled file
```
java priorityBased
```

3. Enter the number of processes and the arrival time, burst time and priority of each process

4. The program will output the waiting time, completion time, turnaround time and average waiting time and turnaround time for each process.

## Example

```
Enter process: 3
Enter priority, at and bt of 1th process: 2 0 5
Enter priority, at and bt of 2th process: 3 1 3
Enter priority, at and bt of 3th process: 1 2 2
pid     priority        at      bt      wt      ct      tat
1               2       0       5       3       8       8
2               3       1       3       3       6       5
3               1       2       2       0       4       2
avg wt: 2.00
avg atat: 5.00
```

In this example, there are three processes with arrival time, burst time and priority as follows:

| Process | Arrival Time | Burst Time | Priority |
|---------|--------------|------------|----------|
| P1      | 0            | 5          | 2        |
| P2      | 1            | 3          | 3        |
| P3      | 2            | 2          | 1        |

The program outputs the waiting time, completion time, turnaround time and average waiting time and turnaround time for each process.
