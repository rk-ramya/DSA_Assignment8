package project.demo;

class Question4{
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
			this.left = this.right = null;
		}
	}
	static int start = 0;

	static Node buildTree(String s)
	{
		if (s.length() == 0 || s == null)
		{
			return null;
		}
		
		if (start >= s.length())
			return null;
		boolean neg = false;
		
		if (s.charAt(start) == '-')
		{
			neg = true;
			start++;
		}
		
		int num = 0;
		while (start < s.length() &&
			Character.isDigit(s.charAt(start)))
		{
			int digit = Character.getNumericValue(
				s.charAt(start));
			num = num * 10 + digit;
			start++;
		}
		
		if (neg)
			num = -num;
		Node node = new Node(num);
		
		if (start >= s.length())
		{
			return node;
		}
		if (start < s.length() && s.charAt(start) == '(' )
		{
			start++;
			node.left = buildTree(s);
		}
		
		if (start < s.length() && s.charAt(start) == ')')
		{
			start++;
			return node;
		}
		
		if (start < s.length() && s.charAt(start) == '(')
		{
			start++;
			node.right = buildTree(s);
		}
		
		if (start < s.length() && s.charAt(start) == ')')
		{
			start++;
			return node;
		}
		return node;
	}

	public static void displayResult(Node node)
	{
		if (node == null)
			return;

		System.out.println(node.data + " ");
		displayResult(node.left);
		displayResult(node.right);
	}

	public static void main(String[] args)
	{
		
		String s = "4(2(3)(1))(6(5))";
		Node root = buildTree(s);

		displayResult(root);
	}
	}

	