/**
 * Created by d on 2017/7/20.
 */
$(document).ready(function () {
chaxun();
    toastr.options = {
        "closeButton": false,
        "debug": false,
        "positionClass": "toast-top-left",
        "onclick": null,
        "showDuration": "300",
        "hideDuration": "1000",
        "timeOut": "2000",
        "extendedTimeOut": "1000",
        "showEasing": "swing",
        "hideEasing": "linear",
        "showMethod": "fadeIn",
        "hideMethod": "fadeOut"
    }
});
function chaxun() {
    var h=$("#iiid").text();
    var tt="";
   $.ajax({
        url: "Activityremark.action",
        type: "POST",
        data: {"activityId":h},
        dataType: "json",
        success: function (data) {
              if(data.remarkinformationList.length>0) {
                  $("#remark").html("");
                  $.each(data.remarkinformationList, function (i, value) {

                      tt = "    <div class='well'>"
                          + " <div class='row'> <span> " + value.studentId + "</span>:<span>" + value.remarkContent + "</span> </div>"
                          + "<p class='text-right'>" + value.remarkTime + "</p>"
                          + "</div>" + tt;

                  });
                  $("#remark").html(tt);
              }
        }

    });
}
function remark(){

    var content=$("#remarkContent").val();
    if(content.length>10){
    $("#remarkContent").val("");
    var remarkpeople=$("#username").text();
    var activityId=$("#iiid").text();
    $.ajax({
        url: "ActivityremarkSave.action",
        type: "POST",
        data: {"activityId": activityId, "remarkContent": content, "remarkPeople": remarkpeople},
        dataType: "json",
        success: function (data) {
            toastr["success"]("你的评论成功了!","恭喜你");
            chaxun();
        }
    });
    }
    else toastr["error"]("评论失败，您的评论字数少于10个!","错误");
}
function zishu(){
    var a=50-$("#remarkContent").val().length;
    $("#zishu").html(a);
}