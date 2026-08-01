package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3038e extends AbstractC18224e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C3638e f7102e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f7103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3038e(C3638e c3638e, int i) {
        super(c3638e);
        this.f7103e = i;
        this.f7102e = c3638e;
    }

    @Override // defpackage.AbstractC18224e
    public final Object ad(int i) {
        switch (this.f7103e) {
            case 0:
                return this.f7102e.adcel()[i];
            case 1:
                return new C17910e(this.f7102e, i);
            default:
                return this.f7102e.mopub()[i];
        }
    }
}
