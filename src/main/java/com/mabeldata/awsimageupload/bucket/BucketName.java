package com.mabeldata.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("bucketname");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
