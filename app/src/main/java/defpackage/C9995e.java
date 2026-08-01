package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9995e implements InterfaceMenuItemC4281e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public CharSequence f19722e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Drawable f19724e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f19725e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public char f19726e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final MenuC8939e f19728e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public CharSequence f19729e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19730e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public CharSequence f19731e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public SubMenuC1355e f19732e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public MenuItem.OnMenuItemClickListener f19733e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public char f19735e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public View f19736e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public ActionProviderVisibilityListenerC0616e f19737e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public int f19739e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public MenuItem.OnActionExpandListener f19741e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f19743e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f19747e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Intent f19748e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public CharSequence f19749e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f19745e = 4096;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f19738e = 4096;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f19723e = 0;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public ColorStateList f19742e = null;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public PorterDuff.Mode f19750e = null;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f19727e = false;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f19740e = false;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f19744e = false;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public int f19746e = 16;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean f19734e = false;

    public C9995e(MenuC8939e menuC8939e, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f19728e = menuC8939e;
        this.f19747e = i2;
        this.f19730e = i;
        this.f19725e = i3;
        this.f19743e = i4;
        this.f19722e = charSequence;
        this.f19739e = i5;
    }

    public static void vip(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // defpackage.InterfaceMenuItemC4281e
    public final InterfaceMenuItemC4281e ad(ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e) {
        this.f19736e = null;
        this.f19737e = actionProviderVisibilityListenerC0616e;
        this.f19728e.Signature(true);
        ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e2 = this.f19737e;
        if (actionProviderVisibilityListenerC0616e2 != null) {
            actionProviderVisibilityListenerC0616e2.ad = new C16089e(this);
            actionProviderVisibilityListenerC0616e2.vip.setVisibilityListener(actionProviderVisibilityListenerC0616e2);
        }
        return this;
    }

    public final boolean appmetrica() {
        ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e;
        if ((this.f19739e & 8) != 0) {
            if (this.f19736e == null && (actionProviderVisibilityListenerC0616e = this.f19737e) != null) {
                this.f19736e = actionProviderVisibilityListenerC0616e.vip.onCreateActionView(this);
            }
            if (this.f19736e != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f19739e & 8) == 0) {
            return false;
        }
        if (this.f19736e == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f19741e;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f19728e.license(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!appmetrica()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f19741e;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f19728e.purchase(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f19736e;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e = this.f19737e;
        if (actionProviderVisibilityListenerC0616e == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC0616e.vip.onCreateActionView(this);
        this.f19736e = onCreateActionView;
        return onCreateActionView;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f19738e;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f19726e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f19731e;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f19730e;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f19724e;
        if (drawable != null) {
            return license(drawable);
        }
        int i = this.f19723e;
        if (i == 0) {
            return null;
        }
        Drawable purchase = AbstractC4628e.purchase(this.f19728e.f17945e, i);
        this.f19723e = 0;
        this.f19724e = purchase;
        return license(purchase);
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f19742e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f19750e;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f19748e;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f19747e;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f19745e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f19735e;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f19725e;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f19732e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f19722e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f19749e;
        return charSequence != null ? charSequence : this.f19722e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f19729e;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f19732e != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f19734e;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f19746e & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f19746e & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f19746e & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e = this.f19737e;
        return (actionProviderVisibilityListenerC0616e == null || !actionProviderVisibilityListenerC0616e.vip.overridesItemVisibility()) ? (this.f19746e & 8) == 0 : (this.f19746e & 8) == 0 && this.f19737e.vip.isVisible();
    }

    public final Drawable license(Drawable drawable) {
        if (drawable != null && this.f19744e && (this.f19727e || this.f19740e)) {
            drawable = drawable.mutate();
            if (this.f19727e) {
                drawable.setTintList(this.f19742e);
            }
            if (this.f19740e) {
                drawable.setTintMode(this.f19750e);
            }
            this.f19744e = false;
        }
        return drawable;
    }

    @Override // defpackage.InterfaceMenuItemC4281e
    public final ActionProviderVisibilityListenerC0616e metrica() {
        return this.f19737e;
    }

    public final void purchase(boolean z) {
        if (z) {
            this.f19746e |= 32;
        } else {
            this.f19746e &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        MenuC8939e menuC8939e = this.f19728e;
        Context context = menuC8939e.f17945e;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f19736e = inflate;
        this.f19737e = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f19747e) > 0) {
            inflate.setId(i2);
        }
        menuC8939e.f17938e = true;
        menuC8939e.Signature(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f19736e = view;
        this.f19737e = null;
        if (view != null && view.getId() == -1 && (i = this.f19747e) > 0) {
            view.setId(i);
        }
        MenuC8939e menuC8939e = this.f19728e;
        menuC8939e.f17938e = true;
        menuC8939e.Signature(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f19726e == c) {
            return this;
        }
        this.f19726e = Character.toLowerCase(c);
        this.f19728e.Signature(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f19726e == c && this.f19738e == i) {
            return this;
        }
        this.f19726e = Character.toLowerCase(c);
        this.f19738e = KeyEvent.normalizeMetaState(i);
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f19746e;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f19746e = i2;
        if (i != i2) {
            this.f19728e.Signature(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.f19746e;
        int i2 = i & 4;
        MenuC8939e menuC8939e = this.f19728e;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.f19746e = i3;
            if (i != i3) {
                menuC8939e.Signature(false);
            }
            return this;
        }
        ArrayList arrayList = menuC8939e.f17947e;
        int size = arrayList.size();
        menuC8939e.isVip();
        for (int i4 = 0; i4 < size; i4++) {
            C9995e c9995e = (C9995e) arrayList.get(i4);
            if (c9995e.f19730e == this.f19730e && (c9995e.f19746e & 4) != 0 && c9995e.isCheckable()) {
                boolean z2 = c9995e == this;
                int i5 = c9995e.f19746e;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                c9995e.f19746e = i6;
                if (i5 != i6) {
                    c9995e.f19728e.Signature(false);
                }
            }
        }
        menuC8939e.tapsense();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final InterfaceMenuItemC4281e setContentDescription(CharSequence charSequence) {
        this.f19731e = charSequence;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f19746e |= 16;
        } else {
            this.f19746e &= -17;
        }
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f19724e = null;
        this.f19723e = i;
        this.f19744e = true;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f19723e = 0;
        this.f19724e = drawable;
        this.f19744e = true;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f19742e = colorStateList;
        this.f19727e = true;
        this.f19744e = true;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f19750e = mode;
        this.f19740e = true;
        this.f19744e = true;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f19748e = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f19735e == c) {
            return this;
        }
        this.f19735e = c;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f19735e == c && this.f19745e == i) {
            return this;
        }
        this.f19735e = c;
        this.f19745e = KeyEvent.normalizeMetaState(i);
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f19741e = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f19733e = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f19735e = c;
        this.f19726e = Character.toLowerCase(c2);
        this.f19728e.Signature(false);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f19735e = c;
        this.f19745e = KeyEvent.normalizeMetaState(i);
        this.f19726e = Character.toLowerCase(c2);
        this.f19738e = KeyEvent.normalizeMetaState(i2);
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f19739e = i;
        MenuC8939e menuC8939e = this.f19728e;
        menuC8939e.f17938e = true;
        menuC8939e.Signature(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f19728e.f17945e.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f19722e = charSequence;
        this.f19728e.Signature(false);
        SubMenuC1355e subMenuC1355e = this.f19732e;
        if (subMenuC1355e != null) {
            subMenuC1355e.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f19749e = charSequence;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final InterfaceMenuItemC4281e setTooltipText(CharSequence charSequence) {
        this.f19729e = charSequence;
        this.f19728e.Signature(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.f19746e;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f19746e = i2;
        if (i != i2) {
            MenuC8939e menuC8939e = this.f19728e;
            menuC8939e.f17937e = true;
            menuC8939e.Signature(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f19722e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
