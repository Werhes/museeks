package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7880e implements InterfaceC11969e {
    public final AbstractC4765e ad;
    public final C17634e metrica;
    public final C16333e vip;

    public C7880e(C16333e c16333e, C17634e c17634e, AbstractC4765e abstractC4765e) {
        this.vip = c16333e;
        c17634e.getClass();
        this.metrica = c17634e;
        this.ad = abstractC4765e;
    }

    @Override // defpackage.InterfaceC11969e
    public final void ad(Object obj, Object obj2) {
        AbstractC5630e.mopub(this.vip, obj, obj2);
    }

    @Override // defpackage.InterfaceC11969e
    public final boolean appmetrica(AbstractC18270e abstractC18270e, AbstractC18270e abstractC18270e2) {
        C16333e c16333e = this.vip;
        c16333e.getClass();
        C16724e c16724e = abstractC18270e.unknownFields;
        c16333e.getClass();
        return c16724e.equals(abstractC18270e2.unknownFields);
    }

    @Override // defpackage.InterfaceC11969e
    public final int billing(AbstractC18270e abstractC18270e) {
        this.vip.getClass();
        C16724e c16724e = abstractC18270e.unknownFields;
        int i = c16724e.license;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c16724e.ad; i3++) {
            int i4 = c16724e.vip[i3] >>> 3;
            i2 += C15997e.mopub(3, (C6283e) c16724e.metrica[i3]) + C15997e.amazon(i4) + C15997e.smaato(2) + (C15997e.smaato(1) * 2);
        }
        c16724e.license = i2;
        return i2;
    }

    @Override // defpackage.InterfaceC11969e
    public final AbstractC18270e license() {
        AbstractC4765e abstractC4765e = this.ad;
        return abstractC4765e instanceof AbstractC18270e ? ((AbstractC18270e) abstractC4765e).startapp() : ((AbstractC12661e) ((AbstractC18270e) abstractC4765e).vip(5)).vip();
    }

    @Override // defpackage.InterfaceC11969e
    public final boolean metrica(Object obj) {
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC11969e
    public final int purchase(AbstractC18270e abstractC18270e) {
        this.vip.getClass();
        return abstractC18270e.unknownFields.hashCode();
    }

    @Override // defpackage.InterfaceC11969e
    public final void startapp(Object obj, C11226e c11226e, C3758e c3758e) {
        this.vip.ad(obj);
        this.metrica.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC11969e
    public final void vip(Object obj) {
        this.vip.getClass();
        C16724e c16724e = ((AbstractC18270e) obj).unknownFields;
        if (c16724e.appmetrica) {
            c16724e.appmetrica = false;
        }
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC11969e
    public final void yandex(C6594e c6594e, Object obj) {
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }
}
