record Student(int score,int studentId){}
class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report,
            int[] student_id, int k) {
        Set<String> pos = new HashSet<>(Arrays.asList(positive_feedback));
        Set<String> neg = new HashSet<>(Arrays.asList(negative_feedback));
        Queue<Student> pq = new PriorityQueue<>((a, b) -> {
            if(a.score()==b.score()){
                return Integer.compare(a.studentId(),b.studentId());
            }
            return Integer.compare(b.score(),a.score());
        });
        for (int i = 0; i < student_id.length; i++) {
            int score = 0;
            String[] currentReport = report[i].split(" ");
            for (String c : currentReport) {
                if (pos.contains(c)) {
                    score += 3;
                }
                if (neg.contains(c)) {
                    score -= 1;
                }
            }
            pq.add(new Student(score, student_id[i]));
        }
        int d=k;
        List<Integer> ans = new ArrayList<>();
        while (k-- >0 && !pq.isEmpty()) {
            ans.add(pq.poll().studentId());
        }
        System.out.println(ans);
        return ans;
    }
}