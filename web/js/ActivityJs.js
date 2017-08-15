/**
 * Created by d on 2017/7/13.
 */
$(document).ready(function () {
    MessageContent();
    setInterval(function() {
        $("#MessageContent").load(MessageContent());
    }, 5000);

    $("#previousPage").click(function () {

        var tt="<div class='row'>";
        var pCount=$("#pageCount").text()
        var pNo= $('#pageNo').text();
        if(pNo>1){pNo=pNo-1;}

        $.ajax({
            url: "ActivityinformationList.action",
            type: "POST",
            data: {'pageNo':pNo,'activityType':$("#activityType option:selected").val(),'activityState':$("#activityState option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val(),'activityPeopleId':$("#studentid").text()},
            dataType: "json",
            success: function (data) {
                $("#pageCount").text(data.page);
                $("#pageNo").text(data.pageNo);
                if(data.pageNo==1) document.getElementById("previousPage").style.visibility="hidden";
                if(data.pageNo<pCount) document.getElementById("nextPage").style.visibility="visible";
                $("#activityList").html("");
                if(data.activityInformations.size==0){
                    $("#activityList").html("抱歉，暂时没有此类活动");
                }
                $.each(data.activityInformations,function(i,value){
                    var imgSrc="images/400X200.gif";
                    if(value.activityKind==("运动")){
                        imgSrc="images/yundong.jpg";
                    }

                    tt=tt+"<div class='col-lg-4 col-md-4 col-sm-6 col-xs-6'>"
                        +  " <div class='thumbnail'> <img src='"+imgSrc+"' alt='Thumbnail Image 1' class='img-responsive'>"
                        +"  <div class='caption'>"
                        +" <h3>"+value.activityName+"</h3>"
                        + "<p>"+value.activityContent+"</p>"
                        +" <hr>"
                        +" <p class='text-center'><a href='Activity.action?activityId="+ value.activityId+"' class='btn btn-success'role='button'>加入我们</a></p>"
                        +"</div>"
                        +"</div>"
                        +"</div>";
                    /*                    $("#content").append("<tr>"
                     +"<td>"+value.activityId+"</td>"
                     /!*   +"<td>"+value.activityName+"</td>"
                     +"<td>"+value.activityFristDate+"</td>"*!/
                     + "<td>"+value.activityContent+"</td></tr>");*/

                });
                tt=tt+"</div>";
                $("#activityList").append(tt);
            }
        });
    });
    $("#nextPage").click(function () {
        var tt="<div class='row'>";
        var pNo= parseInt($('#pageNo').text());
        var pCount=$("#pageCount").text()
        if(pNo<pCount){ pNo=pNo+1;}
     /*   alert($("#activityType").find("option:selected").text());*/
        $.ajax({
            url: "ActivityinformationList.action",
            type: "POST",
            data: {'pageNo':pNo,'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val(),'activityPeopleId':$("#studentid").text()},
            dataType: "json",
            success: function (data) {
                $("#pageCount").text(data.page);
                $("#pageNo").text(data.pageNo);
                if(data.pageNo>1) document.getElementById("previousPage").style.visibility="visible";
                if(data.pageNo==pCount) document.getElementById("nextPage").style.visibility="hidden";
                $("#activityList").html("");
                if(data.activityInformations.size==0){
                    $("#activityList").html("抱歉，暂时没有此类活动");
                }
                $.each(data.activityInformations,function(i,value){
                    var imgSrc="images/400X200.gif";
                    if(value.activityKind==("运动")){
                        imgSrc="images/yundong.jpg";
                    }

                    tt=tt+"<div class='col-lg-4 col-md-4 col-sm-6 col-xs-6'>"
                        +  " <div class='thumbnail'> <img src='"+imgSrc+"' alt='Thumbnail Image 1' class='img-responsive'>"
                        +"  <div class='caption'>"
                        +" <h3>"+value.activityName+"</h3>"
                        + "<p>"+value.activityContent+"</p>"
                        +" <hr>"
                        +" <p class='text-center'><a href='Activity.action?activityId="+ value.activityId+"' class='btn btn-success'role='button'>加入我们</a></p>"
                        +"</div>"
                        +"</div>"
                        +"</div>";
/*                    $("#content").append("<tr>"
                        +"<td>"+value.activityId+"</td>"
                        /!*   +"<td>"+value.activityName+"</td>"
                         +"<td>"+value.activityFristDate+"</td>"*!/
                        + "<td>"+value.activityContent+"</td></tr>");*/

                });
                tt=tt+"</div>";
                $("#activityList").append(tt);
            }
        });
    });
    chaxun();

});
function chaxun(){
    var btn="加入我们";
    $.ajax({
        url: "ActivityinformationList.action",
        type: "POST",
        data: {'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val(),'activityRelation':$("#activityRelation ").find("option:selected").val(),'activityPeopleId':$("#studentid").text()},
        dataType: "json",
        success: function (data) {
               if(data.page>data.pageNo)　document.getElementById("nextPage").style.visibility="visible";
            $("#pageCount").text(data.page);
            $("#pageNo").text(data.pageNo);
            $("#activityList").html("");
            if(data.activityInformations.size==0){
                $("#activityList").html("抱歉，暂时没有此类活动");
            }
            var tt="<div class='row'>";
            $.each(data.activityInformations,function(i,value){
                var imgSrc="images/400X200.gif";
                if(value.activityKind=="运动"){
                    imgSrc="images/yundong.jpg";
                }
                else if(value.activityKind=="烧烤"){
                    imgSrc="images/shaokao.jpg";
                }
                else if(value.activityKind=="野营"){
                    imgSrc="images/yeying.jpg";
                }
                else if(value.activityKind=="聚会"){
                    imgSrc="images/juhui.jpg";
                }
                else if(value.activityKind=="其他"){
                    imgSrc="images/qita.jpg";
                }
               if(value.activityState=="已经结束"){

                    btn="已结束";
               }
                tt=tt+"<div class='col-lg-4 col-md-4 col-sm-6 col-xs-6'>"
                    +  " <div class='thumbnail'> <img src='"+imgSrc+"' alt='Thumbnail Image 1' class='img-responsive'>"
                    +"  <div class='caption'>"
                    +" <h3>"+value.activityName+"</h3>"
                    + "<p>"+value.activityContent+"</p>"
                    +" <hr>"
                    +" <p class='text-center'><a href='Activity.action?activityId="+ value.activityId+"' class='btn btn-success'role='button'>"+btn+"</a></p>"
                    +"</div>"
                    +"</div>"
                    +"</div>";
                /*                    $("#content").append("<tr>"
                 +"<td>"+value.activityId+"</td>"
                 /!*   +"<td>"+value.activityName+"</td>"
                 +"<td>"+value.activityFristDate+"</td>"*!/
                 + "<td>"+value.activityContent+"</td></tr>");*/

            });
            tt=tt+"</div>";
            $("#activityList").append(tt);
        }
    });
}
function MessageContent(){
    $.ajax({
        url:"MessageMessageContentAction.action",
        type:"post",
        data:"",
        dateType:"json",
        success:function (data) {
            $("#MessageContent").text(data.messageContent);
        }
    });

}
function  Message(){
    $("#myModal2").modal();
    MessageContentNoRead();
}
function MessageContentNoRead() {
    $.ajax({
        url:"MessageQueryMessage.action",
        type:"post",
        data:"",
        dateType:"json",
        success:function (data) {
            var c="";
            $.each(data.messageInformationList,function(i,value){
                c="<div>发送人:"+value.messageSendId+"</div><div>内容:"+value.messageContent+"</div><div>发送时间:"+value.messageTime+"</div><button onclick='read("+value.messageId+")' >已读</button><br>"+c;
            });
            $("#messageList").html(c);
        }
    });
}
function read(id) {
    $.ajax({
        url: "MessageModifyMessageState.action",
        type: "post",
        data: {'messageId':id},
        dateType: "json",
        success: function (data) {
            MessageContentNoRead();
            MessageContent();
        }
    });
}
function exitSystem(){

}