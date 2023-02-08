package com.example.myapplication.model.remote

import com.example.myapplication.model.remote.Post

interface PostsApi {
        suspend fun getPosts(): List<Post>
}