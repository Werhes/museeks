package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC10667e implements MenuItem.OnMenuItemClickListener {
    public static final Class[] license = {MenuItem.class};
    public final /* synthetic */ int ad = 0;
    public Object metrica;
    public Object vip;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC10667e() {
    }

    public MenuItemOnMenuItemClickListenerC10667e(MenuItemC4494e menuItemC4494e, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.metrica = menuItemC4494e;
        this.vip = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.ad) {
            case 0:
                Object obj = this.vip;
                Method method = (Method) this.metrica;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.vip).onMenuItemClick(((MenuItemC4494e) this.metrica).m3034e(menuItem));
        }
    }
}
