package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6146e extends AbstractC11202e {
    private static final C6146e zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;

    static {
        C6146e c6146e = new C6146e();
        zzf = c6146e;
        AbstractC11202e.billing(C6146e.class, c6146e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new C6146e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
