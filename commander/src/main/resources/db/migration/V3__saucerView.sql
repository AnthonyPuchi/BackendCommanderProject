CREATE VIEW saucer_view AS
SELECT s.*, p,quantity proteins
FROM saucer s
JOIN proteins p ON s.id = p.id;
