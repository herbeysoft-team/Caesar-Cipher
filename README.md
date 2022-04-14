Caesar Cipher is one of the simplest and most widely known encryption techniques. As we mention in class this method is a kind of substitution cipher in which each letter in the plain-text is replaced by a letter some fixed number of positions down the alphabet. Developed application should have following features;

1) Number of shift countNo can be variable and application should take this parameter from file (Details given in following parts). And according to this number new dictionary created.

2) Application should support encryption and decryption methods. These methods should be taken from file again (Details given in following parts). In encryption the text which is given as plain-text form (from file)  should be converted to cipher-text according to dictionary created in first step. And this cipher-text should printed to screen. In decryption, encrypted text should be taken by application (From file) . Then according to dictionary in reverse order it should be converted back to plain-text.

Developed application also has some constraints:

1) You should submit source code of your file and also all files should be in github account

2) Input file should have following structure:

[Shift Count]:[Encrypt/De-crypt]:[Alphabet 0-4]:Plain text/Cipher Text

Shift Count: Number of shift should be given here as it described in first step.

Second field: 0->Encrypt,1->De-crypt

Third field: Alphabet Type 0 for English, 1 for French, 2 for Spanish, 3 for Turkish

Forth field: If second field Encrypt(0) forth part should have plain text  if  it is De-crypt(1) it should have cipher-text.
Example encrypt for english input file:

4:0:0:hello world    

Screen Output ->LIPPS ASVPH

Example for de-crypt input file

4:1:0:LIPPS ASVPH

Screen Output -> hello world

Example encrypt for Spanish input:

7:0:2:HOLLA

Screen Output -> ÑVRRH

