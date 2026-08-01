package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3476e extends AbstractC17076e implements InterfaceC5238e {
    private static final C3476e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;
    private String zzk = BuildConfig.FLAVOR;
    private String zzl = BuildConfig.FLAVOR;
    private String zzm = BuildConfig.FLAVOR;
    private String zzn = BuildConfig.FLAVOR;
    private String zzo = BuildConfig.FLAVOR;
    private String zzp = BuildConfig.FLAVOR;
    private String zzq = BuildConfig.FLAVOR;
    private String zzr = BuildConfig.FLAVOR;

    static {
        C3476e c3476e = new C3476e();
        zzb = c3476e;
        AbstractC17076e.yandex(C3476e.class, c3476e);
    }

    public static C3476e amazon() {
        return zzb;
    }

    public final String Signature() {
        return this.zzl;
    }

    public final String admob() {
        return this.zzj;
    }

    public final String ads() {
        return this.zzn;
    }

    public final String applovin() {
        return this.zzh;
    }

    public final String inmobi() {
        return this.zzo;
    }

    public final String isPro() {
        return this.zzr;
    }

    public final String isVip() {
        return this.zzi;
    }

    public final String loadAd() {
        return this.zzk;
    }

    public final String premium() {
        return this.zzg;
    }

    public final String pro() {
        return this.zze;
    }

    public final String remoteconfig() {
        return this.zzq;
    }

    public final String signatures() {
        return this.zzp;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new C3476e();
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
        return this.zzm;
    }

    public final String tapsense() {
        return this.zzf;
    }
}
