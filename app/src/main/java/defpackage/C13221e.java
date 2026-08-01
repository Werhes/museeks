package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13221e implements InterfaceC0043e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC4134e f26246e;

    public C13221e(AbstractC4134e abstractC4134e) {
        this.f26246e = abstractC4134e;
    }

    @Override // defpackage.InterfaceC0043e
    public final long Signature(long j) {
        return this.f26246e.f9109e.Signature(C2152e.startapp(0L, ad()));
    }

    public final long ad() {
        AbstractC4134e abstractC4134e = this.f26246e;
        AbstractC4134e metrica = AbstractC2564e.metrica(abstractC4134e);
        return C2152e.yandex(mo210native(metrica.f9107e, 0L, true), abstractC4134e.f9109e.mo210native(metrica.f9109e, 0L, true));
    }

    @Override // defpackage.InterfaceC0043e
    public final void adcel(InterfaceC0043e interfaceC0043e, float[] fArr) {
        this.f26246e.f9109e.adcel(interfaceC0043e, fArr);
    }

    @Override // defpackage.InterfaceC0043e
    public final long advert() {
        AbstractC4134e abstractC4134e = this.f26246e;
        return (abstractC4134e.f6806e << 32) | (abstractC4134e.f6804e & 4294967295L);
    }

    @Override // defpackage.InterfaceC0043e
    public final boolean billing() {
        return this.f26246e.f9109e.mo2524e().f27016e;
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: class */
    public final long mo207class(InterfaceC0043e interfaceC0043e, long j) {
        return mo210native(interfaceC0043e, j, true);
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: goto */
    public final C0763e mo208goto(InterfaceC0043e interfaceC0043e, boolean z) {
        return this.f26246e.f9109e.mo208goto(interfaceC0043e, z);
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: interface */
    public final long mo209interface(long j) {
        return C2152e.startapp(this.f26246e.f9109e.mo209interface(j), ad());
    }

    @Override // defpackage.InterfaceC0043e
    public final InterfaceC0043e isVip() {
        AbstractC4134e mo2526e;
        if (!billing()) {
            AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC17732e abstractC17732e = ((AbstractC17732e) this.f26246e.f9109e.f34782e.f27592e.appmetrica).f34794e;
        if (abstractC17732e == null || (mo2526e = abstractC17732e.mo2526e()) == null) {
            return null;
        }
        return mo2526e.f9107e;
    }

    @Override // defpackage.InterfaceC0043e
    public final long license(long j) {
        return this.f26246e.f9109e.license(C2152e.startapp(j, ad()));
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: native */
    public final long mo210native(InterfaceC0043e interfaceC0043e, long j, boolean z) {
        boolean z2 = interfaceC0043e instanceof C13221e;
        AbstractC4134e abstractC4134e = this.f26246e;
        if (!z2) {
            AbstractC4134e metrica = AbstractC2564e.metrica(abstractC4134e);
            C13221e c13221e = metrica.f9107e;
            AbstractC17732e abstractC17732e = metrica.f9109e;
            long mo210native = mo210native(c13221e, j, z);
            long j2 = metrica.f9110e;
            long yandex = C2152e.yandex(mo210native, (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!abstractC17732e.mo2524e().f27016e) {
                AbstractC14070e.metrica("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC17732e.m4395e();
            AbstractC17732e abstractC17732e2 = abstractC17732e.f34794e;
            if (abstractC17732e2 != null) {
                abstractC17732e = abstractC17732e2;
            }
            return C2152e.startapp(yandex, abstractC17732e.mo210native(interfaceC0043e, 0L, z));
        }
        AbstractC4134e abstractC4134e2 = ((C13221e) interfaceC0043e).f26246e;
        AbstractC17732e abstractC17732e3 = abstractC4134e2.f9109e;
        abstractC17732e3.m4395e();
        AbstractC4134e mo2526e = abstractC4134e.f9109e.m4401e(abstractC17732e3).mo2526e();
        if (mo2526e != null) {
            boolean z3 = !z;
            long metrica2 = C11490e.metrica(C11490e.license(abstractC4134e2.m1468e(mo2526e, z3), AbstractC17324e.purchase(j)), abstractC4134e.m1468e(mo2526e, z3));
            return (Float.floatToRawIntBits((int) (metrica2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (metrica2 & 4294967295L)) & 4294967295L);
        }
        AbstractC4134e metrica3 = AbstractC2564e.metrica(abstractC4134e2);
        boolean z4 = !z;
        long license = C11490e.license(C11490e.license(abstractC4134e2.m1468e(metrica3, z4), metrica3.f9110e), AbstractC17324e.purchase(j));
        AbstractC4134e metrica4 = AbstractC2564e.metrica(abstractC4134e);
        long metrica5 = C11490e.metrica(license, C11490e.license(abstractC4134e.m1468e(metrica4, z4), metrica4.f9110e));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (metrica5 >> 32));
        return metrica4.f9109e.f34794e.mo210native(metrica3.f9109e.f34794e, (Float.floatToRawIntBits((int) (metrica5 & 4294967295L)) & 4294967295L) | (floatToRawIntBits << 32), z);
    }

    @Override // defpackage.InterfaceC0043e
    public final long pro(long j) {
        return C2152e.startapp(this.f26246e.f9109e.pro(j), ad());
    }

    @Override // defpackage.InterfaceC0043e
    public final void startapp(float[] fArr) {
        this.f26246e.f9109e.startapp(fArr);
    }

    @Override // defpackage.InterfaceC0043e
    /* renamed from: this */
    public final long mo211this(long j) {
        return this.f26246e.f9109e.mo211this(C2152e.startapp(j, ad()));
    }
}
