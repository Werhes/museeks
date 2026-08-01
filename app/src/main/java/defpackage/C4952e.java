package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4952e extends AbstractC15319e {
    private static final C4952e zzi;
    private static volatile InterfaceC11283e zzj;
    private int zzb;
    private C0973e zze;
    private C4103e zzf;
    private boolean zzg;
    private String zzh = BuildConfig.FLAVOR;

    static {
        C4952e c4952e = new C4952e();
        zzi = c4952e;
        AbstractC15319e.Signature(C4952e.class, c4952e);
    }

    public static C4952e subs() {
        return zzi;
    }

    public final boolean ads() {
        return (this.zzb & 8) != 0;
    }

    public final boolean applovin() {
        return this.zzg;
    }

    public final /* synthetic */ void crashlytics(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    public final C4103e inmobi() {
        C4103e c4103e = this.zzf;
        return c4103e == null ? C4103e.crashlytics() : c4103e;
    }

    public final boolean isPro() {
        return (this.zzb & 4) != 0;
    }

    public final boolean isVip() {
        return (this.zzb & 2) != 0;
    }

    public final String premium() {
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
            return new C0537e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C4952e();
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
        synchronized (C4952e.class) {
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

    public final C0973e tapsense() {
        C0973e c0973e = this.zze;
        return c0973e == null ? C0973e.premium() : c0973e;
    }
}
