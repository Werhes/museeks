package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC8330e extends AbstractC7413e implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f17028e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f17031e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public View f17034e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f17035e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Context f17036e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f17037e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public View f17038e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f17039e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public boolean f17041e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f17043e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f17044e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public int f17045e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f17046e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public InterfaceC17386e f17047e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public ViewTreeObserver f17049e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Handler f17051e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f17052e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ArrayList f17050e = new ArrayList();

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final ArrayList f17040e = new ArrayList();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2609e f17048e = new ViewTreeObserverOnGlobalLayoutListenerC2609e(2, this);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC0544e f17032e = new ViewOnAttachStateChangeListenerC0544e(1, this);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C12916e f17042e = new C12916e(7, this);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f17030e = 0;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f17029e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f17033e = false;

    public ViewOnKeyListenerC8330e(Context context, View view, int i, boolean z) {
        this.f17036e = context;
        this.f17034e = view;
        this.f17046e = i;
        this.f17028e = z;
        this.f17039e = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f17031e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f17051e = new Handler();
    }

    @Override // defpackage.AbstractC7413e
    public final void Signature(int i) {
        if (this.f17030e != i) {
            this.f17030e = i;
            this.f17029e = Gravity.getAbsoluteGravity(i, this.f17034e.getLayoutDirection());
        }
    }

    @Override // defpackage.InterfaceC13836e
    public final boolean ad() {
        ArrayList arrayList = this.f17040e;
        return arrayList.size() > 0 && ((C6712e) arrayList.get(0)).ad.f28227e.isShowing();
    }

    @Override // defpackage.InterfaceC13836e
    public final C15703e adcel() {
        ArrayList arrayList = this.f17040e;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C6712e) AbstractC17861e.mopub(1, arrayList)).ad.f28217e;
    }

    @Override // defpackage.AbstractC7413e
    public final void admob(int i) {
        this.f17037e = true;
        this.f17045e = i;
    }

    @Override // defpackage.AbstractC7413e
    public final void advert(MenuC8939e menuC8939e) {
        menuC8939e.vip(this, this.f17036e);
        if (ad()) {
            signatures(menuC8939e);
        } else {
            this.f17050e.add(menuC8939e);
        }
    }

    @Override // defpackage.AbstractC7413e
    public final void amazon(View view) {
        if (this.f17034e != view) {
            this.f17034e = view;
            this.f17029e = Gravity.getAbsoluteGravity(this.f17030e, view.getLayoutDirection());
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final void billing(InterfaceC17386e interfaceC17386e) {
        this.f17047e = interfaceC17386e;
    }

    @Override // defpackage.InterfaceC13836e
    public final void dismiss() {
        ArrayList arrayList = this.f17040e;
        int size = arrayList.size();
        if (size > 0) {
            C6712e[] c6712eArr = (C6712e[]) arrayList.toArray(new C6712e[size]);
            for (int i = size - 1; i >= 0; i--) {
                C6712e c6712e = c6712eArr[i];
                if (c6712e.ad.f28227e.isShowing()) {
                    c6712e.ad.dismiss();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean license() {
        return false;
    }

    @Override // defpackage.AbstractC7413e
    public final void loadAd(boolean z) {
        this.f17033e = z;
    }

    @Override // defpackage.InterfaceC17868e
    public final boolean metrica(SubMenuC1355e subMenuC1355e) {
        Iterator it = this.f17040e.iterator();
        while (it.hasNext()) {
            C6712e c6712e = (C6712e) it.next();
            if (subMenuC1355e == c6712e.vip) {
                c6712e.ad.f28217e.requestFocus();
                return true;
            }
        }
        if (!subMenuC1355e.hasVisibleItems()) {
            return false;
        }
        advert(subMenuC1355e);
        InterfaceC17386e interfaceC17386e = this.f17047e;
        if (interfaceC17386e != null) {
            interfaceC17386e.smaato(subMenuC1355e);
        }
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C6712e c6712e;
        ArrayList arrayList = this.f17040e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c6712e = null;
                break;
            }
            c6712e = (C6712e) arrayList.get(i);
            if (!c6712e.ad.f28227e.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c6712e != null) {
            c6712e.vip.metrica(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.AbstractC7413e
    public final void pro(int i) {
        this.f17035e = true;
        this.f17052e = i;
    }

    @Override // defpackage.InterfaceC13836e
    public final void purchase() {
        if (ad()) {
            return;
        }
        ArrayList arrayList = this.f17050e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            signatures((MenuC8939e) it.next());
        }
        arrayList.clear();
        View view = this.f17034e;
        this.f17038e = view;
        if (view != null) {
            boolean z = this.f17049e == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f17049e = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f17048e);
            }
            this.f17038e.addOnAttachStateChangeListener(this.f17032e);
        }
    }

    @Override // defpackage.AbstractC7413e
    public final void remoteconfig(boolean z) {
        this.f17044e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eؚؔۛ, eٓ۟ۡ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void signatures(defpackage.MenuC8939e r20) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnKeyListenerC8330e.signatures(eٌۙؖ):void");
    }

    @Override // defpackage.InterfaceC17868e
    public final void startapp() {
        Iterator it = this.f17040e.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C6712e) it.next()).ad.f28217e.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C13856e) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.AbstractC7413e
    public final void subscription(PopupWindow.OnDismissListener onDismissListener) {
        this.f17043e = onDismissListener;
    }

    @Override // defpackage.InterfaceC17868e
    public final void vip(MenuC8939e menuC8939e, boolean z) {
        ArrayList arrayList = this.f17040e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC8939e == ((C6712e) arrayList.get(i)).vip) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C6712e) arrayList.get(i2)).vip.metrica(false);
        }
        C6712e c6712e = (C6712e) arrayList.remove(i);
        MenuC8939e menuC8939e2 = c6712e.vip;
        C2434e c2434e = c6712e.ad;
        C16235e c16235e = c2434e.f28227e;
        menuC8939e2.subscription(this);
        if (this.f17041e) {
            AbstractC8631e.vip(c16235e, null);
            c16235e.setAnimationStyle(0);
        }
        c2434e.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f17039e = ((C6712e) arrayList.get(size2 - 1)).metrica;
        } else {
            this.f17039e = this.f17034e.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C6712e) arrayList.get(0)).vip.metrica(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC17386e interfaceC17386e = this.f17047e;
        if (interfaceC17386e != null) {
            interfaceC17386e.vip(menuC8939e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f17049e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f17049e.removeGlobalOnLayoutListener(this.f17048e);
            }
            this.f17049e = null;
        }
        this.f17038e.removeOnAttachStateChangeListener(this.f17032e);
        this.f17043e.onDismiss();
    }
}
