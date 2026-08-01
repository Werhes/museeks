package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9160e extends AbstractC8618e {
    public int license;
    public InterfaceC16486e metrica;

    public C9160e(long j, InterfaceC16486e interfaceC16486e) {
        super(j);
        this.metrica = interfaceC16486e;
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        synchronized (AbstractC9743e.vip) {
            this.metrica = ((C9160e) abstractC8618e).metrica;
            this.license = ((C9160e) abstractC8618e).license;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e metrica(long j) {
        return new C9160e(j, this.metrica);
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return new C9160e(AbstractC12909e.adcel().billing(), this.metrica);
    }
}
