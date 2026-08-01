package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13745e extends AbstractC15319e {
    private static final C13745e zzk;
    private static volatile InterfaceC11283e zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC13229e zzj = C9782e.f19327e;

    static {
        C13745e c13745e = new C13745e();
        zzk = c13745e;
        AbstractC15319e.Signature(C13745e.class, c13745e);
    }

    /* renamed from: interface, reason: not valid java name */
    public static C3271e m3639interface() {
        return (C3271e) zzk.mopub();
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m3640abstract() {
        this.zzj = C9782e.f19327e;
    }

    public final boolean ads() {
        return (this.zzb & 8) != 0;
    }

    public final long applovin() {
        return this.zzg;
    }

    /* renamed from: break, reason: not valid java name */
    public final void m3641break(ArrayList arrayList) {
        InterfaceC13229e interfaceC13229e = this.zzj;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzj = AbstractC1414e.advert(interfaceC13229e);
        }
        AbstractC17836e.license(arrayList, this.zzj);
    }

    /* renamed from: class, reason: not valid java name */
    public final int m3642class() {
        return this.zzj.size();
    }

    public final double crashlytics() {
        return this.zzi;
    }

    /* renamed from: extends, reason: not valid java name */
    public final /* synthetic */ void m3643extends(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final InterfaceC13229e firebase() {
        return this.zzj;
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m3644goto(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final String inmobi() {
        return this.zzf;
    }

    public final boolean isPro() {
        return (this.zzb & 4) != 0;
    }

    public final boolean isVip() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: native, reason: not valid java name */
    public final /* synthetic */ void m3645native() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final float premium() {
        return this.zzh;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C13745e.class});
        }
        if (i2 == 3) {
            return new C13745e();
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
        synchronized (C13745e.class) {
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

    /* renamed from: protected, reason: not valid java name */
    public final void m3646protected(C13745e c13745e) {
        InterfaceC13229e interfaceC13229e = this.zzj;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzj = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzj.add(c13745e);
    }

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final boolean subs() {
        return (this.zzb & 16) != 0;
    }

    public final String tapsense() {
        return this.zze;
    }

    /* renamed from: this, reason: not valid java name */
    public final /* synthetic */ void m3647this(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* renamed from: throw, reason: not valid java name */
    public final /* synthetic */ void m3648throw() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    /* renamed from: try, reason: not valid java name */
    public final /* synthetic */ void m3649try() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    /* renamed from: while, reason: not valid java name */
    public final /* synthetic */ void m3650while(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }
}
