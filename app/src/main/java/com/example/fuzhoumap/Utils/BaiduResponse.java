package com.example.fuzhoumap.Utils;

import java.util.List;

public class BaiduResponse {


   public static class Results{
        String name;
        String address;
        String province;
        String city;
        String area;
        String street_id;
        String telephone;
        String detail;
        String uid;
        String tag;
        String type;
        String detail_url;
        String price;
        String overall_rating;
        String comment_num;
        String children;
        double value;

        public Results setAddress(String address) {
            this.address = address;
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


        public Results setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public String getName() {
            return name;
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

        public String getDetail() {
            return detail;
        }

        public String getTelephone() {
            return telephone;
        }

        public String getUid() {
            return uid;
        }


            public String getType() {
                return type;
            }

            public  String setTag(String tag) {
                this.tag = tag;
                return this.tag;
            }

            public void setDetail_url(String detail_url) {
                this.detail_url = detail_url;
            }

            public void setChildren(String children) {
                this.children = children;
            }

            public String setType(String type) {
                this.type = type;
                return this.type;
            }

            public String setComment_num(String comment_num) {
                this.comment_num = comment_num;
                return this.comment_num;
            }

            public String setOverall_rating(String overall_rating) {
                this.overall_rating = overall_rating;
                return this.overall_rating;
            }

            public String setPrice(String price) {
                this.price = price;
                return this.price;
            }

            public String getChildren() {
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


