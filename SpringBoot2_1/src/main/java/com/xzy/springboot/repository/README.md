数据操作层
=
* 数据操作层为一个实现了JpaRepository<>的接口其中的泛型位置内容如下
  * 第一个位置填写的是本接口所要操作的实体类
  * 第二个位置填写的是该实体类的主键的数据类型
* 如果发现JpaRepository接口不足以满足你的编码需求请使用如下方式进行数据库操作
  * @Query("from User u where u.name=:name")  User findUser(@Param("name") String name);
