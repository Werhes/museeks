package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12380e {
    public final C3168e ad;
    public final C5389e appmetrica;
    public final C0576e license;
    public final C0576e metrica;
    public final C12431e purchase;
    public C2573e vip;

    public C12380e(String str, long j, C3168e c3168e) {
        this.ad = c3168e;
        this.vip = new C2573e(new C17013e(str, AbstractC9262e.license(str.length(), j), null, null, null, null, 60), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        AbstractC14533e.startapp(bool);
        this.metrica = AbstractC14533e.startapp(new C17013e(str, j, null, null, null, null, 60));
        this.license = AbstractC14533e.startapp(bool);
        this.appmetrica = new C5389e(28, this);
        this.purchase = new C12431e(0, new C14129e[16]);
    }

    public static final void ad(C12380e c12380e, InterfaceC12006e interfaceC12006e, boolean z, int i) {
        C17013e vip = c12380e.vip();
        if (((C12431e) c12380e.vip.ad().f33137e).f24868e == 0 && C12347e.metrica(vip.f33324e, c12380e.vip.f6428e)) {
            if (AbstractC7890e.billing(vip.f33321e, c12380e.vip.f6435e) && AbstractC7890e.billing(vip.f33326e, c12380e.vip.f6431e) && AbstractC7890e.billing(vip.f33325e, c12380e.vip.f6434e)) {
                return;
            }
            C17013e vip2 = c12380e.vip();
            String c4860e = c12380e.vip.f6429e.toString();
            C2573e c2573e = c12380e.vip;
            long j = c2573e.f6428e;
            C12347e c12347e = c2573e.f6435e;
            c12380e.appmetrica(vip2, new C17013e(c4860e, j, c12347e, c2573e.f6431e, AbstractC12947e.ad(c12347e, c2573e.f6434e), null, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = ((C12431e) c12380e.vip.ad().f33137e).f24868e != 0;
        String c4860e2 = c12380e.vip.f6429e.toString();
        C2573e c2573e2 = c12380e.vip;
        long j2 = c2573e2.f6428e;
        C12347e c12347e2 = c2573e2.f6435e;
        C17013e c17013e = new C17013e(c4860e2, j2, c12347e2, c2573e2.f6431e, AbstractC12947e.ad(c12347e2, c2573e2.f6434e), null, 32);
        if (interfaceC12006e == null) {
            if (z3 && z) {
                z2 = true;
            }
            c12380e.appmetrica(vip, c17013e, z2);
            c12380e.metrica(vip, c17013e, c12380e.vip.ad(), i);
            return;
        }
        C2573e c2573e3 = new C2573e(c17013e, c12380e.vip.ad(), vip, null, 8);
        interfaceC12006e.mopub(c2573e3);
        C4860e c4860e3 = c2573e3.f6429e;
        boolean adcel = AbstractC6507e.adcel(c4860e3, c17013e);
        boolean metrica = C12347e.metrica(c2573e3.f6428e, c17013e.f33324e);
        if (adcel && metrica) {
            c12380e.appmetrica(vip, C2573e.yandex(c2573e3, 0L, c17013e.f33321e, 13), z);
        } else {
            C17013e yandex = C2573e.yandex(c12380e.vip, 0L, null, 15);
            if (!adcel) {
                c12380e.vip = new C2573e(new C17013e(c4860e3.toString(), c2573e3.f6428e, null, null, null, null, 60), null, null, null, 14);
            } else if (!metrica) {
                C2573e c2573e4 = c12380e.vip;
                long j3 = c2573e3.f6428e;
                c2573e4.billing(AbstractC9262e.metrica((int) (j3 >> 32), (int) (j3 & 4294967295L)));
            }
            if (!adcel || !metrica || !AbstractC7890e.billing(yandex.f33321e, c2573e3.f6435e)) {
                c12380e.vip.purchase(null);
            }
            c12380e.appmetrica(yandex, C2573e.yandex(c12380e.vip, 0L, null, 15), true);
        }
        c12380e.metrica(vip, c12380e.vip(), c2573e3.ad(), i);
    }

    public final void appmetrica(C17013e c17013e, C17013e c17013e2, boolean z) {
        this.metrica.setValue(c17013e2);
        C12431e c12431e = this.purchase;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C14129e c14129e = (C14129e) objArr[i2];
            boolean z2 = (!z || AbstractC6507e.adcel(c17013e.f33322e, c17013e2) || c17013e.f33321e == null) ? false : true;
            C0909e c0909e = c14129e.ad;
            long j = c17013e.f33324e;
            C12347e c12347e = c17013e.f33321e;
            long j2 = c17013e2.f33324e;
            C12347e c12347e2 = c17013e2.f33321e;
            if (z2) {
                c0909e.m427try().restartInput((View) c0909e.f3323e);
            } else if (!C12347e.metrica(j, j2) || !AbstractC7890e.billing(c12347e, c12347e2)) {
                c0909e.m427try().updateSelection((View) c0909e.f3323e, C12347e.billing(j2), C12347e.purchase(j2), c12347e2 != null ? C12347e.billing(c12347e2.ad) : -1, c12347e2 != null ? C12347e.purchase(c12347e2.ad) : -1);
            }
        }
        license(false);
    }

    public final void license(boolean z) {
        this.license.setValue(Boolean.valueOf(z));
    }

    public final void metrica(C17013e c17013e, C17013e c17013e2, C16911e c16911e, int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        C3168e c3168e = this.ad;
        if (m2467class == 0) {
            AbstractC7070e.appmetrica(c3168e, c17013e, c17013e2, c16911e, true);
            return;
        }
        if (m2467class != 1) {
            if (m2467class != 2) {
                throw new C14803e(10);
            }
            AbstractC7070e.appmetrica(c3168e, c17013e, c17013e2, c16911e, false);
        } else {
            ((C0576e) c3168e.f7272e).setValue(null);
            C16675e c16675e = (C16675e) c3168e.f7271e;
            c16675e.vip.clear();
            c16675e.metrica.clear();
        }
    }

    public final String toString() {
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            return "TextFieldState(selection=" + ((Object) C12347e.adcel(vip().f33324e)) + ", text=\"" + ((Object) vip().f33322e) + "\")";
        } finally {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        }
    }

    public final C17013e vip() {
        return (C17013e) this.metrica.getValue();
    }
}
