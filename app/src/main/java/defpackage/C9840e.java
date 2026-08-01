package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9840e {
    public final ArrayList ad;
    public int appmetrica;
    public final Object billing;
    public int license;
    public int metrica;
    public int purchase;
    public Object startapp;
    public int vip;
    public final Object yandex;

    public C9840e(C4602e c4602e, ArrayList arrayList, int i, C6613e c6613e, C8650e c8650e, int i2, int i3, int i4) {
        this.billing = c4602e;
        this.ad = arrayList;
        this.vip = i;
        this.yandex = c6613e;
        this.startapp = c8650e;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
    }

    public C9840e(C11324e c11324e) {
        this.billing = c11324e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C12229e(0, 0));
        this.ad = arrayList;
        this.appmetrica = -1;
        this.yandex = new ArrayList();
        this.startapp = C13664e.f27089e;
    }

    public static C9840e ad(C9840e c9840e, int i, C6613e c6613e, C8650e c8650e, int i2) {
        if ((i2 & 1) != 0) {
            i = c9840e.vip;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c6613e = (C6613e) c9840e.yandex;
        }
        C6613e c6613e2 = c6613e;
        if ((i2 & 4) != 0) {
            c8650e = (C8650e) c9840e.startapp;
        }
        int i4 = c9840e.metrica;
        int i5 = c9840e.license;
        int i6 = c9840e.appmetrica;
        return new C9840e((C4602e) c9840e.billing, c9840e.ad, i3, c6613e2, c8650e, i4, i5, i6);
    }

    public int appmetrica() {
        return ((C11324e) this.billing).vip.f36470e;
    }

    public int billing(int i) {
        C4763e tapsense = ((C11324e) this.billing).vip.tapsense(i);
        int i2 = i - tapsense.ad;
        return (int) ((C5177e) ((C11215e) tapsense.metrica).vip.invoke(C13152e.ad, Integer.valueOf(i2))).ad;
    }

    public int license(int i) {
        if (appmetrica() <= 0) {
            return 0;
        }
        if (i >= appmetrica()) {
            AbstractC8889e.ad("ItemIndex > total count");
        }
        return i / this.purchase;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public C6233e metrica(int i) {
        ArrayList arrayList;
        int i2 = this.purchase;
        int i3 = i * i2;
        int appmetrica = appmetrica() - i3;
        if (i2 > appmetrica) {
            i2 = appmetrica;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.startapp.size()) {
            arrayList = this.startapp;
        } else {
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(new C5177e(1));
            }
            this.startapp = arrayList2;
            arrayList = arrayList2;
        }
        return new C6233e(i3, arrayList);
    }

    public C11058e purchase(C8650e c8650e) {
        C6613e c6613e = (C6613e) this.yandex;
        int i = this.vip;
        ArrayList arrayList = this.ad;
        if (i >= arrayList.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.purchase++;
        if (c6613e != null) {
            C0309e purchase = ((InterfaceC16718e) c6613e.f13640e).purchase();
            C15718e c15718e = c8650e.ad;
            C15718e c15718e2 = purchase.startapp.yandex;
            if (c15718e.appmetrica != c15718e2.appmetrica || !AbstractC7890e.billing(c15718e.license, c15718e2.license)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.purchase != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        C9840e ad = ad(this, i2, null, c8650e, 58);
        InterfaceC11304e interfaceC11304e = (InterfaceC11304e) arrayList.get(i);
        C11058e ad2 = interfaceC11304e.ad(ad);
        if (ad2 == null) {
            throw new NullPointerException("interceptor " + interfaceC11304e + " returned null");
        }
        if (c6613e == null || i2 >= arrayList.size() || ad.purchase == 1) {
            return ad2;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC11304e + " must call proceed() exactly once").toString());
    }

    public int vip() {
        return ((int) Math.sqrt((appmetrica() * 1.0d) / this.purchase)) + 1;
    }
}
