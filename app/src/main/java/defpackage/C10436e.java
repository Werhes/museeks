package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10436e extends AbstractC17475e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4947e f20607e;

    public C10436e(C4947e c4947e) {
        this.f20607e = c4947e;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return this.f20607e.advert();
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4947e c4947e = this.f20607e;
        switch (c4947e.f10462e) {
            case 0:
                C0917e c0917e = ((C11994e) c4947e.f10461e).f23974e;
                AbstractC2301e.mopub(i, c0917e.metrica);
                return new C15079e(c0917e, i);
            default:
                C0917e c0917e2 = ((C11994e) c4947e.f10461e).f23974e;
                AbstractC2301e.mopub(i, c0917e2.metrica);
                return c0917e2.ad[i];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20607e.size();
    }
}
