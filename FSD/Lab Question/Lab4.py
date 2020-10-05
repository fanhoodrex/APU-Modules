while True:
    """Assignment_marks, test_marks and exam_mark are all in same marking scheme
    pass if equal or above 60 otherwise fail"""
    
    assignment_marks = int(input("Enter your assignment marks:"))
    if assignment_marks >= 60:
        test_marks = int(input("Enter your test marks:"))
        if test_marks >= 60:
            exam_marks = int(input("Enter your exam marks:"))
            if exam_marks >= 60:
                print("you have passed the module")
            else:
                print("resit for exam")
        else:
            print("Resit for the test")
    else:
        print("Redo the asssignment")

