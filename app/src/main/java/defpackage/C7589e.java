package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7589e {
    public final Object ad;
    public final C0576e appmetrica;
    public boolean billing;
    public final C0576e license;
    public final C11224e metrica = new C11224e(this);
    public final C7558e purchase;
    public final C0287e startapp;
    public final C13610e vip;
    public final C0287e yandex;

    public C7589e(Object obj, C13610e c13610e) {
        this.ad = obj;
        this.vip = c13610e;
        C13664e c13664e = C13664e.f27089e;
        this.license = AbstractC14533e.startapp(c13664e);
        this.appmetrica = AbstractC14533e.startapp(c13664e);
        this.purchase = new C7558e(new C2152e(0L), AbstractC9546e.purchase, null, 12);
        this.yandex = new C0287e(this, 0);
        this.startapp = new C0287e(this, 1);
    }

    public final boolean ad() {
        C11224e c11224e = this.metrica;
        return c11224e.pro().vip() || c11224e.pro().license() || c11224e.vip == 2;
    }

    public final void appmetrica() {
        this.vip.getClass();
        List vip = vip();
        ArrayList arrayList = new ArrayList();
        int size = vip.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C16223e c16223e = (C16223e) vip.get(i);
            if (c16223e.yandex()) {
                arrayList.add(c16223e);
                if (c16223e.license().vip()) {
                    z = true;
                }
            }
        }
        this.appmetrica.setValue(arrayList);
        C11224e c11224e = this.metrica;
        C7589e c7589e = (C7589e) c11224e.license;
        C16330e c16330e = (C16330e) c11224e.purchase;
        if (c7589e.metrica().size() > 1 && z) {
            c11224e.vip = 2;
            c16330e.startapp(c11224e.ad + 1);
        } else if (!c7589e.vip.vip()) {
            c11224e.vip = 1;
            c11224e.ad = c16330e.purchase();
            ((C0576e) c11224e.appmetrica).setValue(C4471e.ad);
        } else if (!z) {
            c11224e.vip = 3;
            c16330e.startapp(c11224e.ad + 1);
        }
        c11224e.signatures();
    }

    public final boolean license() {
        List metrica = metrica();
        int size = metrica.size();
        for (int i = 0; i < size; i++) {
            C13119e c13119e = ((C16223e) metrica.get(i)).license().vip;
            while (true) {
                C13119e c13119e2 = c13119e.vip;
                if (c13119e2 == null) {
                    break;
                }
                c13119e = c13119e2;
            }
            if (!AbstractC7890e.billing(c13119e.metrica(), c13119e.license.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final List metrica() {
        return (List) this.appmetrica.getValue();
    }

    public final List vip() {
        return (List) this.license.getValue();
    }
}
