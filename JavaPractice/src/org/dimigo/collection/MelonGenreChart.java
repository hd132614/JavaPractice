package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HIPERCUBE on 10/1/15.
 */
public class MelonGenreChart {
    public static void printMap(Map<String, List<Music>> map) {
        for (String key : map.keySet()) {
            System.out.println("[" + key + "]");
            List<Music> list = map.get(key);
            for (int i = 0; i < list.size(); ++i) {
                System.out.println(String.valueOf(i + 1) + ". " + list.get(i).toString());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, List<Music>> map = new HashMap<String, List<Music>>();

        List<Music> balladList = new ArrayList<Music>();
        balladList.add(new Music("내 첫사랑", "베리굿"));
        balladList.add(new Music("또 다시 사랑", "임창정"));
        balladList.add(new Music("부산에 가면", "박진영"));
        map.put("발라드", balladList);


        List<Music> danceList = new ArrayList<Music>();
        danceList.add(new Music("커피", "유재환, 김예림"));
        danceList.add(new Music("다 잘될거야", "쿨"));
        map.put("댄스", danceList);

        System.out.println("-------- << 멜론 장르별 챠트 >> --------");
        printMap(map);

        balladList.set(2, new Music("지우고 지워도", "차수경"));
        map.put("발라드", balladList);
        System.out.println("\n-------- << 발라드 3위 곡 변경 >> --------");
        printMap(map);

        balladList.remove(0);
        map.put("발라드", balladList);
        System.out.println("\n-------- << 발라드 1위 곡 삭제 >> --------");
        printMap(map);

        map.clear();
        System.out.println("\n-------- << 전체 리스트 삭제 >> --------");
        printMap(map);
    }
}
