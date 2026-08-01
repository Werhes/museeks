package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17226e extends AbstractC15319e {
    private static final C17226e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private InterfaceC13229e zze = C9782e.f19327e;
    private C10881e zzf;

    static {
        C17226e c17226e = new C17226e();
        zzg = c17226e;
        AbstractC15319e.Signature(C17226e.class, c17226e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", C7298e.class, "zzf"});
        }
        if (i2 == 3) {
            return new C17226e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzh;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C17226e.class) {
            try {
                interfaceC11283e = zzh;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzg);
                    zzh = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final List signatures() {
        return this.zze;
    }

    public final C10881e tapsense() {
        C10881e c10881e = this.zzf;
        return c10881e == null ? C10881e.isVip() : c10881e;
    }
}
