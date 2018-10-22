# image-filters

A command-line Java program to apply filters to images, developed as part of a course I was teaching in year 2013-2014. The aim of the program for me was mainly to generate test files so the students could have some material to validate their work. 

## Usage

`Main input_file input_file_type output_file output_file_type filter1 filter2 ...`  
At least one filter had to be specified, as its number (see below).
Supported file types were PNG, JPEG and a custom-made, text-based format called ESI (Ensica Simple Image). 

## Build

Maven is used to build the project. In the `imageFilters` directory, type  
`mvn compile`

## Available filters

Only three of these were required to pass the course, but I did more for fun.

0. Identity, used for simple format conversions
1. Grayscale (required)
2. Blur (required - not implemented)
3. Color inverter (required)
4. Sepia
5. XFlip (mirror along horizontal line)
6. YFlip (mirror along vertical line)

## Licence

GPLv3, see the LICENCE file for more details
