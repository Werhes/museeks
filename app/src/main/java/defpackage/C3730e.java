package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۤ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3730e extends AbstractC11202e {
    private static final C3730e zzm;
    private int zzb;
    private long zze;
    private long zzf;
    private int zzh;
    private boolean zzi;
    private long zzk;
    private long zzl;
    private String zzd = BuildConfig.FLAVOR;
    private InterfaceC1958e zzg = C17026e.f33352e;
    private String zzj = BuildConfig.FLAVOR;

    static {
        C3730e c3730e = new C3730e();
        zzm = c3730e;
        AbstractC11202e.billing(C3730e.class, c3730e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u001b\u0005င\u0003\u0006ဇ\u0004\u0007ဈ\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C6146e.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C3730e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        throw null;
    }
}
