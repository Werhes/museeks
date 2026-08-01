package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5892e extends AbstractC15319e {
    private static final C5892e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        C5892e c5892e = new C5892e();
        zzj = c5892e;
        AbstractC15319e.Signature(C5892e.class, c5892e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C5892e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzk;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C5892e.class) {
            try {
                interfaceC11283e = zzk;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzj);
                    zzk = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }
}
