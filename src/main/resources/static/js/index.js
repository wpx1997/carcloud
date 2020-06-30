$(document).ready(function() {
//绑定元素点击事件
    $(".menuList ul li").click(function() {
        //判断对象是显示还是隐藏
        if($(this).children(".liMenu").is(":hidden")){
            //表示隐藏
            if(!$(this).children(".liMenu").is(":animated")) {
                $(this).children(".option").css({'transform':'rotate(360deg)'});
                //如果当前没有进行动画，则添加新动画
                $(this).children(".liMenu").animate({
                    height: 'show'
                }, 1000)
            }
        } else {
            //表示显示
            if(!$(this).children(".liMenu").is(":animated")) {
                $(this).children(".option").css({'transform':'rotate(270deg)'});
                $(this).children(".liMenu").animate({
                    height: 'hide'
                }, 1000)
            }
        }
    });

//阻止事件冒泡，子元素不再继承父元素的点击事件
    $('.liMenu').click(function(e){
        e.stopPropagation();
    });

    $(".menuList ul li .liMenu .pMenu").click(function () {
        //表示隐藏
        if ($(this).next().is(":hidden")){
            $(this).siblings(".aLiMenu").animate({
                height: 'hide'
            },1000)
            $(this).next().animate({
                height: 'show'
            }, 1000)
        }
        //表示显示
        else {
            $(this).next().animate({
                height: 'hide'
            }, 1000)
        }
    });

});