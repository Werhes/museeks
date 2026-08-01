package defpackage;

import android.util.Log;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۣۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8327e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C8327e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public C8327e(C10078e c10078e) {
        this.ad = 1;
        Objects.requireNonNull(c10078e);
        this.vip = c10078e;
    }

    public final void Signature(C12481e[] c12481eArr) {
    }

    public final void ad() {
    }

    public final void adcel(int[] iArr, int i) {
    }

    public void admob(ArrayList arrayList, ArrayList arrayList2, int i) {
        switch (this.ad) {
            case 0:
                ArrayList arrayList3 = new ArrayList();
                if (i == 0) {
                    ((C9407e) this.vip).license.size();
                } else if (arrayList2.isEmpty()) {
                    C18482e c18482e = ((C9407e) this.vip).ad;
                    Log.w(c18482e.ad, c18482e.license("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]));
                } else {
                    SparseIntArray sparseIntArray = ((C9407e) this.vip).appmetrica;
                    if (sparseIntArray.get(i, -1) == -1) {
                        sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    C9407e c9407e = (C9407e) this.vip;
                    int i2 = c9407e.appmetrica.get(intValue, -1);
                    if (i2 == -1) {
                        c9407e.vip();
                        return;
                    }
                    arrayList3.add(Integer.valueOf(i2));
                }
                C9407e c9407e2 = (C9407e) this.vip;
                c9407e2.purchase();
                c9407e2.license = arrayList;
                c9407e2.metrica();
                Set set = c9407e2.smaato;
                synchronized (set) {
                    Iterator it2 = set.iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c9407e2.billing();
                return;
            default:
                return;
        }
    }

    public final void advert(int[] iArr) {
    }

    public final void amazon(int[] iArr) {
    }

    public void appmetrica(String str, long j, int i, long j2, long j3) {
        switch (this.ad) {
            case 1:
                C10182e c10182e = ((C10078e) this.vip).advert;
                if (c10182e != null) {
                    C0385e license = ((C11328e) c10182e.f20137e).license();
                    C4601e c4601e = new C4601e(str);
                    c4601e.vip = j;
                    c4601e.metrica = i;
                    c4601e.license = j2;
                    c4601e.appmetrica = j3;
                    C9633e c9633e = new C9633e(c4601e);
                    c9633e.purchase = license.yandex;
                    license.license.add(c9633e);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void billing(int[] iArr) {
        switch (this.ad) {
            case 0:
                C9407e c9407e = (C9407e) this.vip;
                ArrayList appmetrica = AbstractC5942e.appmetrica(iArr);
                if (c9407e.license.equals(appmetrica)) {
                    return;
                }
                c9407e.purchase();
                c9407e.purchase.evictAll();
                c9407e.billing.clear();
                c9407e.license = appmetrica;
                c9407e.metrica();
                c9407e.yandex();
                c9407e.billing();
                return;
            default:
                return;
        }
    }

    public final void license() {
    }

    public void loadAd(C12481e[] c12481eArr) {
        switch (this.ad) {
            case 0:
                HashSet hashSet = new HashSet();
                C9407e c9407e = (C9407e) this.vip;
                ArrayList arrayList = c9407e.billing;
                SparseIntArray sparseIntArray = c9407e.appmetrica;
                arrayList.clear();
                for (C12481e c12481e : c12481eArr) {
                    int i = c12481e.f24982e;
                    c9407e.purchase.put(Integer.valueOf(i), c12481e);
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        c9407e.vip();
                        return;
                    }
                    hashSet.add(Integer.valueOf(i2));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i3 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
                    if (i3 != -1) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                }
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList(hashSet);
                Collections.sort(arrayList2);
                c9407e.purchase();
                AbstractC5942e.license(arrayList2);
                c9407e.license();
                c9407e.billing();
                return;
            default:
                return;
        }
    }

    public final void metrica() {
    }

    public void mopub(int[] iArr) {
        switch (this.ad) {
            case 0:
                C9407e c9407e = (C9407e) this.vip;
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    c9407e.purchase.remove(Integer.valueOf(i));
                    int i2 = c9407e.appmetrica.get(i, -1);
                    if (i2 == -1) {
                        c9407e.vip();
                        return;
                    }
                    arrayList.add(Integer.valueOf(i2));
                }
                Collections.sort(arrayList);
                c9407e.purchase();
                AbstractC5942e.license(arrayList);
                c9407e.license();
                c9407e.billing();
                return;
            default:
                return;
        }
    }

    public final void purchase(String str, long j, int i, long j2, long j3) {
    }

    public final void remoteconfig() {
    }

    public void smaato(int[] iArr) {
        switch (this.ad) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (int i : iArr) {
                    C9407e c9407e = (C9407e) this.vip;
                    c9407e.purchase.remove(Integer.valueOf(i));
                    SparseIntArray sparseIntArray = c9407e.appmetrica;
                    int i2 = sparseIntArray.get(i, -1);
                    if (i2 == -1) {
                        c9407e.vip();
                        return;
                    } else {
                        sparseIntArray.delete(i);
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                Collections.sort(arrayList);
                C9407e c9407e2 = (C9407e) this.vip;
                c9407e2.purchase();
                c9407e2.license.removeAll(AbstractC5942e.appmetrica(iArr));
                c9407e2.metrica();
                AbstractC5942e.license(arrayList);
                Set set = c9407e2.smaato;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c9407e2.billing();
                return;
            default:
                return;
        }
    }

    public void startapp(int[] iArr, int i) {
        int i2;
        switch (this.ad) {
            case 0:
                if (i == 0) {
                    i2 = ((C9407e) this.vip).license.size();
                } else {
                    C9407e c9407e = (C9407e) this.vip;
                    i2 = c9407e.appmetrica.get(i, -1);
                    if (i2 == -1) {
                        c9407e.vip();
                        return;
                    }
                }
                C9407e c9407e2 = (C9407e) this.vip;
                c9407e2.purchase();
                c9407e2.license.addAll(i2, AbstractC5942e.appmetrica(iArr));
                c9407e2.metrica();
                Set set = c9407e2.smaato;
                synchronized (set) {
                    Iterator it = set.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
                c9407e2.billing();
                return;
            default:
                return;
        }
    }

    public final void subscription(ArrayList arrayList, ArrayList arrayList2, int i) {
    }

    public final void vip() {
    }

    public final void yandex(int[] iArr) {
    }
}
