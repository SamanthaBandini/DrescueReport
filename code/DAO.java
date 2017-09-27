public interface GenericDao {
    void insert(ObjectModel objectModel);
    void delete(ObjectModel objectModel);
    ObjectModel selectByIdentifier(ObjectModel objectModel);
	...
}