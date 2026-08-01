package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٞۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0466e extends AbstractC11202e {
    private static final C0466e zzk;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C0466e c0466e = new C0466e();
        zzk = c0466e;
        AbstractC11202e.billing(C0466e.class, c0466e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C11047e.f21922e, "zzh", C17354e.f34056e, "zzi", C4524e.f9805e, "zzj", C9616e.f19070e});
        }
        if (i2 == 3) {
            return new C0466e();
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
