package com.leetCode;

public class Codec {

    //Encode and Decode TinyURL No.535

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String url = longUrl + "@wangmeng";
        return url;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String url = shortUrl.replace("@wangmeng", "");
        return url;
    }


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

}

