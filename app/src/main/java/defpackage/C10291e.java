package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10291e extends AbstractC15319e {
    private static final C10291e zzh;
    private static volatile InterfaceC11283e zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًٕؔ, eَٖؖ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzh = abstractC15319e;
        AbstractC15319e.Signature(C10291e.class, abstractC15319e);
    }

    public final int isVip() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", C13746e.purchase, "zzf", C13746e.appmetrica, "zzg", C13746e.billing});
        }
        if (i2 == 3) {
            return new AbstractC15319e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzi;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C10291e.class) {
            try {
                interfaceC11283e = zzi;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzh);
                    zzi = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final int signatures() {
        int metrica = AbstractC10423e.metrica(this.zze);
        if (metrica == 0) {
            return 1;
        }
        return metrica;
    }

    public final int tapsense() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
