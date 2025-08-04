import java.util.Arrays;

public class TeamAssignmentGame {
    public static void main(String args[]) {
        int[] members = { 10, 20, 30, 40 };

        int[] team1 = new int[members.length / 2];
        int[] team2 = new int[members.length / 2];

        int sum1 = 0, sum2 = 0, j = 0, k = 0;

        for (int i = 0; i < members.length; i++) {
            if (sum1 <= sum2) {
                team1[j++] = members[i];
                sum1 += members[i];
            } else {
                team2[k++] = members[i];
                sum2 += members[i];
            }
        }

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
    }

}
