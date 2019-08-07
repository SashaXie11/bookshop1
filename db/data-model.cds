namespace my.bookshop;

type User : String(111);
entity Books {
  key ID : Integer;
  title  : String;
  author : Association to Authors;
  stock  : Integer;
  createdAt  : DateTime @cds.on.insert: #now;
  createdBy  : User @cds.on.insert: #user;
  modifiedBy : User @cds.on.update: #user;
  modifiedAt : DateTime @cds.on.update: #now;
  projectId : Integer;
}

entity Authors {
  key ID : Integer;
  name   : String;
  books  : Association to many Books on books.author = $self;
}

entity Orders {
  key ID : UUID;
  book   : Association to Books;
  buyer  : String;
  date   : DateTime;
  amount : Integer;
}
