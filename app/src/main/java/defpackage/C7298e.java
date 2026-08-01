package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7298e extends AbstractC15319e {
    private static final C7298e zzk;
    private static volatile InterfaceC11283e zzl;
    private int zzb;
    private int zze;
    private InterfaceC13229e zzf = C9782e.f19327e;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private boolean zzi;
    private double zzj;

    static {
        C7298e c7298e = new C7298e();
        zzk = c7298e;
        AbstractC15319e.Signature(C7298e.class, c7298e);
    }

    public final boolean ads() {
        return (this.zzb & 16) != 0;
    }

    public final boolean applovin() {
        return this.zzi;
    }

    public final String inmobi() {
        return this.zzh;
    }

    public final boolean isPro() {
        return (this.zzb & 8) != 0;
    }

    public final boolean isVip() {
        return (this.zzb & 4) != 0;
    }

    public final double premium() {
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
            return new C0537e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", C13746e.Signature, "zzf", C7298e.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C7298e();
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
        synchronized (C7298e.class) {
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

    public final List signatures() {
        return this.zzf;
    }

    public final int subs() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String tapsense() {
        return this.zzg;
    }
}
