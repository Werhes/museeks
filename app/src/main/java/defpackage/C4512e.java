package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4512e extends AbstractC15319e {
    private static final C4512e zzk;
    private static volatile InterfaceC11283e zzl;
    private int zzb;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private C4952e zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C4512e c4512e = new C4512e();
        zzk = c4512e;
        AbstractC15319e.Signature(C4512e.class, c4512e);
    }

    public static C17821e subs() {
        return (C17821e) zzk.mopub();
    }

    public final boolean ads() {
        return (this.zzb & 32) != 0;
    }

    public final boolean applovin() {
        return this.zzi;
    }

    public final /* synthetic */ void crashlytics(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final C4952e inmobi() {
        C4952e c4952e = this.zzg;
        return c4952e == null ? C4952e.subs() : c4952e;
    }

    public final boolean isPro() {
        return this.zzh;
    }

    public final String isVip() {
        return this.zzf;
    }

    public final boolean premium() {
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
            return new C0537e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C4512e();
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
        synchronized (C4512e.class) {
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

    public final int tapsense() {
        return this.zze;
    }
}
