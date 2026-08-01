package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9373e extends AbstractC3747e {
    public final /* synthetic */ AbstractC3747e license;
    public final /* synthetic */ AbstractC3747e metrica;

    public C9373e(AbstractC3747e abstractC3747e, AbstractC3747e abstractC3747e2) {
        this.metrica = abstractC3747e;
        this.license = abstractC3747e2;
    }

    @Override // defpackage.AbstractC3747e
    public final void ad() {
        AbstractC3747e abstractC3747e = this.license;
        try {
            this.metrica.ad();
        } finally {
            abstractC3747e.ad();
        }
    }
}
