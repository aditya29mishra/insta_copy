package com.example.insta_copy

import com.example.insta_copy.feed_package.feed_package

class data {

    companion object {

        fun createdataset(): ArrayList<feed_package> {

            val list = ArrayList<feed_package>()

            list.add(

                feed_package(
                    "it.s.aditya._",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/my_self.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/my_self_modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            list.add(

                feed_package(
                    "_anvansh_",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/anvansh.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/anvansh_modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            list.add(

                feed_package(
                    "_utkarsh_",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/utkarsh.png",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/utkarsh-modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            list.add(

                feed_package(
                    "_prabhat_",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/prabhat.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/prabhat_modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            list.add(

                feed_package(
                    "_shashwat_",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/shashwat.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/shashwat-modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            list.add(

                feed_package(
                    "kanishk_",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/kanish.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/kanish_modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            list.add(

                feed_package(
                    "parthav",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/parthav.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/parthav-modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )


            list.add(

                feed_package(
                    "naveen",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/naveen.jpg",
                    "https://raw.githubusercontent.com/aditya29mishra/insta-photos/master/naveen-modified.png",
                    "profile updated ",
                    "like",
                    "View All Comments",
                )
            )

            return list
        }

    }


}