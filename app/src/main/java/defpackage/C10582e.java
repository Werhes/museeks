package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۡؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10582e extends AbstractC15319e {
    private static final C10582e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private int zze = 1;
    private InterfaceC13229e zzf = C9782e.f19327e;

    static {
        C10582e c10582e = new C10582e();
        zzg = c10582e;
        AbstractC15319e.Signature(C10582e.class, c10582e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zze", C13746e.advert, "zzf", C3718e.class});
        }
        if (i2 == 3) {
            return new C10582e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzh;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C10582e.class) {
            try {
                interfaceC11283e = zzh;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzg);
                    zzh = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }
}
