package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۤۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5254e extends AbstractC15319e {
    private static final C5254e zzh;
    private static volatile InterfaceC11283e zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C5254e c5254e = new C5254e();
        zzh = c5254e;
        AbstractC15319e.Signature(C5254e.class, c5254e);
    }

    public static C8608e ads() {
        return (C8608e) zzh.mopub();
    }

    public final AbstractC7244e applovin() {
        return this.zze == 6 ? (AbstractC7244e) this.zzf : AbstractC7244e.f14800e;
    }

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ void m1842class(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void crashlytics(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void firebase(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    /* renamed from: goto, reason: not valid java name */
    public final int m1843goto() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    public final double inmobi() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: interface, reason: not valid java name */
    public final /* synthetic */ void m1844interface(AbstractC7244e abstractC7244e) {
        abstractC7244e.getClass();
        this.zze = 6;
        this.zzf = abstractC7244e;
    }

    public final String isPro() {
        return this.zze == 5 ? (String) this.zzf : BuildConfig.FLAVOR;
    }

    public final boolean isVip() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final /* synthetic */ void premium(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new C5254e();
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
        synchronized (C5254e.class) {
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

    public final /* synthetic */ void subs(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    public final long tapsense() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }
}
