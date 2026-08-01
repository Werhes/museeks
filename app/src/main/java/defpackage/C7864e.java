package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7864e implements AutoCloseable, InterfaceC1926e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Set f15917e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C3150e f15918e = new C3150e(C15841e.metrica, C6764e.vip);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5157e f15919e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final LinkedHashMap f15920e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2107e f15921e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12582e f15922e;

    public C7864e(C2107e c2107e, C5157e c5157e, boolean z) {
        C6764e c6764e;
        this.f15921e = c2107e;
        this.f15919e = c5157e;
        C1239e c1239e = c2107e.f5443e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10064e.appmetrica(c1239e.f3917e));
        Iterator it = c1239e.entrySet().iterator();
        if (!it.hasNext()) {
            this.f15920e = linkedHashMap;
            Set keySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(keySet, 10));
            Iterator it2 = keySet.iterator();
            while (it2.hasNext()) {
                C12550e ad = this.f15921e.ad(((C13269e) it2.next()).ad);
                if (ad == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(ad);
            }
            this.f15917e = AbstractC13480e.m3582e(arrayList);
            this.f15922e = new C12582e(24);
            return;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        int i = ((C13269e) entry.getKey()).ad;
        AbstractC7905e abstractC7905e = (AbstractC7905e) entry.getValue();
        C12550e ad2 = this.f15921e.ad(i);
        if (ad2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C2740e license = this.f15921e.license(i);
        license.getClass();
        List list = license.ad;
        if (z) {
            if (Build.VERSION.SDK_INT >= 33 && (list == null || !list.isEmpty())) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((AbstractC17549e) it3.next()).getClass();
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29) {
                throw null;
            }
            if (i2 >= 33) {
                throw null;
            }
            c6764e = C6764e.vip;
        } else {
            if (Build.VERSION.SDK_INT >= 33 && (list == null || !list.isEmpty())) {
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    ((AbstractC17549e) it4.next()).getClass();
                }
            }
            c6764e = C6764e.vip;
        }
        C1239e c1239e2 = new C1239e();
        Iterator it5 = ad2.vip.iterator();
        while (it5.hasNext()) {
            C7662e c7662e = (C7662e) it5.next();
            c1239e2.put(new C18319e(c7662e.ad), new C3150e(C15841e.vip, c6764e));
        }
        new C10914e(c1239e2.vip(), abstractC7905e);
        abstractC7905e.getClass();
        throw null;
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void Signature(InterfaceC9610e interfaceC9610e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void ads(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void advert(InterfaceC9610e interfaceC9610e) {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15919e.close();
        this.f15918e.close();
        Iterator it = this.f15920e.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Map) it.next()).values().iterator();
            while (it2.hasNext()) {
                ((C3150e) it2.next()).close();
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void crashlytics(InterfaceC9610e interfaceC9610e, long j, C10224e c10224e) {
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: extends */
    public final void mo730extends(InterfaceC9610e interfaceC9610e, long j, C7500e c7500e) {
        this.f15918e.license(j, c7500e);
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: goto */
    public final void mo731goto(InterfaceC9610e interfaceC9610e, long j, InterfaceC7172e interfaceC7172e) {
        this.f15918e.license(j, new C3110e(10));
        if (interfaceC7172e.isVip()) {
            return;
        }
        Iterator it = interfaceC9610e.subs().keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f15920e.get(new C13269e(((C13269e) it.next()).ad));
            if (map != null) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    ((C3150e) it2.next()).ad(j);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void inmobi(InterfaceC9610e interfaceC9610e, int i) {
    }

    @Override // defpackage.InterfaceC1926e
    public final void isVip(InterfaceC9610e interfaceC9610e, long j, long j2) {
        C14400e c14400e = new C14400e(interfaceC9610e, j, j2, this.f15917e);
        this.f15918e.purchase(j, j2, j, c14400e.license);
        C1169e c1169e = c14400e.appmetrica;
        int subs = c1169e.subs();
        for (int i = 0; i < subs; i++) {
            C9050e c9050e = (C9050e) c1169e.get(i);
            Object obj = this.f15920e.get(new C13269e(c9050e.f18109e));
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object obj2 = ((Map) obj).get(new C18319e(c9050e.f18108e));
            if (obj2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C3150e c3150e = (C3150e) obj2;
            c3150e.purchase(j, j2, j2, c9050e);
            if (!interfaceC9610e.subs().keySet().contains(new C13269e(c9050e.f18109e))) {
                c3150e.ad(c14400e.ad);
            }
        }
        C2238e c2238e = new C2238e(c14400e);
        this.f15922e.getClass();
        if (!interfaceC9610e.mo2623protected()) {
            this.f15919e.ad();
        }
        c2238e.ad();
    }

    @Override // defpackage.InterfaceC1926e
    public final void license(InterfaceC9610e interfaceC9610e, long j, int i, int i2) {
        Map map = (Map) this.f15920e.get(new C13269e(i));
        if (map == null) {
            return;
        }
        if (this.f15921e.license(i) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!map.containsKey(new C18319e(i2))) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C3150e) it.next()).ad(j);
        }
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void loadAd(InterfaceC9610e interfaceC9610e, long j) {
    }

    @Override // defpackage.InterfaceC1926e
    /* renamed from: protected */
    public final void mo732protected(C9021e c9021e) {
        this.f15919e.ad();
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void purchase(InterfaceC9610e interfaceC9610e, long j, long j2) {
    }

    @Override // defpackage.InterfaceC1926e
    public final /* synthetic */ void subs(InterfaceC9610e interfaceC9610e) {
    }
}
