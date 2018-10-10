$(function () {
    /**
     * 点击搜索图标出现加载器
     */
    $(document).on('click', '#search_button', function () {
        $('.swiper-container').show();
        var identity = $('#search').val();
        if (!identity || identity == '') {
            $.toast('身份证号不能为空');
            return;
        }
        /*$.showPreloader();
        setTimeout(function () {
            $.hidePreloader();
        }, 2000);*/
        var url = '/stewardess/findByIdentity/' + identity;
        //清除查询结果
        $('.list-block').html('');
        $.getJSON(url, function (data) {
            //获取后台传递过来的头条列表
            var code = data.code;
            var info = data.data;
            if (code == 100) {
                $('.swiper-container').hide();
                var re_html = '<div class="content-block-title">' + data.msg + '</div>\n' +
                    '            <ul>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">班级</div>\n' +
                    '                        <div class="item-after">' + info.grade + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">学号</div>\n' +
                    '                        <div class="item-after">' + info.number + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">姓名</div>\n' +
                    '                        <div class="item-after">' + info.name + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">身份证号码</div>\n' +
                    '                        <div class="item-after">' + info.identity + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">性别</div>\n' +
                    '                        <div class="item-after">' + info.sex + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">籍贯</div>\n' +
                    '                        <div class="item-after">' + info.province + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">宿舍号</div>\n' +
                    '                        <div class="item-after">' + info.sleep + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">床位号</div>\n' +
                    '                        <div class="item-after">' + info.bed + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '                <li class="item-content">\n' +
                    '                    <div class="item-inner">\n' +
                    '                        <div class="item-title">学院</div>\n' +
                    '                        <div class="item-after">' + info.academy + '</div>\n' +
                    '                    </div>\n' +
                    '                </li>\n' +
                    '            </ul>';
                $('.list-block').html(re_html);
            } else {
                $.toast(data.msg);
            }
        });

    });

    /**
     * 点击右上角图标出现关于信息
     */
    $('#me').click(function () {
        $.openPanel('#panel-left-demo');
    });
    $(".swiper-container").swiper({
        autoplay: 5000,
        //用户对轮播图进行操作时,是否自动停止autoplay
        autoplayDisableOnInteraction: false
    });
//        $(document).on('click','.open-about', function () {
//            $.popup('.popup-about');
//        });
//
//        $(document).on('click','.close-panel', function () {
//            $.closeModal('.popup-about');
//        });
})