package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٞۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6548e extends AbstractC8618e {
    public int metrica;

    public C6548e(long j, int i) {
        super(j);
        this.metrica = i;
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        this.metrica = ((C6548e) abstractC8618e).metrica;
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e metrica(long j) {
        return new C6548e(j, this.metrica);
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return metrica(AbstractC12909e.adcel().billing());
    }
}
