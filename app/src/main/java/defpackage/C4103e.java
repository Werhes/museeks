package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4103e extends AbstractC15319e {
    private static final C4103e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C4103e c4103e = new C4103e();
        zzj = c4103e;
        AbstractC15319e.Signature(C4103e.class, c4103e);
    }

    public static C4103e crashlytics() {
        return zzj;
    }

    public final String ads() {
        return this.zzh;
    }

    public final boolean applovin() {
        return (this.zzb & 8) != 0;
    }

    public final int firebase() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final boolean inmobi() {
        return (this.zzb & 4) != 0;
    }

    public final String isPro() {
        return this.zzg;
    }

    public final boolean isVip() {
        return this.zzf;
    }

    public final boolean premium() {
        return (this.zzb & 16) != 0;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", C13746e.metrica, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C4103e();
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
        synchronized (C4103e.class) {
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

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final String subs() {
        return this.zzi;
    }

    public final boolean tapsense() {
        return (this.zzb & 2) != 0;
    }
}
