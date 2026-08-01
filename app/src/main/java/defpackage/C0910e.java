package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0910e extends AbstractC17076e implements InterfaceC5238e {
    private static final C0910e zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = BuildConfig.FLAVOR;

    static {
        C0910e c0910e = new C0910e();
        zzb = c0910e;
        AbstractC17076e.yandex(C0910e.class, c0910e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", C11732e.ads, "zzg"});
        }
        if (i2 == 3) {
            return new C0910e();
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
