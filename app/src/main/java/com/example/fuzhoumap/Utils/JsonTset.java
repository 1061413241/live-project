package com.example.fuzhoumap.Utils;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class JsonTset {

    public List<BaiduResponse.Results> list = new ArrayList<>();

    public ArrayList<BaiduResponse.Results> list0 = new ArrayList<BaiduResponse.Results>();
    public ArrayList<BaiduResponse.Results> list1 = new ArrayList<BaiduResponse.Results>();
    public ArrayList<BaiduResponse.Results> list2 = new ArrayList<BaiduResponse.Results>();
    public ArrayList<BaiduResponse.Results> list3 = new ArrayList<BaiduResponse.Results>();

    public static String readJsonFile(String fileName) {
        String jsonStr = "";
        try {
            File jsonFile = new File(fileName);
            FileReader fileReader = new FileReader(jsonFile);

            Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }



    public static void deal() {

        new Thread(new Runnable(){
            @Override
            public void run() {
                int count=0;
                List<BaiduResponse.Results> list = new ArrayList<>();
                //String data = "{\"website\":\"chinamobilesh\", \"create_time\":157360, \"basic_version\":{\"user_gender\": \"男\",\"user_searched_history_by_orgs\": [{\"org_self\": true,\"searched_date\": \"2017-11-07\",\"searched_org\": \"其他\"},{\"org_self\": false,\"searched_date\": \"2017-07-08\",\"searched_org\": \"线上消费分期\"}]}}";
                //InterFace rel = new InterFace();
                while(count<5) {
                    String data = InterFace.deal(count);
                    Log.d("JsonTest", "JsonTest:" +data);

                    Gson gson = new Gson();
//         将 json 转化 成 List泛型
                    java.lang.reflect.Type type = new TypeToken<BaiduResponse>() {}.getType();
                    final BaiduResponse baiduResponse= gson.fromJson(data, type);
                    list = baiduResponse.results;

//                hisList = gson.fromJson(val, new TypeToken<List<History>>() {}.getType());
                    //BaiduResponse baiduresponse = gson.fromJson(data, BaiduResponse.class);
                    //	BaiduResponse.Results = gson.fromJson(data, new TypeToken<BaiduResponse[]>(){}.getType());


//					JSONObject jsonObject1= new  JSONObject(data);
//					//JSONObject basic = jsonObject.getJSONObject("result");
//					JSONArray re  = jsonObject1.getJSONArray("results");
//					   String orgSel = null;
//					   System.out.println(re.length());
//					   for (int i=0; i < re.length(); i++){
//					    //每一个array都是一个JSONObject
//
//					       JSONObject jo1 = re.getJSONObject(i);
//					       BaiduResponse.Results result=new BaiduResponse.Results();
//					      // System.out.println(jo1.getJSONObject("location").get("lat").toString());
//					       result.name= jo1.get("name").toString();
//					     //result.detail_info info = result.new detail_info();
//					      // result.location.lng=jo1.getJSONObject("location").get("lng").toString();
//					       result.address=jo1.get("address").toString();
//					       result.province=jo1.get("province").toString();
//					       result.city=jo1.get("city").toString();
//					       //System.out.println(jo1.get("street_id").toString());
//					       if( jo1.getJSONObject("detail_info").has("price")) {
//					    	   result.price= jo1.getJSONObject("detail_info").get("price").toString();
//					        // System.out.println(s);
//					       }
//
//					       //result.price=jo1.getJSONObject("detail_info").get("price").toString();
//					      //System.out.println(jo1.getJSONObject("detail_info").get("price").toString());
//					       result.area=jo1.get("area").toString();
//					      // result.street_id=jo1.get("street_id").toString();
//					      // result.telephone=jo1.get("telephone").toString();
//					       result.detail=jo1.get("detail").toString();
//					       result.uid=jo1.get("uid").toString();
//					       result.tag=jo1.getJSONObject("detail_info").get("tag").toString();
//					       result.type=jo1.getJSONObject("detail_info").get("type").toString();
//					       result.detail_url=jo1.getJSONObject("detail_info").get("detail_url").toString();
//					       result.overall_rating=jo1.getJSONObject("detail_info").get("overall_rating").toString();
//					      //result.value=	Double.valueOf(result.price)/Double.valueOf(result.overall_rating);
//					       if(jo1.getJSONObject("detail_info").has("comment_num")) {
//					    	   result.comment_num=jo1.getJSONObject("detail_info").get("comment_num").toString();
//					       }
//					       else {
//					    	   result.comment_num="0";
//					       }
//					       result.children=null;
//					       list.add(result);
////					       JSONObject lo = jo1.getJSONObject("location");
////					       orgSel = String.valueOf(jo1.get("name"));
//					       //break;
//
//					   }
//
//					   count++;
//		}
//
////		 Collections.sort(list, new Comparator<BaiduResponse.Results>() {
////			   public int compare(BaiduResponse.Results p1, BaiduResponse.Results p2) {
////			        //按照Person的年龄进行升序排列
////			        if(Double.valueOf(p1.overall_rating) < Double.valueOf(p2.overall_rating)){
////			            return 1;
////			        }
////
////			        return -1;
////			    }
////		   });
                    ArrayList<BaiduResponse.Results> list00 = new ArrayList<BaiduResponse.Results>();
                    ArrayList<BaiduResponse.Results> list11 = new ArrayList<BaiduResponse.Results>();
                    ArrayList<BaiduResponse.Results> list22 = new ArrayList<BaiduResponse.Results>();
                    ArrayList<BaiduResponse.Results> list33 = new ArrayList<BaiduResponse.Results>();
//
                    for(BaiduResponse.Results item:list) {
                        if(item.detail_info.price!=null) {
                            if(Double.valueOf(item.detail_info.price)<=50.0) {
                                list00.add(item);
                                //if(list0.size()==5) break;
                            }
                            else if(Double.valueOf(item.detail_info.price)>50.0&&Double.valueOf(item.detail_info.price)<=100.0) {
                                list11.add(item);
                            }
                            else if(Double.valueOf(item.detail_info.price)>100.0&&Double.valueOf(item.detail_info.price)<=200.0) {
                                list22.add(item);
                            }
                            else if(Double.valueOf(item.detail_info.price)>200.0) {
                                list33.add(item);
                            }
                        }
                    }
//				   for(BaiduResponse.Results item:list0) {
//					   System.out.println(item.name);
//				   }
//				   System.out.println("----------------------------------------------");
//				   for(BaiduResponse.Results item:list1) {
//					   System.out.println(item.name);
//				   }
//				   System.out.println("----------------------------------------------");
//				   for(BaiduResponse.Results item:list2) {
//					   System.out.println(item.name);
//				   }
//				   System.out.println("----------------------------------------------");
//				   for(BaiduResponse.Results item:list3) {
//					   System.out.println(item.name);
//				   }
//				   Gson gson=new Gson();
//
//				   String jsonStr=gson.toJson(list);
//			        JSONObject jsonObject2= new  JSONObject(jsonStr);
                }

            }
        }).start();


    }

}
