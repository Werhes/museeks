package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.adcel;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18368e {
    public static final C6575e billing = new C6575e(24);
    public static final C6575e yandex = new C6575e(25);
    public int ad;
    public final Object appmetrica;
    public int license;
    public int metrica;
    public final Object purchase;
    public int vip;

    public C18368e() {
        this.purchase = new C18296e[5];
        this.appmetrica = new ArrayList();
        this.ad = -1;
    }

    public C18368e(int i, C3335e c3335e, int i2, int i3, int i4, String str) {
        this.ad = i;
        this.appmetrica = c3335e;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.purchase = str;
    }

    public C18368e(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.purchase = staggeredGridLayoutManager;
        this.appmetrica = new ArrayList();
        this.ad = RecyclerView.UNDEFINED_DURATION;
        this.vip = RecyclerView.UNDEFINED_DURATION;
        this.metrica = 0;
        this.license = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ad(int i, float f) {
        C18296e c18296e;
        C18296e[] c18296eArr = (C18296e[]) this.purchase;
        ArrayList arrayList = (ArrayList) this.appmetrica;
        if (this.ad != 1) {
            Collections.sort(arrayList, billing);
            this.ad = 1;
        }
        int i2 = this.license;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.license = i3;
            c18296e = c18296eArr[i3];
        } else {
            c18296e = new Object();
        }
        int i4 = this.vip;
        this.vip = i4 + 1;
        c18296e.ad = i4;
        c18296e.vip = i;
        c18296e.metrica = f;
        arrayList.add(c18296e);
        this.metrica += i;
        while (true) {
            int i5 = this.metrica;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            C18296e c18296e2 = (C18296e) arrayList.get(0);
            int i7 = c18296e2.vip;
            if (i7 <= i6) {
                this.metrica -= i7;
                arrayList.remove(0);
                int i8 = this.license;
                if (i8 < 5) {
                    this.license = i8 + 1;
                    c18296eArr[i8] = c18296e2;
                }
            } else {
                c18296e2.vip = i7 - i6;
                this.metrica -= i6;
            }
        }
    }

    public int adcel(int i) {
        ArrayList arrayList = (ArrayList) this.appmetrica;
        int i2 = this.ad;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C16413e c16413e = (C16413e) view.getLayoutParams();
        this.ad = ((StaggeredGridLayoutManager) this.purchase).subscription.appmetrica(view);
        c16413e.getClass();
        return this.ad;
    }

    public int appmetrica() {
        return ((StaggeredGridLayoutManager) this.purchase).isVip ? purchase(0, ((ArrayList) this.appmetrica).size()) : purchase(r0.size() - 1, -1);
    }

    public int billing(int i) {
        int i2 = this.vip;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.appmetrica).size() == 0) {
            return i;
        }
        vip();
        return this.vip;
    }

    public int license() {
        return ((StaggeredGridLayoutManager) this.purchase).isVip ? purchase(r0.size() - 1, -1) : purchase(0, ((ArrayList) this.appmetrica).size());
    }

    public void metrica() {
        ((ArrayList) this.appmetrica).clear();
        this.ad = RecyclerView.UNDEFINED_DURATION;
        this.vip = RecyclerView.UNDEFINED_DURATION;
        this.metrica = 0;
    }

    public int purchase(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.purchase;
        int mopub = staggeredGridLayoutManager.subscription.mopub();
        int billing2 = staggeredGridLayoutManager.subscription.billing();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.appmetrica).get(i);
            int appmetrica = staggeredGridLayoutManager.subscription.appmetrica(view);
            int vip = staggeredGridLayoutManager.subscription.vip(view);
            boolean z = appmetrica <= billing2;
            boolean z2 = vip >= mopub;
            if (z && z2 && (appmetrica < mopub || vip > billing2)) {
                return adcel.m145extends(view);
            }
            i += i3;
        }
        return -1;
    }

    public float startapp() {
        ArrayList arrayList = (ArrayList) this.appmetrica;
        if (this.ad != 0) {
            Collections.sort(arrayList, yandex);
            this.ad = 0;
        }
        float f = 0.5f * this.metrica;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C18296e c18296e = (C18296e) arrayList.get(i2);
            i += c18296e.vip;
            if (i >= f) {
                return c18296e.metrica;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C18296e) AbstractC17861e.mopub(1, arrayList)).metrica;
    }

    public void vip() {
        View view = (View) AbstractC17861e.mopub(1, (ArrayList) this.appmetrica);
        C16413e c16413e = (C16413e) view.getLayoutParams();
        this.vip = ((StaggeredGridLayoutManager) this.purchase).subscription.vip(view);
        c16413e.getClass();
    }

    public View yandex(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.purchase;
        ArrayList arrayList = (ArrayList) this.appmetrica;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.isVip && adcel.m145extends(view2) >= i) || ((!staggeredGridLayoutManager.isVip && adcel.m145extends(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.isVip && adcel.m145extends(view3) <= i) || ((!staggeredGridLayoutManager.isVip && adcel.m145extends(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }
}
