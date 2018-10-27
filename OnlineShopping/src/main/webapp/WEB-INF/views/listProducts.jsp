<div class="container">
	<div class="row">
		<!-- Inserting Sidebar here -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>
		<!--  Listing all Products Here -->
		<div class="col-md-9">
			<div class="row">


				<div class="col-lg-12">

					<c:if test="${UserClickAllProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a>/</li>
							<li class="active">AllProducts/</li>
						</ol>
					</c:if>
					<c:if test="${UserClickCategoryProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a>/</li>
							<li class="active">Category/</li>
							<li class="active">${category.name}/</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>
</div>