package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10909e extends AbstractC15319e {
    private static final InterfaceC4873e zzl = new C8455e(23);
    private static final C10909e zzq;
    private static volatile InterfaceC11283e zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private InterfaceC13229e zzi;
    private InterfaceC13229e zzj;
    private InterfaceC7569e zzk;
    private C6498e zzm;
    private boolean zzn;
    private boolean zzo;
    private C8398e zzp;
    private AbstractC7244e zze = AbstractC7244e.f14800e;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C10909e c10909e = new C10909e();
        zzq = c10909e;
        AbstractC15319e.Signature(C10909e.class, c10909e);
    }

    public C10909e() {
        C9782e c9782e = C9782e.f19327e;
        this.zzi = c9782e;
        this.zzj = c9782e;
        this.zzk = C5407e.f11592e;
    }

    /* renamed from: goto, reason: not valid java name */
    public static C16307e m2938goto() {
        return (C16307e) zzq.mopub();
    }

    /* renamed from: this, reason: not valid java name */
    public static C10909e m2939this() {
        return zzq;
    }

    public final InterfaceC13229e ads() {
        return this.zzj;
    }

    public final InterfaceC13229e applovin() {
        return this.zzi;
    }

    /* renamed from: class, reason: not valid java name */
    public final boolean m2940class() {
        return this.zzo;
    }

    public final C6498e crashlytics() {
        C6498e c6498e = this.zzm;
        return c6498e == null ? C6498e.isVip() : c6498e;
    }

    public final boolean firebase() {
        return this.zzn;
    }

    public final String inmobi() {
        return this.zzg;
    }

    /* renamed from: interface, reason: not valid java name */
    public final C8398e m2941interface() {
        C8398e c8398e = this.zzp;
        return c8398e == null ? C8398e.tapsense() : c8398e;
    }

    public final long isPro() {
        return this.zzh;
    }

    public final boolean isVip() {
        return this.zzf;
    }

    /* renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m2942native(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final List premium() {
        return new C5959e(this.zzk, zzl);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C13746e.vip, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new C10909e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzr;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C10909e.class) {
            try {
                interfaceC11283e = zzr;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzq);
                    zzr = interfaceC11283e;
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

    public final boolean subs() {
        return (this.zzb & 16) != 0;
    }

    public final AbstractC7244e tapsense() {
        return this.zze;
    }
}
