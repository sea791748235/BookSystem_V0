// Bootstrap 公共JS+CSS引用

<!-- 3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
// document.write('<meta charset="utf-8">');
// document.write('<meta http-equiv="X-UA-Compatible" content="IE=edge">');
// document.write('<meta name="viewport" content="width=device-width, initial-scale=1">');
// ===========CSS
<!-- Bootstrap -->
document.write('<link href="../../css/bootstrap-3.3.7.min.css" rel="stylesheet" type="text/css">');
<!--Bootstrap Table-->
document.write('<link href="../../css/bootstrap-table-1.12.1.min.css" rel="stylesheet" type="text/css">');

// ===========JS

// <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
// <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
//     <!--[if lt IE 9]>
// <!--<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>-->
//     <!--<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>-->
//     <![endif]-->

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
document.write('<script src="../../js/jquery-3.3.1.min.js" type="text/javascript"></script>');
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
document.write('<script src="../../js/bootstrap-3.3.7.min.js" type="text/javascript></script>');
// BootsTrap Table js
document.write('<script src="../../js/bootstrap-table-1.12.1.min.js" type="text/javascript></script>');
// BootsTrap Table 中文化
document.write('<script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>');