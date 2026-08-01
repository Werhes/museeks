package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3829e extends AbstractC11202e {
    private static final C3829e zzg;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private InterfaceC5846e zzf = C16882e.f33084e;

    static {
        C3829e c3829e = new C3829e();
        zzg = c3829e;
        AbstractC11202e.billing(C3829e.class, c3829e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zzb", "zzd", "zze", "zzf", C4524e.f9817e});
        }
        if (i2 == 3) {
            return new C3829e();
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
