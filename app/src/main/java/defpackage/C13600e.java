package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13600e extends AbstractC6073e {
    public final boolean Signature;
    public final boolean admob;
    public final long advert;
    public final boolean amazon;
    public long isVip;
    public final boolean loadAd;
    public C4822e pro;
    public final C11501e remoteconfig;
    public C10889e signatures;
    public final long smaato;
    public final ArrayList subscription;
    public long tapsense;

    public C13600e(C9362e c9362e) {
        super(c9362e.ad);
        this.advert = c9362e.vip;
        this.smaato = c9362e.metrica;
        this.amazon = c9362e.license;
        this.loadAd = c9362e.appmetrica;
        this.Signature = c9362e.purchase;
        this.admob = c9362e.billing;
        this.subscription = new ArrayList();
        this.remoteconfig = new C11501e();
    }

    @Override // defpackage.AbstractC1029e, defpackage.AbstractC3317e
    public final void Signature() {
        super.Signature();
        this.signatures = null;
        this.pro = null;
    }

    @Override // defpackage.AbstractC3317e
    public final boolean ad(C1962e c1962e) {
        AbstractC3317e abstractC3317e = this.mopub;
        return abstractC3317e.yandex().appmetrica.equals(c1962e.appmetrica) && abstractC3317e.ad(c1962e);
    }

    @Override // defpackage.AbstractC1029e, defpackage.AbstractC3317e
    public final void adcel() {
        C10889e c10889e = this.signatures;
        if (c10889e != null) {
            throw c10889e;
        }
        super.adcel();
    }

    @Override // defpackage.AbstractC3317e
    public final void amazon(InterfaceC14239e interfaceC14239e) {
        ArrayList arrayList = this.subscription;
        AbstractC2301e.subscription(arrayList.remove(interfaceC14239e));
        this.mopub.amazon(((C5231e) interfaceC14239e).f11136e);
        if (!arrayList.isEmpty() || this.loadAd) {
            return;
        }
        C4822e c4822e = this.pro;
        c4822e.getClass();
        subs(c4822e.appmetrica);
    }

    @Override // defpackage.AbstractC6073e
    public final void applovin(AbstractC6690e abstractC6690e) {
        if (this.signatures != null) {
            return;
        }
        subs(abstractC6690e);
    }

    public final void subs(AbstractC6690e abstractC6690e) {
        long j;
        long j2;
        long j3;
        C11501e c11501e = this.remoteconfig;
        abstractC6690e.amazon(0, c11501e);
        long j4 = c11501e.Signature;
        C4822e c4822e = this.pro;
        long j5 = this.smaato;
        ArrayList arrayList = this.subscription;
        if (c4822e == null || arrayList.isEmpty() || this.loadAd) {
            boolean z = this.Signature;
            j = this.advert;
            if (z) {
                long j6 = c11501e.advert;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.tapsense = j4 + j;
            this.isVip = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C5231e c5231e = (C5231e) arrayList.get(i);
                long j7 = this.tapsense;
                long j8 = this.isVip;
                c5231e.f11138e = j7;
                c5231e.f11137e = j8;
            }
            j3 = j2;
        } else {
            j = this.tapsense - j4;
            j3 = j5 != Long.MIN_VALUE ? this.isVip - j4 : Long.MIN_VALUE;
        }
        try {
            C4822e c4822e2 = new C4822e(abstractC6690e, j, j3, this.admob);
            this.pro = c4822e2;
            smaato(c4822e2);
        } catch (C10889e e) {
            this.signatures = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C5231e) arrayList.get(i2)).f11134e = this.signatures;
            }
        }
    }

    @Override // defpackage.AbstractC3317e
    public final InterfaceC14239e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        C5231e c5231e = new C5231e(this.mopub.vip(c18208e, interfaceC16970e, j), this.amazon, this.tapsense, this.isVip, 0);
        this.subscription.add(c5231e);
        return c5231e;
    }
}
