
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>

struct Item{
	 char* id;
	 char* name;
	 int cost;
};

int comparator(const void* p,const void* q)
{
	 return strcmp(((struct Item*)p)->name,((struct Item*)q)->name);
}


int main(void)
{
	int i=0,n=5;

	struct Item arr[n];
	arr[0].id="1";
	arr[0].name="bd";
	arr[0].cost=100;

	arr[1].id="2";
	arr[1].name="ba";
	arr[1].cost=110;

	arr[2].id="3";
	arr[2].name="aaz";
	arr[2].cost=120;

	arr[3].id="4";
	arr[3].name="az";
	arr[3].cost=130;
	
	arr[4].id="5";
	arr[4].name="bc";
	arr[4].cost=140;

	qsort(arr,n,sizeof(struct Item),comparator);

	printf("\n\n Item records sorted by Name:\n");
	for(i=0;i<n;i++){
	  printf("Id=%s,Name=%s,Cost=%d\n",arr[i].id,arr[i].name,arr[i].cost);
	}

	return 0;


}