package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2266e extends AbstractC15319e {
    private static final C2266e zzm;
    private static volatile InterfaceC11283e zzn;
    private int zzb;
    private InterfaceC13229e zze = C9782e.f19327e;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        C2266e c2266e = new C2266e();
        zzm = c2266e;
        AbstractC15319e.Signature(C2266e.class, c2266e);
    }

    /* renamed from: extends, reason: not valid java name */
    public static C13673e m786extends() {
        return (C13673e) zzm.mopub();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final /* synthetic */ void m787abstract(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final boolean ads() {
        return (this.zzb & 2) != 0;
    }

    public final String applovin() {
        return this.zzf;
    }

    /* renamed from: break, reason: not valid java name */
    public final /* synthetic */ void m788break(int i) {
        tapsense();
        this.zze.remove(i);
    }

    /* renamed from: case, reason: not valid java name */
    public final /* synthetic */ void m789case(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    /* renamed from: catch, reason: not valid java name */
    public final /* synthetic */ void m790catch(long j) {
        this.zzb |= 32;
        this.zzk = j;
    }

    /* renamed from: class, reason: not valid java name */
    public final int m791class() {
        return this.zzi;
    }

    public final long crashlytics() {
        return this.zzh;
    }

    /* renamed from: default, reason: not valid java name */
    public final /* synthetic */ void m792default(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final boolean firebase() {
        return (this.zzb & 8) != 0;
    }

    /* renamed from: goto, reason: not valid java name */
    public final long m793goto() {
        return this.zzk;
    }

    /* renamed from: implements, reason: not valid java name */
    public final /* synthetic */ void m794implements(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final int inmobi() {
        return this.zze.size();
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m795interface() {
        return (this.zzb & 32) != 0;
    }

    public final C13745e isPro(int i) {
        return (C13745e) this.zze.get(i);
    }

    public final List isVip() {
        return this.zze;
    }

    /* renamed from: native, reason: not valid java name */
    public final long m796native() {
        return this.zzl;
    }

    public final long premium() {
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
            return new C0537e(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", C13745e.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2266e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzn;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C2266e.class) {
            try {
                interfaceC11283e = zzn;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzm);
                    zzn = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m797protected() {
        this.zze = C9782e.f19327e;
    }

    public final /* synthetic */ void signatures(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final boolean subs() {
        return (this.zzb & 4) != 0;
    }

    public final void tapsense() {
        InterfaceC13229e interfaceC13229e = this.zze;
        if (((AbstractC1229e) interfaceC13229e).f3884e) {
            return;
        }
        this.zze = AbstractC1414e.advert(interfaceC13229e);
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m798this() {
        return (this.zzb & 64) != 0;
    }

    /* renamed from: throw, reason: not valid java name */
    public final /* synthetic */ void m799throw(int i, C13745e c13745e) {
        tapsense();
        this.zze.set(i, c13745e);
    }

    /* renamed from: try, reason: not valid java name */
    public final /* synthetic */ void m800try(Iterable iterable) {
        tapsense();
        AbstractC17836e.license(iterable, this.zze);
    }

    /* renamed from: while, reason: not valid java name */
    public final /* synthetic */ void m801while(C13745e c13745e) {
        c13745e.getClass();
        tapsense();
        this.zze.add(c13745e);
    }
}
