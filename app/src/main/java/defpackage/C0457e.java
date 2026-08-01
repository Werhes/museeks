package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٞٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0457e extends AbstractC11202e {
    private static final C0457e zzh;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;
    private long zzf;
    private C14096e zzg;

    static {
        C0457e c0457e = new C0457e();
        zzh = c0457e;
        AbstractC11202e.billing(C0457e.class, c0457e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0457e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }
}
