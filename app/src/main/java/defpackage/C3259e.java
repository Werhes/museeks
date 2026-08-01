package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3259e extends AbstractC15319e {
    private static final C3259e zzh;
    private static volatile InterfaceC11283e zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C3259e c3259e = new C3259e();
        zzh = c3259e;
        AbstractC15319e.Signature(C3259e.class, c3259e);
    }

    public static C2596e ads() {
        return (C2596e) zzh.mopub();
    }

    public static C3259e premium() {
        return zzh;
    }

    public final AbstractC7244e applovin() {
        return this.zze == 5 ? (AbstractC7244e) this.zzf : AbstractC7244e.f14800e;
    }

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ void m1332class(double d) {
        this.zze = 3;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void crashlytics(long j) {
        this.zze = 1;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void firebase(boolean z) {
        this.zze = 2;
        this.zzf = Boolean.valueOf(z);
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m1333goto(C10553e c10553e) {
        c10553e.getClass();
        this.zze = 5;
        this.zzf = c10553e;
    }

    public final double inmobi() {
        if (this.zze == 3) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: interface, reason: not valid java name */
    public final /* synthetic */ void m1334interface(String str) {
        str.getClass();
        this.zze = 4;
        this.zzf = str;
    }

    public final String isPro() {
        return this.zze == 4 ? (String) this.zzf : BuildConfig.FLAVOR;
    }

    public final boolean isVip() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzh, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new C3259e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzi;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C3259e.class) {
            try {
                interfaceC11283e = zzi;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzh);
                    zzi = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final String signatures() {
        return this.zzg;
    }

    public final /* synthetic */ void subs(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final long tapsense() {
        if (this.zze == 1) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    /* renamed from: this, reason: not valid java name */
    public final int m1335this() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }
}
