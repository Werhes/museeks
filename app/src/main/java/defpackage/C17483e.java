package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17483e extends AbstractC17076e implements InterfaceC5238e {
    private static final C17483e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private C12126e zzj;
    private C12126e zzk;

    static {
        C17483e c17483e = new C17483e();
        zzb = c17483e;
        AbstractC17076e.yandex(C17483e.class, c17483e);
    }

    public static C17483e Signature() {
        return zzb;
    }

    public final String admob() {
        return this.zzf;
    }

    public final C12126e amazon() {
        C12126e c12126e = this.zzk;
        return c12126e == null ? C12126e.pro() : c12126e;
    }

    public final C12126e loadAd() {
        C12126e c12126e = this.zzj;
        return c12126e == null ? C12126e.pro() : c12126e;
    }

    public final String pro() {
        return this.zzi;
    }

    public final String remoteconfig() {
        return this.zzh;
    }

    public final String signatures() {
        return this.zze;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C17483e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String subscription() {
        return this.zzg;
    }
}
