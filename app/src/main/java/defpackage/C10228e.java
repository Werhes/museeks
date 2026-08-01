package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10228e extends AbstractC15319e {
    private static final C10228e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private long zzh;
    private String zze = BuildConfig.FLAVOR;
    private AbstractC7244e zzf = AbstractC7244e.f14800e;
    private String zzg = BuildConfig.FLAVOR;
    private InterfaceC13229e zzi = C9782e.f19327e;

    static {
        C10228e c10228e = new C10228e();
        zzj = c10228e;
        AbstractC15319e.Signature(C10228e.class, c10228e);
    }

    public static C17995e ads() {
        return (C17995e) zzj.mopub();
    }

    public static C10228e premium() {
        return zzj;
    }

    public final int applovin() {
        return this.zzi.size();
    }

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ void m2785class(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void crashlytics(AbstractC7244e abstractC7244e) {
        abstractC7244e.getClass();
        this.zzb |= 2;
        this.zzf = abstractC7244e;
    }

    public final /* synthetic */ void firebase(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final long inmobi() {
        return this.zzh;
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2786interface(C5254e c5254e) {
        InterfaceC13229e interfaceC13229e = this.zzi;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzi = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzi.add(c5254e);
    }

    public final InterfaceC13229e isPro() {
        return this.zzi;
    }

    public final String isVip() {
        return this.zzg;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", C5254e.class});
        }
        if (i2 == 3) {
            return new C10228e();
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
        synchronized (C10228e.class) {
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

    public final String signatures() {
        return this.zze;
    }

    public final /* synthetic */ void subs(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final AbstractC7244e tapsense() {
        return this.zzf;
    }
}
