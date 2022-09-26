package Projects.AbstractClassesAndInterfaces.Part3;

/**
 Implements a generalized interface for
 types of movement by objects.
 */

// TODO: create the interface type and the abstract methods move and getPosition
// to support the Ship and Auto classes.
public interface Movement
{
    void move(int distance);
    String getPosition();
}
