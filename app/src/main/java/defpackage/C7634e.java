package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7634e extends AbstractC11202e {
    private static final C7634e zzk;
    private int zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private InterfaceC1958e zzh;
    private InterfaceC1958e zzi;
    private String zzj;

    static {
        C7634e c7634e = new C7634e();
        zzk = c7634e;
        AbstractC11202e.billing(C7634e.class, c7634e);
    }

    public C7634e() {
        C17026e c17026e = C17026e.f33352e;
        this.zzh = c17026e;
        this.zzi = c17026e;
        this.zzj = BuildConfig.FLAVOR;
    }

    @Override // defpackage.AbstractC11202e
    public final Object startapp(int i, AbstractC11202e abstractC11202e) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C17996e(zzk, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzb", "zzd", C12575e.f25226e, "zze", "zzf", C15802e.f31140e, "zzg", "zzh", C2874e.class, "zzi", C2874e.class, "zzj"});
        }
        if (i2 == 3) {
            return new C7634e();
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
