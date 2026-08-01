package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7196e extends AbstractC18224e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C3638e f14704e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f14705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7196e(C3638e c3638e, int i) {
        super(c3638e, (byte) 0);
        this.f14705e = i;
        this.f14704e = c3638e;
    }

    @Override // defpackage.AbstractC18224e
    public final Object vip(int i) {
        int i2 = this.f14705e;
        C3638e c3638e = this.f14704e;
        switch (i2) {
            case 0:
                Object obj = C3638e.f8187e;
                return c3638e.amazon()[i];
            case 1:
                return new C5420e(c3638e, i);
            default:
                Object obj2 = C3638e.f8187e;
                return c3638e.loadAd()[i];
        }
    }
}
