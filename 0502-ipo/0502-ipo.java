
class Project implements Comparable<Project> {
    int profit;
    int capital;

    Project(int profit, int capital) {
        this.profit = profit;
        this.capital = capital;
    }

    @Override
    public int compareTo(Project that) {
        return this.capital - that.capital; // increasing order of capital
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> minPQ = new PriorityQueue<>();
        int n = capital.length;

        for (int i = 0; i < n; i++) {
            minPQ.offer(new Project(profits[i], capital[i]));
        }

        PriorityQueue<Project> maxPQ = new PriorityQueue<>((a, b) -> b.profit - a.profit); // max heap based on profit

        while (k > 0) {
            while (!minPQ.isEmpty() && minPQ.peek().capital <= w) {
                maxPQ.offer(minPQ.poll());
            }
            if (maxPQ.isEmpty()) break;
            w += maxPQ.poll().profit;
            k--;
        }

        return w;
    }
}
