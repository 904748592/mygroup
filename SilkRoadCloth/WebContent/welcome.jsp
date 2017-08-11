<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body  class="nav-md" style="">
<div class="container body">
<%@ include file="head.jsp"%>
<%@ include file="top.jsp"%>
	<div class="main_container">
		<div class="page-title">
				<div class="title_left">
					<h3>Form Elements</h3>
				</div>
				<div class="title_right">
					<div
						class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
						<div class="input-group">
							<input type="text" class="form-control"placeholder="Search for..."> 
							<span class="input-group-btn">
								<button class="btn btn-default btn-search" type="button">Go!</button>
							</span>
						</div>
					</div>
				</div>
			</div>
        <div class="clearfix"></div>
		<div class="data" style="background:#ddd">
			<div class="data-control" style="background:#eee">
						
		
			</div>
			<table class="table">
			<thead class="thead">
				<tr class="tr_title">
					<td style="width:80px;">序号</td>
					<td style="width:120px;">名称</td>
					<td style="width:120px;">创建时间</td>
					<td style="width:120px;">状态</td>
				</tr>
			</thead>
				<tbody class="tbody">
					<tr class="tr_first">
						<td style="width:80px;">1</td>
						<td style="width:120px;">红布</td>
						<td style="width:120px;">2017-8-8</td>
						<td style="width:120px;">未发布</td>
					</tr>
					<tr class="tr_secd">
						<td style="width:80px;">2</td>
						<td style="width:120px;">蓝布</td>
						<td style="width:120px;">2017-8-7</td>
						<td style="width:120px;">已发布</td>
					</tr>
					<tr class="tr_first">
						<td style="width:80px;">1</td>
						<td style="width:120px;">红布</td>
						<td style="width:120px;">2017-8-8</td>
						<td style="width:120px;">未发布</td>
					</tr>
					<tr class="tr_secd">
						<td style="width:80px;">2</td>
						<td style="width:120px;">蓝布</td>
						<td style="width:120px;">2017-8-7</td>
						<td style="width:120px;">已发布</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div id="mask"></div>
		<!-- 弹窗 -->
		<div class="openBox" style="">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>Form Design <small>different form elements</small></h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">First Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="first-name" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">Last Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input type="text" id="last-name" name="last-name" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12">Middle Name / Initial</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="middle-name" class="form-control col-md-7 col-xs-12" type="text" name="middle-name">
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Gender</label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <div id="gender" class="btn-group" data-toggle="buttons">
                            <label class="btn btn-default" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" name="gender" value="male"> &nbsp; Male &nbsp;
                            </label>
                            <label class="btn btn-primary" data-toggle-class="btn-primary" data-toggle-passive-class="btn-default">
                              <input type="radio" name="gender" value="female"> Female
                            </label>
                          </div>
                        </div>
                      </div>
                      <div class="form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Date Of Birth <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                          <input id="birthday" class="date-picker form-control col-md-7 col-xs-12" required="required" type="text">
                        </div>
                      </div>
                      <div class="ln_solid"></div>
                      <div class="form-group">
                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                          <button class="btn btn-primary" type="button">Cancel</button>
						  <button class="btn btn-primary" type="reset">Reset</button>
                          <button type="submit" class="btn btn-success">Submit</button>
                        </div>
                      </div>

                    </form>
                  </div>
                </div>
              </div>
            </div>
	</div>
</div>
</body>
</html>