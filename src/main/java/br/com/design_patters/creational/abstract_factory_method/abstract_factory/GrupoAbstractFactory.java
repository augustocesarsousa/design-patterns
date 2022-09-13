package main.java.br.com.design_patters.creational.abstract_factory_method.abstract_factory;

import main.java.br.com.design_patters.creational.abstract_factory_method.model.Grupo;
import main.java.br.com.design_patters.creational.abstract_factory_method.model.mapa_impl.MapaCavernaSecreta;
import main.java.br.com.design_patters.creational.abstract_factory_method.model.mapa_impl.MapaFlorestaMistica;
import main.java.br.com.design_patters.creational.abstract_factory_method.model.monstro_impl.MonstroInseto;
import main.java.br.com.design_patters.creational.abstract_factory_method.model.monstro_impl.MonstroNormal;

public abstract class GrupoAbstractFactory {
    public static Grupo criar(String nivel) {
        Grupo grupo = null;

        if ("nivel1".equals(nivel)) {
            grupo = new Grupo(new MapaCavernaSecreta(), new MonstroNormal());
        }

        if ("nivel2".equals(nivel)) {
            grupo = new Grupo(new MapaFlorestaMistica(), new MonstroInseto());
        }

        return grupo;
    }
}
