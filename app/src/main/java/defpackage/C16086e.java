package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16086e extends AbstractC15319e {
    private static final C16086e zzl;
    private static volatile InterfaceC11283e zzm;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;

    static {
        C16086e c16086e = new C16086e();
        zzl = c16086e;
        AbstractC15319e.Signature(C16086e.class, c16086e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C16086e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzm;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C16086e.class) {
            try {
                interfaceC11283e = zzm;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzl);
                    zzm = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }
}
