package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13119e {
    public final C0351e ad;
    public final C12742e adcel;
    public final String metrica;
    public final C0576e mopub;
    public final C12742e startapp;
    public final C13119e vip;
    public final C0576e yandex;
    public final C0576e license = AbstractC14533e.startapp(metrica());
    public final C0576e appmetrica = AbstractC14533e.startapp(new C2701e(metrica(), metrica()));
    public final C15867e purchase = new C15867e(0);
    public final C15867e billing = new C15867e(Long.MIN_VALUE);

    public C13119e(C0351e c0351e, C13119e c13119e, String str) {
        this.ad = c0351e;
        this.vip = c13119e;
        this.metrica = str;
        Boolean bool = Boolean.FALSE;
        this.yandex = AbstractC14533e.startapp(bool);
        this.startapp = new C12742e();
        this.adcel = new C12742e();
        this.mopub = AbstractC14533e.startapp(bool);
        AbstractC14533e.purchase(new C1556e(this, 1));
        c0351e.getClass();
    }

    public final void ad(Object obj, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(obj) : c13770e.yandex(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(this) ? 32 : 16;
        }
        if (!c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e.m3659default();
        } else if (billing()) {
            c13770e.m3676strictfp(467722849);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(466062241);
            mopub(obj);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z || m3681throw == c5170e) {
                m3681throw = AbstractC14533e.purchase(new C1556e(this, 0));
                c13770e.m3682throws(m3681throw);
            }
            if (((Boolean) ((InterfaceC16132e) m3681throw).getValue()).booleanValue()) {
                c13770e.m3676strictfp(466470356);
                Object m3681throw2 = c13770e.m3681throw();
                if (m3681throw2 == c5170e) {
                    m3681throw2 = AbstractC17680e.startapp(c13770e);
                    c13770e.m3682throws(m3681throw2);
                }
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw2;
                boolean yandex = c13770e.yandex(interfaceC18435e) | (i3 == 32);
                Object m3681throw3 = c13770e.m3681throw();
                if (yandex || m3681throw3 == c5170e) {
                    m3681throw3 = new C6538e(interfaceC18435e, this, 28);
                    c13770e.m3682throws(m3681throw3);
                }
                AbstractC17680e.ad(interfaceC18435e, this, (Function1) m3681throw3, c13770e);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(467712929);
                c13770e.Signature(false);
            }
            c13770e.Signature(false);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(this, obj, i, 23);
        }
    }

    public final void adcel(Object obj, Object obj2) {
        this.billing.startapp(Long.MIN_VALUE);
        C0351e c0351e = this.ad;
        c0351e.ad.setValue(Boolean.FALSE);
        boolean billing = billing();
        C0576e c0576e = this.license;
        if (!billing || !AbstractC7890e.billing(metrica(), obj) || !AbstractC7890e.billing(c0576e.getValue(), obj2)) {
            if (!AbstractC7890e.billing(metrica(), obj) && (c0351e instanceof C0351e)) {
                c0351e.vip.setValue(obj);
            }
            c0576e.setValue(obj2);
            this.mopub.setValue(Boolean.TRUE);
            this.appmetrica.setValue(new C2701e(obj, obj2));
        }
        C12742e c12742e = this.adcel;
        int size = c12742e.size();
        for (int i = 0; i < size; i++) {
            C13119e c13119e = (C13119e) c12742e.get(i);
            if (c13119e.billing()) {
                c13119e.adcel(c13119e.metrica(), c13119e.license.getValue());
            }
        }
        C12742e c12742e2 = this.startapp;
        int size2 = c12742e2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C11117e) c12742e2.get(i2)).license();
        }
    }

    public final long appmetrica() {
        C13119e c13119e = this.vip;
        return c13119e != null ? c13119e.appmetrica() : this.purchase.purchase();
    }

    public final boolean billing() {
        return ((Boolean) this.mopub.getValue()).booleanValue();
    }

    public final boolean license() {
        C12742e c12742e = this.startapp;
        int size = c12742e.size();
        for (int i = 0; i < size; i++) {
            ((C11117e) c12742e.get(i)).getClass();
        }
        C12742e c12742e2 = this.adcel;
        int size2 = c12742e2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C13119e) c12742e2.get(i2)).license()) {
                return true;
            }
        }
        return false;
    }

    public final Object metrica() {
        return this.ad.vip.getValue();
    }

    public final void mopub(Object obj) {
        C0576e c0576e = this.license;
        if (AbstractC7890e.billing(c0576e.getValue(), obj)) {
            return;
        }
        this.appmetrica.setValue(new C2701e(c0576e.getValue(), obj));
        if (!AbstractC7890e.billing(metrica(), c0576e.getValue())) {
            this.ad.vip.setValue(c0576e.getValue());
        }
        c0576e.setValue(obj);
        if (this.billing.purchase() == Long.MIN_VALUE) {
            this.yandex.setValue(Boolean.TRUE);
        }
        C12742e c12742e = this.startapp;
        int size = c12742e.size();
        for (int i = 0; i < size; i++) {
            ((C11117e) c12742e.get(i)).f22040e.startapp(-2.0f);
        }
    }

    public final InterfaceC16490e purchase() {
        return (InterfaceC16490e) this.appmetrica.getValue();
    }

    public final void startapp() {
        this.billing.startapp(Long.MIN_VALUE);
        C0351e c0351e = this.ad;
        if (c0351e instanceof C0351e) {
            c0351e.vip.setValue(this.license.getValue());
        }
        if (this.vip == null) {
            this.purchase.startapp(0L);
        }
        c0351e.ad.setValue(Boolean.FALSE);
        C12742e c12742e = this.adcel;
        int size = c12742e.size();
        for (int i = 0; i < size; i++) {
            ((C13119e) c12742e.get(i)).startapp();
        }
    }

    public final String toString() {
        C12742e c12742e = this.startapp;
        int size = c12742e.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C11117e) c12742e.get(i)) + ", ";
        }
        return str;
    }

    public final long vip() {
        C12742e c12742e = this.startapp;
        int size = c12742e.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((C11117e) c12742e.get(i)).f22032e.purchase());
        }
        C12742e c12742e2 = this.adcel;
        int size2 = c12742e2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((C13119e) c12742e2.get(i2)).vip());
        }
        return j;
    }

    public final void yandex(long j, boolean z) {
        C15867e c15867e = this.billing;
        long purchase = c15867e.purchase();
        C0351e c0351e = this.ad;
        if (purchase == Long.MIN_VALUE) {
            c15867e.startapp(j);
            c0351e.ad.setValue(Boolean.TRUE);
        } else if (!((Boolean) c0351e.ad.getValue()).booleanValue()) {
            c0351e.ad.setValue(Boolean.TRUE);
        }
        this.yandex.setValue(Boolean.FALSE);
        C12742e c12742e = this.startapp;
        int size = c12742e.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            C11117e c11117e = (C11117e) c12742e.get(i);
            C0576e c0576e = c11117e.f22028e;
            C0576e c0576e2 = c11117e.f22028e;
            if (!((Boolean) c0576e.getValue()).booleanValue()) {
                long vip = z ? c11117e.metrica().vip() : j;
                c11117e.f22034e.setValue(c11117e.metrica().purchase(vip));
                c11117e.f22037e = c11117e.metrica().license(vip);
                C9260e metrica = c11117e.metrica();
                metrica.getClass();
                if (AbstractC8703e.appmetrica(metrica, vip)) {
                    c0576e2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0576e2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        C12742e c12742e2 = this.adcel;
        int size2 = c12742e2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C13119e c13119e = (C13119e) c12742e2.get(i2);
            if (!AbstractC7890e.billing(c13119e.license.getValue(), c13119e.metrica())) {
                c13119e.yandex(j, z);
            }
            if (!AbstractC7890e.billing(c13119e.license.getValue(), c13119e.metrica())) {
                z2 = false;
            }
        }
        if (z2) {
            startapp();
        }
    }
}
