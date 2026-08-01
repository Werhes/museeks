package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7039e extends AbstractC15319e {
    private static final C7039e zzi;
    private static volatile InterfaceC11283e zzj;
    private int zzb;
    private int zze;
    private C9486e zzf;
    private C9486e zzg;
    private boolean zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚِ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzi = abstractC15319e;
        AbstractC15319e.Signature(C7039e.class, abstractC15319e);
    }

    public static C1996e premium() {
        return (C1996e) zzi.mopub();
    }

    public final boolean ads() {
        return this.zzh;
    }

    public final boolean applovin() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ void m2266class(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void crashlytics(C9486e c9486e) {
        this.zzf = c9486e;
        this.zzb |= 2;
    }

    public final /* synthetic */ void firebase(C9486e c9486e) {
        this.zzg = c9486e;
        this.zzb |= 4;
    }

    public final boolean inmobi() {
        return (this.zzb & 4) != 0;
    }

    public final C9486e isPro() {
        C9486e c9486e = this.zzg;
        return c9486e == null ? C9486e.crashlytics() : c9486e;
    }

    public final C9486e isVip() {
        C9486e c9486e = this.zzf;
        return c9486e == null ? C9486e.crashlytics() : c9486e;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new AbstractC15319e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzj;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C7039e.class) {
            try {
                interfaceC11283e = zzj;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzi);
                    zzj = interfaceC11283e;
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

    public final /* synthetic */ void subs(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final int tapsense() {
        return this.zze;
    }
}
