package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10110e extends AbstractC15319e {
    private static final C10110e zzw;
    private static volatile InterfaceC11283e zzx;
    private int zzb;
    private long zze;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;
    private InterfaceC13229e zzh;
    private InterfaceC13229e zzi;
    private InterfaceC13229e zzj;
    private String zzk;
    private boolean zzl;
    private InterfaceC13229e zzm;
    private InterfaceC13229e zzn;
    private String zzo;
    private String zzp;
    private C12607e zzq;
    private C5892e zzr;
    private C11965e zzs;
    private C11719e zzt;
    private C15509e zzu;
    private InterfaceC7569e zzv;

    static {
        C10110e c10110e = new C10110e();
        zzw = c10110e;
        AbstractC15319e.Signature(C10110e.class, c10110e);
    }

    public C10110e() {
        C9782e c9782e = C9782e.f19327e;
        this.zzh = c9782e;
        this.zzi = c9782e;
        this.zzj = c9782e;
        this.zzk = BuildConfig.FLAVOR;
        this.zzm = c9782e;
        this.zzn = c9782e;
        this.zzo = BuildConfig.FLAVOR;
        this.zzp = BuildConfig.FLAVOR;
        this.zzv = C5407e.f11592e;
    }

    /* renamed from: throw, reason: not valid java name */
    public static C0344e m2761throw() {
        return (C0344e) zzw.mopub();
    }

    /* renamed from: while, reason: not valid java name */
    public static C10110e m2762while() {
        return zzw;
    }

    public final C8720e ads(int i) {
        return (C8720e) this.zzi.get(i);
    }

    public final int applovin() {
        return this.zzi.size();
    }

    /* renamed from: break, reason: not valid java name */
    public final void m2763break() {
        this.zzm = C9782e.f19327e;
    }

    /* renamed from: class, reason: not valid java name */
    public final String m2764class() {
        return this.zzo;
    }

    public final int crashlytics() {
        return this.zzm.size();
    }

    /* renamed from: extends, reason: not valid java name */
    public final InterfaceC7569e m2765extends() {
        return this.zzv;
    }

    public final InterfaceC13229e firebase() {
        return this.zzn;
    }

    /* renamed from: goto, reason: not valid java name */
    public final C12607e m2766goto() {
        C12607e c12607e = this.zzq;
        return c12607e == null ? C12607e.ads() : c12607e;
    }

    public final String inmobi() {
        return this.zzf;
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m2767interface() {
        return (this.zzb & 128) != 0;
    }

    public final InterfaceC13229e isPro() {
        return this.zzh;
    }

    public final boolean isVip() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: native, reason: not valid java name */
    public final C11965e m2768native() {
        C11965e c11965e = this.zzs;
        return c11965e == null ? C11965e.isVip() : c11965e;
    }

    public final List premium() {
        return this.zzj;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", C17330e.class, "zzi", C8720e.class, "zzj", C15502e.class, "zzk", "zzl", "zzm", C17226e.class, "zzn", C9511e.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new C10110e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzx;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C10110e.class) {
            try {
                interfaceC11283e = zzx;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzw);
                    zzx = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m2769protected() {
        this.zzj = C9782e.f19327e;
    }

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final InterfaceC13229e subs() {
        return this.zzm;
    }

    public final long tapsense() {
        return this.zze;
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m2770this() {
        return (this.zzb & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0;
    }

    /* renamed from: try, reason: not valid java name */
    public final void m2771try(int i, C8720e c8720e) {
        InterfaceC13229e interfaceC13229e = this.zzi;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzi = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzi.set(i, c8720e);
    }
}
