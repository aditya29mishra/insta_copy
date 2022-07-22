package com.example.insta_copy.feed_package

class feed_package(
    var user_name: String,
    var user_id: String,
    var post_photo: String,
    var user_profile: String,
    var caption: String,
    var like: String,
    var comments: String,
    )
{

    override fun toString(): String {
        return "feed(user_name='$user_name', user_id='$user_id', post_photo='$post_photo', user_photo='$user_profile', id='$user_id', caption='$caption', comment='$comments' , like='$like')"
    }


}
