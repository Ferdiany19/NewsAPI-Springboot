# Project: News API Test
Ini adalah API yang dibuat untuk portal berita.  
Fitur API ini dapat membuat berita berdasarkan rolenya masing-masing.
# 📁 Collection: Roles 


## End-point: Add Role
Endpoint ini bertujuan untuk menambahkan role yang hanya bisa dilakukan oleh Admin.
### Method: POST
>```
>localhost:8080/api/v1/admin/roles/create
>```
### Body (**raw**)

```json
{
    "roleName": "Sponsor"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDEzNCwiZXhwIjoxNjk0MTEzNzM0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.n6bNzLGUabXG9hFmrN7L7zmWeTAAegjuoaNhNMj9PyU|string|


### Response: 201
```json
{
    "success": true,
    "message": "Success Add Role",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Roles
Endpoint ini untuk mendapatkan seluruh role yang telah terdaftar.
### Method: GET
>```
>localhost:8080/api/v1/admin/roles
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDEzNCwiZXhwIjoxNjk0MTEzNzM0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.n6bNzLGUabXG9hFmrN7L7zmWeTAAegjuoaNhNMj9PyU|string|


### Response: 200
```json
[
    {
        "roleId": 3,
        "role": "ROLE_ADMIN"
    },
    {
        "roleId": 1,
        "role": "ROLE_CREATOR"
    },
    {
        "roleId": 2,
        "role": "ROLE_USER"
    },
    {
        "roleId": 4,
        "role": "Sponsor"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Users 


## End-point: Create User
Endpoint ini bertujuan untuk membuat user dan rolenya berdasarkan yang di input.
### Method: POST
>```
>localhost:8080/api/v1/user/register
>```
### Body (**raw**)

```json
{
    "username": "user3",
    "fullname": "user3",
    "email": "user3@gmail.com",
    "password": "12345678"
}
```

### Query Params

|Param|value|
|---|---|
|role|ROLE_CREATOR|
|role|ROLE_ADMIN|


### Response: 201
```json
{
    "userId": "f8e6862c-321e-4490-b261-6a9cb7e6aff0",
    "username": "admin1",
    "fullname": "admin1",
    "email": "admin1@gmail.com",
    "roles": [
        {
            "roleId": 3,
            "role": "ROLE_ADMIN"
        }
    ],
    "createdAt": "2023-09-07T23:29:02.267638",
    "updatedAt": "2023-09-07T23:29:02.267662",
    "isDeleted": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Login User
Endpoint ini bertujuan untuk login menggunakan Email dan Password. Dan mendapatkan Token untuk login.
### Method: POST
>```
>localhost:8080/api/v1/user/login
>```
### Body (**raw**)

```json
{
    "email": "admin1@gmail.com",
    "password": "12345678"
}
```

### Response: 200
```json
{
    "email": "admin1@gmail.com",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDU0MiwiZXhwIjoxNjk0MTE0MTQyLCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.MeBqbEa7mmkzb4y22Kdgs3WNEO17WhYvF0ZcjhV-cM8"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Reset Password
Endpoint ini bertujuan untuk mereset password.
### Method: POST
>```
>localhost:8080/api/v1/user/reset
>```
### Body (**raw**)

```json
{
    "email": "user1@gmail.com",
    "newPassword": "123456789"
}
```

### Response: 200
```json
{
    "success": true,
    "message": "Password Updated Successfully",
    "status": 200
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Users
Endpoint ini bertujuan untuk mendapatkan semua list user.
### Method: GET
>```
>localhost:8080/api/v1/user
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMDc3OCwiZXhwIjoxNjk0MTE0Mzc4LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.SWGcCu0XnAP8eLcZnMeA3h0QpsTteKBTTPvGxr-pEbs|string|


### Response: 200
```json
[
    {
        "userId": "14b381d7-54b7-4f62-9454-3e346cf960c2",
        "username": "user1",
        "fullname": "user1",
        "email": "user1@gmail.com",
        "roles": [
            {
                "roleId": 2,
                "role": "ROLE_USER"
            }
        ],
        "createdAt": "2023-09-07T23:28:41.770434",
        "updatedAt": "2023-09-08T01:18:23.247929",
        "isDeleted": false
    },
    {
        "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
        "username": "creator1",
        "fullname": "creator1",
        "email": "creator1@gmail.com",
        "roles": [
            {
                "roleId": 1,
                "role": "ROLE_CREATOR"
            }
        ],
        "createdAt": "2023-09-07T23:28:21.420506",
        "updatedAt": "2023-09-07T23:28:21.420575",
        "isDeleted": false
    },
    {
        "userId": "f8e6862c-321e-4490-b261-6a9cb7e6aff0",
        "username": "admin1",
        "fullname": "admin1",
        "email": "admin1@gmail.com",
        "roles": [
            {
                "roleId": 3,
                "role": "ROLE_ADMIN"
            }
        ],
        "createdAt": "2023-09-07T23:29:02.267638",
        "updatedAt": "2023-09-07T23:29:02.267662",
        "isDeleted": false
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Articles 


## End-point: Create Article
Endpoint ini bertujuan untuk membuat artikel memasukkan kategori. Hanya role CREATOR dan ADMIN yang dapat membuat article.
### Method: POST
>```
>localhost:8080/api/v1/articles/create
>```
### Body (**raw**)

```json
{
    "title": "Anies dan Ganjar dan Prabowo",
    "content": "isi dari berita Anies dan Ganjar dan Prabowo",
    "category": "Politik",
    "author": "admin1"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMjE0NCwiZXhwIjoxNjk0MTE1NzQ0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.Q-rQbqguh_RQX1uMZvu0c3dDtQH1lItH-6ZmK38dIuU|string|


### Response: 201
```json
{
    "success": true,
    "message": "Successfully Created Article",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Article
Endpoint ini bertujuan untuk mendapatkan semua list article.
### Method: GET
>```
>localhost:8080/api/v1/articles
>```
### Response: 200
```json
[
    {
        "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
        "title": "Anies dan Ganjar",
        "content": "isi dari berita Anies dan Ganjar",
        "viewCounts": 0,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    },
    {
        "articleId": "ef501d6f-8b47-4bbb-b195-841f53de5216",
        "title": "berita Politik",
        "content": "isi dari berita politik",
        "viewCounts": 2,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Latest Article
Endpoint ini bertujuan untuk mendapatkan article yang terbaru.
### Method: GET
>```
>localhost:8080/api/v1/articles/latest
>```
### Response: 200
```json
[
    {
        "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
        "title": "Anies dan Ganjar",
        "content": "isi dari berita Anies dan Ganjar",
        "viewCounts": 0,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    },
    {
        "articleId": "ef501d6f-8b47-4bbb-b195-841f53de5216",
        "title": "berita Politik",
        "content": "isi dari berita politik",
        "viewCounts": 2,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Add Published
Endpoint ini bertujuan untuk mempublish artikel yang masih di draft. Endpoint ini hanya bisa dijalankan dengan role ADMIN.
### Method: PUT
>```
>localhost:8080/api/v1/admin/articles/publish?id=e2cc2c5c-d162-4b3e-a978-faec73ee2b1f
>```
### Query Params

|Param|value|
|---|---|
|id|e2cc2c5c-d162-4b3e-a978-faec73ee2b1f|


### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDExMTQzMywiZXhwIjoxNjk0MTE1MDMzLCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.gLegxamMMYaeWUovqJ0aqGEPPPF3p4_HqaTjbAISrH0|string|


### Response: 201
```json
{
    "success": true,
    "message": "Success Publish Article",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Article By Id
Endpoint ini bertujuan untuk mendapatkan Detail dari article. Endpoint ini juga mendambah jumlah views.
### Method: GET
>```
>localhost:8080/api/v1/articles/e2cc2c5c-d162-4b3e-a978-faec73ee2b1f
>```
### Response: 200
```json
{
    "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
    "title": "Anies dan Ganjar",
    "content": "isi dari berita Anies dan Ganjar",
    "viewCounts": 1,
    "isDeleted": false,
    "isPublished": true,
    "category": {
        "id": 1,
        "category": "Politik"
    },
    "author": {
        "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
        "username": "creator1",
        "fullname": "creator1",
        "email": "creator1@gmail.com",
        "roles": [
            {
                "roleId": 1,
                "role": "ROLE_CREATOR"
            }
        ],
        "createdAt": "2023-09-07T23:28:21.420506",
        "updatedAt": "2023-09-07T23:28:21.420575",
        "isDeleted": false
    }
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Categories 


## End-point: Create Categories
Endpoint ini bertujuan untuk menambahkan category untuk article/berita.
### Method: POST
>```
>localhost:8080/api/v1/categories/create
>```
### Body (**raw**)

```json
{
    "category": "Politik"
}
```

### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwNzY5OSwiZXhwIjoxNjk0MTExMjk5LCJlbWFpbCI6ImNyZWF0b3IxQGdtYWlsLmNvbSJ9.GbbtGGQrCf5bb_b8_SjvFuXfNGg3b7osDqYxSXNXugk|string|


### Response: 201
```json
{
    "id": 1,
    "category": "Politik"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Categories
Endpoint ini bertujuan untuk mendapatkan semua list Categories.
### Method: GET
>```
>localhost:8080/api/v1/categories
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwNzY5OSwiZXhwIjoxNjk0MTExMjk5LCJlbWFpbCI6ImNyZWF0b3IxQGdtYWlsLmNvbSJ9.GbbtGGQrCf5bb_b8_SjvFuXfNGg3b7osDqYxSXNXugk|string|


### Response: 200
```json
[
    {
        "id": 1,
        "category": "Politik"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Comments 


## End-point: Add Comment
Endpoint ini bertujuan untuk user dapat menambahkan komen di article.
### Method: POST
>```
>localhost:8080/api/v1/comments
>```
### Body (**raw**)

```json
{
    "comment": "ini komen pertama",
    "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
    "commentUser": "user1"
}
```

### Response: 201
```json
{
    "success": true,
    "message": "Success Add Comment",
    "status": 201
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get All Comments
Endpoint ini bertujuan untuk mendapatkan semua komen.
### Method: GET
>```
>localhost:8080/api/v1/comments
>```
### Response: 200
```json
[
    {
        "id": 1,
        "comment": "ini komen pertama",
        "article": {
            "articleId": "e2cc2c5c-d162-4b3e-a978-faec73ee2b1f",
            "title": "Anies dan Ganjar",
            "content": "isi dari berita Anies dan Ganjar",
            "viewCounts": 1,
            "isDeleted": false,
            "isPublished": true,
            "category": {
                "id": 1,
                "category": "Politik"
            },
            "author": {
                "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
                "username": "creator1",
                "fullname": "creator1",
                "email": "creator1@gmail.com",
                "roles": [
                    {
                        "roleId": 1,
                        "role": "ROLE_CREATOR"
                    }
                ],
                "createdAt": "2023-09-07T23:28:21.420506",
                "updatedAt": "2023-09-07T23:28:21.420575",
                "isDeleted": false
            }
        },
        "commentUser": {
            "userId": "14b381d7-54b7-4f62-9454-3e346cf960c2",
            "username": "user1",
            "fullname": "user1",
            "email": "user1@gmail.com",
            "roles": [
                {
                    "roleId": 2,
                    "role": "ROLE_USER"
                }
            ],
            "createdAt": "2023-09-07T23:28:41.770434",
            "updatedAt": "2023-09-08T01:18:23.247929",
            "isDeleted": false
        },
        "createdAt": "2023-09-08T01:33:00.733818",
        "updatedAt": "2023-09-08T01:33:00.733839",
        "isDeleted": false
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Upload FIle 


## End-point: Add File
Endpoint ini bertujuan untuk mengupload file/gambar untuk sebuah artikel.
### Method: POST
>```
>localhost:8080/api/v1/admin/files/article?articleId=ef501d6f-8b47-4bbb-b195-841f53de5216
>```
### Body formdata

|Param|value|Type|
|---|---|---|
|file|/Users/septyanwidianto/Pictures/Picture1.png|file|


### Query Params

|Param|value|
|---|---|
|articleId|ef501d6f-8b47-4bbb-b195-841f53de5216|


### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwOTU5NCwiZXhwIjoxNjk0MTEzMTk0LCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.8GFwP_pstsfKBH24zuReVsbsBkHJ48UUtCynSMvoxM4|string|


### Response: 201
```json
{
    "id": "a6bfb78e-ee70-42ba-b389-cb4faa418c32",
    "sharedUrl": "http://localhost:8080/files/book/a6bfb78e-ee70-42ba-b389-cb4faa418c32",
    "imageName": "Picture1.png",
    "article": {
        "articleId": "ef501d6f-8b47-4bbb-b195-841f53de5216",
        "title": "berita Politik",
        "content": "isi dari berita politik",
        "viewCounts": 2,
        "isDeleted": false,
        "isPublished": false,
        "category": {
            "id": 1,
            "category": "Politik"
        },
        "author": {
            "userId": "25819fde-b4e2-46e9-9008-42fdf4e4a376",
            "username": "creator1",
            "fullname": "creator1",
            "email": "creator1@gmail.com",
            "roles": [
                {
                    "roleId": 1,
                    "role": "ROLE_CREATOR"
                }
            ],
            "createdAt": "2023-09-07T23:28:21.420506",
            "updatedAt": "2023-09-07T23:28:21.420575",
            "isDeleted": false
        }
    },
    "isDeleted": false
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Load Image
Endpoint ini bertujuan untuk mendapatkan image by id.
### Method: GET
>```
>localhost:8080/api/v1/admin/files/image/a6bfb78e-ee70-42ba-b389-cb4faa418c32
>```
### Query Params

|Param|value|
|---|---|
|imageId|a6bfb78e-ee70-42ba-b389-cb4faa418c32|


### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJmYXp6YmNhIiwic3ViIjoiYXV0aCIsImlhdCI6MTY5NDEwOTk5MSwiZXhwIjoxNjk0MTEzNTkxLCJlbWFpbCI6ImFkbWluMUBnbWFpbC5jb20ifQ.83mA73b2em_KnI54lwbQwrcb28V7ii8gRnUP5HOZ2fA|string|


### Response: 200
```json
�PNG

   IHDR   �  y   ����   sRGB ���   	pHYs    g��R  @ IDATx��ŕ?�===yfs�J�Ze		�@���&��M���1��9`�������`�1 2A(�$X��J����8yzz���׳3;3��U
w��}~�4�ݯ^��U�^�z%���K`Ŋ����3�q�b��~�g/:�4����������%�q	|\���%PXk��B﷮GO��嚾S��?�0�	�DBh>vY ���K�����Ւɦ��ig���H�� �b�ϼgldDHɲZ9uj�4��a���K����vWUSM����ؘ
�mB  �5-%�������4�����ߺ�K�*�	�.�S�:��Y���C�a�A?!�u�捅B!)68h�=����H�Ȟ=�������������ЗĽ6�e �ٶ�?��#���I��E�z���+���__�q����`�˂Mt��	N�)8�H������� �ݠ���Q��i��$��_,j��k�����%��w�К)�H��|��q	��[)��{���4���.!:�ZRǉqu:V��\��J@�h�!f-����F�qu pB}����$�1��%�_	��56[�;H��Hݻ��\p�&���D1ͨ��KPGE��1<�����~��\�ƛ�(��G7|�A}SJ�j�!n��)�N�ûh BL�͖o"%	B<�q@�K$�H҇'�"Rk&�D?�E��qt���pEJ�x����&H���`����A?���)�7��A0r�C��o����̐F㋞��᛹���OS�u����H�ҩOנ�FBP�(y��Qdr��E4�+�.JѦ�5��h;�(aԕ*�P_��CC���f��B*��wB�l���EM
c�JCR�@]�D!�$���1z��$Čz�a����$b������p��3���4h��$����,��� V����ۄ�^}U� �>�_P�8jt��d2)��A���bi��o�"���c~��t:Q T@��v��Ȼ]n���G��<(@*fݠ��SI*�CvZJEx�`�Q�L��((��щd4pM(
ڎ0�Wp:�=���O���mt�)
��!=Dq"�D;O"��Npj��`yF��!�@�].YH����a�A;F3Q�B�w �F "� ��Q�@��3�
�È/��TnT�AA\(��Ң#��CC���L�tCH�)c�L&S�l�ْ(��(�D��ОH�Ĥ���i�MB�L	J<!�D�0�0Ȇ�~�����]��;$W�i�JN�WR.�s �6U�i.��QMjQ��_@��2#Ȩǁ�~��S&�z��*�K�
��W��(�N!��e%��)HN�`�t[Jp9\>��9-�$��H(G�,9Q�h�2�0e��7�/�(K���(�KPۨ/IH�ި���tTM8	c������T���z1��QT��DسkǮ+����:#L���Z=�C�!�ZVT���S�ط}�m%%�:�Y.��N�ext�*����$�D��ݣ���>76�P�^o���!�B1�ȱ�r�d�{G���/�|���۰����5*�
��I��虊��O��ɟ]�a�3�pb�#T��&9�J��C���%������<^�Ҟ����\.WUY49<R�`�����[ZZ*���ΉF���x�%K��'F���x��(\|�ţ�#CZyY��j�?J��P�A zx����շ��Օ��ljjʖ�8v�1uj�mｷ��9s��`$"�I��zH
�D��i�q9^���u�߯zU�O#�����}Ԟ�G����
�#ﶶv��@��*dxK!�ڲe��s����7}�?�{zR�JП|�I��Ȉ�'�M�����>as�䲲�73�bOU����p_S�?G�78��s�ǃX��w׽���tq]]�xf�a�F�W���b4ʨ&����G�_�Y��71�`-�H� #p pM��0��������yhP <�*��6n|��w�[���;[���R��<x�����������362r�s�=w1���db����A96�p������G�����L�ƅ�J��h���_���D"c���6?���5s�g�Ï>��!�N������gF�	�RԼ�=��S�~2����)�DA�=f���ڎ�M3�M
\ 8�S��eG�M?�e6�( j`_���굵��4Ŕ�r����@&����q{�h	Ƀ��ΈV���׿ʉ�����aF�s�W�e��=�~l�P|q1�BxUE��6��%�ԧC�pUy=7;x�P��r.��}d$�+�?7��H���|��ʊIA�W�V���z
�f߼a�Pf���E36�O�[o?�������?TJ�]�F̃&,\�0�EG�k��8�h�N��5S���*�㡍�	722�5�R�v#<��㓦ڪr��Sn��kߵ��E�I'V��Fm��WKS9�oH�rR������$�d9�J���,�4��P����	tuu�'��ڰ���͟??^T`�A�>�f�M�6�v��v�y�ِV/�S�N�~s��I�" ��C`,�I�%ϕ���8�*G[2H�I�9����&��i<��7�����Diξ}{�D,�5���]vǗpzK����@�Qp����<NՒ\muɒ%b]m�{�pe�$����\�2W��Õ��2�����9�s��E���[����S��g��'+��p^��(���G�:��v,dP�xsP̠�=�1�h�WT�j��y��a����#�=������ʊ��<4e��MQ��p�/��Q`��&/����"�y`�4�-^u�����y�M>�MO�$o��R\#���>�ČI�8(�����Q�f�'�$>	֛���?8mT�k��b�ɴK�tؙ�sؖ "k�G1���&.���ݻgē�O���i��,��T�y3f]k�WGc���c��H��]�d����ɚ��H�j3m�'�h�<��Fg:��4��l�&rB����eY�m�Buee�� ��Vc�1�6���q���|��c0�Ɖ;[����^�`�ݔ�!u ?�N�r�)� -��H����UQ�����|�H��+?k�ǏsV���\Ar�m��̒����x�3��z�]r�4����4L]Q��:!bvD_y�:��r@��AnI�I�ay�U�6:m<y���2Ң8ǹ���B����W���c�)-�����Q]}����n���n��Q�i3�������k�
՛�o�����U��"�K�I�f�����:K!m@NĢU�[u;���i1IEs/�����m��=����L���*z�
�l��
@�G6�j�et|K���!5c��><Q�ĦA�I��{L���"E�Yx^��b!���q���oh�`V6$z:��lG���N����S��Pl� ��?�u	���.��t5�hR�^Iņf�0�� t�@�5����j�;H���ed��\�0�x<�m}8�R��n��"�
����:P�U�G�Ԕ���xCEǈ�m��t��nCZ��T#b�Q��G@�F�#��jE��	=%�#��w�>n7<<xoYYŗ3�{�ҢBa��1J�!�@�%2z"�Wʹ})c���ةaЏ>H��$�%�G�I��T	ԾH�ŀ6#��QG�3�ؑ.�C���G���R�o��L���LC���'�A��֧2H����4�M�k	�ӥ�C۝�s�<ب�BqQ5��9�{z��v�[MD�=JjBz{6N�пKbDI�F��Ru�V�D���,x\�шp0����?J�Z*�.�d奪.�$���X(q�ׯk�T�&�P;\�P]ͫ'z{G ��70`�f�
�q�Q�����r[{��ʬY��.<��/�h�������{�6�wi4�-�<�`�k���>s�%]BU6�*�A�F鼽���щ�[:ֶ/�wWO��=KDx�Y�A/-/�ϙ��
�-U?�;��%;wf��յ��ݭ@���N�-
���b<���c�69��प�s�Y�-[v�^Z~��ec��d�Y8��	.%�\9e	��5s�ʦ�5l����hl4W�}��mwDՄ�fwy���Q�e�_������� �w��l�6��ڵ��MsBL��=[�޵k����뮿��^{��l�M^"��^��x�<�o���\p�Q�Ӛ���0�@G�@]4�xeA�_���~�-�1�}��
x�fy�5�ۋ�`0BUUU�i�v�L���5Yޛ��y"nʸ�I�<�?��O_��w���d:Q��<����	�-���t{z��U��s��	���������ܘ8�(���,�v����`J�0���L�/p��w+���w��Z���,<����~��{Yx�pt�h�tCCC`_~d�4��� �*vҠ5i����d"y�҅�P��w���4u7��S�H�\h�Gx�Vox�.��5ܝ;wNI�R?��M=�S�Ի�:�c.m-�e��Ñmoy#F1��w��-���We�z��>3�q&S�m4�ϟ;��!O���Z��CZSY�֮V0|R�Å��|���"�ؕO���F�OZw��'h�a��qO��q7������X�lR4��0��i����կs��l޵��x�-N;��Ϡ�M��'���<�T0NR�Ñ������o؈cn���a���̽���q_}}]��Ƕm̘9����3p��b�s΄�$�Q��n����'W�0�f�%�:�|�4�\2饥+��`̓&�VW�V�vd�/\D���S�8��fӴi��<o��8�� h�%��တ�KN�h�i���g�����+�Y��_�CS� �xN������O�*O��T�W3����374�^o�'�t�&��)���f��Z>���G5��@�U0����֛��Ň;y25����\Z(k1�͇�)C������˨�s���Es��~|7��tF���j=��@u���y�����˰�8��9�vvvm����~�#q��p�v?D�L�"84�����2��m��C�efG;��3���)=b��#���G����.��}rN�ǖ��Ϣz�H�Y��0��ܺ)�zOWs�"M��$Ve9�$D�D�~p�3,�ϼ����{�Mze^g����D�v���:�d�fI�ǽ����|��A�z��~�C�cJ8��vC��,�Y3�����,����Q+�+ﵠ�m�������K^B�||�;_� :b�!EC3�K�=ǵ;�="Z+1_��1��Q_g���S�����V#���8]I���O��P2ԯ>���0��-xɶ ��馛ZI~���Ǝ9�&+eС=G��K�ՐɈXD����D0��.S<ﴡ�ᰙȁ��`&��p�#$��)��� ����[vǘ��U�����	)W!͙=sjg_���1'S�ґ`��f!�iD�/a�H!��{���0�v��B��j6f�#AO=�T
,��:�8U�;F�`��f�J_�s�?F����d�[�n���yeّ_�FL���N(���8Wܘ��e�I	�q���Z�/ǅp�nM�7�eɥB�����H,�c�mŊ�����}\4y'�/��"�q��LxX;�]�(g�>4N"
V�sd�^��{@�GF:~4��42~���/����!����w���+�]?�$�^��.`����E�ѬF��S�=�ʷ^��ќE����2_I%��]ݧ���#˾�ً�s欹sa8��`�R�ש��j)Z*������R�#���s��^����ڞJȲ�����K�pϰÂ��
`=����yE��Jd���KU��P���W4w,��C�J�GF޶��DH���=0U�m��<�ij<�(xTEy�C+�&��h�f����I���4{����?�7�8`�ɦ�,���*)�T_���F#��xl��}�}䁻c�؞=��[?��Q�_^}�q֙z�g��;j&�w��J-7�s+�0������o0�(M=���F�� ����OϨ.��UR	G2w�4R[7n���O�xe<�HgXUT�������cbш�nw�$��H�KMy�5u{E��+5���}�vj� �o�2F�꺩cPʱ�+��m���0;%�������X^��X�v�x���,��+Au(X�%�D:�E�T�z_XɈV�6�����Ԕ,�׌��<�����l�ќC"Z5�$Wn�
>7��ڋѓ���	����5YI�]���_�[((Rs�p��cl�R��%�����th�:M#}/S0=�lv4(0o��Xx�q�R��`��j�tY���M����J"�]�"��V�W|��s��	�7�Y�k�`X�V<��*�������7xqÖ͏1��[P-:.eO�G��PdtjmuE�&��E�A���_v�Σ��0:�^�ӳdp$��CL�S�-v��BU���\
�ס����XR�ZB����ٵ���d<�$4���L�9�j<�'�x�dw G���Y��)����r;��*.��kN育J�� ��E&c���Π�L����	�5�(wT�䠐5�gٳ�������y��!�Na%oJLo�I�j��4wH�KaF����h����������o�epr�I�N����)�\1�k3x8�_4)J	�a�%���&^�O.����U8�c��&���|�s�qWo����xpP������+��?��т������,/G~�]GG����iӭ���ZH�J�%*Z����,�๯}�w�d�k����k����e����a���v̼PO=.&�A�2�� /<�� ��7~����w�.;�x
�q��'K�	���1�A�5��;:�֏�����Ţ�ғ�Fh��j�:+����]�:N8��)z��L�-ʄ-|�s]��Q!���v`v�i!��{�=Ԁ��X�z��C��M�x
a�v�&�)fc��H�9}5��-����03����2ƙa�����`�<��±P�H0�iƙ�+`�?�H��{�n���3�����|����2����͞)0�/�����ra��,P������$3���{�r;f������fjT���H�o��SI����c�؉�iD�����̝���_���T��n�A� �&�,�Q��{>[c�G�W�x�
<�x�SN�'N&����U� 闉�P�Q��_���\?����b��ĕ7{�&�C��t��_.k�P��z�(�r{�u�QrnX�w0f���Ar�՘��wϛ3����9�|�?�Z��.&b��bgo�y䕗���>1�`�"�ַ�/��������M��ڹ+nN)a���%Y��=�Οv�H��}�ݘ=�b��c�������ʪ���'}뺯wo�w&� �p���i3�E��gl�&+��V?�_� �MX2�Z"��Hn~�7n�
�G�=��w�m���M�Ǣ�j�����z��X�Ͽ�Z���X��b�-�g6�� �5��\�f�y�wn��i̙
R����=t�9�	hCC��K�n~����s�o��M<l�p���ә��>���1=rup�.;2����Ly��ɴi�N���z��ov����U,<�w���=�ܳ��{�I'U~����$���&�N`�-�?�T����\,�����oJ&�1Lm���gE^ V�E1f͎��ɗ�pCVrX����'M��@�B����5�Eڸ� ��J_LQ�;�{�z%��U��0s�l�ʕ/1�ScSJںu�z�̓xx��FW��k�"r��t��*��tRE5-[b��X�3�m�ͭ�׍����-�A�OX�f�Iت��1V��?�m@<�9� �)�51�f�������f�
���M��@�9��,������5�@'�8!�UP�<,���`S��<	���ko���b��M}n0O�m4۰䈣,�I��}��&���-7�Y�B��R'�9`��c�R13�t0�w_G7G:��z�1y��Ϥ2dW�x���\|&j��-�E�Wr\i`��a�����Aݸ�������<�	�-�8�������0�cM��/�t���(�T��θ5ܒ6ڔ���.K�qO\���<���ֆָ؀'m��G�?����n�fq��
$���h�Оb����$��;���B��T�K��~��%9*��V�2��d������v���t�J������ϸF��d(�ESc�UP��`�ǡ'��&���c��O�}��q�L�o	�1�u�+��Ѡ�<��O)��x�m__P�5�]J��e���E�DRJ
�ήS��B���g�>�p*��*��E�M�R;�2� bO4,�B��I�L�ٝ����2��"���Cw�Fj��֝Z���ٰC�c�P_���s��	�4jT5��<��$�ذq��H"O�<<!��	㘯�C/���e��"G�@D�Pi��p��lt� �PwG�����)\�q^}4nt�|�܈��t�0�����e�$Q{w��8�i�H�3Z�"���T�Tf$�.���0�c��P�x���8 9I[�6�4X�WE�.C_!�l`Ȗ��>�Ĥ ����(�Dy��f>���G�ǻxuR+"CU��C�53C�!4U����v�:��4�P�I8�+"����F�7���%�vh��(b8��I��q�����z�udh� ո�d�d��A���A=
{�dl����]���~QBJ���b.ź"���%Q'UU�l�uT	*O��N��|N�o�j�ʇ"�ۡ%"���p�����A։H��4��C�P��A���F�঺�n�ߥ$�:�FQ��+DX�`������5u�&�2�`22MS�2��2�c��۴�e�1G���m�T�<�t�{��	t��2!�8a��k�77� Ӊ0�=���'��Q�������������H�D�
�<����k?���Y遈AA�,�?��ų����k�Չ����]6*;�BT��`��t�^����y$a{��h�/�J���p�=#�\�y�{֙�]�pΜ�a+��cj����m�C~�V�:{��Ś�Sj)mR����cJ�%���&�Ċ�Ï>zWG��ҥK�Y�n�ֲvjC�iV8�w��w_w뭷~i�Ľ��?������8M4�wA�x���,p�X��|�Q��������8�]��?p!~Y���K�y�����}O��_��1j0U�U]���?��EkD�K��x��l��K�����!���_}M%�c,�7�Yu%F��,<����+��|�E����i{rǎ-�Y�;w�be�������obG-�/��O%�����ѡ��^q�	t�C����oɤ�%������E�l#�Kq��}���,(����\,k\�k�[K�{�Ν�f�
=s�9�#Bm�k��f�N�23�)� L�ּ����"޹`���v��;�ȅ���� t��S�)�8l��w֏���}u�4�?s �ȫ*�����MH�������tseZ����D-@��ß5��sᡈ6o``��W�˥C���BE�����M��k�6b��/ȣ�8��O1Y�\�����ڒ�f�ά���	O����Qn����n,�|5/�{���ݢ�3<¡`�msk,��q݌'�_tDtg�G,r#:v���d���ۘ�aD�
w�k��ɡ�NhAؼ��� �Ձ
iӕ���l���x0Uz	hJ"�DBj��y����_�B��r���O	���ev4$E��O�\6��L��"K(j�?��{�W�[�g<�����e3SªD���?�ґ�p�O�Q#&p3s0@�]8Gd����Y�<^��D>j�I��-�9���~HYv|g��\�.W���ơD�)�_o�����RN�n�AJ�$2^"8����9�o۶��l�
�컺�Z�a��223
�0H���t��*����,Z	^�<�߾���1�	n�K�y��HS�}��g��f�mJ��|=�4���	1=���$=�i/�4�Au (SNt]б�%i�߳2М'E��!�� c�y������׾�"�%9䋼��W�K�)���n���smJ@,��y0�(:v�t0��֑i �6,���c`f���T�qJvA�X<������;�qS��x��l��ĭt$�Ey�kܱ-�e0�Ձ�^�v��@r�.+�]�P�2����m�g/��6/�����;�O�n���0��X�#��[*�L��n�%�\��
�0�&���$ �!Q�K�@�eJ����,+�A�֕M?��s�':1p"����;~��Ku�8�ΑRj
ج�ä=q�j2ٳ�:kV������{{�I��d��]���y���:�E/�c�mr
�!���\���#ʘ��,�;uO2��Є�!�����c��8;v8�fd!�r�Jڗ�tn�T=�j{���Z���}H[��s:i��3z��e��=�9�4S+౩�i���6aJ]�� �h K���kok[;Ѣ�L�bO잳���@(�Gð�GZ��Ʌ�=aӟ��[�ͰC�l|Pa`�{���Ҿ���LD @�!���c�����3�;\����I����%xKdArKm{�^� ���.���aN�K6J\0Sfd���.v#b�b��t�V?@_�t.����c%�jWr��v��v��#��G���pꉔO��I0�U
�&��Dꌔӭ�VU��{���%���j�5��_�P��������Ѵ�ݺ�ohb@A7�{ʈ�C��;���80��ݿ��U��i�cH�^�h1%�t����e��]��>0+�0j������P4�]���,�a�F��c�y	�o"s�1f��.���i�iyػYFZ0�o:�Ap�22M�%9�{�GW͘��EQ��\Aa�V�蔜����Wj����dD��~�;��>"�����x2y�B)h�P���j��:ݕ�0MS��+��@2�l	�������w�\7�y�_�$ 5OYA�i�CQ�w�e��!n@��4����M�4�ubg\бُ������tX�I�E���>�Ê�;H�7ݡ�����JR�x\���9n�IE�˸4NI�'hJ*��c]�@��Zpdln��|�W4h�!F�7�R�����`4	��⭵��WCI��T(!���`<:�ɰ %��%=��W{~��@t�Í�Z�����!j/��[�y����¥�x]NI��)�,=?�0:�K�T_�,
e(-�+���~����r��rJcg,[��,����y�~/��m���O�?s��6�
|=W�$A�����[.ՠ�'�ZN���K�v�?,�m���S��ǝ�[Q�9������A�vň�=�GᲫ��[�u��ʴ��H[_5`�Z�2=#�	���]ZZ#��]���q\M+��jD+����ȭ���$q�;v���� i8��3�Bcc�zu+p���|���	O#� ���r�cJ��퐙�qy�9��b���'9��GX���<s dV��� ��i��N�	j�����`]M͍��A�L��{�x��xSL#�"�?��-��r�5
-�[s��}.'��+�~q�k������닸���9�I������3ߟ9u���\W��C��4_��'ͤ�� f�C�#�'�20=
N��(:.�I|J?Sn^���3MƁ����������q��Fh7�Pa�Z�^U�1�Sl�btX�JR�Ϙ��;]h�b���^�P�~�E����^d��A=���y���'��K��`]-��(+y�,ň�����M�3gs�g�n��5�ܦƉ(!�<��Cx�d"��7���D���T�۟��V]V�iͮX{�H�y&>���)����^$�d�8/7�� !�<a�d0 �^i=�ND�y��@�x��{'I7�%c
0***�p�=N�R=�
8�<�F(D�By����{r�/�|�v�ۙe�`�k�m��\:�Q')y��X�8�4	�:eŗ��I�|{r�c�9�RD�y>��f����m����糟��^/�����f0��i��Aw����+�$���W�'_ON_Q���;-��c��e~��A��ҰP�[��'Uؤy�q*�k�lL|�.o����x�/���G�d�3��r{c>�z?�4�Ƌ�$����"t�w��Z��)n�A��V��j���|"��x��	)sP�A�Z�S�E�a�4R�o�H�+Fc���7����+l�3ͷ��%�BXo�3��K�I��+~���蝐nz�w���:�<g��-�[�lWO�p/
��������Č̔��'i�[��6��+�[:�H��_w��`.�?�|m��8~㙺PQ>�,A'�9ۣi2k[����)�LO�vuu���U���:�8~��gO������≢��\�����B�	A8Z
�({ؗ|����*��ӡ��%;qw��x��R� "/^����<����ҁ2�i�5���x��ē�h�LFGzۏ>v޿��xN��B� �*5�W\�!��C{�t���5�0+�>&1 ��+<x<�{��\	޿߅�&3�q�Q��֩��Y�~��5V�����0qSJ���$�$L0���.��2���f�<��G��D!c��y��2�]
c�.�O>)	�_^��O~�D�1�� �^���]˖�1x�����q2p�j2�<v�]u�~�6��ʪ>�1/��o�aW����_n�I�4��d牮�g���a7����t"Rjx��]W�����6�NYq��FGK6�W��^����$�F�3�`Iu�C��hS""갴��؇��"6�h���=�]P�x��	t0�Hc2"5נ�#B�°*
î53��^����X��x��Gf�144݁V<  h�8��}�/�����Ҵd���=�ȑ�l��Hs:s��فݯD�Y\A���/����]�8-C�B�##>�#C���]����� �aԅhQb��EC |���M��8��q,�|�b8h������WH$«�^��n�#�a�p�&;=1��b&�!�v�i?{fs�?Q9��ɐ2j�j��p���#��w���W�Ol��K�U�C+"��	="M���ո��q�E �G�y���Hu��Vzz�^�� ��"�� 3��a��áKq�﯂ݦ��m8�k	h�(�QX�����G��F#u�u�UU��?f�A�ȟ��v��f�.�������w���S��yi��x����E�����^����o<��r9�l�"/;[[��3k�cE������y�M0�bh���|>�zP>OH����:4W�_����3/=��°��F���S�W\Qt�(�C��N�q[?l�W�ɾk^yt{G�!�`�<i�y�,���>��Yq�m�`�1O�h�u/�i�^3�Lו%P!:7�]��K��{?�,�(W.�W��i��g�N�qK���d�[�n�֑.2����+&;���KLMl�.��o~E~��	��q0Of#�"
�̧s���:@��v�j�����) Hkd��P�]��s8�PV�}��d1��_8�P|��z2�\:0M�<�S��+��,�,�.����9KQ�].w�0�D̼o��N��D?Y�c9B�e��sn���!u oI�_r#)+)��F�R��>�o�N���l�O�p����V	�97O��X�p9�<=����r>��9�G���o{���%k�ITUU%,��[}\I�7�ԑ	W�ə]���9�c���btr�R���<s�ٯ�ԁ
��2rwｅp�o�0�@g�)h���5����a����`h'��Ï�3�aA�X�����FDFG&x;e�ѧ-����.r���b	��J?��>�������.���w���:z>[c�gZe���ax;��Τ4N��3�bm�n���Y�Lr�,��ё'�la�[�����)籓F,<O��^��)�Go
�$Ue?9Ͱ+�*j+��G�٫�t�J���N?�wy�X�s@���4g�)�R�r��c��[�A��F�u+6�����3ǌMv��Ѻt�1KX�`^��q�:P��/b�O'�g��Ը��m<��<h���Y�Ua� �?^�"/�1V���yӘ(�	S��x�L(-�`�>x�3�Y�;���.F#�^�~�}w�G��v&L�'6y�ye�O?�tKY�??�Y߂	���v,�'{��-a�O/��
�����X��xs��H��r_�R����~=��1l��W;NR{8����ά��Ҳ�(�e�&)g�8��c�/[��-�d�?����P����=!!4:�d�8?��D㐩�E#a�y����t�b�>V� <Ha/�o΅�E����(��[�\}�u�:��P���<�~0E�V����jw�2�C�C���`� Y�p4�,�3θ`�ֿ�@��4y����c&Y��AUE�j��<�Jc��C�y@��w�@'�D�� T�󆳮���˯|�W�� pƂ*wŬ)���������Z�sf
Ur�=au/����KK��x\Q��T����d,ٽ�K��_x�'�CB/��O�n�[}z��3����s���)Ѿ�ӓТ�5���A3�.��R�n��)E��.w��,�j��8�.aG �#�`��iz�n	<�A�5-��L����q7	r�քH���(��Љ,��v��W	��H.��$$7�q��h�J4&J�U)�.��6��?h�����J��6	kT/F\��6�{{��c�Rv=�Kɔ��J�lO5�n�Q�=��Dx�SU��.X� �ݞ�A�ETl6Gr4��,�نQ�()��A Ő�2E òAF�Z�-��"2�S���Є�q*����m�ȸ�
���(p,2"��4�ǶO��nS�����#<"E����z�R/�FP�*R��x�>6Hu�#ۉGG���L�V�Wr����z\����4�cF�F@�'��������u�eJ�EY��%L%TUlpO��ڱ#g�X
tx��JJt�\:6�E���h��(�C;jLB�� 1]��38$E��g4AI��w�j�9�{�ޏ��1�7�ݲ{��ʚ��h�辖��g>{ŏ���*�K��շf���'.=v
��ʽ�r�eg-_�w+�k�ֲr���Yx?���K/:W�1�9��J4H��q����%c[VW�]������W�������h�=��c�����ZZ��e˶#V�Z;��������-����g��~icݓO���я�/�9��sȲӽC#L��--[N�j`�@0f���ה��+�[n��d������`�?4V�����k,��ϿуJ������c��n"�����05���m����\�4�U���^}p`��s��-�sH,M��pJc,�|��E���W�],R�Gt��f߲��«*-a��\0���rw��c8����tc�*A���y*�fب&����ٱq�Y�ɰ�T8�+�Y�I��KO_LJ��ኼCe4Ʌ�#̡8P,E�� {]�q������V��	��9;��1M��xr�	i���8(Ϳ�7?d�����&�3}��0��L�)���,���|��	?��O�n�3{�0/x��)�i�4:g�8��MG�߷�r��&��Z=�ԡ�0ڲ\�������v�sGpҕ��9#����d��Y#fA�0c��iK���H�
��Qȍ�G�Kvy����x2��*�a�ĝ��Y��02��e_=pt#f,�Y���f��r�������9�f��sxѼcKa=��N��,4�s�f/>����7�E���9m)P�/���A�����%��8��f:�!�p��iz�u���	!x�,njM��uo���@K{�ǍqK�A&�x4ґy/����c{`���`h̃ &%B��j�Xx��܁D=��NTXEe���K�B�L�.�Nv�8+T������C��!�K&�������r*�;\��q8qy0S@c��ѽo��o���W��;�X���������N4`�X�k���ބ�x_C��'�N~;䆒�&��K6��~kֽ�ܸqge.��=U(�=2<�ǧ	�;��z��kkfN��k�\��=}L��s����iT�Rcf�����`�ͪ.1�{���������\����-s曷����UY��vԡ�!w��.�����0t����ޒ���3r��Z2��u�1�����}t�����H<�]i��^ss�WK^  @ IDATl���`�E���Qװ �M|�1��E��nM��r*/��ǒ#���O��@1�̞��ع����D� @��S�L��?�;�ׇ�ۡ���Q�LR���+�����R��v	5���P����h�u�
��c	��o���ŗ�t��%��V�t�����f�\��w�[��Y{L�q�؛eN���RY�;�E���@��찭A������t��8��UR�8��l���f�d��Z�ŎN����v��(�t�݃�H��)�}>�!r���]Sq�y�\�����ڿ��0:�J��7զ�멛7�H%I��$�@��,���@������0��Z���zrJ&�i���2܀���kqE�J�koZ�	(g�2���yжT&� nF�*��q�v�Ul�n=���6m����mvW�е��@�F�_#���HhI�7�x��6=�F=2���A��@l��I�Jp��b'�q���4mh}]�lע`S8�
P3�PI��|\͊ufJ��m#O�6�6���p���bF�(�4)�j�@3Y� �o����~��i� $C�$i��0J�`T������V��*]�@�ɉ4�R��੫v�j�UAOp��-DF80� ��%>��&đ�\���1������;�jb@���SJ��i����g55�4�WB!�_�3��u�^RR|��w}��Kgᨶ���,�Jb�K��޻~���(���q8���u>�vWX�R��n�O�ٜ��FT�\����o۽��7\s��C�D�m[��,�������x�A}�[�����7��_�n�9�|��~�G�R�ԑ�	��5k6�Ɠ�Uk6~�
�߸���'��f���{��͙w�����{���ra��b�$M�����|�ڵ��%N�����&�'�����$` ���"CAP��ᷰ ��O��I@ ��e�����7]��g�mN|�C���=�ק�H;�&�$�F��y�
����g4
'/;������
y�'k�O~�&-�1�w_��t{o2�`|�8� ���pϝ�H8w��(`���b8�(e֭�W��e�UVUR�,oQ�v9���{ǻ���:�i��hʨ�Zx�{qa�F��իۘ��&�/�&����iS��q0��N~�����w����X��TZ����?��wϙ?w9���7߬��WT[����cN��܇ۈc�����7���:�����1�I���&�"c "V�7�S��f��觞zj��\����6�����Mw�p��\�p^����ҁ���Ȅ����^dn ��9M�X�N�7{�+*|L!�e���ά7�ϜM�-�H�g651;e�#5,��dzfTM̪��O7�d�-�z=̙��͘~ͪ��{��Y��&ff�A��������׉}=��)׻kxם��(f��+
��؅�-�e�F0I�*�,�y0}�q|vc�[0}������9��	ܛ	�+9:������D�cf�!}�W�e��9���%â��X:��~�,N��
��*f��Pٚ �xss���XR��<D � ��NX8�=�+��ty���(krX�3�{oWTȘ,�֯��5��AB�:f�a�!;0:F�|f>�Ӻ5qF#�rNg���F�*=,�����\�xvaW�ș�bC�[�@���Mc-s������SNY�V����x��6KKY�V�h�(N2���v-���y�+��v�T�&�������v�4rj^���t��m���2$������{�������իW'w���� �wl�a�6'����=��*V�l�ƞ={��*�X����lJ��H).�^�z��^!�����5�N0X�v���©3�Z;�ݾ�kM2����T�Q�d�	vS�U ��{Mߺq�?�9"��b�@d�b�8G9*SS`
 �#d�{z��wf�(g�@�w[��!��L�8�.�%'Μf1_�[�_q�{��D�?��؆c�����?bS�:;�W::���q���D������F)eX+��^у��{{�hd�N�Z������{f��F�����N�?S
�:q1�}�Y S���!��vȂ�UA�7�͉�:3��h�3�=�j\���L]�<eX���ӡtHࡎ���6�I�='�,m��A&?X�:�t�Hb�=f���P�_�LBA�0��!M���%�mw��h�4��q�Q]��2�)����l�'�Q����܉�	�x<� �l9N�ct�j��,�H�4tlQ�RS*�<a�Jqi�@�qJ
e�����SJ��y'�c>L�>�D��[�1��F�T�OX�c�O��IIk�1F � A$�h�X��2��	�H瑉���*AzQ���=ɱ�g���6O��<�j5����D,pa�ݡ��KC�R�%v�����sgބ�#�̤�2��t��Kp�R���ž&؜�+_�2�Dy�lkh�6]��~�Ν��1�~��&Dq��j����H_�A9$G��씏����r5|�w��a��a��V�O�#ӊ,��M,���?^|� '���ʕ��+�1�|���f�1|��w���q-s����}0ˊ��w���!�?������w�f�8y���P��p�?{�������ۻ�wp�4�o���?�������th�������[h������#8�Y�^f�}�,��w��}_g�3� }#Σ,�Pp��Qѿ���tR4�T^����Uc�f�'��$z0��$=�h�i��C-��y/�γ��r�,�)����������Xo��F��89f������z;v~�̯sB�BX�7������x�;��&�Cv�@'n?k���Z?�&4L�93+��X#��1�3��+w����٫�k�n��X��~L��ʎ��_ʔ�q��EJa��P3)���I03 XF3p���?�D���Kfw���	���Q[Y�̄W�^�.�΢��}p^Ͼ.�C�l1�_,�<�����Z�EH�&����k#����|��o}o�7.���P��b`]���h���"N�����:�}+��"&�W��YI�8�]V��s\7�k�!�ڰN�K�䜙Zc��Ο=��%%uL־D�|����ʘIy��t #���}ݞr�)\�ɿ��<���S+W�z݆tǜ��_~���;Zr�F?7��Ҷc��/�YS� �]d;���E��r	%Μ���B��i ���yo�]<\��r.յ :��~����h��F�S.�����p<���1�x�D�y�ڦ�\��z���~�GzĖrȹ��I�U����;�(N����;�S/�� ��#��ՙ��)��Ύ���+�e
]_&�I�x�������˗��p��q����]�[�~��I��	'��'�-��RjA �]ː��lyv#���/��#ޜ�c�2:�;���כx�|$�&�͍�L���%3 ��a-�����a��lL�q�!%��#��!;	��,�Ζ�	h
N۴6���jė�z����Sf(p�X����ց��J���R��̓�%�-	�.�uz��20E��9mZ���w�'��  [3v��Ƒ��Wx�"HSD�9�M_y���>hJ ��<�Q��.9�L_y��4lL�U�x�p��?n�>��Yp��k�ȏ�􋫡��, &SɰCJwkj	~�,�{ϯ�?��ͩ�����
г�s/��֜e�ٹi�S��-�4}alh�!3��)��O�f��m��a�&J(�ys5���7�Xpx��9fPf�@�G�G���k�x�s�嵍6����iM��}��a��D�}�5h��>(��:�VHi&)�F�ˆ"?x�*��������I�s���#��������dJ�ap������Mqv&MN��?y�c�ُ�{��v�
��C�a<K*�ș(����{���|�[o���F	p��$�E��3n�]�H߈V��-|m�˗�}Pir�<����+F<��9�*�'J{��}��������d����n7�ͮڼ�V��i���7}�����,à��r6�U�"{<��"��B)�W�uaeu���u��Hlp蒯�����u�6E"��
}�=3֯^�ńw���#a�*d����D�`Վ)���h�s����2W�]��6_\O&ʒ)����ay��FO���ո��gF�./��2�yI��0�(�E������Mk����~� ���BK��p��!�Q�:6�C���M�p������%��|h}��B�D�p���D2�tj����Zh���`"5Z�!h76�H�qu�hA\W�:%�@c!� [*:F�N'Ƣ�8�B���yF��p�h�|P��݃#c�=!����F��̿Z�m��'3�h[�����]�h��V8��Ҫ�����pwU��1n���<�]Y���6G:I�QmoG�p�%
oo����^Z����i�C�X�=vс]�T��vd��}*ZW8��DCa3C�$uI�8.�у������Z;g;�/�a�SMi�d��>��-��zǎ��;�>�.�uܘ��Bۏ��xe���w�W��%���c���*8%m���%J�p�U�'.]C�ōڠ%G:+���]|14:�UWW�F�+C�םвQ�D*
04h���ܦ��xL�4z�'�@b�(�� EAvU���=�����Ϊ�_��v1�TI�>��E
�	�ڴI�y~I��_z����W�)�+Vdf@��c,n�������,yd�5��?��n���y�L�d�~ln��wIyGX�/�~�߿���G��6��~�v<Z�m�z|�(���5{�W1��qo9��.�}ǈb=�Z׌���q-;��K/��>o����!e�C~�MBn8�;s��ޓ)�W�3]�f�A[#.�Ao�aV_w��,�'L��d2�Y��dE�[�������^|�ߙ������������u׌��5�p��p'��#�CL�%£F�;��a8(�%��p�9�pP*�QZ����P�O�	����f�0=�߮&���S�\�����0*3�3/�t�Vp[!�:G��`��\�Dz+����q$�PSV~َM�,���3����ɏa��Ν����B����h�X��VL����CJ������=���@�s"y�yg}͟�܁Uhqǳ�ӭe9ĳk,�UQR{�y���g˒G��S�s�MXv��2��ī�Ϥ>�������J)�j��={���/��p��������_7Y�g}SCIBO�����o����V�VaV,���߁r6>***2�}vm�ܷ�g�!]+��Gh!��g�Xv �pHϲ����V֣��t˼yGZ���9fXZ�e	y�Q_���;0T�� �0 �F��}μD$�n#|{��!��QQ�)_��v��(&S����K�{����nm��nb�>;ȷ�I�0XN�p�ɮ�,�}���۷u�]H��r�#�QG��ަ$�
��~���SN9Œ��g.1E���@bsv9���͘SlQ�\�rek^2>���d�����/~����;V�����I@ O1�{�Z�Q�4�nN����#f�^cs?�$���Փ]�V�M�r'
*=7���	Z���+�'b~$(�����xe��Sj��ڀe�q?0k���*O���-�tbY���?�����?���&�����b�pS�(��^e$]w0poc��v8P���sc���t5��pIy���8��g��7'��HJTI
���tV������c���eK��݅��E���l���<+M<��[
���9�74d�iAq��@c.~�R:�a�ڠ	μ#ٔ��.<��_�w������G�z�' ol*�!�d2»RէN�o��C+=<�9�H4�s�^��?Ù ��@A�X���������|�˂`u��9�͝;���-�}�Vᏹi�}W�W-�:H�x�Wny��N̥o��1��9RI&��0qC�����}�s���[�����=s����u���'J>q��%���o��zR]��Ks���� ��K��iш�\l�%���E�}0��]��D�������;N�F���jx��-��~t����Z����  t�i���B�h��O$�����t�VgD���$.
����
���,�ӏ�}#�?�S�s�R��\��#6v�%Q�E6Q���Cc�h��]�qv�����21��]�:8�a�9
g&Y�����Bx`X�?o�nl�a�\�q����6ptW�z*H�|p=4���s�A@�ҌF
�d7||b5=>��}(r�g�%�Ѐ�4��l�����4�U� 9�$��v�x�9�����.�vXH)���@4���\Q��4ࡅ -�F�ɧ���PK0�9iO ���SB�>�Ю�|"�' ��a��4@�3��֓�
��P�!�FZ�/1�M)�M�08~v
�b$�!}� �*��j Y�'cZ,�2B܀|���������dldo4�v���؈kk���g?{�-��3<<l�t4�@����8�o�u�i���:4yAy�����!��gh4�8݆f�Ϧ��>A�Lv���Ѕ����s���|�K�M}�����Mn��vw��X�އ'%�s0HI��P8�Ƶ;�g~����~����CC��_���ߣ��v��Y��)������l>C�G�>sS6�Y�3�p��3ׯ����b�x��b~��;w27�TE}"7��{WwSl�5�C9�e˵)�+j�ɣ�N ���c��U�/O%�F7����rE|���L�bϸ����� �����1s�w9]��]!Pby���C${+�ٗJK�,b(��)���Yk����6��F+�+-�-�ċ��5{6S_�f���ʙt����3�Ş0�e�7
�n��9`Ș�A��GI$��?�W�p�f㳙�KɎ���;L͓�;��[xI�;(�l�,�hؙ�Q��;�*�Fy}�,B$<�\�D��7�Y�R<.��V�w²��9��\����Ƴ�&�Κ
|����%f�I<%����#V��-���)����g�V��e�e�fw(��򑭤̟�=1��~:��@�9KȜ,eNOFB�����}��Of�E���c���/�UcN!�׷���g�f�4�z����`$ű-��A6�p��Ֆ�`&8GK͠Z>i�c� �����#x�g�̞5�\_���p����dG��`���7��OG��iu����'�.�jd8�*�u�i�$�}5L�>�)O@���@��)�<u���#��q3��k������7����'���6}��^s��N�90�����a0EU� �M���C�������$�۱ql6;����5�6��N9��=�}�ƫn��r�2���#���H�����; �(��{r���AYBB"'K2�`�98��m0F6>�pN�>��al���`ҁM0D�@PXiw�ڬ�;;9�LO�߫���YMW������tW�zU]��K%*,!̬R���̧���u^֢��z�)���j�(�ѵ��W/�Kc~R�̭�P�y�-Iq���"��-�g4&y��P{�خ�}��Q���ɲB`�`���n�������u���̺�?B�MW(+)=���;y�Va�4��
ef��I�����2/���͋;��#�@�ߛCc�e�)�G�$V��蘴`F	q��,U8��⮮�t�~�Y�z��W�yJD1㢘6NC.RL0�L��-Ae���m�b�:�T�N=9�������$���
=���P�zòΝ?;���h����78��f��h[$��6�V�����H������?9(�J"��ewW�ܥ��퐄[�$������X�b��}�b���+
���cb��+�d���bQ�h�+JJ��N�$�R�_�E����/]v����C�e���k�OZ��Sn��W^a����Vh)�j4
�P4:v0y��2���#}9�	�� M"�x�fWejz|�t��'Hr2%�[���+m��f%f�:69Y����2�MĲ+H珌���l�����O N�#�fV�Tjl_�nS~�If��z,� �˓ĖX��)��_!� r�p�c����N4�
�w��R�VÕnɝ���ҠA-��Fɞ�W��ۤ��&��ŋٷ�ݻ�>�}��n��ՠ%��v��QU]]���{o���n�-��V����*j��j�mͨ6g4!{;Z�U�*��A�ҢH��;�J��� $*��f� ��@�?�g_C��]ɐ�.RGx*BG��P�X��S��7�X
� 2\F�ɝ��j�hH�%������;y�/�n��Ci����(�X2Y#�t�`H�`�o�����7����$$a�&U����ȝ���o(�C�/]��sm��]�~E���z3s�z��ԍ��"��DJ t �n�d�ZY��+�\�2�	?ˢ���Q�&ɔƢ��/ ���C �C8=О�x�hS���k�}-�[��(G��9��X"�p���UH`�3m�&\�Av���Ն�#�F�;�6:=~P�V���y�=�<(�!��I����F�� ����l�1��0� `�n'̒�����vY�d|�0�C:�a�*'��<_�Nni��jj�Jv��"����e�h"Zu��_|=
�����h �h4i�;������g�N���6�[��d���ا�u�9��Ah{��"�&�.��p���Ep`?�:=U?���w�����0v��E�Yۭ��Qz2���
�I�ݠ8���x���F&�Gh�*(i?$T�w@�=�C�_(\۰ṋ�q�,^i�y锆o]��pvTl����
����,�?�j)hk!��:��߿�p�"�)�P#��.�$�,�[_�*���oݺ$����~����;�v"��H��!5�Z���NK�T��䷹��b� GF��]�\A'WA�����ؒWZGKrY
�j�H��Ï+��U��#�g��X�E~s�}��'�F�;�PD�G��ᘼ��/�m�KO� *����.�ĉ`�d���#1�v,�Dxx����2OM��$����fѹ	��f���
z��k���q�]
�P�xH�����ۿs�����C��F�q�é������LV�\�
sQX�b�y�?�7��9���c -I�C"�sK�W^��wEp���e%�<!*���e����"*�Q�B  �C�P
j9��!�/�+Yq�|���p�tϱ<<�z��K�	T�ʕ��IZ��M6���ϫ/K+r�)����9p�N�bt��?�"��|�����;���Ŵ����x�j��{
�v`x�qf5�ւhm�d*]��Z���1�M?13��*��l޴~&�l�XKS�a폿t�7~z�6�>ǋ���Hi�䊂J~y��ۺu+�j��NE\�R'bv��q֦���^�m�.�?���Dx.�3����>�:��ً��5ǽ��#�P�"Q^�'8���44�j�+$EE	��H����p�sü���K�3���n�T�K5fp�8#��������8X$��mG��w<<��D��V`x8`���;�l%�S �^���ғ��gc����^S0jZ��'�@;^�ă�f�?�V���T��~�K�S'bg�Z�����i�|�hl��6�6)-r��D��iZ&P:�"u�1=��+[�2h��J�ů�,��K�;����ݿ��/����Yu8D:c���[�Z�8(�T�
FBfQȵ�/a��lv;w��w��z������z��.��=W��,��"�<J���w� Ka;Z��$t�6?��s/E��n��ܼ���Q�'�����'��d��p�;T���]�������Gc�--3<%%���қ���2�[�ͶJ���f2O>���?_x���qҩ_��:�U� �0�3Hӂ
�]/�y݀����W��Ϛe��ÙDl@	��v�P�����lK]���Tҡ�lw���llDJǡ�Z�d$K��� ܲ�ڧ
j��|���j%����)�'+�y�oo���iv����]ZQ��ǒ1/�����C/�ٶ�"oe�qFu��mHq���S��0Vl���e��#� �
g?tC9��
��$$&i�&���Oƪ��.���682f�����Q�d�5���ƙ3Kڻ����)�R��\��ju�Γ�d�bFr�cQ��@}&#���R�kA�V>�`0�%��j�jfT�e��\3Cm�������-��?T�Xۮ4[��I��Ct��F#Z��������z��NY���=�U��YQH�c����p8�JJ�a�\�s��|.{�`��t\����d,j2XLV��KF�c��tuuY<��BP�@����ځNNAp	��tt��r�����
�k��aq8�v��f���c��;������N|�l�+^H�d�����n��3�G/���΃h�h�����AhY�� �!`���94H6O�P�\0f��`��n0`+��Y8�Ϩ�aDI*2>v���.���3	cF5ɩ��ndH�2��cc��Z�.7�`�mF�/����Tq�utt�����A���U4���>�� �����p؃�n�W�l��gά۲x޼��~�i@����XUU6b��pB2ur��L�v�ݶ ����cm�HU�vH�488~�8|e'����뉮]�66<:��,/����`d���^�B�o���:u�c�E���9�'V���%U��9��4�0X�x
�$�]�^�R<��U���I(HE6�H�!�,�SW��ͽ<<H��k ��`^���y�4���������}������G��;�֭� \C.O�_x��"`fJ���KR,p]
\�&�+���7Q������:�#8o��iod�!d���\H��Vs��$��Ea�ī"�-p&B!��)r�<`��tw�:���62�"�I��I�#����e��>�n����N�����:I ��1(�A�)=�c4[���sC�#UT;*�m��ʦbw�T����a�<%>�!T��?���ջ��	ϸ�s��L���!&���L�@K�CK8��i�@�n�Ѩ j���������X�*.X����@txV��I��I9)�#=F�����1��ۼl��S�x@���`��E�y��JwF[
*��۷����E?�q!5���A��#O R_Gx�䔃�'������e�֯�����t���=��5�H8�����Bx?�ӴL p;��b۽4�e0��/X��k���u���r0��l�6�'�CXھ��.�B�!p%%A�&ֶI6Q�ϙ���8��A��p�����$
N�M�c[�Z�N�q��~;�%�1)�pG��!�6��@��01�����|�����'�q����U#���N\��X�Ydp�'c(��9�W�)�Ŵ��,����q��3�IV�ʚ�I@�
����~۟-f�&�qE%lH&�3^��P|.���E;��e;�eG����׽�[��[&0�p��TwG�p�ۍ���R���J撝(>!�f��~�΃l4aa�sѢ�(i�ȽBdB�,��N\����&�h4���+b�O��{�666�R�8�lJB�/4(������\*\����~AP���e+V8a����)K
SH���\g����-S�t񲈅JT��[Q^�HT!���pp��X�7��N��͏��kA�P��vڤ�x=އ����w���G3�a&!��q��'�D��>�O�]�ge�0DLA@ 6�9�@���� H=��-���U�U�f��%�,�N�2���B�����fQ}�Y;�����a����F��BjF��p�ڞ�<�,<���?~*����cVm�#������M`�@*++���ի�3j*\pJ���b�H�֡"�}^��/�6�R�#��Ť����`���Ff�q����|ނ�³O�~Ӧ�y��V=Ѓ�=o���1��X�uI+�C����@.�_��h�H�f��:��<ԐW	�2:��n�e�f]U�9���cvo_S[W{��W����VE��f�\8��7s�-���i��Z	t�hc����#,������S
�9ր�xZ>!�����0��M�\e��ƭŨ@����Ӓ�wwT?��/Hcc#�P ���7�߲影��]�eˏ�L�l9��C	�Pch</�az�!JHg�`{{&5G�/�I. �L*"��rh���g|;�B@�FT
�q�����)���=�U�I�H�Q��̦�ɦYyH��)�~i1d�1z�%�2!Ϡၲ���!]��Y����?�BV匜�/�4��ܳ��Y+���8����`�h!�_��pS�ac�A��L*:՟ՙ@�U�S{��m��pd���;�TJ����Ԧ�aV𔂑	H%��
G�+I9�͖�~���)������d<�������z
�j�w�mm�Ο7o�z��>5�1��n�[�:�3/!�Bx�"��U�����h���X�d�l{2��6�6��7ߪ\���K�$��,������{ſ��s�'����i��y���:
�MM{�4���V8�;��'���u��_0aJdo ��S��^7m�U��5ʕT'�čy��������P��)ч��p�.�뮻�K6��Dh����}!�7owV�/�_���w�f���<J{㭷>9z���e=,�C��o���@��<�x<~ͺ��~G'4/ ����uRu'=��4Z�%`،[h�`����y,�:�OC��� Sl��j�usy�'I��g&�3��������،&�s;=��eI{�N�;�	�n�������������&�.s������^�Q�6A��TR��\��pf�{[�
�i���,y��[x�# ���J�93��L?@����C�+�56s-�$�|�X�Kv~qh�:�#�ZI��K���꼬b����o~q�ۯ��@^�)/m��u��z��#7q�	;�v��nx���;�8g�\72I�W ���3�ө�:%J�F;�L�5�J���3�g�n���3�}ojީ�kV��j�ڻ�g<a�f�:�%w��=8��)��Y5yQ����4���Kʒ���_���� �������'Z]���ײ�|l1����n���z�s��0���欓�%"��7mz���a�
$�G!����$�.�.���PjJ�V� �� ��I��K��|�ꆒ��X�Ӭ��k�#���|��2������OB{�������Rd�y(��hS$�::��9�:�z=
H��C\I�>I����%�4\�E?G_���~7Z7{nLXHr)� _�?���.YB���l¶�U_�*P����ZQ+�i2	IaHd���uWL�)D�na�`,ft�OG(�6�YM�/���K��wt���i|sR�s�3�9��+�S�3�X0���0hrd��K�1���f˜�Ll|Qv��x�Y�p;�b�I�>�<W��ne�b��]�!+����^�}^�b^�}�j�)v|�[��bE$2�?��?97_-P�b�pB����e02�+��PWf���܎-u!��b��r@Y1�.���p�nb6A6�I8J4��BV��ڹ�z��9��	���=��'�_H���х�>�F.
�9W����b����� ~�©��ϒR[���Ǳ���6��+L|�n>��ۈ��!�b3��P����ƍ-ݱx�={,N� "L�����/��
w�i޳�C��%.�
~���]�t�u+-�_�c�e'�u���MD�[����x�u���[����A�h\E �ڀ�|/��i�_B�Z8�욤���O#J MɔH�H0�7�ɘWN�N��z����� ���8�N'HŌ
96F�����.��?m�8)���A3���\cwN��<��+Ӹoӳ��gc��՟� �M��F���;[�5�΂�S�?66*�a=7��Ѭp��>�"{v�e��&�D�\5i�g�A�nU"��.���"�h�� �X�Ƶ�.�BhG�X#�ݮ:!�F�Q�-oX �8T��&�F*A�C�`��j�1eX/p�f�Mp�N�b5�D�Ё5Xp�p��v(Ԁ�,���
��b"͍\��1�6�l�(i��l���2L%0��Ҿ�n��T�2v�
�Z�5-;� -�JV�j0��y|}�[����1o4O��������=�� �L���\s�5A���y�?�tEY�Ź���BF�7�p�n�}�%�Zs^��\<���F�)���Ƀ7��W�W
ԵD�Q�SߢE7Cc�LJ�_d%��=��DR�љP� a*F�M�x_t�=ػ��RS�/>zPM��)؞���3��Ý�6%��מ�������ߟ�Z�186�gU!�Z�L�����[j
0)��}�^>b�
R��!l������.�A��+1%F���<�����@��GS�|�c#�5�������K��>��a�C� �Eg2o�c8��Axxh�Њ���.����7�R(y=N	>��h;v��<P�� �����W]!��{'�|�_x8(����|������S�U(�s#�-4�¥K�D~��W�dJ�C^Zc���C-=���W�y���t��R�D*��8�h���Ó�7�	��ӶDb�%��%�%�����-Y8@���!$}��/�SiY���F��������`�z|e��R_i�/���'?�������<)�� F�~�&f�ᾄ���OY2����\�$�@E0)#�٬�31ѸM�
5�2�Q�}��ਊ?W	��7����ǄVc}�&,Ζ
�,��e����U����x/
X�V=�u�[2{�d��@��������㪫y���{\�^p���2�S�,w�d�<�v<
��$��������S��B}"
��Hw���5d�� sz�9�Nz }Y���S���n�O4��v�f��Lh�cBQ�i���q�#}��	��F�������������i�����V�E�U��d��|�
 ����}t�+���T�h��jkk�E19H�\�!���,cd&�������KЗ��d���q��0=�	L�DZ[8�v�G���64*bc��v.��,̴N �I5��v��>`[in���J3^N�qW]_��UT0���'?�h��|�iS볏?;�W_-��Mft���0�c!NTܫ'�J1L�v���p����=��]�?� ���x���vX�@��6�.�Hc�nNd�E��0x�o��*6]\�b1M��z���Xln�s��T�x�X;�G�LZ(�al�)U:�b�C�&G�֓�>���k����5S�����ٌ�Tee~��oE�逳>5W�w:���-�8���H҅g/����os��%%%!�m!]e"�� `��c� &
�)bt��G����������=L��v8e�%i֓��K5�V�d�jj�r3�JRR���C�t0��68�1�(|<�
q<��á�}��|T6�A�YoRMqL�7�;n:�C�n�Th���~����r�̮�|����Sʤ�kmn�����1_I����5/|�b�cB~���0�S�Ot�x�D#���d[��M`���C@8]���VV�U����#3B�t����+AF�'�"��������``�]�U��Z�,�lJ��7	�_����f��J4a��F�I�: �X����e!#��gZ'��ƒ�!4l�I��n	��L|�~҅h��� �IÅ���Fa!Lu rT�/3J.�$�5&�#ј���]��&���F�о��$��1j&�X�NCK��9���gs<���JM?���iu@G�ٍ��<��C��4��i%#�&u�F_C<�����sӧ��mF�G� ABtf����	3�R�+�C �T�h�i / �.���B�d�����m�:�`U	y�#�1%�o֦<[�������PH�U Ղ(׈�F��?0���b����d*��@�:]��ٳg���ӱ��Φ����O<�����'w�Q��^880�Z]M��z�xY�����k��/�j NL�J������gͮ�]���h��b��|�&����/
n�Ml�*��܇l�q��TUu�ko��h�ϼ
��U����3<�|iżP8�+�j�C  @ IDATWxGy#������c��yd+�0���Vin}����W���-�W����M�<���'ܥ �/:�ʃ��cܷ��5<J�d��j�'!wE�K��`F���l�����	�1Y�8���u8Y�a�J������L��e��i���}MM\+���r���>�_�$mt{(�6]ʃ�����u`����#��]�bX�g'�3;���$�~���D�ȍ���|JB*=D-g
vW>���3Op\t��\���vЩ��ߟy��ᝧؐ{�!:th䔘�r���.�@#�v]8��w�{1�aZ'U�P�4��b�$r	��C���9�x*S����ﭞ�E5\!�+i��5�Hiߞ����X�buC4�|zTUu9s�?0��i]��m�ӭ.K]Ғ�j+S����N��REl�y5n���!,��������Vm��?mջ�mgQ\��r�LG$w����{�s8��>�@��ʲ �CK_B�UZ�G��O�;<��U�
�[^:�M�|
C���R�g.^�u>��vD���1h��5�g��)M�Y"0nz����<�� {�P�v��l�أdY�h}�S��������܋ί�e;C'i<��}��/�f<��`��6 d��c�1����\�i�ApI�;<㠹�W�¸�D����-T����ʷ�������ݟƋ�p�7|��������<���}>�gy0.8��S�U�<7݈{��n.��.A�P	�g�����,�Q��
��$l�Y��x�]�zS:�=�KϘ49�T���O���?�sB�x��rc���hL��O�e���?�i�Cc��d���x���x<�2"|Ǵ�Q��,��T���bEp��B��b�А������8��Ն�K��,�&6a��5f�f��&lE��� �K�_8Q�?M���US��oX���ܹsY-iR� p:�<K�\���S.�⁌��W��c� �,�;f4Z��:��=�Q�c.�I'B���}%*k�.�J���d��ly���k%R갹��ρp���[hE��"���U��qu�胊Hc��qE;�(p�_vBq�}�C2̣P?�0{��?�>�@}��d�Hz2���qk���0�$��И6�����Xl�!r\o���8���]ϙI$C*��q�!&%"���W_x�ӕu5�Օ��c�bKȲ�3�P��H��o�pέ�ߌ��[�V�ٍ*�"V9��B=.&���$��$�<&�wp0���}�x²iӦ����JQ6�3�4X�f�� �^Z�<%�F�ttt� J�����x��o1 ��t�5��qi{{�'���4.���6��4�&���xMV�9!`>�̊�����9����A ړ�m�0�U��l�L� �v�����3FtJ�'(�iޓ��-ԴV�v�J�vՌ�'�hQ�`NÕ$m�Q�VZM�ɔr� �)�pt��3���dg���a���L*��yc�����D��ñ+�8�Q�Sھu��W���,z��>���D&���+��`(�G?�����~O�B�GЂN�(@]�>iڂ�u��i���$b�vX!�c�8�$EF�
��6��wI	#���_,��9�۵/*�g�[Ey���$�S@F���ݘ)�O<q��y���8妛$�c7��b�	��<#�[�Y���[�ˎY�[Z=g̘��M*`$غ���T�������Ə}�c�ݻw�K�.5@��r�1Ǆ���,^���D26��!B���.Y�D���7^�x	�0��.��T�Gy��|Hk<�svk-t�_�}*-���uw*�!z��֡�'b��ś/����L��t�C��s�UW�zh�DL:���(;o"&�	���4����S��҉���vv~l�pɴ��������N��֧�'�iݯ?�y���#͙���T:z�����і���>V�b�W�4Vzl)	�K�2աpX%DQ����������@ϐ:����P��ʤ^��PҤ��Xy��TLڲw�}w%��(�D�U�`��	u�^|�En].��z�o��żr(MME^����3��|�Ci�Cۅu�v(�K���UU��z'T�����N~��)~۱�ɐ��
�y�:N�FN�"aikC��U'�r&&"C��S�;�x�R����b	&j��QB���`�$��~�.\L\����I�����@s���҄C2:��/��3:J����AÒ��F\0��Nw��eT��ܣ\2�#�@A�i��j�پgL�L���f��6�0�>W����y�mS� E~�O_�]%����7ѫ�����^�`:Q/��Q�Kfi �0�K��N�̚5+�D��K1��WF.-�s�N���W���x�f���-��_6�j��*$��q!OŃ�b�oTP+4��ױ��Fd1�4hF��/���Q�@�)I;Ѡ��DB_I��}���D�4^&������s�M�Id��IqO���
�ت����E�Q+O�(C��'�m��cr�<X#܉���gS�@ū�?(��h$*$����D�W�d���qh���^�K'�X8�l��0�ڠ�_A�BKR�!����LÐ3|X	��c)	��.5�d�����DMD����c���3��傶��ց��j�:sp$�ëpei�R^z.g؁ܳ�����r�E7��u��H�֭�:�b?��P�n�ʗ�����YB���\"��H�y�'�������=*�lN��uФ�O3|�*��X�*$n��=�H�m�B�8Ч��w��qaM¡ ��}��+�`��K�?N�8�&�ar��u���5k�����ac���N�����W���=���KQ����Wn����K{*$��3�\��t�i�_y}�)i|����kj�@�9��`�!�@1v�|vVb_B�n��$6�s����_��~Q絃��L�dj�6���[�dBr8]��#�&TZl��+Q��ш��13������8���.�z�m��An駁f��Y�F�ʰ�j��>��k޼y�e˖Yp)��鬠�<��潳�o�~)&*/�p�\�'��bP�V4�hه~�DE�scb�i���ı�,&k0]:::��}�Mi����%b�OFW���d2J������gUU��>P"��|�f���DfV$�aw�)t�(ܣ��U&'Q�H�Mu�LZ�4V7fd5����_H���3(�{Q6;��/KA*����i(,�n'�G�Y`~���Ҹd҆&	��+�6��n�4� bLi�%�LgW�X2d*L��ɑT"�!���p<�����d82|�gЯF�c*|G�r��+V�`�l��#�P�r�����O�\�B�E�:��i�eG�ZH�+�	d����F�5:	Q���飝�RiY��]-�	1#`� �椝�8��q)m������X?�����Z��	P������-l$0�&+H�H�D��_�ʕ}���tyRr"��>�h8��󪱱����&ЁA7x*A9w6�|���D�v\�*�]W�v��8�&��s�o?��O{ ���AbA��Ν��/_~J�^������Jj��N�H��lj�[�l�/�p��{�?��+���}p�y'��������ǟz��z0�^i���a��r	z����-;_G.~L�p�Ӱ<�^��Ow?����1~�!�E
�,��Q�2�o�����M��b	Ɠ���ǘ��=j0�F:��_��Ol�uDJ��y�0R��j�%�����7T��ܓ�~Y/-ٷ����6�s�S~�Ǹt>�n�r�����{]w�m%�r�I2������m�΃����~��y0؆�M�L2���KϥA�gK��/������ms������5�LA�V0HK�)!��n^��.��)=�v���~�ݦ��Rڻ�I:�G^�+�\���'-�Ń�rip8*4X,�fZMe�������w��>��?ku �֯�������i��3m. K�.<vRC�t�	F�KJ��=]�<T�V�ܰh��!�V���̖,e�Ń�����)Yf��ϥ�c�*��ta7�g�6�X^��^7��L�\i�!��aҀ� �8+���Ã�o���Orp�~e�߆Sw@��۴y��!?��H8g/��K��(o�9��P�����Z��l^wr9�\�Ȁ��"_��R�q'�͹z�����6�?n��C/��g5�ռ����m�2�yLI#'��PZt�t�I�F�Y5H�%P�Ƀ�DcQ�lC^:i���
�3����(>�z�{dX:}q�Yƣ�����&'�㖳>|g��;�;���c����O^uU��N'@��>���SAKF�Q�Y��;n��@��V"����\�~=ww���f���@��.mA�Ҽjb��O}�$�G��1w�C�Lҽ����$l�#)Fہt?���ɊK�~�%��]�\Q�֜}�_�;U��r$U�K�����Gx�%�e`(pWvȊ�g�Ƒ-���H���2���Y�OD�*y���|f^�dx�ڻ��W8� �hp����x^q�q�5�s;5v�,��X؈���E?�7M�N��eD`�ae�\7��V�u��^�W�D���[�r��_q$���1F�9�+p=��J(ܑk6�\��;0�%Z�r�Z:��@�J)]�~.8��>���pR�Z���*��V7	
�q���
8������ԴZ���+�A���C~�n��[�����ܷ`�a��v˰h�~�$��\!lLA~��x\N*��P�E�b��J�$��C٧h:O���Z�Uhh�׍
�����0Mp{ݾ�d[{�2��B�m�j�,��NPz:O���~��W��4�*ǒ��p�_�ǃ0n����+Uk>�	�?�e���4��qٞ�@V�^����l��f�*mڹ����&�aƌ�)�2��en+��Œ�;���w�>}��un��]��y��g���(�>���y%dH�����3�|ӒI�1ȋ�A=&�?%?���7Z���2��LJI��3���Kfg<)ph��?����dZ��C��`|���B���QAX�unl����D��7�DQ�*(�M%V�+��V9Z�4 �/�er�8S�/K,���ZԈ�JC�! ����X���ƞ��f����g_H�X�LY��#֕V4S=,u�˖,jmm�����;!�"-E�q?D�&�d2%���+j㬹R�
p��Ks6i�/�`���'�4ӏ8��7�W�(�f׼�3�M���zr54~�hH�]@힫5��I�C~�hY�A���{���צ��hAxF����)˩V�TWO_�
���h2���W��.���}����a2=}�%�0��W��U�&�^Rb��q���K�n�g�������!�������N�9DN,B���� w8<�D"����b�se�-_��%�T��nڷ�%��7��:h�Z[7,Z�`��+Ͽ�����ue.����e������A��dyy�l�PYZ�[NƯ4YS/�z/��'���K
�M��í?8����.�{�I�-��=cܐ&v�t��9p�9�W��	��|�X8�B �#d��1��I���'^R{zh�=���h�p�gt� T��?�C��PSMGێ/p|8f�� m&�}Q/���5����.HʁPƛ<����m���r����
>s�!C�2F���M��
UΎ����Ph�7�1���Jݼ�s��x��M��z���(ҽ��c&����¡��<�(�p`9�vͽ1�}�S��r-�Jˎ[FZ����o�7��a�!g���"ZA��{Om��|�~"��B�2��B� .��W?��覙�3t�����p a�q�#�T�����<і��t5+�՘*��Lя�HW챻{��077Wq��f�������#C5�d FA���g��1�j�Y#A����R�K�b�����kc���d%�`� +t���9��a�&t�	�����b����HeQ(F&Ų��]+�Y�KR^��1�O��WT�j���wxp+�-�W�SoD�?��v��ћ@P��!��N6��z�3M(�� 9�U��y�e5��w�q���R�J^���	�H��P�v0n�\bQ�V��r:-F���Y��

%L��ܓL�(��7��2�]{�i�������yK��o\��3~!�t�q��&6r@�!
f�����^����b�<�aC����&���	ɹ����l����4婷�WR�|A������Srk�M���C��\$.��=�%�G�	�"1�0�`�H�1����
0��q�B3w@
��.h��GZ���z�E57�W@�������vy�$�@�x�	��F����j��G�*q�ћ@�Q(��
�uXmm��&E�Bj�f���?o)Y�B�k��r;��������nrQ�WH8�v��`��=K$�y����4�X���x$���j��"�R8��C��-(�s�<��xX�4�v�u���&;��!�f���=L�6��=���K��<��@����F��#�,�ѩ�f��r�_���M���8�A������@�gα@�\��s6���Y�bq�j�.��&�ժ��Pu���CnX���^�	X+ �M�@���[p#Xۉ�0��#�hK�4m)���!Z�Χӎg�P�RpBG�D�7���MTNd�8��g���b4�K2�y�HƜ*\��i�	�`� &h�4��w�X!#�@��8�����U��r �_0U`��1�"D���&�d�(p�-/Cy�
��Y�d��/F�B��H	��`W�9T1,"dO3���f�)I%i�6wrhdش�M'�v(��O#�`6A�1��p�-@���9ꇪ�-�8�~�a��	di<�-���PѶU�;
�l0���c��8O��`*`Val0&�kc��SP�D��ަ��+#�! ��1��S6��ex��Ƭ�|�R05�1���������*��IM@Y^IƔ�!���i9��}�C��蛯�*+5�³�~#����?��w� ��dxiL���pv���K��È	d�/�@NL���{�%���ǀ`+.<>����4SxudZ�Z�J}����j�����@�\�#cŬ��ۜ\�xQ�A��A%M ��)���[�{ڍ�-A({�%�;8�I�hK�	��ՂAM�nަ��@ь�P���BzA�� E�Ӭd/�ab��o���9#d`�&�eˁ��Q|,Ҫ�n�ʘL#p^َ�ɕ� Պ(೙p+�S�iL��pfb�؞E3f�b8�"��3`!]�Ph�vF)<2���5��ˆ���@�?����ٿ(.��œ*��C�����o����XQ�C2�xJ?UKi���̃A�<�K����ޫ�`�	�E�
�t�G����!��78�X4:4��i'g��0N��žGI'u��Gc�(�b�����
<�����$�E��p^D������[ `�. �e6�(��@�#��[����%�m�,	k![p���z�����
�CcUC�n�3�꠻�@f	�<N��zF���z��r64����"r��_>P3L�s�^�8Q5�L\N�5f�[�����iY��w�������>7;gU<4���]1��yT'ч����n@:i�L�z�z~��7I��!�$noZ� N ��(��+M�ݗ77��e�^:�ǂ�a`H 7�?���7!$-F䫤��Per�� �[C
Q���G"������_yU����N �*P=L����]����Q�@���G�{h0cN��<^��7��9�B��6m����N.���-�p����Y-˔��`�/��^.f�G�O	��0��	8S��	��C1�7Xt���t뗒K�6[�_�ʙ�����Wr��j`v_?�Y+���L��\2�Eoa~A�w�'9��� �P)�}�_,q}�RY�u��i�����L��hU��1ԼwժU
<g�� �U^r6M��dB"�d9FI~u�;��Q��z�����G�Gn�;�\ $�2�5*쟊ʒ��90=x�w�m�i���p<��g(["���p��Q�@9�E�ځp;s/D�D˧��T]�����իץ͒y\6^�44�+<���80�Ն�]�2�B�jE"�喻/���u-�A�oB%J�
��*�b�"���6Z.�`�@\�\8�`�n,]P[�m�pL:w�̙M�dsB+!76R&�{����^=���r�B�l��*Yo��ёYI��g�̩�eW�C��g�FSYy�a�*l��#��J�#/m�̢A�V]}("�hn���
���ʂ4R~-�^}}}�!i���G>\z�2!�B�s_2	�u����*6��ʁ�ā˅��\��l��8�=�ˎ�����7����i�mPbu��B�hJ0� ��1�a�d�U0�ݔ�`��H*�ow�C�sl���uӦMv8��F�i_�����u�X,.���3���?�T��2��UjwX�f��QS�?�ˤ�'U�j��r�SC]��d��(�fwg���:Lk(8 ����;^�븕�ܔ��Q}���(Ц4���JC"I#�L#;�H����Fpg��(�0s�3�qD$4&G��dܟJ%�g0.5����1��-�u�{�CCs,4f��s�H3V��s��W^���F+I�ټ����*��ǈ�#�F�D*a�P��{�/�N��1�_-�����p[XU� �����y5d�OxX��>�<N��gx7k�D�i��⎱X�s������3Hc&!���U�6$�*dB�� ��f4����76�${e�HF��E:��a�(���A:}�m
��^�Q�˴"��	����J�r�t���c���r0-RT�x���3�	ȩҁp �7v00sf�e���FK �N!KL�Sb�l
�"�jJ��}�SN=��@��t��apEq'T��?<W�+j���=;��O>y���-[z�fΑ��}MM�`���ڇ-�Įb�Eđ\��dp�#�� ��15�T�h,�F�+no���Yd�qr����q���z���;>Ã��N.�����<xp���?_ʃI$B���A~��` ������}�Q�LF���Airr�y������n��utD׮�Y�	�"s��(+��?^߲��EM�`�CLM&�p4��@8��)−��?"�y�5�;���3��Q�>��崍/4y��/���N4�&���x�ں?G��1�>�U���tz���|����{�K����K-8�`����a���p=8�%P���.Z�g�pP����΃󔩋�aN�`��l��n�3�P�@ދ���X�z�Ѿ}T�֛���&�-��l�&,;#�����W_|�y��4 zCY�:��f3��?���p���Gf�<�[��Pk�P}K�pJ҇�j��np�&1�
�aS0~rd<�N���3��ʲ����N}�����q���w�gC�2F���#<ԱࡇL������(�CPOG��jGV����-5t�ƍ�$�Y���H��C�R���<�k�}[�ɫN����qǥ���A��DoooM[0r℔�t~2����o:��K9?�!U�k�����Y�,����K��SW�*yw�K<8����2K;p�]*)�j_��������ǖ���4W)q�r�G�K� t����D��H#�j3K�m-XO3y��6+w���%�y<�K�F������MP��'c�R;w�ڡt�+����ğ�Xh'1t��b��z���-�<��	p$��$��K�:��~���_,�%�G[��SӾf㼙uW�������A�����z�҄��\D�;'f	&��3g�d;*�ɴ�����1I:��g��]�!�� `'q��ç�����A��q���{�K�L&w���S���*M�{*�2�I��cj�k�~m3HМ,�H,����Ұ�p��`�tt �6c��M{�=.;�@T7�Æ���E&�ݿ��-���,�;0�5˝�����?O\�T�}��utuKIҵ���^Y+W�q��]��+��Ӄ��]�.�ee�D�y.��T,��D$�ٳ�]^:v��9sD�$w��u
K	���;8��\}�Օ���[�X_ZVQ_YS����}w������
�sp��L2I��������O�m�z�f���p/n���lq���*�vf'���m�h[�E����)�U�'i ш��gE���>�x;i�]ұq,.�c �<T"���9./��*|��l���=kCI���9k���ݼ�?�4��:�ټ�c�ߚ���}n�x�r�k��|�����hD2��a�3!Z�N0t��!�6ʰ�1�죴��T�� �:�$%��ϱ:��f�F��KJDL��ܥEF�y�'�L��P��N=�L��p��k�20X��Y_��m�U��>L+0��X3��B`���yddt~eEY+vZ 0C�H�ٔ�I0{(�o$�ZL���2�h�0�)�hlL��ci�Z�*�e�n{`�-�xZ]^�
�d;V�����WL�̟P/N��!���T4	Vm�����;���Ua��,�7%& 1�dxg���I΃i�����~�g���PW[���6��D~���N�F��g��!I��m���`ޥ<���
M�K�w�uW�ڵkY��n������?;&%��t\��ڝ(Z'�0��8׫��#�QQ�A������`4�������5�V��
�i�@ �L,!2O7���ͳ:߽���w���:�XP�\��O����S�?���q�����30i<�o�0\Y�&��xgO��/��YP##�;ǖܳ�/`r�N=�8S��5�#���"@������)XPR��,�p������!8y%��Ʒs>�GO�2�i��w@�
���bN�5sf�q�0����Gv;N0a���ܾ��'��ص�0�ӹ�f���/I��n���������������,�mϡ��^^=k���k�q�A�	�_|r��
�x�.MGGR�������MDА;�?���x* ��w���nJ4�*�jW��t�z��J$�2*���a�~%��)V	~w���u��Ql]���אR� ĝ=�	��<,��O�;pۓ��<$T�"��bLM��p0?�(�*�D�#�����&%��{�G{tb�!�"/zp�CY�Nv��A.��
e�58ŧ2	(��2��Tʉ��4E�|�nvV1G̔��߿7C����l��E""���p<�݁�����Q��W�O�O���@pp?����Ҩ��XAҍ��&D�����bڼhd� ����I�u4;�b �u�},�'�ܺ툿2�pi��v�d��c"�C�@����h�ꍿ��}\>\�q�<4E��Z�2�ܶ ��H������@\��ǅ~S�����u�2��p� ��h��Ŵ���[K\��N������#����H�K��{I+�`�`ͭ�z����.��Ê���y?� �o�{�6�ntB0��!(qE�*�z0V��V�*���@�&n��+��.�V0 ���=�Nj6�3�蜆�:h���즛nB��L�ƌ�
C�GxpD�}�D���oF:hg0�R��%��!�,V)��}��� ��#,�y�*�;�z�Ja�p�%��ð� ������׭����˪�BUU�zU��׾��7�����w��ً���{ӟ�l���.�͛��5;���f2yF��g��,Y�`0���	�.�c�;���~w4�KR1.�.�l��p��,��$L�x"^��0�����F;�H����r����𒚚�&�k�1��
=i�+��+Fs �e�ĳ�������e��3x��J��l*��8`11h3��=,��#1�qY$��lυ[5�~�h&��2D��%UҀC~:	s�@ܐP}�6
����b?4ۥ+���A~�2��(���MZ�F�����.������<��SN�NBOx�q�⶙�x�y�Z��ܞ�����+��D��`�aO>��z�pڶpa�`q�;|/x�)�A��3�������
_IE��3�jcD��*���TrA�2���]�;v�Gr�|DHx��߾cf��k;�4�XBi�*�a��ie�'1����FC��1�;<cifRT�ĳ��f��-a��R�����`��:�I�Q��j�9ȭ�#�����MZ�،�eKNm�)C����H8zn�9i��Y&�7���D[�K�.����Z���܅W��ёhuy�����O���.���bjx�G�qIT�����NT8��oz�+�
#�D�Fhdߏ�-��p�u�Y.����.��z8�"���o���=�f2�-F��T=�*	�`�f:��{����$�Ggҡ�f��S������~}m�����\	�=�1y�W۶���=�3�$����^�ǜ���!��:S���Er� ��߸��s���Zo|��^�P_�����:=�$���z�]�FkS��.6���E�`0�SY�/��~����Lʃ]��Bysq`߈�ȽO�}jÆ�7�z����߁�����%��@��z�S)�	H�;���Q�|S�0�^�7���w?q϶�;�8܋����H��M�d��~ΣO�9�[���t
���*=�>& ,&�kf4\i��z�*¥ʪ,���u;=�L�H������у�;v�t(�F��@�J�OWPj2���n����.-��2z�N�B�(C�W�[A/@�D:ɝ@K�χ�8��q?��3�?�h�zF�V���'F�2���2��[�#A<9���w�:#q"�rv-�\	��<4~곥ԧ��,ho�oj�ܻ! �M.Ե�A_��z���U8y�&C,+݁��L%૖W���Y�ݒ������f�Rg?����<���p���;�>���#�8K�z��9O�u�Z-�tԹp��v轅`�D�m������i˒��n��k��N8>�|�̅ `�p79d�o�xt���) ��p6��
���j4�*���+,���8���	�o�3a����B�$b|�ᱪ�^���|��^���lު���8D[�^�#lC��(K�"p��U [*��d�u��I	d\lqڤ=۷s;����*)XT��t��2��L�+$L����(��r�b!<�p��wb��B����'��fn[	'�ٿ��o��|c��\��Jj݂0��~����NV�}J�@�-?l�-V��?�?�_�
�%6*�w������Mĳ�5'^��}Wˬ��#��M�.�i��6�-�8�A1�p[[?���y���U�@9�����׏͘a�
��qW
��$�Uz��'#�h����+�j]�!���˟�>H���/��q�Tt�A�{nx,qẇ׋�3���B:$�~�3]�ʚ��E\��� ��&GG�5Y�NI��P/ǥ���w��SE�OZ}���n�����b ��U��O����t\��O.��x/���7{S|/́Ǥ�Z��Z�jVk$R�m���L�$߉A�m�#!9
����H�+������o���.����j��ӆ�b��-#��=�+R0]���ȘL��e�b�U�5DNDaf�쁟,���s��s��Ȭ�U9�"�i���Z��2�-h9���q��˘(v������~��!e߽T���;�21Yѐ���#hu\�2�^�Vh'�{.�p"��m��2�t7�}���(�|�QQBk �# �	��pbq�#��&�>\�ƅW���|���I�N�>�,8\ڋF��1�;�b�Ǹ<c�R����0�G �OT`Lwa�.ԁ~Ă��Osk�4s�lZ���:m"MJ�;���G�B�U���䨙�IG%��0F5�bRoPrt�x���*�iB#���jsZ�LTM��a,<������U���F�MQ�J������R��fV-�ِ(l~gSU�_�����(˘2���h���!��X� ��o_}������ew���.�g�KDⰐ��^0�Ī�ح���H`���:�`fD&d��6��o�W�]�v����٥��Ս�w�"w�[o��G�%�w�.#a׮�/��F�~��uUҙ�p�}�^=(^N��&�y	&*���9�����ys��ub��������VL�� �n<���c�U���`����RZ����t�q�fa٦�[� ���K�0Z�6��tw!uL-�/��&�B���ӏ4��f�v�t�k�IKlzݺq�d|�P��;A�Z�f�C�5@�;��.-ֺ��K�����L�+��I]���O]�S� ՝@���|K��� �;�ȁ#��!6��I0���R]m�I�S�U1�K�)�Gu�P��#g *Hs���d�H �K介$�iP
�aD7DC~�4J��`oO{��eQ�/�������<�.O]p�0:-9������3'���8:� ���͗K���fز
'z��o��������)ۼB n{�i��љF��t�2=X��?:TW�c� �P`&@]T����քB H2⒐��:�D�gne���"�\y��j����v��>SIKK��	�u�t��W@���N`��N�3P�O�R�D����ټt:�I��7�1�R9�3Q�߼<Pj3�2��U�p�+F�:�ֶ���N��Xv�UUV09c*��X����X:c\��S�W�b��~Ā���c��l�|�-�l(n�Ń/�Y|�����ߟ���9P0s6rA�cɌ�[�h����	�xgg77��Y���L��[���p9K-.�Gw1#�V�%�.�jm����	�>8�o��o��hv����i㋴L����N��K�����B�K��B,B$�����ć����޴��)�NȤ�e��I���޽��$ b��+L�9�` �/2����<P����Z�K׸SMGw�y�8�}l�� �Um�92��k3�\�345r�z�?���N�=�=I�='��d��B3�C�D8@��O,`� /2��O�I!.	Q�=��t�g.�d�d�8ࡔ�6%}��o������'&��{ll(�ϋ���z������u�#n`1�ò�.R`4�v�gY6���8��{�����������WU^ZVZZ�%�}PI��f����7;��1>�2Rb,>�@��CTfwv�'b��2g,����*iÐn��Ӏ7�k��-E���K�Za�1���X�%����L����2�	GpX��5���1�2��*�hXc[���@r��[\&�����jr> *U]��ȱ���Z�D�
zKA�%S��;����܆��L9`���=��F05��H�X�����q��Es�0d�1թ>h7����lG1�OM u,4��:��ޅ�~fGC��p;$��&�{���w�F�ᗨX�%�M�5�.��K�[=5*���Ps2�(����:�ګȥaI"E���vG���y"�K

��]���@(	��Qb#C�7��o߲��,�w��vK�νM�������ܨU�j8����il�y�xĔ��_z~���]�aJ��k{���,\���)�m7&ͩ��/*��ؽ{wCF���r�S���tw_cI����̮�J��y�y�\�*�!!!Q���46�-`��O�4���-��k||�~-�>}4��n�� dhӢ�D2�BL%��J���֭;O���}��}�����om��s���>���^{����/6�Q�#�Km�eYsM���P��$&������G�O}�S�}�Ὧ����|c�peݣc���c�t���1h2hV+д�閲D��C#c[��G���1mϮ}Z$��ٓ�I$��o��-���������X�,|��c������q:�,X�,YJ��3?��Yڂ?f���>}�'��F1>�4�/�a �^g@�%������/.��-3����s��?`�uM'ާ��šP�ㆁy�O����'��IY��7/��K�D�v�҆Gƴ	\�	E¸.App�,�t���,'�iq�`ŉf
M���t�@t�Ϊt�T�Ѷ�e4���]���~KS�%���C ��^y��L����,t79{����W�I3�  %�IDATu���U�Y�y�C	#b�U�	"��Q(7�~-�^eNߊ�ǀ�3{΁;�w�m�	u����&X�ъ���b�CR�b�3=0�d������}Q�UB��ם_B�^S�CamӦ�*#AR2G׏en~��������O�o8p�n|��@�.s^�{%./�c�Z������5J�`w$�%���i1D d�M���n�ذ���/�Y)m�CQK LEt�a�?Z��p�L8i�� ��0:�!�eb/B{�x&c_G�D�KR2W�|�v��A�����J�����N�2t�,�Uߠ�F!���� /��Σ:������z���4� u"�C�5]�g�
��A]T�ZE9���6��(��xӕ8�P��"�M�?����%�.�|�^\Ԡi��������=�V���*jIQ+u IR=���Vp���M��D�<7̌L�HG�JWu�(W4�
@�6��h�"�����l��"1�%!>%� N�ֱĒ��NvVpp*:b��1�x��L�O[��u 6iX��BH#`����Ə��\��o/�I�y��3K*�)T6�by`ȕ*&ꫫ�����g�)~N���F�*\@��Yܴ�h���H-@�r�H��.�P�������u3\��"���2��%Q�KZH���1g]�OoG�Iҟ�q40�-�ڔe���f�����0��5��1�h�8u)s��'�7J=��2��	�H�����r����#��dDP���M#�jS�ݞ�F"0������HDE��7�Z�L�*D�eE�)�X6�B�����>}���euYS�� u�v��Ax?�.˓O>���Q��������W��mmn��8}HN��&�y����0F]�Ms�⺄���%Ք��$ηO=��U�@@M%�8E�`�Ý��b�
���/�4y��eIs�`f�&�\j"]�;�)D�aK�����@~2���0��"��C��GЉ	n/�a�<�GN	�3N7��a��;��7���(-�𬙌u3Z!�f��FJ�я�.�p��ŅC�5��#K5�p�&2��Ȱ�CР�[8�-X7�e\${�\��v0���H	P^�Y�j�z�Z܎��k>t?��H�P<������%���$0kQ(��*ʔ�B�h_J�|��l�ǳZ�@�F�r��2w�zKm�r��q���%4lС� Y\����-_��8�(
ӳ� �QO���3+/�������<z�2�4��P��;E,��[�Д��~rRj�0kUmV�j��V�nK�V~�bŢ���h��US�]�C��N��Ȏ<ڨ���jwg����߷�xP���\*���՗6�8�S��cޜ�J}�ޢ�Ȏ���[�|J�����N��1�\�Y,�64��6���)�ޞz�y7�|sϔO�̭,v�q���Ґ�������w�vs��O���,Ql���{[i��z�ױi��1��B��~�j�퟿I��*f����D睢w��
��bџ��JM���‛F����K�۪��mVN��,�X�M&({��?��c��űw��֩��(Σ}S{�G��G�����Q�=EIJa�W�N�,�c%��}{��k�|��(��ײ�Qpь:�q�����@U�
I������X��B\�C�M7Yk֭�����7��HLYԾr!h��oͥ9�\��0{ʜnW��W�T]]�^��!�@S�hBD=��.*&�`z�flD�%Kʄ)��)�.&��i���N9�q,p�/�n���������#����o�eW�y�(����3�@��	�Mr���vJ�� �~R!K9�9Խ<�,1�h�m�b�G}��eSXK\"J��B��˪��� a�y�t��S�ӧNI�Q{��`�E:`�rֹS���:n+�xT:���~?a3ځ�$IO�T|s}S35PW��,Y[���];Ǭ��>�X��盅��g��򏘅OLL!m)ό����9x���d%^j>����9]B�<��+�y@�sI
;㈸�;�8D�E����,NRM����tt(��ڳ�8/���]�v�9�������о�$b&X�2��2��6�� ��I�e,�]���74���2��7B���]'�pՑ1�9����҆��#�)z��i��?1WF����p
�8�X��?-g��<f��ƆV��5������Uմ�"���nijpP6Y*�t]���/׉v0�V2�hIt�H(�i�	Ͽ��/��0]a�
��L
t.���F�d���8zmm����$��sX���9�{[�l��g��B�P�s�(˫��d����K�F�¥W�$%~^J��_*��@V�����fR��-(Ϸ��gx���y!QͲe�?b\�eٲg�w�r�M��u��n�l�b�\�\
�-;w�@���TW[�ڵ�F]������Wn���l8�q��G�2I ���Z�d6�w�Ư�]�7�xQ�a�.V��T*4V��.q{P�`�׻���<�|�K_�@1�?�i������!Ly�f�,�
�ֵ��:���������CA�5�����6�4565yZ��ǒ:D��Ԝ����KW-kΐ)q��Hr��`^�2�H�hS��j�YNX�4V����.I��v��a%�׃�K�|���*�$��H٬�/b�xb�M9��JM����/�_�)��]�A�*q�T\�JJ���Ģ��+Ȃ����}ߝ��"=e��]Р�4�a�X�tQHG
ٱAŻ5��l�b'��Qh�X���P�t
M����S�\b�G�Y͚L�T�jIU�������b�TfI���N��JA�M�b*�=C�~��a�x0�ܰy���9p;k�qN�Ӗ�n��߸Uፎ_��+3��}聪�d,�
yJ�Ȱ��Rϩoc[낻�������~Ы�X�x��jq��@7=.�����j�x$��׀eN��0�
n\���0;��+*�l`��$��htA*�fcn�/�C%��UR���ћHM�~��us�7�G&mM��#�Cg�G'�,v+���D�Ԑ�ϱ`g��'���z-��q��W�ʐ���C��Վe���o�Uə3��ں�cfᑉp2P]e��L�G㞪SFD4�鯩�ʜ��ߢ�=U�(��H�DV��3F����S��,�Hw��6'dO���2|�;ZZ���h�'?��xn1���xbٕW|�wm�gQ�.Ǳ�Ӧ��`2+�E�'Z��v��C���Xm�ZCB{�����������˟q�v�ܯ���7�~����y�)�+�CB�:�Vx7����F�?��,�B8ʏe����桘[*\gH�:~��рf��e����s�,��0��Lm��p
���O��|�+�Zt����|�׾2��&"1\_�]�	i#�A� \a�5"3m~3�Iqim�1ƌKf Ͱ8$�l��:G��$6��r���Ψ�W��\\��g�#`ځ ���U;�@��Z���J�t:��99u�Υ�Ɩ�6�Mª��+]ۘ���ײ2�aRh�+� "f��~�{^={[Uu�50L�!�4X�%�B+�ʤ+�}ĘQ&��n�B�Ei����P6�X��U+׽�w���2\�4�^��t�>��RsE}⛥�,^�ݔMN���7��������d�܉m�y0���ڍ�<mI�.	u9h?��`��#eD*d�|`q�Y۞$[Af*-M�8Ec�i�ŧjE���-�+�WuU�@� 蹰��D�0�%6֕��"{AOj�h&&�d��{��E��Ŀ�����۶}����?�����ƍ�����!�IOy�	1�ɸ�>���M��d� ri疫�L�	g�΁��<��Ny#�	�7����O��Dꏥ,h�_�b'�E��R���Q�ag|N��Ʉ+6��:�
�0�����~��/(����Qq4� چI�E�h�F ��#Au�oB"��v%��K��BH����`pI��K�s��ž�,I����L�J镽��̑��,<��I��y	Ƣ�xΐ�P�YL�:�y!Ah�w��@��/>�"�x$,����P�󤱖���X�A0��c����Y��Q�~���H��>�׊?��]�$jj�J$%�A_�47S<
�������ܯ�=	������M`d�8��w�	���Y���_hN�r�tϣk>���g͝��>����g�s��a��Z������	j+���ƪ�t�hNKʦڗ�8;z z�]�l��3P�KX�n������Z���/���ڎ�nɦ��R�tR:�E�U�%'����n�H[x �-V�fs8,��j�-�a�X"�h��'� R��?���8�BIJ[\�F��g��_ΟS��"D�A�Z2�g���o-JX��:e=�.�M�O��-Z�rIr���4�e��?��*%џ-J6����Q(HbۭRf� 8M�襛&b�C&�i��~b\WS�DcQT ��������rMP�Q��VI�(	C1���z��('~�79�����hP��N�z�C ����]�^GAB��G� Z�d�q�r\�������	j@P�?k.F�Q* l����2����Pxe��u(SFǣ�����H$�S�x&�s�D��u��/>����P�6\�����[񥗭5ec�9���b�}%��^�=����o����Ȼ��?�v�����BK������Ǜ�n:7D�	�c�U^_�Y8�����o��w�0���ӽmμ���]���ͫ.��^���Ɍ�+{�i� ��ԀT�������NN׽uUU������Z����R� ������}}گw�;,���H���w:4��;Tk�ꧦwnL1k�Q9g�`C�!�<s�p�*�A�t�B��F_-~/�DR+���Lϙ�x��#G,,OW�k*R66�ۦ��|��ِ��\=���:�x��ޣ�2�����~-4;�����66B[�B�����Ng�ا�`%Z8�?@qh����ۡ�W�3�aD�ؕ�.�����>42S���ۺ��ez+����Nks焎�
K^��W�N��G�X����J�y��@�k���S�����\gg�to�L����������ׯ�.:��>��xxɃ�y�KH(�?оH�f�D���:�� iu��Fu�!���c��v�H�ﰙ�@YmL\1Dc��D�IT9��+��i��`0R�=5��r�.@cF����Y�)Z�K���ћ�-dN��[YxoO�W L�466�###��	;SHQEIܚ�V|R�|�#�ǟy�,N��T�Q$9���(��B��؛A|	�fa��~�~+��g��k�"�c��	>���}�.��Ԛ�-��,+���Y��Ѡ{�fa�/�E&H�G޼My�9��u��HHz���?���k��#��y�f�2�n�����\&-e%:=nӣ "��uKLW�̬iU���rl-)N��Shʥ=/�%b:�Q�	2���3ށ���p/��Ϸ-l�̃�F�"�~%w������@1�a�yxR��V�Zsz��\�LK���Db��j����ӝ;w��t�/�B����A�I;�G.,Bkw��>�ɇ�XF
D���@Lہ����DR����J��t�3I����`���<Z�*i���`���{�$��m�hq�Ì&�.��[�gĺ��Ou�a]��ٶh�ޡ r$�����f�$:��c����eF%�!̆qш�W�(�X:q%�)�[�Q-�?���zjhh��;H�Z5�����h�w�`r.��Ǐ�]w���k��ځ��MMM��&����=���o
�"=��c����Dj�s۶����o9o�����j�GMMU����ͳ.Y�Y��$9|�{ =g_g��Lq�l*՝�*O2vU��Y��;��B���},i�f�g��8nN�a(�X��:.��T���Q�k�lB�-�h�:{������}�W�� ��$1q�����S�����]��F?:C��{<`�n˽��q3ށ�����E�I�L��bddP�>����b��N7*rs��lo�\2��S�N%ұ��/9MY���	�"Vw��49�X�l�J3n�����':C��>(ځ�7���uI��L<�����ri��[�Sܸװ��v�m��
��՚Wq��｛.)�)"�����~���_����'��M�"���d�k�4._�P�	�5V>�ȭY�֘�%��\&i��)�R撱d<Z]�s#lE"J�?�4ր۾��$_���N����x̡�|V-��O<���D[s�R���ۍ���`�wL9}&y���Qr�rÕ+��G��w�32<��ln��A«o���#�^��5J͎�2��Q�Q�g0�^���_<��3��}�����tumu6a��=U֓��N���`��?�����4�>���|�Ȣ��<Ho�)],6v���O���z!�
G���1mx,�=����~�㟛�ҟ��#�9�{����c������=��ܯ�V�M7�ȷf=�ܣx&���^��;�{�ܯ�=�[�^��֫����:tK�{�sV͍�����}H��ھ{�7��=C��0.ô�*�D"����&�{�8yb���wi�h\�4O�68<��k��PJ�v���]Mwe��ު.�Lb��17�V�8�������Vn��w�%�|��#;v�cͤg�)��+�*�z<���۹O,%��-����+U���bj�ϩLB�!��t�o'Z�[Z���,~OKSC��}���YҾxy1=�g�����l"*�g�^���O?}�m�[�e���m/���.ݮA��O��,�E�~�E�OqX�a�.8A9�a�T�$�8��P�uJ�Y�g��������R+
	��qǖ�f1ԴF�6ckⴾ��J�aE�_s72<z�,t�֭��G�J9h���6�����c��N�# Jeu˥�)ή��ޢ�f�kF��b����3fq~��{Zmn�<b]Ӓco^��/�0�X\��@"s]pV�Fut^O���fm�q����ou�t�M�n2��Ö�7|��5A�+�3����%�>�v.�$+�ץx���%	�^.\h�H+]�x�n���5U���}l����/�������߷}yң�ᱭ/5ZZ/�B�w�k]M�#i�1q�slM��NXG�+��l0J��I'�ۛ��8��
�8YҞ���bD����Iv\У�-���G�ѣ�������M>�SK��%��[��Z暶��L�3�A�y���1�S*i�����w�ڵ�@  ݣXl�ZW`��e���7>N�}�֭���>`*�5�z�?�3�g�g�)�S�݊=�q{o5�r���C�&��t��&7;d����/ �֮4������/����h��V�YͿ�P��^�����$��Ͻ�����_zb&-s%.�N/W!�F����kSs�Z��ʖ��e���l�O���5wJGzzsV�g�w����ڼvX3P��sc�@�q��9�p4��������勧��DC��TyJ��F����1q���9�4s��3>V�{O����?q@�%�J� �S�$���v�P�F5��w�48t�3����,^zG47�l�1"�.HK��Tw�2<��6����;���I*:�����SM�n�6q�C4��A%i�\W�ô�h8��hw��1'Ҋ�֩�@�Z����k��Ld�N�t�6�����N��7�
	{����$Dn�e��Ą�/�J�"
�o�O�xkD�R	0wUh܄�R�DT@*�@��^��`@�pAb��c�̞=
%��w��Nqٝ���h��=9��i�E�p�<$�@͖�����Z�a��j�Ԍ�а�ox:��|�/��Gߣ; p�F��iAL<�\�hU��/�+��tlD������n����sZ�CO�R:�!Q��B��D�F���":���k2��TW���e�HODS'$�HA�H(_4}^C�B�BYieA����9��<$ʂ0�=$����靓D� �^V=��K� ��+ãc�7]�Y
#����s{9��{�j���j���/����`*��BG�R_]kݸ�A#Q-���V)��eԕ8GA�P��w@��xj����Q��$萣0���f=4�����."����,܃De�1/*C<�@�Q��<tn�ARQL�+uz��*Y ���+P��j8����6����UoT�D��Y4J�Ad�.QZ�v$�z:Aj���G#z�N����O4��y������GbA����N���M�<u���nb �ׅ�:L!�*	������J���D��X�N�:q�/u�ҹY�S1E�E>TD��::�����!�͔t6����*��D�PtB��;*Ό���xtx|�l�*_�� 0#�G��F�ЈhV�j!�E�8�p�FC��^X��W@�/�e�s����z 5é��D��hj��g�1�P!(��qxq�/D���S�ČC��:�h�4�#�J�ʄ�"�^N*/-����F��?�!:���È��:,)�fF\v�"���B>0�g�����4 �r�>��(9_\<�ŧ���pj]�L���;�/̾x��A��(�)��_�+�Y�_�YI�T4iW�FiXZp��g�BY�K�?��t:���7��S|Q_e����wy��۟�ݛ�GS#t��iDՈ�DAK�����J&I
F4J�kpD�z@$G�����Kg3��g�Q��Qմ��P�C���N�xd!�:��$�/fjI蘸�)�V�H
O��ϕ��B*�.�h^(;�*������w�ՏZ�b+87���=B�ʁ��j�{Ѹ�	��="�D�c�[�xhv08�"v^�˽qh���w�����z��#ߺ皿���_F�i�g?�ѷ�{�u�����Q�θ�L�>y��g���NOm$�u�;� KmF��b(��ѰW�IKk]�,^�Ć�>h������h�,�)5�־��`�3���ssɉ\�����FS6����0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #�0� #��A#�� �GH��c�    IEND�B`�
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)
