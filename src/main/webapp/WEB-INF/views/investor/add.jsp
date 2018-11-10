<%--
  Created by IntelliJ IDEA.
  User: LOVE
  Date: 2018/11/7
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>资方开户</title>
    <meta name="renderer" content="webkit"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport"
          content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no"/>
    <link rel="stylesheet" type="text/css" href="../layui/css/layui.css" media="all"/>
    <script src="../js/jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>
    <style type="text/css">
        .td {
            border: #000000 1px solid;
        }
    </style>
</head>
<body>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>资方开户</legend>
</fieldset>
<div class="layui-form">
    <div id="" class="layui-btn layui-btn-xs">
        基本信息
    </div>
    <table border="" cellspacing="" cellpadding="" class="layui-table">
        <!-- <colgroup>
            <col width="93px">
            <col width="">
            <col width="93px">
            <col width="">
            <col width="93px">
            <col width="">
        </colgroup> -->


        <thead>
        <tr>
            <td>
                <em style="color: red;">*</em>资方编码
            </td>
            <td>
                <input type="text" autocomplete="off" placeholder="请输入编码" class="layui-input" id="investorId"
                       name="investorId"/>
            </td>
            <td>
                <em style="color: red;">*</em>资方名称
            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" id="investorName" name="investorName"/>
            </td>
            <td>
                <em style="color: red;">*</em>资方简称
            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" id="investorShortName"
                       name="investorShortName"/>
            </td>
        </tr>
        <tr>
            <td>
                <em style="color: red;">*</em>类型
            </td>
            <td>
                <!-- <div class="layui-input-block"> -->
                <select id="type" name="type" lay-filter="leixing">
                    <option value="" class="layui-select" selected="">请选择类型</option>
                    <option value="银行">银行</option>
                    <option value="金融机构">金融机构</option>
                    <option value="第三方">第三方</option>
                </select>
                <!-- </div> -->
            </td>
            <td>
                <em style="color: red;">*</em>证件类型
            </td>
            <td>
                <select name="DocumentType" id="DocumentType" lay-filter="zhengjianleixing">
                    <option value="" class="layui-select" selected="">请选择</option>
                    <option value="营业执照">营业执照</option>
                    <option value="税务登记证">税务登记证</option>
                    <option value="组织机构代码证">组织机构代码证</option>
                </select>
            </td>
            <td>
                <em style="color: red;">*</em>证件号码
            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" name="idNumber" id="idNumber"/>
            </td>
        </tr>
        <tr>
            <td>
                <em style="color: red;">*</em>营业起始日
            </td>
            <td>
                <input type="text" class="layui-input" id="openingDate" name="openingDate">
            </td>
            <td>
                <em style="color: red;">*</em>营业到期日
            </td>
            <td>
                <input type="text" class="layui-input" id="expirationDate" name="expirationDate">
            </td>
            <td>
                <em style="color: red;">*</em>合作开始日

            </td>
            <td>
                <input type="text" class="layui-input" id="startDate" name="startDate">
            </td>
        </tr>
        <tr>
            <td>
                <em style="color: red;">*</em>合作到期日
            </td>
            <td>
                <input type="text" class="layui-input" id="endDate" name="endDate">
            </td>
            <td>
                <em style="color: red;">*</em>电子邮件
            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" name="emaile" id="emaile"/>
            </td>
            <td>
                <em style="color: red;">*</em>资产资金(万美金)

            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" name="initialFunding" id="initialFunding"/>
            </td>
        </tr>
        <tr>
            <td>
                <em style="color: red;">*</em>法人
            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" name="legalPerson" id="legalPerson"/>
            </td>
            <td>
            </td>
            <td>
            </td>
            <td>

            </td>
            <td>
            </td>
        </tr>
        <tr>
            <td>
                <em style="color: red;">*</em>注册地址
            </td>
            <td>
                <input type="text" autocomplete="off" class="layui-input" name="registeredAddress"
                       id="registeredAddress"/>
            </td>
            <td colspan="4">
                <input type="text" autocomplete="off" placeholder="详细地址" class="layui-input"/>
            </td>
        </tr>
        </thead>

    </table>
    <div  class="layui-btn layui-btn-xs">
        联系人信息
    </div>
    <table class="layui-table">
        <thead>
        <tr>
            <th>姓名</th>
            <th>职位</th>
            <th>手机号码</th>
            <th>电子邮箱</th>
            <th>备注</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>

            <td><input type="text" autocomplete="off" class="layui-input" id="lmNmae"/></td>
            <td><input type="text" autocomplete="off" class="layui-input" id="lmPost"/></td>
            <td><input type="text" autocomplete="off" class="layui-input" id="lmPhone"/></td>
            <td><input type="text" autocomplete="off" class="layui-input" id="lmEmail"/></td>
            <td><input type="text" autocomplete="off" class="layui-input" id="lmRemake"/></td>
            <td>
                <button class="layui-btn layui-btn-primary layui-btn-radius ">删除</button>
            </td>
        </tr>
        </tbody>
    </table>
 <button class="layui-btn layui-btn-normal " style="margin-left: 90%;">新增一行</button>
    <div  class="layui-btn layui-btn-xs">
        管理员信息
    </div>
    <br/>
    <%--<label class="layui-form-label">手机号</label>--%>
    <%--<div class="layui-input-inline">--%>
        <%--<input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">--%>
        <%--姓名<input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">--%>
    <%--</div>--%>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input" id="admPhone">
            </div>
        </div>
        <div class="layui-inline layui-btn " style="background-color: #fbfbfb" >
            <%--<label class="layui-form-label"></label>--%>
            <%--<div class="layui-input-inline">--%>
                <%--<input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">--%>
            <%--</div>--%>
                <%--<img src="../layui/images/face/搜索.jpg" />--%>
                <img src="../layui/images/face/搜索2.jpg" style="width: 40px;" height="35px;" class="" id="adm1" />
                <%--<i class="layui-icon layui-icon-search"></i>--%>
                <%--<button class="layui-icon layui-icon-search" style="font-size: 30px;" id="adm" />--%>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-inline">
                <input type="text" name="email" style="color: #0C0C0C" autocomplete="off" disabled="disabled" class="layui-input " id="admName">
            </div>
        </div>
    </div>
    <br/>
    <input class="layui-btn layui-btn-warm" type="button" value="提交" id="btnSave" style="margin-left: 45%" />
</div>
<div style="height: 200px;"></div>
<script src="../layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
    layui.use(['form', 'laydate'], function () {
        var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
        var laydate = layui.laydate;
        //……

        //但是，如果你的HTML是动态生成的，自动渲染就会失效
        //因此你需要在相应的地方，执行下述方法来手动渲染，跟这类似的还有 element.init();
        // form.render();
        laydate.render({
            elem: '#openingDate', //指定元素
        });
        laydate.render({
            elem: '#expirationDate', //指定元素
        });
        laydate.render({
            elem: '#startDate', //指定元素
        });
        laydate.render({
            elem: '#endDate', //指定元素
        });

        $(function () {

            $("#btnSave").click(function () {
                    //添加基本信息
                    $.ajax({
                        type: "post",
                        url: "investor",
                        data: {
                            investorId: $("#investorId").val(),
                            investorName: $("#investorName").val(),
                            investorShortName: $("#investorShortName").val(),
                            type: $("#type").val(),
                            DocumentType: $("#DocumentType").val(),
                            idNumber: $("#idNumber").val(),
                            openingDate: $("#openingDate").val(),
                            expirationDate: $("#expirationDate").val(),
                            startDate: $("#startDate").val(),
                            endDate: $("#endDate").val(),
                            emaile: $("#emaile").val(),
                            initialFunding: $("#initialFunding").val(),
                            legalPerson: $("#legalPerson").val(),
                            registeredAddress: $("#registeredAddress").val()
                        },
                        success: function (data) {
                            if ("SUCCESS" == data) {
                                link();
                                return "menu.jsp";
                            }
                            if ("ERROR" == data) {

                                return "error.jsp";
                            }
                        }
                    });


                }
            );

            //添加联系人信息
            function link() {
                alert("link");
                alert($("#lmNmae").val());
                $.ajax({
                    type: "post",
                    url: "linkman",
                    data: {
                        investorId: $("#investorId").val(),
                        lmNmae: $("#lmNmae").val(),
                        lmPost: $("#lmPost").val(),
                        lmPhone: $("#lmPhone").val(),
                        lmEmail: $("#lmEmail").val(),
                        lmRemake: $("#lmRemake").val()
                    },
                    success: function (data) {
                        alert(data);
                    }
                });
            };
            $("#adm1").click(function(){
                $.ajax({
                  type : "get",
                  url : "adm",
                    data : {
                      admPhone : $("#admPhone").val()
                },
                success:function(data){
                      if("ERROR"!=data){
                          $("#admName").val(data);
                      }
                      else {
                          alert("跳转添加管理员页面");
                      }
                }
                });
            });
        });

    });
</script>
</body>
</html>