package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2153e extends AbstractC17076e implements InterfaceC5238e {
    private static final C2153e zzb;
    private InterfaceC5024e zzd = C0885e.f3279e;

    static {
        C2153e c2153e = new C2153e();
        zzb = c2153e;
        AbstractC17076e.yandex(C2153e.class, c2153e);
    }

    public static C12418e amazon() {
        return (C12418e) zzb.license();
    }

    public static void loadAd(C2153e c2153e, C0461e c0461e) {
        InterfaceC5024e interfaceC5024e = c2153e.zzd;
        if (!((AbstractC18495e) interfaceC5024e).f36253e) {
            int size = interfaceC5024e.size();
            c2153e.zzd = interfaceC5024e.vip(size == 0 ? 10 : size + size);
        }
        c2153e.zzd.add(c0461e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0461e.class});
        }
        if (i2 == 3) {
            return new C2153e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
