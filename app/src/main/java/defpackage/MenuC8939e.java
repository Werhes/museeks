package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC8939e implements Menu {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final int[] f17924e = {1, 4, 5, 3, 2, 0};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC18087e f17925e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public CharSequence f17926e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f17928e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ArrayList f17929e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public Drawable f17931e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Resources f17933e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public View f17935e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f17937e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f17938e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C9995e f17939e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f17941e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final ArrayList f17943e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public boolean f17944e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f17945e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ArrayList f17946e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final ArrayList f17947e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f17927e = 0;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f17936e = false;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f17934e = false;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f17932e = false;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f17940e = false;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final ArrayList f17948e = new ArrayList();

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f17930e = new CopyOnWriteArrayList();

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f17942e = false;

    public MenuC8939e(Context context) {
        boolean z;
        boolean z2 = false;
        this.f17945e = context;
        Resources resources = context.getResources();
        this.f17933e = resources;
        this.f17947e = new ArrayList();
        this.f17946e = new ArrayList();
        this.f17937e = true;
        this.f17943e = new ArrayList();
        this.f17929e = new ArrayList();
        this.f17938e = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC7742e.ad;
            if (Build.VERSION.SDK_INT >= 28) {
                z = AbstractC17305e.m4287instanceof(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.f17941e = z2;
    }

    public final void Signature(boolean z) {
        if (this.f17936e) {
            this.f17934e = true;
            if (z) {
                this.f17932e = true;
                return;
            }
            return;
        }
        if (z) {
            this.f17937e = true;
            this.f17938e = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17930e;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        isVip();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC17868e interfaceC17868e = (InterfaceC17868e) weakReference.get();
            if (interfaceC17868e == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC17868e.startapp();
            }
        }
        tapsense();
    }

    public final C9995e ad(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (f17924e[i5] << 16) | (65535 & i3);
        C9995e c9995e = new C9995e(this, i, i2, i3, i6, charSequence, this.f17927e);
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((C9995e) arrayList.get(size)).f19743e <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, c9995e);
        Signature(true);
        return c9995e;
    }

    public String adcel() {
        return "android:menu:actionviewstates";
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return ad(0, 0, 0, this.f17933e.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return ad(i, i2, i3, this.f17933e.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return ad(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return ad(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f17945e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C9995e ad = ad(i, i2, i3, resolveInfo.loadLabel(packageManager));
            ad.setIcon(resolveInfo.loadIcon(packageManager));
            ad.f19748e = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = ad;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f17933e.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f17933e.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C9995e ad = ad(i, i2, i3, charSequence);
        SubMenuC1355e subMenuC1355e = new SubMenuC1355e(this.f17945e, this, ad);
        ad.f19732e = subMenuC1355e;
        subMenuC1355e.setHeaderTitle(ad.f19722e);
        return subMenuC1355e;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean admob(android.view.MenuItem r7, defpackage.InterfaceC17868e r8, int r9) {
        /*
            r6 = this;
            eَؒؗ r7 = (defpackage.C9995e) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            eٌۙؖ r1 = r7.f19728e
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f19733e
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.appmetrica(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f19748e
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f17945e     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            eؑ۠ۥ r1 = r7.f19737e
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.vip
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            eؑ۠ۥ r2 = r7.f19737e
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.vip
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.appmetrica()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.metrica(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.metrica(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.metrica(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            eٕؒ۟ r9 = new eٕؒ۟
            android.content.Context r5 = r6.f17945e
            r9.<init>(r5, r6, r7)
            r7.f19732e = r9
            java.lang.CharSequence r5 = r7.f19722e
            r9.setHeaderTitle(r5)
        L90:
            eٕؒ۟ r7 = r7.f19732e
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.vip
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f17930e
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.metrica(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            e٘ٛۧ r4 = (defpackage.InterfaceC17868e) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.metrica(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.metrica(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.MenuC8939e.admob(android.view.MenuItem, e٘ٛۧ, int):boolean");
    }

    public final ArrayList advert() {
        boolean z = this.f17937e;
        ArrayList arrayList = this.f17946e;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f17947e;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C9995e c9995e = (C9995e) arrayList2.get(i);
            if (c9995e.isVisible()) {
                arrayList.add(c9995e);
            }
        }
        this.f17937e = false;
        this.f17938e = true;
        return arrayList;
    }

    public boolean amazon() {
        return this.f17928e;
    }

    public boolean appmetrica(MenuC8939e menuC8939e, MenuItem menuItem) {
        InterfaceC18087e interfaceC18087e = this.f17925e;
        return interfaceC18087e != null && interfaceC18087e.ad(menuC8939e, menuItem);
    }

    public final C9995e billing(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f17948e;
        arrayList.clear();
        yandex(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C9995e) arrayList.get(0);
        }
        boolean amazon = amazon();
        for (int i2 = 0; i2 < size; i2++) {
            C9995e c9995e = (C9995e) arrayList.get(i2);
            char c = amazon ? c9995e.f19726e : c9995e.f19735e;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (amazon && c == '\b' && i == 67))) {
                return c9995e;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final void clear() {
        C9995e c9995e = this.f17939e;
        if (c9995e != null) {
            license(c9995e);
        }
        this.f17947e.clear();
        Signature(true);
    }

    public final void clearHeader() {
        this.f17931e = null;
        this.f17926e = null;
        this.f17935e = null;
        Signature(false);
    }

    @Override // android.view.Menu
    public final void close() {
        metrica(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C9995e c9995e = (C9995e) arrayList.get(i2);
            if (c9995e.f19747e == i) {
                return c9995e;
            }
            if (c9995e.hasSubMenu() && (findItem = c9995e.f19732e.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f17947e.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f17944e) {
            return true;
        }
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C9995e) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return billing(i, keyEvent) != null;
    }

    public final void isVip() {
        if (this.f17936e) {
            return;
        }
        this.f17936e = true;
        this.f17934e = false;
        this.f17932e = false;
    }

    public boolean license(C9995e c9995e) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17930e;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f17939e == c9995e) {
            isVip();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC17868e interfaceC17868e = (InterfaceC17868e) weakReference.get();
                if (interfaceC17868e == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = interfaceC17868e.appmetrica(c9995e);
                    if (z) {
                        break;
                    }
                }
            }
            tapsense();
            if (z) {
                this.f17939e = null;
            }
        }
        return z;
    }

    public boolean loadAd() {
        return this.f17941e;
    }

    public final void metrica(boolean z) {
        if (this.f17940e) {
            return;
        }
        this.f17940e = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17930e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC17868e interfaceC17868e = (InterfaceC17868e) weakReference.get();
            if (interfaceC17868e == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC17868e.vip(this, z);
            }
        }
        this.f17940e = false;
    }

    public MenuC8939e mopub() {
        return this;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return admob(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C9995e billing = billing(i, keyEvent);
        boolean admob = billing != null ? admob(billing, null, i2) : false;
        if ((i2 & 2) != 0) {
            metrica(true);
        }
        return admob;
    }

    public final void pro(Bundle bundle) {
        int size = this.f17947e.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1355e) item.getSubMenu()).pro(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(adcel(), sparseArray);
        }
    }

    public boolean purchase(C9995e c9995e) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17930e;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        isVip();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC17868e interfaceC17868e = (InterfaceC17868e) weakReference.get();
            if (interfaceC17868e == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = interfaceC17868e.yandex(c9995e);
                if (z) {
                    break;
                }
            }
        }
        tapsense();
        if (z) {
            this.f17939e = c9995e;
        }
        return z;
    }

    public final void remoteconfig(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(adcel());
        int size = this.f17947e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1355e) item.getSubMenu()).remoteconfig(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C9995e) arrayList.get(i3)).f19730e == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C9995e) arrayList.get(i3)).f19730e != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            Signature(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C9995e) arrayList.get(i2)).f19747e == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        Signature(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C9995e c9995e = (C9995e) arrayList.get(i2);
            if (c9995e.f19730e == i) {
                c9995e.f19746e = (c9995e.f19746e & (-5)) | (z2 ? 4 : 0);
                c9995e.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f17942e = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C9995e c9995e = (C9995e) arrayList.get(i2);
            if (c9995e.f19730e == i) {
                c9995e.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f17947e;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C9995e c9995e = (C9995e) arrayList.get(i2);
            if (c9995e.f19730e == i) {
                int i3 = c9995e.f19746e;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c9995e.f19746e = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Signature(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f17928e = z;
        Signature(false);
    }

    public final void signatures(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.f17935e = view;
            this.f17926e = null;
            this.f17931e = null;
        } else {
            if (i > 0) {
                this.f17926e = this.f17933e.getText(i);
            } else if (charSequence != null) {
                this.f17926e = charSequence;
            }
            if (i2 > 0) {
                this.f17931e = this.f17945e.getDrawable(i2);
            } else if (drawable != null) {
                this.f17931e = drawable;
            }
            this.f17935e = null;
        }
        Signature(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f17947e.size();
    }

    public boolean smaato() {
        return this.f17942e;
    }

    public final void startapp() {
        ArrayList advert = advert();
        if (this.f17938e) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f17930e;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC17868e interfaceC17868e = (InterfaceC17868e) weakReference.get();
                if (interfaceC17868e == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z |= interfaceC17868e.license();
                }
            }
            ArrayList arrayList = this.f17943e;
            ArrayList arrayList2 = this.f17929e;
            if (z) {
                arrayList.clear();
                arrayList2.clear();
                int size = advert.size();
                for (int i = 0; i < size; i++) {
                    C9995e c9995e = (C9995e) advert.get(i);
                    if ((c9995e.f19746e & 32) == 32) {
                        arrayList.add(c9995e);
                    } else {
                        arrayList2.add(c9995e);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(advert());
            }
            this.f17938e = false;
        }
    }

    public final void subscription(InterfaceC17868e interfaceC17868e) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f17930e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC17868e interfaceC17868e2 = (InterfaceC17868e) weakReference.get();
            if (interfaceC17868e2 == null || interfaceC17868e2 == interfaceC17868e) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void tapsense() {
        this.f17936e = false;
        if (this.f17934e) {
            this.f17934e = false;
            Signature(this.f17932e);
        }
    }

    public final void vip(InterfaceC17868e interfaceC17868e, Context context) {
        this.f17930e.add(new WeakReference(interfaceC17868e));
        interfaceC17868e.mopub(context, this);
        this.f17938e = true;
    }

    public final void yandex(List list, int i, KeyEvent keyEvent) {
        boolean amazon = amazon();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f17947e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C9995e c9995e = (C9995e) arrayList.get(i2);
                if (c9995e.hasSubMenu()) {
                    c9995e.f19732e.yandex(list, i, keyEvent);
                }
                char c = amazon ? c9995e.f19726e : c9995e.f19735e;
                if ((modifiers & 69647) == ((amazon ? c9995e.f19738e : c9995e.f19745e) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (amazon && c == '\b' && i == 67)) && c9995e.isEnabled()) {
                        list.add(c9995e);
                    }
                }
            }
        }
    }
}
