<div class="container">
	<div class="row">
		
		<!-- To display the side bar -->
		<div class="col-md-3">
			<%@include file="./shared/Sidebar.jsp"%>
		</div>
		
		<!-- To display all products -->
		<div class="col-md-9">
		
			<div class="row">
			
				<div class="col-lg-12">
					
					<c:if test="${userClickAllProducts == true}">
						
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>	&nbsp;
							<li class="active">All products</li>
						</ol>
						
					</c:if>
					
					
					<c:if test="${userClickCategoryProducts == true}">
						
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>	&nbsp;
							<li class="active">Category</li>	&nbsp;
							<li class="active">${category.name}</li>	&nbsp;
						</ol>
						
					</c:if>
					
				</div>
				
			</div>
			
		</div>
		
	</div>
</div>