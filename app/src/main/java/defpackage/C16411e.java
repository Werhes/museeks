package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16411e extends AbstractC17076e implements InterfaceC5238e {
    private static final C16411e zzb;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C16411e c16411e = new C16411e();
        zzb = c16411e;
        AbstractC17076e.yandex(C16411e.class, c16411e);
    }

    public static C16411e amazon() {
        return zzb;
    }

    public final String Signature() {
        return this.zze;
    }

    public final int admob() {
        int i;
        int i2 = this.zzf;
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

    public final String loadAd() {
        return this.zzg;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", C11732e.license, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C16411e();
        }
        if (i2 == 4) {
            return new C5434e(8, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
