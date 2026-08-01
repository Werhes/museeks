package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5100e implements InterfaceC16154e {
    public final /* synthetic */ int ad;
    public static final C5100e vip = new C5100e(0);
    public static final C5100e metrica = new C5100e(1);

    public /* synthetic */ C5100e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC16154e
    public final AbstractC14073e ad(long j, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e) {
        switch (this.ad) {
            case 0:
                float mo493e = interfaceC14388e.mo493e(AbstractC6461e.ad);
                return new C14340e(new C0763e(0.0f, -mo493e, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + mo493e));
            case 1:
                float mo493e2 = interfaceC14388e.mo493e(AbstractC6461e.ad);
                return new C14340e(new C0763e(-mo493e2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + mo493e2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new C14340e(AbstractC18489e.billing(0L, j));
        }
    }

    public String toString() {
        switch (this.ad) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
