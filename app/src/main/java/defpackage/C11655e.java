package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11655e extends AbstractC11202e {
    private static final C11655e zzg;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private int zze;
    private C10735e zzf;

    static {
        C11655e c11655e = new C11655e();
        zzg = c11655e;
        AbstractC11202e.billing(C11655e.class, c11655e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", C12575e.f25233e, "zzf"});
        }
        if (i2 == 3) {
            return new C11655e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
