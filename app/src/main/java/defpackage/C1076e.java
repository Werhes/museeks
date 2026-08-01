package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1076e extends AbstractC11202e {
    private static final C1076e zze;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;

    static {
        C1076e c1076e = new C1076e();
        zze = c1076e;
        AbstractC11202e.billing(C1076e.class, c1076e);
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zze, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zzd"});
        }
        if (i2 == 3) {
            return new C1076e();
        }
        if (i2 == 4) {
            return new AbstractC10140e(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        throw null;
    }
}
