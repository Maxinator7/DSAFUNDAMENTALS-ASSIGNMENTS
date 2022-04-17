package feb2022dsafundamentals;



public class BST {
	
	public class TreeNode{   // Necessary class for Node Building
		
		int data;    // variablesDeclerations
		
		TreeNode left;
		TreeNode Right;
		
		TreeNode(int data){  // TreeNode method for assigning variables 
			this.data=data;
			
			this.left=this.Right=null;
		}
	}
	
TreeNode root; 
    BST(){      // class constructor to make root null by default
	
	root=null;
}

// Tree creation is done to this point 

public TreeNode insert (TreeNode root, int datatoinsert) {  // insertion in BST
	
	if(root==null) {  
		
		root= new TreeNode(datatoinsert);  // instanciating of tree node class
		return root;// returning value of root to console 
	}
	if(root.data>datatoinsert) {               
		root.left=insert(root.left,datatoinsert);  //calling insert method/function for inserting data at that Node
 				return root;
	}   
	else if (root.data<datatoinsert) {
		root.Right=insert(root.Right,datatoinsert);  //calling insert method/function for inserting data at that Node
		return root;
	}
	
	
	return root;
	
	
}


public TreeNode search (TreeNode root, int datatosearch) {
	
	if (root==null|| root.data == datatosearch) {
		return root;
	}
	if (root.data>datatosearch) {
		root.left=search(root.left,datatosearch);
		return root;
	}
	
	else if (root.data < datatosearch){
		root.Right=search(root.Right,datatosearch);
		return root;
	}
	
	System.out.println("Element not Present ");
	return root;
}


public void inorder(TreeNode root) {

	if (root==null) {
		return;
	}
	else {
	inorder(root.left);
	System.out.print(root.data+ " ");
	inorder(root.Right);
	}
	
}
public void preorder(TreeNode root) {
	
	
	if (root==null) {
		return ;
	}
	else {
	System.out.print(root.data+ " ");
	preorder(root.left);
	
	preorder(root.Right);
	}
	

} 

public void postorder(TreeNode root) {
	System.out.println("Post Order :");
	if (root==null) {
		return;
	
	}
	else {
	preorder(root.left);
	
	preorder(root.Right);
	System.out.print(root.data+ " ");
	
	}

}

// Wrapper clases for better Nomenclature 

public void Insert(int datatoinsert) {
	
	root = insert(root,datatoinsert);
}

public TreeNode SearchNode(int datasearch) {
	
	return search(root,datasearch);
}

public void INORDER() {
	inorder(root);
}

public void POSTORDER() {
	postorder(root);
}

public void PREORDER() {
	preorder(root);
}



}
