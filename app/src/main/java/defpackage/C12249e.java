package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12249e extends AbstractC17076e implements InterfaceC5238e {
    private static final C12249e zzb;
    private int zzd;
    private C4164e zzj;
    private C2101e zzk;
    private byte zzl = 2;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private InterfaceC6692e zzg = C10506e.f20729e;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;

    static {
        C12249e c12249e = new C12249e();
        zzb = c12249e;
        AbstractC17076e.yandex(C12249e.class, c12249e);
        C2101e amazon = C2101e.amazon();
        EnumC1699e enumC1699e = EnumC1699e.f4631e;
        if (amazon == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", C11732e.vip, "zzh", "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new C12249e();
        }
        if (i2 == 4) {
            return new C5434e(4, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = abstractC17076e == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
