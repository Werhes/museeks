package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4089e extends AbstractC15319e {
    private static final C4089e zze;
    private static volatile InterfaceC11283e zzf;
    private C8926e zzb = C8926e.f17888e;

    static {
        C4089e c4089e = new C4089e();
        zze = c4089e;
        AbstractC15319e.Signature(C4089e.class, c4089e);
    }

    public static C4089e tapsense() {
        return zze;
    }

    public final C8926e isVip() {
        C8926e c8926e = this.zzb;
        if (!c8926e.f17889e) {
            this.zzb = c8926e.ad();
        }
        return this.zzb;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", AbstractC8934e.ad});
        }
        if (i2 == 3) {
            return new C4089e();
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
        synchronized (C4089e.class) {
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

    public final C7459e signatures(String str, C7459e c7459e) {
        str.getClass();
        C7459e c7459e2 = (C7459e) this.zzb.get(str);
        return c7459e2 != null ? c7459e2 : c7459e;
    }
}
