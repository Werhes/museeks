package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0973e extends AbstractC15319e {
    private static final C0973e zzi;
    private static volatile InterfaceC11283e zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC13229e zzh = C9782e.f19327e;

    static {
        C0973e c0973e = new C0973e();
        zzi = c0973e;
        AbstractC15319e.Signature(C0973e.class, c0973e);
    }

    public static C0973e premium() {
        return zzi;
    }

    public final int ads() {
        return this.zzh.size();
    }

    public final InterfaceC13229e applovin() {
        return this.zzh;
    }

    public final boolean inmobi() {
        return (this.zzb & 4) != 0;
    }

    public final boolean isPro() {
        return this.zzg;
    }

    public final String isVip() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", C13746e.license, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C0973e();
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
        synchronized (C0973e.class) {
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

    public final int subs() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final boolean tapsense() {
        return (this.zzb & 2) != 0;
    }
}
