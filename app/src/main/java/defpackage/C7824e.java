package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7824e extends AbstractC13717e {
    public final Function1 appmetrica;
    public final AbstractC13717e purchase;

    public C7824e(long j, C11353e c11353e, Function1 function1, AbstractC13717e abstractC13717e) {
        super(j, c11353e);
        this.appmetrica = function1;
        this.purchase = abstractC13717e;
        abstractC13717e.mopub();
    }

    @Override // defpackage.AbstractC13717e
    public final void advert() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.AbstractC13717e
    public final void amazon(InterfaceC17335e interfaceC17335e) {
        C7983e c7983e = AbstractC12909e.ad;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.AbstractC13717e
    public final Function1 appmetrica() {
        return this.appmetrica;
    }

    @Override // defpackage.AbstractC13717e
    public final void metrica() {
        if (this.metrica) {
            return;
        }
        long j = this.vip;
        AbstractC13717e abstractC13717e = this.purchase;
        if (j != abstractC13717e.billing()) {
            ad();
        }
        abstractC13717e.advert();
        super.metrica();
    }

    @Override // defpackage.AbstractC13717e
    public final void mopub() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.AbstractC13717e
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.AbstractC13717e
    public final AbstractC13717e signatures(Function1 function1) {
        return new C7824e(this.vip, this.ad, AbstractC12909e.mopub(function1, this.appmetrica, true), this.purchase);
    }

    @Override // defpackage.AbstractC13717e
    public final void smaato() {
    }

    @Override // defpackage.AbstractC13717e
    public final Function1 startapp() {
        return null;
    }
}
