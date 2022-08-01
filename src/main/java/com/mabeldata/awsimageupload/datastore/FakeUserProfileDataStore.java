package com.mabeldata.awsimageupload.datastore;

import com.mabeldata.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("6e00a57a-aeb9-4308-96b1-240c4b8d4e59"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("bb710379-b9f1-414d-a546-d4f89ba13d84"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
