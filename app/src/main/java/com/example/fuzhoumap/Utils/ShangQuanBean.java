package com.example.fuzhoumap.Utils;

public class ShangQuanBean {

    int status;
    String message;
    int total;
    Result result;

    public int getTotal() {
        return total;
    }

    public Result getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public ShangQuanBean setMessage(String message) {
        this.message = message;
        return this;
    }

    public ShangQuanBean setResult(Result result) {
        this.result = result;
        return this;
    }

    public ShangQuanBean setStatus(int status) {
        this.status = status;
        return this;
    }

    public ShangQuanBean setTotal(int total) {
        this.total = total;
        return this;
    }

    public class Result{
        String name;
        Location location;
        String address;
        String province;
        String city;
        String area;
        int detail;
        String uid;
        Detail_info detail_info;

        public String getAddress() {
            return address;
        }

        public String getProvince() {
            return province;
        }

        public Location getLocation() {
            return location;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public String getUid() {
            return uid;
        }

        public Detail_info getDetail_info() {
            return detail_info;
        }

        public String getArea() {
            return area;
        }

        public int getDetail() {
            return detail;
        }

        public Result setLocation(Location location) {
            this.location = location;
            return this;
        }

        public Result setAddress(String address) {
            this.address = address;
            return this;
        }

        public Result setArea(String area) {
            this.area = area;
            return this;
        }

        public Result setCity(String city) {
            this.city = city;
            return this;
        }

        public Result setName(String name) {
            this.name = name;
            return this;
        }

        public Result setProvince(String province) {
            this.province = province;
            return this;
        }

        public Result setDetail(int detail) {
            this.detail = detail;
            return this;
        }

        public Result setDetail_info(Detail_info detail_info) {
            this.detail_info = detail_info;
            return this;
        }

        public Result setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public class Location{
            float lat;
            float lng;

            public Location setLng(float lng) {
                this.lng = lng;
                return this;
            }

            public Location setLat(float lat) {
                this.lat = lat;
                return this;
            }

            public float getLat() {
                return lat;
            }

            public float getLng() {
                return lng;
            }
        }
        public class Detail_info{
            String tag;
            Navi_location navi_location;
            String type;
            String detail_url;
            String image_num;
            String children;

            public Detail_info setNavi_location(Navi_location navi_location) {
                this.navi_location = navi_location;
                return this;
            }

            public Detail_info setType(String type) {
                this.type = type;
                return this;
            }

            public Detail_info setChildren(String children) {
                this.children = children;
                return this;
            }

            public Detail_info setTag(String tag) {
                this.tag = tag;
                return this;
            }

            public Detail_info setImage_num(String image_num) {
                this.image_num = image_num;
                return this;
            }

            public Detail_info setDetail_url(String detail_url) {
                this.detail_url = detail_url;
                return this;
            }

            public String getTag() {
                return tag;
            }

            public String getDetail_url() {
                return detail_url;
            }

            public String getChildren() {
                return children;
            }

            public Navi_location getNavi_location() {
                return navi_location;
            }

            public String getImage_num() {
                return image_num;
            }

            public String getType() {
                return type;
            }

            public class Navi_location{
                double lng;
                double lat;

                public Navi_location setLat(double lat) {
                    this.lat = lat;
                    return this;
                }

                public Navi_location setLng(double lng) {
                    this.lng = lng;
                    return this;
                }

                public double getLat() {
                    return lat;
                }

                public double getLng() {
                    return lng;
                }
            }

        }

    }

}
