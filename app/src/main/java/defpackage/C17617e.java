package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17617e extends AbstractC15319e {
    private static final C17617e zzl;
    private static volatile InterfaceC11283e zzm;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private AbstractC7244e zzf = AbstractC7244e.f14800e;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC13229e zzh;
    private InterfaceC13229e zzi;
    private boolean zzj;
    private long zzk;

    static {
        C17617e c17617e = new C17617e();
        zzl = c17617e;
        AbstractC15319e.Signature(C17617e.class, c17617e);
    }

    public C17617e() {
        C9782e c9782e = C9782e.f19327e;
        this.zzh = c9782e;
        this.zzi = c9782e;
    }

    public static C7141e ads() {
        return (C7141e) zzl.mopub();
    }

    public final long applovin() {
        return this.zzk;
    }

    /* renamed from: class, reason: not valid java name */
    public final void m4375class(String str) {
        str.getClass();
        InterfaceC13229e interfaceC13229e = this.zzi;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzi = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void crashlytics(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void firebase(C3259e c3259e) {
        InterfaceC13229e interfaceC13229e = this.zzh;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzh = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzh.add(c3259e);
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m4376goto(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final String inmobi() {
        return this.zzg;
    }

    /* renamed from: interface, reason: not valid java name */
    public final /* synthetic */ void m4377interface(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final InterfaceC13229e isPro() {
        return this.zzh;
    }

    public final AbstractC7244e isVip() {
        return this.zzf;
    }

    public final /* synthetic */ void premium(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", C3259e.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C17617e();
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
        synchronized (C17617e.class) {
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

    public final String signatures() {
        return this.zze;
    }

    public final /* synthetic */ void subs(C10553e c10553e) {
        c10553e.getClass();
        this.zzb |= 2;
        this.zzf = c10553e;
    }

    public final boolean tapsense() {
        return (this.zzb & 2) != 0;
    }
}
