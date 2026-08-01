package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6526e extends AbstractC17076e implements InterfaceC5238e {
    private static final C6526e zzb;
    private int zzd;
    private byte zzg = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;

    static {
        C6526e c6526e = new C6526e();
        zzb = c6526e;
        AbstractC17076e.yandex(C6526e.class, c6526e);
    }

    public static C6526e amazon() {
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
            return new C6526e();
        }
        if (i2 == 4) {
            return new C5434e(7, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
