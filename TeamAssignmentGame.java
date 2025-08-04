import java.util.Arrays;

public class TeamAssignmentGame {
    public static void main(String args[]) {
        int[] teams = { 2, 45, 54, 12, 67, 98 };
        Arrays.sort(teams);
        int sum1 = 0, sum2 = 0;
        int[] team1 = new int[teams.length / 2];
        int[] team2 = new int[teams.length / 2];
        int j = 0, k = 0;

        for (int i = 0; i < teams.length; i++) {
            if (i % 2 == 0) {
                sum1 += teams[i];
                team1[j++] = teams[i];
            } else {
                sum2 += teams[i];
                team2[k++] = teams[i];
            }
        }

        if (sum1 <= sum2) {
            int t = teams[0];
            team1[0] = team2[0];
            team2[0] = t;
        }

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
    }

}
