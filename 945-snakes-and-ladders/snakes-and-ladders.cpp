class Solution {
public:
    int snakesAndLadders(vector<vector<int>>& board) {
        int rows = board.size(), target= rows*rows;
        int count=1;
        vector<pair<int,int>> cells(target+1);
        vector<int> columns(rows);
        iota(columns.begin(),columns.end(),0);
        for(int row=rows-1;row>=0;row--){
            for(auto col:columns){
                cells[count]={row,col};
                count++;
            }
            reverse(columns.begin(),columns.end());
        }
        vector<int> distance(target+1,-1);
        distance[1]=0;
        queue<int> q;
        q.push(1);
        while(!q.empty()){
            int curr = q.front();
            q.pop();
            for(int next = curr+1;next<=min(curr+6,target);next++){
                auto [row,column]=cells[next];
                int dest = board[row][column]!=-1?board[row][column]:next;
                if(distance[dest]==-1){
                    distance[dest]=distance[curr]+1;
                    q.push(dest);
                }
            }
        }
        return distance[target];
    }
};

