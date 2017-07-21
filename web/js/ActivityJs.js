/**
 * Created by d on 2017/7/13.
 */
$(document).ready(function () {

    $("#previousPage").click(function () {

        var tt="<div class='row'>";
        var pCount=$("#pageCount").text()
        var pNo= $('#pageNo').text();
        if(pNo>1){pNo=pNo-1;}

        $.ajax({
            url: "ActivityinformationList.action",
            type: "POST",
            data: {'pageNo':pNo,'activityType':$("#activityType option:selected").val(),'activityState':$("#activityState option:selected").val()},
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
            data: {'pageNo':pNo,'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val()},
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
    $.ajax({
        url: "ActivityinformationList.action",
        type: "POST",
        data: {'activityType':$("#activityType ").find("option:selected").val(),'activityState':$("#activityState ").find("option:selected").val()},
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
}
