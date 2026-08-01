package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15693e extends AbstractC17076e implements InterfaceC5238e {
    private static final C15693e zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private C0264e zzf;

    static {
        C15693e c15693e = new C15693e();
        zzb = c15693e;
        AbstractC17076e.yandex(C15693e.class, c15693e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C5166e(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C15693e();
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
