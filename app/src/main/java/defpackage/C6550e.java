package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٞۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6550e extends AbstractC17076e implements InterfaceC5238e {
    private static final C6550e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private AbstractC13532e zzf;
    private String zzg;
    private AbstractC13532e zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        C6550e c6550e = new C6550e();
        zzb = c6550e;
        AbstractC17076e.yandex(C6550e.class, c6550e);
    }

    public C6550e() {
        C2655e c2655e = AbstractC13532e.f26826e;
        this.zzf = c2655e;
        this.zzg = BuildConfig.FLAVOR;
        this.zzh = c2655e;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static /* synthetic */ void Signature(C6550e c6550e, AbstractC13532e abstractC13532e) {
        abstractC13532e.getClass();
        c6550e.zzd |= 8;
        c6550e.zzh = abstractC13532e;
    }

    public static C13873e amazon() {
        return (C13873e) zzb.license();
    }

    public static /* synthetic */ void loadAd(C6550e c6550e, AbstractC13532e abstractC13532e) {
        abstractC13532e.getClass();
        c6550e.zzd |= 2;
        c6550e.zzf = abstractC13532e;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new C6550e();
        }
        if (i2 == 4) {
            return new AbstractC15425e(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
