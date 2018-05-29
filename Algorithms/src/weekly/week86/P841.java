package weekly.week86;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class P841 {
	public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keyset = new HashSet<>();
        boolean[] visit = new boolean[rooms.size()];
        List<Integer> room0 = rooms.get(0);
        for (Integer key : room0) {
        	keyset.add(key);
		}
        visit[0] = true;
        while(!keyset.isEmpty()){
        	List<List<Integer>> room = new ArrayList<>();
        	List<Integer> visitroom = new ArrayList<>();
        	for(Integer i :keyset){
        		if(visit[i] == false){
        		room.add(rooms.get(i));
        		visit[i] = true;
        		visitroom.add(i);
        		}
        	}
        	for (List<Integer> list : room) {
				for (Integer integer : list) {
					if(visit[integer] == false)
					keyset.add(integer);
				}
			}
        	for (Integer integer : visitroom) {
				keyset.remove(integer);
			}
        }   	
        for(int j = 0;j<visit.length;j++){
        	if(visit[j] == false) return false;
        }
		return true;
    }
	
	public static void main(String[] args) {
		//[[6,7,8],[5,4,9],[],[8],[4],[],[1,9,2,3],[7],[6,5],[2,3,1]]
		List<Integer> l0 = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		List<Integer> l4 = new ArrayList<>();
		List<Integer> l5 = new ArrayList<>();
		List<Integer> l6 = new ArrayList<>();
		List<Integer> l7 = new ArrayList<>();
		List<Integer> l8 = new ArrayList<>();
		List<Integer> l9 = new ArrayList<>();
		l0.add(6);l0.add(7);l0.add(8);
		l1.add(5);l1.add(4);l1.add(9);
		l3.add(8);
		l4.add(4);
		l6.add(1);l6.add(9);l6.add(2);l6.add(3);
		l7.add(7);
		l8.add(6);l8.add(5);
		l9.add(2);l9.add(3);l9.add(1);

		List<List<Integer>> L = new ArrayList<>();
		L.add(l0);
		L.add(l1);
		L.add(l2);
		L.add(l3);
		L.add(l4);		
		L.add(l5);
		L.add(l6);
		L.add(l7);
		L.add(l8);
		L.add(l9);
		System.out.println(P841.canVisitAllRooms(L));
	}
}
