package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0812e extends AbstractC15319e {
    private static final C0812e zzh;
    private static volatile InterfaceC11283e zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [eًؒؔ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzh = abstractC15319e;
        AbstractC15319e.Signature(C0812e.class, abstractC15319e);
    }

    public static C0812e isVip() {
        return zzh;
    }

    public static C1907e tapsense() {
        return (C1907e) zzh.mopub();
    }

    public final /* synthetic */ void ads(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final int applovin() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final void inmobi(int i) {
        this.zzf = AbstractC1414e.metrica(i);
        this.zzb |= 2;
    }

    public final int isPro() {
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

    public final /* synthetic */ void premium(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", C13746e.loadAd, "zzf", C13746e.smaato, "zzg", C13746e.amazon});
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
        synchronized (C0812e.class) {
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
        int vip = AbstractC1414e.vip(this.zzf);
        if (vip == 0) {
            return 1;
        }
        return vip;
    }
}
