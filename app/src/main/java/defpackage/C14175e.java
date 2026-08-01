package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14175e extends AbstractC15319e {
    private static final C14175e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٓۗؗ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzg = abstractC15319e;
        AbstractC15319e.Signature(C14175e.class, abstractC15319e);
    }

    public static C15977e signatures() {
        return (C15977e) zzg.mopub();
    }

    public final /* synthetic */ void inmobi(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void isPro(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }

    public final int isVip() {
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

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", C13746e.startapp, "zzf", C13746e.adcel});
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
        synchronized (C14175e.class) {
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

    public final int tapsense() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
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
