package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1355e extends MenuC8939e implements SubMenu {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final MenuC8939e f4151e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C9995e f4152e;

    public SubMenuC1355e(Context context, MenuC8939e menuC8939e, C9995e c9995e) {
        super(context);
        this.f4151e = menuC8939e;
        this.f4152e = c9995e;
    }

    @Override // defpackage.MenuC8939e
    public final String adcel() {
        C9995e c9995e = this.f4152e;
        int i = c9995e != null ? c9995e.f19747e : 0;
        if (i == 0) {
            return null;
        }
        return AbstractC1786e.admob(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.MenuC8939e
    public final boolean amazon() {
        return this.f4151e.amazon();
    }

    @Override // defpackage.MenuC8939e
    public final boolean appmetrica(MenuC8939e menuC8939e, MenuItem menuItem) {
        return super.appmetrica(menuC8939e, menuItem) || this.f4151e.appmetrica(menuC8939e, menuItem);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4152e;
    }

    @Override // defpackage.MenuC8939e
    public final boolean license(C9995e c9995e) {
        return this.f4151e.license(c9995e);
    }

    @Override // defpackage.MenuC8939e
    public final boolean loadAd() {
        return this.f4151e.loadAd();
    }

    @Override // defpackage.MenuC8939e
    public final MenuC8939e mopub() {
        return this.f4151e.mopub();
    }

    @Override // defpackage.MenuC8939e
    public final boolean purchase(C9995e c9995e) {
        return this.f4151e.purchase(c9995e);
    }

    @Override // defpackage.MenuC8939e, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f4151e.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        signatures(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        signatures(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        signatures(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        signatures(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        signatures(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f4152e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4152e.setIcon(drawable);
        return this;
    }

    @Override // defpackage.MenuC8939e, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f4151e.setQwertyMode(z);
    }

    @Override // defpackage.MenuC8939e
    public final boolean smaato() {
        return this.f4151e.smaato();
    }
}
