package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4646e extends AbstractC8618e {
    public int appmetrica;
    public int license;
    public AbstractC8218e metrica;

    public C4646e(long j, AbstractC8218e abstractC8218e) {
        super(j);
        this.metrica = abstractC8218e;
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        synchronized (C7582e.appmetrica) {
            this.metrica = ((C4646e) abstractC8618e).metrica;
            this.license = ((C4646e) abstractC8618e).license;
            this.appmetrica = ((C4646e) abstractC8618e).appmetrica;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e metrica(long j) {
        return new C4646e(j, this.metrica);
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return metrica(AbstractC12909e.adcel().billing());
    }
}
