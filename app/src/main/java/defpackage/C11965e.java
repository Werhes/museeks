package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11965e extends AbstractC15319e {
    private static final C11965e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private int zzh;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C11965e c11965e = new C11965e();
        zzj = c11965e;
        AbstractC15319e.Signature(C11965e.class, c11965e);
    }

    public static C11965e isVip() {
        return zzj;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C11965e();
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
        synchronized (C11965e.class) {
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

    public final int signatures() {
        return this.zzh;
    }

    public final String tapsense() {
        return this.zzi;
    }
}
