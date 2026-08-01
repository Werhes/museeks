package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11178e extends AbstractC17076e implements InterfaceC5238e {
    private static final C11178e zzb;
    private int zzd;
    private C2153e zzj;
    private C9515e zzl;
    private String zze = BuildConfig.FLAVOR;
    private AbstractC13532e zzf = AbstractC13532e.f26826e;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private int zzk = 1;
    private int zzm = 320;
    private int zzn = 4;
    private int zzo = 2;

    static {
        C11178e c11178e = new C11178e();
        zzb = c11178e;
        AbstractC17076e.yandex(C11178e.class, c11178e);
    }

    public static /* synthetic */ void Signature(C11178e c11178e, AbstractC13532e abstractC13532e) {
        abstractC13532e.getClass();
        c11178e.zzd |= 2;
        c11178e.zzf = abstractC13532e;
    }

    public static C1868e amazon() {
        return (C1868e) zzb.license();
    }

    public static /* synthetic */ void loadAd(C11178e c11178e, C2153e c2153e) {
        c11178e.zzj = c2153e;
        c11178e.zzd |= 32;
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new C11178e();
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
