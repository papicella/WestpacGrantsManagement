insert into westpacgrant
(grantid,
 grantname,
 grantdescription,
 providerid,
 providername,
 recipientid,
 recipientname,
 dateopened,
 dateappclosed,
 dateawarded,
 grantvalue,
 grantawarded,
 paymenttype,
 numberofpayments)
VALUES
('1',
 'Wheat exploration',
 'Developing drought resistant wheat strains',
 145,
 'Aust Wheat Board',
 245,
 'Wheat Farmers Inc',
 '2012-12-10',
 '2013-01-31',
 '2013-02-25',
 500000,
 'TRUE',
 'Single',
 1);

 insert into westpacgrant
(grantid,
 grantname,
 grantdescription,
 providerid,
 providername,
 recipientid,
 recipientname,
 dateopened,
 dateappclosed,
 dateawarded,
 grantvalue,
 grantawarded,
 paymenttype,
 numberofpayments)
VALUES
('2',
 'Water reclamation',
 'Reclaiming greay water',
 452,
 'Sydney Water',
 412,
 'Hydrolast Pty Ltd',
 '2013-01-05',
 '2013-01-31',
 '2013-03-31',
 '150000',
 'TRUE',
 'Multiple',
 3);

insert into grantpayment
(grantpaymentid,
 grantid,
 paymentnumber,
 paymentamount,
 duedate,
 datepaid,
 criteriarequired,
 criteriamet)
VALUES
('1',
 1,
 1,
 500000,
 '2013-03-31',
 '2013-03-31',
 'FALSE',
 'TRUE');

insert into grantpayment
(grantpaymentid,
 grantid,
 paymentnumber,
 paymentamount,
 duedate,
 datepaid,
 criteriarequired,
 criteriamet)
VALUES
('2',
 2,
 1,
 60000,
 '2013-04-30',
 '2013-04-30',
 'FALSE',
 'TRUE');

insert into grantpayment
(grantpaymentid,
 grantid,
 paymentnumber,
 paymentamount,
 duedate,
 datepaid,
 criteriarequired,
 criteriamet)
VALUES
('3',
 2,
 2,
 '50000',
 '2013-07-31',
 '2013-07-31',
 'TRUE',
 'TRUE');

insert into grantpayment
(grantpaymentid,
 grantid,
 paymentnumber,
 paymentamount,
 duedate,
 datepaid,
 criteriarequired,
 criteriamet)
VALUES
('4',
 2,
 3,
 '40000',
 '2013-10-31',
 NULL,
 'TRUE',
 'FALSE');