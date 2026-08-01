package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12032e extends AbstractC17076e implements InterfaceC5238e {
    private static final C12032e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        C12032e c12032e = new C12032e();
        zzb = c12032e;
        AbstractC17076e.yandex(C12032e.class, c12032e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C12032e();
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
