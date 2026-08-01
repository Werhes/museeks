package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12275e extends AbstractC11202e {
    private static final C12275e zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private String zzg = BuildConfig.FLAVOR;
    private String zzj = BuildConfig.FLAVOR;

    static {
        C12275e c12275e = new C12275e();
        zzk = c12275e;
        AbstractC11202e.billing(C12275e.class, c12275e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C12275e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }
}
