// for input and output streams
# include <iostream>
// for string class and functions
# include <string>

int main(int argc, char const *argv[]){
	// variables declared here
	int n;
	std::string binary = "";
	
	// inputting the string
	std::cout << "Enter the number: ";
	std::cin >> n;
	
	// iterating through to get the binary representation
	for(int i = n; i != 0; i /= 2){
		// getting the remainder of dividing i by 2 into the string
		binary += std::to_string(i%2);
	}
	
	// flipping the string to get the accurate result
	binary = std::string(binary.rbegin(), binary.rend());
	std::cout <<"The binary number: "<<binary;
	
	return 0;
}
