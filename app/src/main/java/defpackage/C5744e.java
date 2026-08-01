package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5744e implements InterfaceC16984e {
    public final AbstractC17836e ad;
    public final C9616e vip;

    public C5744e(C9616e c9616e, AbstractC17836e abstractC17836e) {
        C11672e c11672e = AbstractC17412e.ad;
        this.vip = c9616e;
        this.ad = abstractC17836e;
    }

    @Override // defpackage.InterfaceC16984e
    public final AbstractC15319e ad() {
        AbstractC17836e abstractC17836e = this.ad;
        return abstractC17836e instanceof AbstractC15319e ? ((AbstractC15319e) abstractC17836e).startapp() : ((AbstractC6041e) ((AbstractC15319e) abstractC17836e).pro(5)).license();
    }

    @Override // defpackage.InterfaceC16984e
    public final void adcel(Object obj, C11226e c11226e, C17268e c17268e) {
        this.vip.getClass();
        C9616e.subscription(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC16984e
    public final boolean appmetrica(Object obj) {
        throw AbstractC8647e.isVip(obj);
    }

    @Override // defpackage.InterfaceC16984e
    public final int billing(AbstractC15319e abstractC15319e) {
        return abstractC15319e.zzc.hashCode();
    }

    @Override // defpackage.InterfaceC16984e
    public final int license(AbstractC17836e abstractC17836e) {
        C2370e c2370e = ((AbstractC15319e) abstractC17836e).zzc;
        int i = c2370e.license;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c2370e.ad; i3++) {
            int i4 = c2370e.vip[i3] >>> 3;
            AbstractC7244e abstractC7244e = (AbstractC7244e) c2370e.metrica[i3];
            int subscription = AbstractC13874e.subscription(8);
            int subscription2 = AbstractC13874e.subscription(i4) + AbstractC13874e.subscription(16);
            int subscription3 = AbstractC13874e.subscription(24);
            int billing = abstractC7244e.billing();
            i2 = AbstractC8703e.crashlytics(subscription + subscription, subscription2, AbstractC1414e.appmetrica(billing, billing, subscription3), i2);
        }
        c2370e.license = i2;
        return i2;
    }

    @Override // defpackage.InterfaceC16984e
    public final void metrica(Object obj) {
        this.vip.getClass();
        C2370e c2370e = ((AbstractC15319e) obj).zzc;
        if (c2370e.appmetrica) {
            c2370e.appmetrica = false;
        }
        C11672e c11672e = AbstractC17412e.ad;
        throw AbstractC8647e.isVip(obj);
    }

    @Override // defpackage.InterfaceC16984e
    public final void purchase(Object obj, byte[] bArr, int i, int i2, C6313e c6313e) {
        AbstractC15319e abstractC15319e = (AbstractC15319e) obj;
        if (abstractC15319e.zzc == C2370e.purchase) {
            abstractC15319e.zzc = C2370e.ad();
        }
        throw AbstractC8647e.isVip(obj);
    }

    @Override // defpackage.InterfaceC16984e
    public final boolean startapp(AbstractC15319e abstractC15319e, AbstractC15319e abstractC15319e2) {
        return abstractC15319e.zzc.equals(abstractC15319e2.zzc);
    }

    @Override // defpackage.InterfaceC16984e
    public final void vip(Object obj, Object obj2) {
        AbstractC0248e.vip(obj, obj2);
    }

    @Override // defpackage.InterfaceC16984e
    public final void yandex(Object obj, C16089e c16089e) {
        throw AbstractC8647e.isVip(obj);
    }
}
