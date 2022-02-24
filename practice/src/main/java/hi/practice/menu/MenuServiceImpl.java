package hi.practice.menu;

public class MenuServiceImpl implements MenuService{

    private final MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    @Override
    public void menuRegistration(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public Menu findMenu(String menuName) {
        return menuRepository.findByName(menuName);
    }

    @Override
    public Menu removeMenu(Long menuId) {
        return menuRepository.delete(menuId);
    }
}
