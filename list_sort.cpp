// for input and output
# include <iostream>
// for dynamic arrays
# include <vector>
// for std::sort
# include <algorithm>
// for std::numeric_limts
# include <limits>

// fixes std::cin if bad input is provided
void fix_cin(){
	if(std::cin.fail()){
		// clears std::cin and removes all the bad input from it
		std::cin.clear();
		std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');	
	}	
}

// functions which prints all the members in a vector
void printVector(std::vector<int> &vec, std::string sep){
	// looping through the vector and printing each one
	for(int i = 0; i < (int)(vec.size()); i++){
		std::cout << vec[i] << sep;
	}	
}

int main(int argc, char const** argv){
	// variable declaration
	int total, input;
	std::vector<int> numbers;
	
	// asking for total size
	std::cout << "How many numbers you want to insert?: ";
	std::cin >> total;
	fix_cin();
	
	// looping for 'total' amount and getting all the integers
	for(int i = 0; i < total; i++){
		std::cout << "Enter integer #" << i + 1 << ": ";
		std::cin >> input;
		fix_cin();
		numbers.push_back(input);
	}
	
	// printing the vector
	std::cout << "\n\nList before sorting:\n";
	printVector(numbers, " ");
	
	// sorting the array
	std::sort(numbers.begin(), numbers.end());
	
	// printing the vector
	std::cout << "\n\nList after sorting:\n";
	printVector(numbers, " ");
	
	return 0;
}
