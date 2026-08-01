package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC15372e extends AbstractC11130e implements Menu {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final MenuC8939e f30303e;

    public MenuC15372e(Context context, MenuC8939e menuC8939e) {
        super(context);
        if (menuC8939e == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f30303e = menuC8939e;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m3034e(this.f30303e.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m3034e(this.f30303e.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m3034e(this.f30303e.ad(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m3034e(this.f30303e.ad(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f30303e.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m3034e(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f30303e.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f30303e.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f30303e.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f30303e.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C17519e c17519e = (C17519e) this.f22046e;
        if (c17519e != null) {
            c17519e.clear();
        }
        this.f30303e.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f30303e.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m3034e(this.f30303e.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m3034e(this.f30303e.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f30303e.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f30303e.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f30303e.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f30303e.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C17519e) this.f22046e) != null) {
            int i2 = 0;
            while (true) {
                C17519e c17519e = (C17519e) this.f22046e;
                if (i2 >= c17519e.f34352e) {
                    break;
                }
                if (((InterfaceMenuItemC4281e) c17519e.purchase(i2)).getGroupId() == i) {
                    ((C17519e) this.f22046e).billing(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f30303e.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C17519e) this.f22046e) != null) {
            int i2 = 0;
            while (true) {
                C17519e c17519e = (C17519e) this.f22046e;
                if (i2 >= c17519e.f34352e) {
                    break;
                }
                if (((InterfaceMenuItemC4281e) c17519e.purchase(i2)).getItemId() == i) {
                    ((C17519e) this.f22046e).billing(i2);
                    break;
                }
                i2++;
            }
        }
        this.f30303e.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f30303e.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f30303e.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f30303e.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f30303e.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f30303e.size();
    }
}
