package com.example.fuzhoumap.Utils;

import java.sql.Array;
import java.util.List;

public class BaiduResponse {

    int status;
    String message;
    int total;
    List<Results> results;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public String getMessage() {
        return message;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public List<Results> getResults() {
        return results;
    }


    static public class Results{
        String name;
        Location location;
        String address;
        String province;
        String city;
        String area;
        String street_id;
        String telephone;
        String detail;
        String uid;
        Detail_info detail_info;

        public Results(String name,String overall_rating,String price,String tag,String address){
            this.name = name;
            this.detail_info = new BaiduResponse.Results.Detail_info();
            this.detail_info.overall_rating = overall_rating;
            this.detail_info.price = price;
            this.detail_info.tag = tag;
            this.address = address;
        }

        public Results setAddress(String address) {
            this.address = address;
            return this;
        }

        public Results setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Results setArea(String area) {
            this.area = area;
            return this;
        }

        public Results setCity(String city) {
            this.city = city;
            return this;
        }

        public Results setName(String name) {
            this.name = name;
            return this;
        }

        public Results setProvince(String province) {
            this.province = province;
            return this;
        }

        public Results setDetail(String detail) {
            this.detail = detail;
            return this;
        }

        public Results setStreet_id(String street_id) {
            this.street_id = street_id;
            return this;
        }

        public Results setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Results setDetail_info(Detail_info detail_info) {
            this.detail_info = detail_info;
            return this;
        }

        public Results setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public String getName() {
            return name;
        }

        public Location getLocation() {
            return location;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getArea() {
            return area;
        }

        public String getProvince() {
            return province;
        }

        public String getStreet_id() {
            return street_id;
        }

        public Detail_info getDetail_info() {
            return detail_info;
        }

        public String getDetail() {
            return detail;
        }

        public String getTelephone() {
            return telephone;
        }

        public String getUid() {
            return uid;
        }


        static class Location{
            float lat;
            float lng;

            public void setLat(float lat) {
                this.lat = lat;
            }

            public void setLng(float lng) {
                this.lng = lng;
            }

            public float getLat() {
                return lat;
            }

            public float getLng() {
                return lng;
            }
        }
        static class Detail_info{
            String tag;
            String type;
            String detail_url;
            String price;
            String overall_rating;
            String comment_num;
            List children;//TODO:

            public String getType() {
                return type;
            }

            public Detail_info setTag(String tag) {
                this.tag = tag;
                return this;
            }

            public void setDetail_url(String detail_url) {
                this.detail_url = detail_url;
            }

            public void setChildren(List children) {
                this.children = children;
            }

            public Detail_info setType(String type) {
                this.type = type;
                return this;
            }

            public Detail_info setComment_num(String comment_num) {
                this.comment_num = comment_num;
                return this;
            }

            public Detail_info setOverall_rating(String overall_rating) {
                this.overall_rating = overall_rating;
                return this;
            }

            public Detail_info setPrice(String price) {
                this.price = price;
                return this;
            }

            public List getChildren() {
                return children;
            }

            public String getComment_num() {
                return comment_num;
            }

            public String getDetail_url() {
                return detail_url;
            }

            public String getOverall_rating() {
                return overall_rating;
            }

            public String getPrice() {
                return price;
            }

            public String getTag() {
                return tag;
            }
        }
    }



}
