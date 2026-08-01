package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؐؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12939e extends AbstractC15319e {
    private static final C12939e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [eْؐؓ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzg = abstractC15319e;
        AbstractC15319e.Signature(C12939e.class, abstractC15319e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            C13746e c13746e = C13746e.purchase;
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", c13746e, "zzf", c13746e});
        }
        if (i2 == 3) {
            return new AbstractC15319e();
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
        synchronized (C12939e.class) {
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

    public final int signatures() {
        int metrica = AbstractC10423e.metrica(this.zze);
        if (metrica == 0) {
            return 1;
        }
        return metrica;
    }

    public final int tapsense() {
        int metrica = AbstractC10423e.metrica(this.zzf);
        if (metrica == 0) {
            return 1;
        }
        return metrica;
    }
}
