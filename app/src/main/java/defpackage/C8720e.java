package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8720e extends AbstractC15319e {
    private static final C8720e zzi;
    private static volatile InterfaceC11283e zzj;
    private int zzb;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C8720e c8720e = new C8720e();
        zzi = c8720e;
        AbstractC15319e.Signature(C8720e.class, c8720e);
    }

    public final int ads() {
        return this.zzh;
    }

    public final boolean applovin() {
        return (this.zzb & 8) != 0;
    }

    public final boolean inmobi() {
        return (this.zzb & 4) != 0;
    }

    public final boolean isPro() {
        return this.zzg;
    }

    public final boolean isVip() {
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
            return new C0537e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C8720e();
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
        synchronized (C8720e.class) {
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

    public final String signatures() {
        return this.zze;
    }

    public final boolean tapsense() {
        return (this.zzb & 2) != 0;
    }
}
