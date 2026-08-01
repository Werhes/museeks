package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15502e extends AbstractC15319e {
    private static final C15502e zzj;
    private static volatile InterfaceC11283e zzk;
    private int zzb;
    private int zze;
    private InterfaceC13229e zzf;
    private InterfaceC13229e zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C15502e c15502e = new C15502e();
        zzj = c15502e;
        AbstractC15319e.Signature(C15502e.class, c15502e);
    }

    public C15502e() {
        C9782e c9782e = C9782e.f19327e;
        this.zzf = c9782e;
        this.zzg = c9782e;
    }

    public final int ads() {
        return this.zzg.size();
    }

    public final InterfaceC13229e applovin() {
        return this.zzg;
    }

    public final void crashlytics(int i, C12919e c12919e) {
        InterfaceC13229e interfaceC13229e = this.zzg;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzg = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzg.set(i, c12919e);
    }

    public final int inmobi() {
        return this.zzf.size();
    }

    public final C4512e isPro(int i) {
        return (C4512e) this.zzf.get(i);
    }

    public final List isVip() {
        return this.zzf;
    }

    public final C12919e premium(int i) {
        return (C12919e) this.zzg.get(i);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", C4512e.class, "zzg", C12919e.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C15502e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzk;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C15502e.class) {
            try {
                interfaceC11283e = zzk;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzj);
                    zzk = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final void subs(int i, C4512e c4512e) {
        InterfaceC13229e interfaceC13229e = this.zzf;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzf = AbstractC1414e.advert(interfaceC13229e);
        }
        this.zzf.set(i, c4512e);
    }

    public final int tapsense() {
        return this.zze;
    }
}
