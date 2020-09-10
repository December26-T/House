<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/9
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的租房网</title>
    <style>
        table{
            width:990px;
            margin: 20px auto;

        }
        td{
            border: solid 1px black;
        }
        .content>table:nth-of-type(1){
            background: aqua;
        }
        article>table{
            background: darkorchid;
        }
        header table{
            background: deeppink;
        }
        body{
            background: azure;
        }

    </style>
</head>
<body>

    <header>
        <form   action="" method="post">
            <table >

                <tr>
                    <td>
                        <input type="button" value="发布信息" >
                        <input type="button" value="退出系统" >
                    </td>
                    <td>
                        用户名:<input type="text" name="username">
                        密码: <input type="pssword" name="password">
                        <input type="submit" value="登录">
                    </td>
                </tr>
            </table>
        </form>
    </header>
    <article>
        <table >
            <tr>
                <td>
                    标题: <input type="text">
                </td>
                <td>
                    价格: <select>
                            <option value="0" selected>请选择</option>
                            <option value="1">1500元-3000元</option>
                            <option value="2">3000元-6000元</option>
                            <option value="3">6000元-20000元</option>
                            <option value="4">20000以上</option>
                          </select>
                </td>
                <td>
                    房屋面积: <select>
                                 <option value="0" selected>请选择</option>
                                 <option value="1">30平米-70平米</option>
                                 <option value="2">100平米-200平米</option>
                                 <option value="3">200平米-800平米</option>
                              </select>
                </td>
            </tr>
            <tr>
                <td>
                    房屋位置: <select >
                                <option value="0" selected >请选择</option>
                                <option value="1">海淀区</option>
                                <option value="2">昌平区</option>
                                <option value="3">朝阳区</option>
                                <option value="4">景山区</option>
                                <option value="5">东城区</option>
                                <option value="6">西城区</option>
                              </select>
                              <select >
                                  <option value="0">请选择</option>
                              </select>
                </td>
                <td>
                    房屋类型: <select name="" id="">
                                <option value="0" selected>请选择</option>
                                <option value="1">一室一厅</option>
                                <option value="2">两室一厅</option>
                                <option value="3">三室一厅</option>
                                <option value="4">海边花园大别墅</option>
                             </select>
                </td>
                <td>
                    <input type="button" value="搜索房屋">
                    <input type="reset" value="清空条件">
                </td>
            </tr>
        </table>
    </article>
    <div class="content">
        <table >
            <tr>
                <td>编号</td>
                <td>图片</td>
                <td>标题</td>
                <td>房屋位置</td>
                <td>面积</td>
                <td>联系方式</td>
                <td>价格</td>
                <td>房屋类型</td>
                <td>操作</td>
            </tr>
            <tr>
                <td colspan="9">
                    <a href="">首页</a>
                    <a href="">下一页</a>
                    <a href="">尾页</a>
                    第 <lable></lable> / <lable></lable> 页
                    共 <lable></lable>条记录 跳 <input type="text">页
                    <input type="button" value="go">
                </td>

            </tr>
        </table>
    </div>
</body>
</html>
