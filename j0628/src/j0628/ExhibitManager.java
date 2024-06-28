package j0628;
import java.util.*;
public class ExhibitManager {
	// iv = 필드, 인스턴스변수, 전역변수
	Map<Integer, Exhibit> exhibitMap = new HashMap<Integer, Exhibit>();
	// 전시회를 맵에 추가하는 메서드
	void insertExhibit(Exhibit exh) {
		// key 는 중복이 없어야하기때문에 가장 마지막 key값을 찾는다
		int lastNo = 0;
		Iterator<Integer> it = exhibitMap.keySet().iterator();
		while(it.hasNext()) {
			lastNo = it.next();
		}
		exhibitMap.put(lastNo+1, exh);
	}
	Map<Integer, Exhibit> selectMap(){
		return exhibitMap;
	}
	public Map<Integer, Exhibit> searchMap (String title){
		Map<Integer, Exhibit> map = new HashMap<Integer, Exhibit>();
		
		for(Integer i : exhibitMap.keySet()) {
			if(exhibitMap.get(i).getTitle().contains(title)) {
				map.put(i, exhibitMap.get(i));
			}
		}
		return map;
	} //searchMap
	public int deleteMap(int no) {
		Exhibit tmp = null;
		for(Integer i : exhibitMap.keySet()) {
			if(i == no) {
				tmp = exhibitMap.remove(no);
				break;
			}
		}
		return tmp != null ? 1 : 0;
		// tmp가 null이 아닐때 참이면 1 아니면 0
	}
	
	
	
	
}
