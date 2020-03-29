package com.fawda.xpath;

public class RootNodeTest {
    public static void main(String[] args) {
        System.err.println("=========== 打印结果 ===========");
        TreeNodeElement parentNode = OperateElementFactory.getInstance().createNodeHandler();
        if (parentNode != null) {
            parentNode.show();

            System.err.println("=========== 分割线 =============");

            // 移除节点：
            RootNode nodeElement = parentNode.getNode(0);
            parentNode.removeNode(nodeElement);
            parentNode.show();
        }
    }
}