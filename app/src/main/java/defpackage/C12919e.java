package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12919e extends AbstractC15319e {
    private static final C12919e zzm;
    private static volatile InterfaceC11283e zzn;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC13229e zzg = C9782e.f19327e;
    private boolean zzh;
    private C4103e zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C12919e c12919e = new C12919e();
        zzm = c12919e;
        AbstractC15319e.Signature(C12919e.class, c12919e);
    }

    /* renamed from: interface, reason: not valid java name */
    public static C1057e m3420interface() {
        return (C1057e) zzm.mopub();
    }

    public final boolean ads() {
        return (this.zzb & 8) != 0;
    }

    public final C4952e applovin(int i) {
        return (C4952e) this.zzg.get(i);
    }

    /* renamed from: class, reason: not valid java name */
    public final boolean m3421class() {
        return this.zzl;
    }

    public final boolean crashlytics() {
        return this.zzk;
    }

    public final boolean firebase() {
        return (this.zzb & 64) != 0;
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m3422goto(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final List inmobi() {
        return this.zzg;
    }

    public final int isPro() {
        return this.zzg.size();
    }

    public final String isVip() {
        return this.zzf;
    }

    public final C4103e premium() {
        C4103e c4103e = this.zzi;
        return c4103e == null ? C4103e.crashlytics() : c4103e;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", C4952e.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C12919e();
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
        synchronized (C12919e.class) {
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

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final boolean subs() {
        return this.zzj;
    }

    public final int tapsense() {
        return this.zze;
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3423this(int i, C4952e c4952e) {
        InterfaceC13229e interfaceC13229e = this.zzg;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzg = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzg.set(i, c4952e);
    }
}
