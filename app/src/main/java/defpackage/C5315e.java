package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5315e extends AbstractC8618e {
    public int license;
    public InterfaceC12449e metrica;

    public C5315e(long j, InterfaceC12449e interfaceC12449e) {
        super(j);
        this.metrica = interfaceC12449e;
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        C5315e c5315e = (C5315e) abstractC8618e;
        synchronized (AbstractC15849e.appmetrica) {
            this.metrica = c5315e.metrica;
            this.license = c5315e.license;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e metrica(long j) {
        return new C5315e(j, this.metrica);
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return new C5315e(AbstractC12909e.adcel().billing(), this.metrica);
    }
}
