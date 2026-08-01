package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12196e extends AbstractC17076e implements InterfaceC5238e {
    private static final C12196e zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = BuildConfig.FLAVOR;
    private String zzm = BuildConfig.FLAVOR;

    static {
        C12196e c12196e = new C12196e();
        zzb = c12196e;
        AbstractC17076e.yandex(C12196e.class, c12196e);
    }

    @Override // defpackage.AbstractC17076e
    public final Object smaato(int i, AbstractC17076e abstractC17076e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            C11732e c11732e = C11732e.pro;
            return new C5166e(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", C11732e.signatures, "zzg", "zzh", C11732e.remoteconfig, "zzi", c11732e, "zzj", c11732e, "zzk", c11732e, "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new C12196e();
        }
        if (i2 == 4) {
            return new C5434e(26, zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
