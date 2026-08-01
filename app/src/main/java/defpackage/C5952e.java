package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5952e extends AbstractC15319e {
    private static final C5952e zzk;
    private static volatile InterfaceC11283e zzl;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C5952e c5952e = new C5952e();
        zzk = c5952e;
        AbstractC15319e.Signature(C5952e.class, c5952e);
    }

    /* renamed from: class, reason: not valid java name */
    public static C13358e m2007class() {
        return (C13358e) zzk.mopub();
    }

    public final long ads() {
        return this.zzh;
    }

    public final boolean applovin() {
        return (this.zzb & 8) != 0;
    }

    public final boolean crashlytics() {
        return (this.zzb & 32) != 0;
    }

    /* renamed from: extends, reason: not valid java name */
    public final /* synthetic */ void m2008extends(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final double firebase() {
        return this.zzj;
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m2009goto(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final boolean inmobi() {
        return (this.zzb & 4) != 0;
    }

    /* renamed from: interface, reason: not valid java name */
    public final /* synthetic */ void m2010interface(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final String isPro() {
        return this.zzg;
    }

    public final String isVip() {
        return this.zzf;
    }

    /* renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m2011native() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
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
            return new C0537e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C5952e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzl;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C5952e.class) {
            try {
                interfaceC11283e = zzl;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzk);
                    zzl = interfaceC11283e;
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

    public final float subs() {
        return this.zzi;
    }

    public final long tapsense() {
        return this.zze;
    }

    /* renamed from: this, reason: not valid java name */
    public final /* synthetic */ void m2012this(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    /* renamed from: throw, reason: not valid java name */
    public final /* synthetic */ void m2013throw() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    /* renamed from: try, reason: not valid java name */
    public final /* synthetic */ void m2014try() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    /* renamed from: while, reason: not valid java name */
    public final /* synthetic */ void m2015while(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }
}
