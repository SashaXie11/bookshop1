using my.bookshop from '../db/data-model';
using API_ENTERPRISE_PROJECT_SRV as ep from '../srv/external/csn/EnterpriseProjectCreateReadUpdateDelete';
service CatalogService {
  entity Books as projection on bookshop.Books;
  entity Authors as projection on bookshop.Authors;
  entity Orders as projection on bookshop.Orders;
  
  entity Projects as projection on ep.A_EnterpriseProjectType
	   excluding {to_EnterpriseProjectElement, to_EnterpriseProjectJVA};

  function GetProject(BookID:Integer) returns Projects;
  
  action updateStock ( Id:Integer );
}
