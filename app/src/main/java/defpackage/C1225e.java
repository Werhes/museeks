package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٞۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225e implements InterfaceMenuItemC4281e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3862e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public PorterDuff.Mode f3863e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public ColorStateList f3864e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Intent f3865e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public CharSequence f3866e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f3867e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public CharSequence f3868e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f3869e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f3870e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Drawable f3871e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public CharSequence f3872e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public char f3873e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Context f3874e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public CharSequence f3875e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f3876e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public char f3877e;

    @Override // defpackage.InterfaceMenuItemC4281e
    public final InterfaceMenuItemC4281e ad(ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f3876e;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f3877e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f3866e;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f3871e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f3864e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f3863e;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f3865e;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f3862e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f3873e;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f3875e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3868e;
        return charSequence != null ? charSequence : this.f3875e;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f3872e;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f3870e & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f3870e & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f3870e & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f3870e & 8) == 0;
    }

    @Override // defpackage.InterfaceMenuItemC4281e
    public final ActionProviderVisibilityListenerC0616e metrica() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f3877e = Character.toLowerCase(c);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f3877e = Character.toLowerCase(c);
        this.f3876e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f3870e = (z ? 1 : 0) | (this.f3870e & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f3870e = (z ? 2 : 0) | (this.f3870e & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3866e = charSequence;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final InterfaceMenuItemC4281e setContentDescription(CharSequence charSequence) {
        this.f3866e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f3870e = (z ? 16 : 0) | (this.f3870e & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f3871e = this.f3874e.getDrawable(i);
        vip();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f3871e = drawable;
        vip();
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3864e = colorStateList;
        this.f3867e = true;
        vip();
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3863e = mode;
        this.f3869e = true;
        vip();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f3865e = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f3873e = c;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f3873e = c;
        this.f3862e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f3873e = c;
        this.f3877e = Character.toLowerCase(c2);
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f3873e = c;
        this.f3862e = KeyEvent.normalizeMetaState(i);
        this.f3877e = Character.toLowerCase(c2);
        this.f3876e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f3875e = this.f3874e.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3875e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3868e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3872e = charSequence;
        return this;
    }

    @Override // defpackage.InterfaceMenuItemC4281e, android.view.MenuItem
    public final InterfaceMenuItemC4281e setTooltipText(CharSequence charSequence) {
        this.f3872e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f3870e = (this.f3870e & 8) | (z ? 0 : 8);
        return this;
    }

    public final void vip() {
        Drawable drawable = this.f3871e;
        if (drawable != null) {
            if (this.f3867e || this.f3869e) {
                this.f3871e = drawable;
                Drawable mutate = drawable.mutate();
                this.f3871e = mutate;
                if (this.f3867e) {
                    mutate.setTintList(this.f3864e);
                }
                if (this.f3869e) {
                    this.f3871e.setTintMode(this.f3863e);
                }
            }
        }
    }
}
