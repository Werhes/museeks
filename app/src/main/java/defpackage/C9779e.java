package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9779e extends AbstractC8618e {
    public float metrica;

    public C9779e(float f, long j) {
        super(j);
        this.metrica = f;
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        this.metrica = ((C9779e) abstractC8618e).metrica;
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e metrica(long j) {
        return new C9779e(this.metrica, j);
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return metrica(AbstractC12909e.adcel().billing());
    }
}
