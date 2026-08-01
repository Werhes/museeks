package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15272e extends AbstractC15319e {
    private static final C15272e zze;
    private static volatile InterfaceC11283e zzf;
    private InterfaceC13229e zzb = C9782e.f19327e;

    static {
        C15272e c15272e = new C15272e();
        zze = c15272e;
        AbstractC15319e.Signature(C15272e.class, c15272e);
    }

    public static C15272e tapsense(byte[] bArr, C17268e c17268e) {
        return (C15272e) AbstractC15319e.appmetrica(zze, bArr, c17268e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new C15272e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzf;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C15272e.class) {
            try {
                interfaceC11283e = zzf;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zze);
                    zzf = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final List signatures() {
        return this.zzb;
    }
}
