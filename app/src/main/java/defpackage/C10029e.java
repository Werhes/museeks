package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10029e implements InterfaceC3028e {
    public final AbstractC6866e ad;
    public final C8901e metrica;
    public final C3756e vip;

    public C10029e(C3756e c3756e, C8901e c8901e, AbstractC6866e abstractC6866e) {
        this.vip = c3756e;
        c8901e.getClass();
        this.metrica = c8901e;
        this.ad = abstractC6866e;
    }

    @Override // defpackage.InterfaceC3028e
    public final void ad(Object obj, Object obj2) {
        AbstractC1505e.mopub(this.vip, obj, obj2);
    }

    @Override // defpackage.InterfaceC3028e
    public final boolean adcel(AbstractC4994e abstractC4994e, AbstractC4994e abstractC4994e2) {
        this.vip.getClass();
        return abstractC4994e.unknownFields.equals(abstractC4994e2.unknownFields);
    }

    @Override // defpackage.InterfaceC3028e
    public final int appmetrica(AbstractC4994e abstractC4994e) {
        this.vip.getClass();
        C16137e c16137e = abstractC4994e.unknownFields;
        int i = c16137e.license;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < c16137e.ad; i3++) {
            int i4 = c16137e.vip[i3] >>> 3;
            i2 += AbstractC16754e.purchase(3, (AbstractC4002e) c16137e.metrica[i3]) + AbstractC16754e.mopub(i4) + AbstractC16754e.adcel(2) + (AbstractC16754e.adcel(1) * 2);
        }
        c16137e.license = i2;
        return i2;
    }

    @Override // defpackage.InterfaceC3028e
    public final int billing(AbstractC4994e abstractC4994e) {
        this.vip.getClass();
        return abstractC4994e.unknownFields.hashCode();
    }

    @Override // defpackage.InterfaceC3028e
    public final AbstractC4994e license() {
        AbstractC6866e abstractC6866e = this.ad;
        return abstractC6866e instanceof AbstractC4994e ? ((AbstractC4994e) abstractC6866e).adcel() : ((AbstractC12161e) ((AbstractC4994e) abstractC6866e).license(5)).vip();
    }

    @Override // defpackage.InterfaceC3028e
    public final boolean metrica(Object obj) {
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC3028e
    public final void purchase(Object obj, C13935e c13935e) {
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC3028e
    public final void startapp(Object obj, C11226e c11226e, C16593e c16593e) {
        this.vip.getClass();
        C3756e.ad(obj);
        this.metrica.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.InterfaceC3028e
    public final void vip(Object obj) {
        this.vip.getClass();
        C16137e c16137e = ((AbstractC4994e) obj).unknownFields;
        if (c16137e.appmetrica) {
            c16137e.appmetrica = false;
        }
        this.metrica.getClass();
        AbstractC1786e.applovin(obj);
        throw null;
    }

    @Override // defpackage.InterfaceC3028e
    public final void yandex(Object obj, byte[] bArr, int i, int i2, C6313e c6313e) {
        AbstractC4994e abstractC4994e = (AbstractC4994e) obj;
        if (abstractC4994e.unknownFields == C16137e.purchase) {
            abstractC4994e.unknownFields = C16137e.metrica();
        }
        throw AbstractC8647e.isVip(obj);
    }
}
