package defpackage;

import android.view.MenuItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC7133e implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener ad;
    public final /* synthetic */ MenuItemC4494e vip;

    public MenuItemOnActionExpandListenerC7133e(MenuItemC4494e menuItemC4494e, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.vip = menuItemC4494e;
        this.ad = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.ad.onMenuItemActionCollapse(this.vip.m3034e(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.ad.onMenuItemActionExpand(this.vip.m3034e(menuItem));
    }
}
