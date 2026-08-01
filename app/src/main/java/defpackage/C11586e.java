package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11586e extends AbstractC15319e {
    private static final C11586e zzl;
    private static volatile InterfaceC11283e zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؚؕ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzl = abstractC15319e;
        AbstractC15319e.Signature(C11586e.class, abstractC15319e);
    }

    public static C14006e premium() {
        return (C14006e) zzl.mopub();
    }

    public static C11586e subs() {
        return zzl;
    }

    public final boolean ads() {
        return this.zzk;
    }

    public final boolean applovin() {
        return this.zzj;
    }

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ void m3226class(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void crashlytics(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void firebase(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m3227goto(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final boolean inmobi() {
        return this.zzh;
    }

    /* renamed from: interface, reason: not valid java name */
    public final /* synthetic */ void m3228interface(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final boolean isPro() {
        return this.zzi;
    }

    public final boolean isVip() {
        return this.zzg;
    }

    /* renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m3229native(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new AbstractC15319e();
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
        synchronized (C11586e.class) {
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

    public final boolean signatures() {
        return this.zze;
    }

    public final boolean tapsense() {
        return this.zzf;
    }

    /* renamed from: this, reason: not valid java name */
    public final /* synthetic */ void m3230this(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }
}
