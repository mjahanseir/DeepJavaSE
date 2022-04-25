use sakila;
DROP PROCEDURE IF EXISTS movie_report;
DELIMITER $$
CREATE PROCEDURE movie_report 
(
 IN title varchar(50), 
 OUT outstring varchar(500)
 )
BEGIN 
	 /* initial variables for info to get 
		- category, timesRented, the filmid
		- a finished var for the cursor handler
		- actor first and last name vars
	 */
     DECLARE filmCategory varchar(40);
     DECLARE timesRented int;
     DECLARE filmID int;
     
     DECLARE finished int default 0;
     
     DECLARE actorFname varchar(50);
     DECLARE actorLname varchar(50);

	 /* set up the cursor to output actors 
		- query the first and last name for the cursor
	 */
	 DECLARE curActor CURSOR FOR 
     SELECT first_name,last_name FROM film_actor inner join actor using (actor_id) join film using (film_id) where film.title=title;

	 DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = 1;

	 /* get the film_id from the title provided */
	 select film_id into filmID from film where film.title=title;
	 
	 /* get the category and rental count using the film_id */
	 select name into filmCategory from category inner join film_category using (category_id) where film_id=filmID;
	 select count(*) into timesRented from rental inner join inventory using (inventory_id) where film_id=filmID;
     	 
	 /* "output" lines 
	 */
     SET outstring = (CONCAT("Report for movie: ", title, "\n"));
     SET outstring = (CONCAT(outstring, "--------------------------------------------", "\n"));
     SET outstring = (CONCAT(outstring, "Category : ", filmCategory, "\n"));
     SET outstring = (CONCAT(outstring, "Has been rented ",timesRented," times", "\n"));
     SET outstring = (CONCAT(outstring, "Cast :", "\n"));
     
	 /* use cursor to "output" list of actors 
		- usual cursor workflow: open, loop through cursor, close
	 */
     OPEN curActor;
     
     printActor: LOOP
		FETCH curActor INTO actorFname,actorLname;
        IF finished=1 THEN
			LEAVE printActor;
		END IF;
		SET outstring = (CONCAT(outstring, '     ',actorFname,' ',actorLname, "\n"));
     END LOOP printActor;
     
     CLOSE curActor;
     
 END $$
 DELIMITER ;
 
call movie_report("OPUS ICE", @myvar);
select @myvar;