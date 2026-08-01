package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9296e extends AbstractC17076e implements InterfaceC5238e {
    private static final C9296e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;

    static {
        C9296e c9296e = new C9296e();
        zzb = c9296e;
        AbstractC17076e.yandex(C9296e.class, c9296e);
    }

    public static C9296e amazon() {
        return zzb;
    }

    public final String Signature() {
        return this.zze;
    }

    public final String admob() {
        return this.zzj;
    }

    public final String loadAd() {
        return this.zzh;
    }

    public final String pro() {
        return this.zzf;
    }

    public final String remoteconfig() {
        return this.zzg;
    }

    public final String signatures() {
        return this.zzk;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C9296e();
        }
        if (i2 == 4) {
            return new C5434e(10, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String subscription() {
        return this.zzi;
    }
}
