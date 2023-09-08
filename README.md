## Online Documentation With HTTP Request Method

https://documenter.getpostman.com/view/10894444/2s9YBz3ay1

# Project: News API Test

Ini adalah API yang dibuat untuk portal berita.  
Fitur API ini dapat membuat berita berdasarkan rolenya masing-masing.

Beberapa teknologi yang digunakan dalam project kali ini:

- Spring Boot
- Spring Security
- Jpa Repository
- Restricted endpoints
- JSON Web Token
- Exceptions handling
- Custom Error Response

# 📁 Collection: Roles

## End-point: Add Role

Endpoint ini bertujuan untuk menambahkan role yang hanya bisa dilakukan oleh Admin.

### Method: POST

> ```
> localhost:8080/api/v1/admin/roles/create
> ```

### Body (**raw**)

```json
{
  "roleName": "Sponsor"
}
```

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---- |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo |

| string |

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

> ```
> localhost:8080/api/v1/admin/roles
> ```

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---- |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo |

| string |

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

> ```
> localhost:8080/api/v1/user/register
> ```

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

| Param | value        |
| ----- | ------------ |
| role  | ROLE_CREATOR |
| role  | ROLE_ADMIN   |

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

> ```
> localhost:8080/api/v1/user/login
> ```

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
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo
"
}
```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Reset Password

Endpoint ini bertujuan untuk mereset password.

### Method: POST

> ```
> localhost:8080/api/v1/user/reset
> ```

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

> ```
> localhost:8080/api/v1/user
> ```

### 🔑 Authentication bearer

| Param  | value                                                                                                                                                                                       | Type |
| ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---- |
| token  | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo |
| string |

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

> ```
> localhost:8080/api/v1/articles/create
> ```

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

| Param | value                                                                                                                                                                                       | Type   |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo | string |

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

> ```
> localhost:8080/api/v1/articles
> ```

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

> ```
> localhost:8080/api/v1/articles/latest
> ```

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

> ```
> localhost:8080/api/v1/admin/articles/publish?id=e2cc2c5c-d162-4b3e-a978-faec73ee2b1f
> ```

### Query Params

| Param | value                                |
| ----- | ------------------------------------ |
| id    | e2cc2c5c-d162-4b3e-a978-faec73ee2b1f |

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type   |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo | string |

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

> ```
> localhost:8080/api/v1/articles/e2cc2c5c-d162-4b3e-a978-faec73ee2b1f
> ```

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

> ```
> localhost:8080/api/v1/categories/create
> ```

### Body (**raw**)

```json
{
  "category": "Politik"
}
```

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type   |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo | string |

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

> ```
> localhost:8080/api/v1/categories
> ```

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type   |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo | string |

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

> ```
> localhost:8080/api/v1/comments
> ```

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

> ```
> localhost:8080/api/v1/comments
> ```

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

> ```
> localhost:8080/api/v1/admin/files/article?articleId=ef501d6f-8b47-4bbb-b195-841f53de5216
> ```

### Body formdata

| Param | value                                        | Type |
| ----- | -------------------------------------------- | ---- |
| file  | /Users/septyanwidianto/Pictures/Picture1.png | file |

### Query Params

| Param     | value                                |
| --------- | ------------------------------------ |
| articleId | ef501d6f-8b47-4bbb-b195-841f53de5216 |

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type   |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo | string |

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

> ```
> localhost:8080/api/v1/admin/files/image/a6bfb78e-ee70-42ba-b389-cb4faa418c32
> ```

### Query Params

| Param   | value                                |
| ------- | ------------------------------------ |
| imageId | a6bfb78e-ee70-42ba-b389-cb4faa418c32 |

### 🔑 Authentication bearer

| Param | value                                                                                                                                                                                       | Type   |
| ----- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------ |
| token | eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJc3N1ZXIiLCJVc2VybmFtZSI6IkphdmFJblVzZSIsImV4cCI6MTY5NDE0MDkzOCwiaWF0IjoxNjk0MTQwOTM4fQ.q-Lbz3zU-a6cb28Ok5DrjaSyM_TGcvgNYgvutBWgfdo | string |

```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

```
