# Instagram Backend

This repository contains the backend code for an Instagram-like application implemented in Java using the Spring Boot framework. The backend provides endpoints for user management, posting, liking, commenting, and following other users.

## Table of Contents

- [Controller](#controller)
- [Model](#model)
- [Endpoints](#endpoints)

## Controller

### UserController

#### `userSignUp`

- **Endpoint:** `POST /user/signup`
- **Description:** Signs up a new user.
- **Request Body:**
  - `User`: User details to be signed up.
- **Response:** Returns a message indicating the success of the sign-up process.

#### `userSignIn`

- **Endpoint:** `POST /user/signIn/{email}/{password}`
- **Description:** Signs in a user.
- **Path Variables:**
  - `email`: User's email address.
  - `password`: User's password.
- **Response:** Returns a message indicating the success of the sign-in process.

#### `userSignOut`

- **Endpoint:** `DELETE /user/signOut`
- **Description:** Signs out a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `token`: User's authentication token.
- **Response:** Returns a message indicating the success of the sign-out process.

#### `createInstaPost`

- **Endpoint:** `POST /InstaPost`
- **Description:** Creates a new Instagram post for a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
- **Request Body:**
  - `Post`: Details of the new Instagram post.
- **Response:** Returns a message indicating the success of the post creation.

#### `deleteInstaPost`

- **Endpoint:** `DELETE /InstaPost/{postId}`
- **Description:** Deletes an existing Instagram post for a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `postId`: ID of the post to be deleted.
- **Response:** Returns a message indicating the success of the post deletion.

#### `addLike`

- **Endpoint:** `POST /like/post/{postId}`
- **Description:** Adds a like to a specific Instagram post for a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `postId`: ID of the post to be liked.
- **Response:** Returns a message indicating the success of the like addition.

#### `removeLike`

- **Endpoint:** `DELETE /unlike/post/{postId}`
- **Description:** Removes a like from a specific Instagram post for a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `postId`: ID of the post to be unliked.
- **Response:** Returns a message indicating the success of the like removal.

#### `getLikesByPostId`

- **Endpoint:** `GET /count/likes/post/{postId}`
- **Description:** Retrieves the count of likes for a specific Instagram post.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `postId`: ID of the post to get likes count.
- **Response:** Returns the count of likes for the specified post.

#### `addComment`

- **Endpoint:** `POST /comment/post/{postId}`
- **Description:** Adds a comment to a specific Instagram post for a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `postId`: ID of the post to be commented on.
- **Request Body:**
  - `String`: Body of the comment.
- **Response:** Returns a message indicating the success of the comment addition.

#### `removeComment`

- **Endpoint:** `DELETE /post/comment/{commentId}`
- **Description:** Removes a comment from a specific Instagram post for a user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `commentId`: ID of the comment to be removed.
- **Response:** Returns a message indicating the success of the comment removal.

#### `followTarget`

- **Endpoint:** `POST /follow/user/{targetUserId}`
- **Description:** Follows a target user.
- **Request Parameters:**
  - `email`: User's email address.
  - `tokenValue`: User's authentication token.
  - `targetUserId`: ID of the user to be followed.
- **Response:** Returns a message indicating the success of the follow action.

