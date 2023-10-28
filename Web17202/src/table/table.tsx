import React, { useEffect, useState } from "react";
import { Button, Layout, Space, Table, Tag } from "antd";
import type { ColumnsType } from "antd/es/table";
import { Link } from "react-router-dom";
import { useGetProductsQuery } from "../service/product";
import { IProduct } from "../interface/product";

// interface IProduct {
//   key: string;
//   name: string;
//   age: number;
//   address: string;
//   tags: string[];
// }

const ProductList: React.FC = () => {
  const [product, setProduct] = useState<IProduct[]>([]);
  const {data:list,isLoading,error} =useGetProductsQuery()
  console.log("list",list)
 
    
    setProduct(list!.map((product:IProduct)=>({
      key: product.id,
      ...product,
    })))
 
  
  // useEffect(() => {
  //   (async () => {
  //     try {
  //       const response = await fetch("http://localhost:3000/products");
  //       const data = await response.json();
  //       setProduct(
  //         data.map((product: any) => ({
  //           key: product.id,
  //           ...product,
  //         }))
  //       );
  //     } catch (error) {
  //       console.log(error);
  //     }
  //   })();
  // }, []);
  
  const onHandelDelete = async(id: any) => {
    const response = await fetch("http://localhost:3000/products/"+id,{
      method:"DELETE",
      headers:{
        "Content-Type":"application/json"
      }
    });
    const data = await response.json();
    
    return data

  };
  const columns: ColumnsType<IProduct> = [
    {
      title: "Name",
      dataIndex: "name",
      key: "name",
      render: (text) => <a>{text}</a>,
    },
    {
      title: "Price",
      dataIndex: "price",
      key: "price",
    },
    {
      title: "Description",
      dataIndex: "description",
      key: "description",
    },
    {
      title: "Action",
      key: "action",
      render: (_, record) => (
        <Space size="middle">
          <Button
            type="primary"
            danger
            onClick={() => onHandelDelete(record.id)}
          >
            Delete
          </Button>
        </Space>
      ),
    },
  ];
  return (
    <Layout>
      <Space size="middle">
        <Button type="primary" danger>
          <Link to="/add">Add</Link>
        </Button>
      </Space>
      <Table columns={columns} dataSource={product} />
    </Layout>
  );
};

export default ProductList;
