package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1700e extends AbstractC17076e implements InterfaceC5238e {
    private static final C1700e zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C1700e c1700e = new C1700e();
        zzb = c1700e;
        AbstractC17076e.yandex(C1700e.class, c1700e);
    }

    public static C1700e amazon() {
        return zzb;
    }

    public final String Signature() {
        return this.zzf;
    }

    public final String loadAd() {
        return this.zze;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C1700e();
        }
        if (i2 == 4) {
            return new C5434e(5, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
