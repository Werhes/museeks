package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13142e extends AbstractC13717e {
    public final AbstractC13717e appmetrica;
    public final boolean billing;
    public final boolean purchase;
    public final long startapp;
    public Function1 yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13142e(AbstractC13717e abstractC13717e, Function1 function1, boolean z, boolean z2) {
        super(0L, C11353e.f22848e);
        Function1 appmetrica;
        C7983e c7983e = AbstractC12909e.ad;
        this.appmetrica = abstractC13717e;
        this.purchase = z;
        this.billing = z2;
        this.yandex = AbstractC12909e.mopub(function1, (abstractC13717e == null || (appmetrica = abstractC13717e.appmetrica()) == null) ? AbstractC12909e.adcel.appmetrica : appmetrica, z);
        this.startapp = AbstractC15390e.appmetrica();
    }

    @Override // defpackage.AbstractC13717e
    public final void advert() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.AbstractC13717e
    public final void amazon(InterfaceC17335e interfaceC17335e) {
        tapsense().amazon(interfaceC17335e);
    }

    @Override // defpackage.AbstractC13717e
    public final Function1 appmetrica() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC13717e
    public final long billing() {
        return tapsense().billing();
    }

    @Override // defpackage.AbstractC13717e
    public final C11353e license() {
        return tapsense().license();
    }

    @Override // defpackage.AbstractC13717e
    public final void metrica() {
        AbstractC13717e abstractC13717e;
        this.metrica = true;
        if (!this.billing || (abstractC13717e = this.appmetrica) == null) {
            return;
        }
        abstractC13717e.metrica();
    }

    @Override // defpackage.AbstractC13717e
    public final void mopub() {
        AbstractC15849e.appmetrica();
        throw null;
    }

    @Override // defpackage.AbstractC13717e
    public final boolean purchase() {
        return tapsense().purchase();
    }

    @Override // defpackage.AbstractC13717e
    public final AbstractC13717e signatures(Function1 function1) {
        Function1 mopub = AbstractC12909e.mopub(function1, this.yandex, true);
        return !this.purchase ? AbstractC12909e.billing(tapsense().signatures(null), mopub, true) : tapsense().signatures(mopub);
    }

    @Override // defpackage.AbstractC13717e
    public final void smaato() {
        tapsense().smaato();
    }

    @Override // defpackage.AbstractC13717e
    public final Function1 startapp() {
        return null;
    }

    public final AbstractC13717e tapsense() {
        AbstractC13717e abstractC13717e = this.appmetrica;
        return abstractC13717e == null ? AbstractC12909e.adcel : abstractC13717e;
    }
}
