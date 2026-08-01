package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17200e extends AbstractC17076e implements InterfaceC5238e {
    private static final C17200e zzb;
    private int zzd;
    private int zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        C17200e c17200e = new C17200e();
        zzb = c17200e;
        AbstractC17076e.yandex(C17200e.class, c17200e);
    }

    public static C17200e amazon() {
        return zzb;
    }

    public final String Signature() {
        return this.zzh;
    }

    public final String admob() {
        return this.zzg;
    }

    public final String loadAd() {
        return this.zzf;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", C11732e.subs, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C17200e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int subscription() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
