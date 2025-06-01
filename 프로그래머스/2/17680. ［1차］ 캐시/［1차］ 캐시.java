import java.util.LinkedHashMap;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0 ) return cities.length * 5;

		int time = 0;
		LinkedHashMap<String, Integer> cache = new LinkedHashMap<>(cacheSize,0.75f, true);
		// cacheSize : 캐시 사이즈 설정
		// 0.75f : 기본 값, 얼마나 채워졌을 때 리사이징 할 지 결정
		// true : get 하면 맨 뒤로 이동 됨

		for(String city : cities){
			city = city.toLowerCase();

			if(cache.containsKey(city)){
				//캐시 안에 존재 할 경우, 속도 1로 계산
				time += 1;
				cache.get(city);
			}else {
				//캐시 MISS
				time += 5;
				if(cache.size() >= cacheSize){
					String oldest = cache.keySet().iterator().next();
					cache.remove(oldest);
				}
				cache.put(city,0);
			}
		}
		return time;
    }
}