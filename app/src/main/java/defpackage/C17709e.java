package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17709e implements InterfaceC9998e, InterfaceC15234e {
    public final String ad;
    public final Map adcel;
    public final C5363e advert;
    public final HashSet appmetrica;
    public final InterfaceC9998e[] billing;
    public final List license;
    public final int metrica;
    public final InterfaceC9998e[] mopub;
    public final String[] purchase;
    public final boolean[] startapp;
    public final AbstractC8457e vip;
    public final List[] yandex;

    public C17709e(String str, AbstractC8457e abstractC8457e, int i, List list, C7469e c7469e) {
        this.ad = str;
        this.vip = abstractC8457e;
        this.metrica = i;
        this.license = c7469e.vip;
        ArrayList arrayList = c7469e.metrica;
        HashSet hashSet = new HashSet(AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList, 12)));
        AbstractC13480e.m3574const(arrayList, hashSet);
        this.appmetrica = hashSet;
        int i2 = 0;
        this.purchase = (String[]) arrayList.toArray(new String[0]);
        this.billing = AbstractC14161e.vip(c7469e.appmetrica);
        this.yandex = (List[]) c7469e.purchase.toArray(new List[0]);
        ArrayList arrayList2 = c7469e.billing;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.startapp = zArr;
        C8950e c8950e = new C8950e(1, new C14515e(8, this.purchase));
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(c8950e, 10));
        Iterator it2 = c8950e.iterator();
        while (true) {
            C2320e c2320e = (C2320e) it2;
            if (!c2320e.f5836e.hasNext()) {
                this.adcel = AbstractC10064e.mopub(arrayList3);
                this.mopub = AbstractC14161e.vip(list);
                this.advert = new C5363e(new C5671e(0, this));
                return;
            }
            C9817e c9817e = (C9817e) c2320e.next();
            arrayList3.add(new C6571e(c9817e.vip, Integer.valueOf(c9817e.ad)));
        }
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        return this.billing[i];
    }

    @Override // defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        return this.purchase[i];
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17709e) {
            InterfaceC9998e interfaceC9998e = (InterfaceC9998e) obj;
            if (AbstractC7890e.billing(this.ad, interfaceC9998e.ad()) && Arrays.equals(this.mopub, ((C17709e) obj).mopub)) {
                int purchase = interfaceC9998e.purchase();
                int i2 = this.metrica;
                if (i2 == purchase) {
                    for (0; i < i2; i + 1) {
                        InterfaceC9998e[] interfaceC9998eArr = this.billing;
                        i = (AbstractC7890e.billing(interfaceC9998eArr[i].ad(), interfaceC9998e.adcel(i).ad()) && AbstractC7890e.billing(interfaceC9998eArr[i].appmetrica(), interfaceC9998e.adcel(i).appmetrica())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return this.license;
    }

    public final int hashCode() {
        return ((Number) this.advert.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        Integer num = (Integer) this.adcel.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean mopub(int i) {
        return this.startapp[i];
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        return this.yandex[i];
    }

    public final String toString() {
        return AbstractC16619e.purchase(this);
    }

    @Override // defpackage.InterfaceC15234e
    public final Set vip() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean yandex() {
        return false;
    }
}
