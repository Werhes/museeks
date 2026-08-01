package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13631e implements InterfaceC17868e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC17386e f27031e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f27032e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f27033e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public MenuC8939e f27034e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Drawable f27035e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public RunnableC17144e f27036e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f27037e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Context f27039e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f27040e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f27041e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f27042e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC18021e f27043e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f27044e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C13816e f27045e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C9337e f27046e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final LayoutInflater f27047e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C2931e f27049e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f27050e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C9337e f27053e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f27052e = R.layout.abc_action_menu_layout;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f27051e = R.layout.abc_action_menu_item_layout;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final SparseBooleanArray f27038e = new SparseBooleanArray();

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C5389e f27048e = new C5389e(2, this);

    public C13631e(Context context) {
        this.f27050e = context;
        this.f27047e = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eَّؔ] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View ad(C9995e c9995e, View view, ViewGroup viewGroup) {
        View actionView = c9995e.getActionView();
        if (actionView == null || c9995e.appmetrica()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC2530e ? (InterfaceC2530e) view : (InterfaceC2530e) this.f27047e.inflate(this.f27051e, viewGroup, false);
            actionMenuItemView.metrica(c9995e);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f27043e);
            if (this.f27045e == null) {
                this.f27045e = new C13816e(this);
            }
            actionMenuItemView2.setPopupCallback(this.f27045e);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c9995e.f19734e ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C16927e)) {
            actionView.setLayoutParams(ActionMenuView.mopub(layoutParams));
        }
        return actionView;
    }

    public final boolean adcel() {
        C9337e c9337e = this.f27046e;
        return c9337e != null && c9337e.vip();
    }

    public final boolean advert() {
        MenuC8939e menuC8939e;
        if (!this.f27033e || adcel() || (menuC8939e = this.f27034e) == null || this.f27043e == null || this.f27036e != null) {
            return false;
        }
        menuC8939e.startapp();
        if (menuC8939e.f17929e.isEmpty()) {
            return false;
        }
        RunnableC17144e runnableC17144e = new RunnableC17144e(this, new C9337e(this, this.f27039e, this.f27034e, this.f27049e), false, 1);
        this.f27036e = runnableC17144e;
        ((View) this.f27043e).post(runnableC17144e);
        return true;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean appmetrica(C9995e c9995e) {
        return false;
    }

    @Override // defpackage.InterfaceC17868e
    public final void billing(InterfaceC17386e interfaceC17386e) {
        throw null;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean license() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        C13631e c13631e = this;
        MenuC8939e menuC8939e = c13631e.f27034e;
        if (menuC8939e != null) {
            arrayList = menuC8939e.advert();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = c13631e.f27042e;
        int i4 = c13631e.f27041e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c13631e.f27043e;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C9995e c9995e = (C9995e) arrayList.get(i5);
            int i8 = c9995e.f19739e;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (c13631e.f27040e && c9995e.f19734e) {
                i3 = 0;
            }
            i5++;
        }
        if (c13631e.f27033e && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = c13631e.f27038e;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C9995e c9995e2 = (C9995e) arrayList.get(i10);
            int i12 = c9995e2.f19739e;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = c9995e2.f19730e;
            if (z3) {
                View ad = c13631e.ad(c9995e2, null, viewGroup);
                ad.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = ad.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c9995e2.purchase(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View ad2 = c13631e.ad(c9995e2, null, viewGroup);
                    ad2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = ad2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        C9995e c9995e3 = (C9995e) arrayList.get(i14);
                        if (c9995e3.f19730e == i13) {
                            if ((c9995e3.f19746e & 32) == 32) {
                                i9++;
                            }
                            c9995e3.purchase(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                c9995e2.purchase(z5);
            } else {
                c9995e2.purchase(false);
                i10++;
                i2 = 2;
                c13631e = this;
                z = true;
            }
            i10++;
            i2 = 2;
            c13631e = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC17868e
    public final boolean metrica(SubMenuC1355e subMenuC1355e) {
        boolean z;
        if (subMenuC1355e.hasVisibleItems()) {
            SubMenuC1355e subMenuC1355e2 = subMenuC1355e;
            while (true) {
                MenuC8939e menuC8939e = subMenuC1355e2.f4151e;
                if (menuC8939e == this.f27034e) {
                    break;
                }
                subMenuC1355e2 = (SubMenuC1355e) menuC8939e;
            }
            C9995e c9995e = subMenuC1355e2.f4152e;
            ViewGroup viewGroup = (ViewGroup) this.f27043e;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC2530e) && ((InterfaceC2530e) childAt).getItemData() == c9995e) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC1355e.f4152e.getClass();
                int size = subMenuC1355e.f17947e.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuC1355e.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C9337e c9337e = new C9337e(this, this.f27039e, subMenuC1355e, view);
                this.f27053e = c9337e;
                c9337e.billing = z;
                AbstractC7413e abstractC7413e = c9337e.startapp;
                if (abstractC7413e != null) {
                    abstractC7413e.loadAd(z);
                }
                C9337e c9337e2 = this.f27053e;
                if (!c9337e2.vip()) {
                    if (c9337e2.appmetrica == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c9337e2.license(0, 0, false, false);
                }
                InterfaceC17386e interfaceC17386e = this.f27031e;
                if (interfaceC17386e != null) {
                    interfaceC17386e.smaato(subMenuC1355e);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC17868e
    public final void mopub(Context context, MenuC8939e menuC8939e) {
        this.f27039e = context;
        LayoutInflater.from(context);
        this.f27034e = menuC8939e;
        Resources resources = context.getResources();
        if (!this.f27032e) {
            this.f27033e = true;
        }
        int i = 2;
        this.f27037e = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f27042e = i;
        int i4 = this.f27037e;
        if (this.f27033e) {
            if (this.f27049e == null) {
                C2931e c2931e = new C2931e(this, this.f27050e);
                this.f27049e = c2931e;
                if (this.f27044e) {
                    c2931e.setImageDrawable(this.f27035e);
                    this.f27035e = null;
                    this.f27044e = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f27049e.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f27049e.getMeasuredWidth();
        } else {
            this.f27049e = null;
        }
        this.f27041e = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean purchase() {
        Object obj;
        RunnableC17144e runnableC17144e = this.f27036e;
        if (runnableC17144e != null && (obj = this.f27043e) != null) {
            ((View) obj).removeCallbacks(runnableC17144e);
            this.f27036e = null;
            return true;
        }
        C9337e c9337e = this.f27046e;
        if (c9337e == null) {
            return false;
        }
        if (c9337e.vip()) {
            c9337e.startapp.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC17868e
    public final void startapp() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f27043e;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC8939e menuC8939e = this.f27034e;
            if (menuC8939e != null) {
                menuC8939e.startapp();
                ArrayList advert = this.f27034e.advert();
                int size = advert.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C9995e c9995e = (C9995e) advert.get(i2);
                    if ((c9995e.f19746e & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C9995e itemData = childAt instanceof InterfaceC2530e ? ((InterfaceC2530e) childAt).getItemData() : null;
                        View ad = ad(c9995e, childAt, viewGroup);
                        if (c9995e != itemData) {
                            ad.setPressed(false);
                            ad.jumpDrawablesToCurrentState();
                        }
                        if (ad != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) ad.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(ad);
                            }
                            ((ViewGroup) this.f27043e).addView(ad, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f27049e) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f27043e).requestLayout();
        MenuC8939e menuC8939e2 = this.f27034e;
        if (menuC8939e2 != null) {
            menuC8939e2.startapp();
            ArrayList arrayList2 = menuC8939e2.f17943e;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e = ((C9995e) arrayList2.get(i3)).f19737e;
            }
        }
        MenuC8939e menuC8939e3 = this.f27034e;
        if (menuC8939e3 != null) {
            menuC8939e3.startapp();
            arrayList = menuC8939e3.f17929e;
        }
        if (this.f27033e && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((C9995e) arrayList.get(0)).f19734e;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f27049e == null) {
                this.f27049e = new C2931e(this, this.f27050e);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f27049e.getParent();
            if (viewGroup3 != this.f27043e) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f27049e);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f27043e;
                C2931e c2931e = this.f27049e;
                actionMenuView.getClass();
                C16927e adcel = ActionMenuView.adcel();
                adcel.ad = true;
                actionMenuView.addView(c2931e, adcel);
            }
        } else {
            C2931e c2931e2 = this.f27049e;
            if (c2931e2 != null) {
                Object parent = c2931e2.getParent();
                Object obj = this.f27043e;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f27049e);
                }
            }
        }
        ((ActionMenuView) this.f27043e).setOverflowReserved(this.f27033e);
    }

    @Override // defpackage.InterfaceC17868e
    public final void vip(MenuC8939e menuC8939e, boolean z) {
        purchase();
        C9337e c9337e = this.f27053e;
        if (c9337e != null && c9337e.vip()) {
            c9337e.startapp.dismiss();
        }
        InterfaceC17386e interfaceC17386e = this.f27031e;
        if (interfaceC17386e != null) {
            interfaceC17386e.vip(menuC8939e, z);
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean yandex(C9995e c9995e) {
        return false;
    }
}
