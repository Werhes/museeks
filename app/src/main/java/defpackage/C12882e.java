package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12882e extends AbstractC17076e implements InterfaceC5238e {
    private static final C12882e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private InterfaceC5024e zzf = C0885e.f3279e;

    static {
        C12882e c12882e = new C12882e();
        zzb = c12882e;
        AbstractC17076e.yandex(C12882e.class, c12882e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C11076e.class});
        }
        if (i2 == 3) {
            return new C12882e();
        }
        if (i2 == 4) {
            return new C5434e(22, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
