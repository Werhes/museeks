package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۢۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5993e extends AbstractC15319e {
    private static final C5993e zzg;
    private static volatile InterfaceC11283e zzh;
    private int zzb;
    private int zze;
    private InterfaceC3927e zzf = C0878e.f3272e;

    static {
        C5993e c5993e = new C5993e();
        zzg = c5993e;
        AbstractC15319e.Signature(C5993e.class, c5993e);
    }

    public static C16564e applovin() {
        return (C16564e) zzg.mopub();
    }

    public final /* synthetic */ void ads(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final int inmobi() {
        return ((C0878e) this.zzf).size();
    }

    public final long isPro(int i) {
        return ((C0878e) this.zzf).billing(i);
    }

    public final List isVip() {
        return this.zzf;
    }

    public final void premium(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((AbstractC1229e) randomAccess).f3884e) {
            C0878e c0878e = (C0878e) randomAccess;
            int i = c0878e.f3274e;
            this.zzf = c0878e.applovin(i + i);
        }
        AbstractC17836e.license(list, this.zzf);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C5993e();
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
        synchronized (C5993e.class) {
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

    public final boolean signatures() {
        return (this.zzb & 1) != 0;
    }

    public final int tapsense() {
        return this.zze;
    }
}
