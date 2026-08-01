package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8398e extends AbstractC15319e {
    private static final C8398e zzf;
    private static volatile InterfaceC11283e zzg;
    private int zzb;
    private boolean zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌؐٚ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzf = abstractC15319e;
        AbstractC15319e.Signature(C8398e.class, abstractC15319e);
    }

    public static C8398e tapsense() {
        return zzf;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new AbstractC15319e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzg;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C8398e.class) {
            try {
                interfaceC11283e = zzg;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzf);
                    zzg = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final boolean signatures() {
        return this.zze;
    }
}
