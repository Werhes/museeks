package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9403e extends AbstractC13717e {
    public final Function1 appmetrica;
    public int purchase;

    public C9403e(long j, C11353e c11353e, Function1 function1) {
        super(j, c11353e);
        this.appmetrica = function1;
        this.purchase = 1;
    }

    @Override // defpackage.AbstractC13717e
    public final void advert() {
        int i = this.purchase - 1;
        this.purchase = i;
        if (i == 0) {
            ad();
        }
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
        advert();
        super.metrica();
    }

    @Override // defpackage.AbstractC13717e
    public final void mopub() {
        this.purchase++;
    }

    @Override // defpackage.AbstractC13717e
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.AbstractC13717e
    public final AbstractC13717e signatures(Function1 function1) {
        AbstractC12909e.metrica(this);
        return new C7824e(this.vip, this.ad, AbstractC12909e.mopub(function1, this.appmetrica, true), this);
    }

    @Override // defpackage.AbstractC13717e
    public final void smaato() {
    }

    @Override // defpackage.AbstractC13717e
    public final Function1 startapp() {
        return null;
    }
}
