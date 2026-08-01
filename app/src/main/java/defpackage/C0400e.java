package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0400e implements InterfaceC11115e {
    public final AbstractC7718e ad;
    public final C15371e metrica;
    public final C3493e vip;

    public C0400e(C3493e c3493e, C15371e c15371e, AbstractC7718e abstractC7718e) {
        this.vip = c3493e;
        c15371e.getClass();
        this.metrica = c15371e;
        this.ad = abstractC7718e;
    }

    @Override // defpackage.InterfaceC11115e
    public final void ad(Object obj, Object obj2) {
        AbstractC4249e.mopub(this.vip, obj, obj2);
    }

    @Override // defpackage.InterfaceC11115e
    public final int adcel(AbstractC3405e abstractC3405e) {
        this.vip.getClass();
        return abstractC3405e.unknownFields.hashCode();
    }

    @Override // defpackage.InterfaceC11115e
    public final int appmetrica(AbstractC3405e abstractC3405e) {
        this.vip.getClass();
        C1434e c1434e = abstractC3405e.unknownFields;
        int i = c1434e.license;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c1434e.ad; i3++) {
            int i4 = c1434e.vip[i3] >>> 3;
            i2 += AbstractC13258e.appmetrica(3, (AbstractC10498e) c1434e.metrica[i3]) + AbstractC13258e.adcel(i4) + AbstractC13258e.startapp(2) + (AbstractC13258e.startapp(1) * 2);
        }
        c1434e.license = i2;
        return i2;
    }

    @Override // defpackage.InterfaceC11115e
    public final void billing(Object obj, C7850e c7850e) {
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC11115e
    public final Object license() {
        AbstractC7718e abstractC7718e = this.ad;
        return abstractC7718e instanceof AbstractC3405e ? ((AbstractC3405e) abstractC7718e).subscription() : abstractC7718e.license().metrica();
    }

    @Override // defpackage.InterfaceC11115e
    public final boolean metrica(Object obj) {
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC11115e
    public final void purchase(Object obj, C11226e c11226e, C5712e c5712e) {
        this.vip.getClass();
        C3493e.ad(obj);
        this.metrica.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC11115e
    public final boolean startapp(AbstractC3405e abstractC3405e, AbstractC3405e abstractC3405e2) {
        this.vip.getClass();
        return abstractC3405e.unknownFields.equals(abstractC3405e2.unknownFields);
    }

    @Override // defpackage.InterfaceC11115e
    public final void vip(Object obj) {
        this.vip.getClass();
        C1434e c1434e = ((AbstractC3405e) obj).unknownFields;
        if (c1434e.appmetrica) {
            c1434e.appmetrica = false;
        }
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC11115e
    public final void yandex(Object obj, byte[] bArr, int i, int i2, C6313e c6313e) {
        AbstractC3405e abstractC3405e = (AbstractC3405e) obj;
        if (abstractC3405e.unknownFields == C1434e.purchase) {
            abstractC3405e.unknownFields = C1434e.metrica();
        }
        throw AbstractC8647e.isVip(obj);
    }
}
