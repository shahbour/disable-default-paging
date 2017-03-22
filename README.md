# disable-default-paging

The idea of this project is to show how to disable default paging by not sending page parameter .

If we don't send page parameter we will receive a List and all projection do work to customize the result

if we want really a page we can send page=0 or page=1 then the result will be Page<T>
