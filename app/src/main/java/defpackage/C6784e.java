package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۦؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6784e extends AbstractC15319e {
    private static final C6784e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private C10909e zze;
    private C9681e zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙۦؐ, eًٕؔ] */
    static {
        ?? abstractC15319e = new AbstractC15319e();
        zzg = abstractC15319e;
        AbstractC15319e.Signature(C6784e.class, abstractC15319e);
    }

    public static C15364e inmobi() {
        return (C15364e) zzg.mopub();
    }

    public static C6784e isVip(byte[] bArr, C17268e c17268e) {
        return (C6784e) AbstractC15319e.appmetrica(zzg, bArr, c17268e);
    }

    public final /* synthetic */ void isPro(C10909e c10909e) {
        this.zze = c10909e;
        this.zzb |= 1;
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
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
        synchronized (C6784e.class) {
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

    public final C10909e signatures() {
        C10909e c10909e = this.zze;
        return c10909e == null ? C10909e.m2939this() : c10909e;
    }

    public final C9681e tapsense() {
        C9681e c9681e = this.zzf;
        return c9681e == null ? C9681e.signatures() : c9681e;
    }
}
