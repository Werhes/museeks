package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2874e extends AbstractC11202e {
    private static final C2874e zzf;
    private int zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;

    static {
        C2874e c2874e = new C2874e();
        zzf = c2874e;
        AbstractC11202e.billing(C2874e.class, c2874e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2874e();
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
