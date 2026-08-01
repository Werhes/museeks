package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9486e extends AbstractC15319e {
    private static final C9486e zzh;
    private static volatile InterfaceC11283e zzi;
    private InterfaceC3927e zzb;
    private InterfaceC3927e zze;
    private InterfaceC13229e zzf;
    private InterfaceC13229e zzg;

    static {
        C9486e c9486e = new C9486e();
        zzh = c9486e;
        AbstractC15319e.Signature(C9486e.class, c9486e);
    }

    public C9486e() {
        C0878e c0878e = C0878e.f3272e;
        this.zzb = c0878e;
        this.zze = c0878e;
        C9782e c9782e = C9782e.f19327e;
        this.zzf = c9782e;
        this.zzg = c9782e;
    }

    public static C9486e crashlytics() {
        return zzh;
    }

    public static C9532e subs() {
        return (C9532e) zzh.mopub();
    }

    public final InterfaceC13229e ads() {
        return this.zzg;
    }

    public final int applovin() {
        return this.zzf.size();
    }

    /* renamed from: class, reason: not valid java name */
    public final void m2576class() {
        this.zzb = C0878e.f3272e;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2577extends(Iterable iterable) {
        InterfaceC13229e interfaceC13229e = this.zzg;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzg = AbstractC1414e.advert(interfaceC13229e);
        }
        AbstractC17836e.license(iterable, this.zzg);
    }

    public final void firebase(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((AbstractC1229e) randomAccess).f3884e) {
            C0878e c0878e = (C0878e) randomAccess;
            int i = c0878e.f3274e;
            this.zzb = c0878e.applovin(i + i);
        }
        AbstractC17836e.license(iterable, this.zzb);
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2578goto() {
        this.zze = C0878e.f3272e;
    }

    public final int inmobi() {
        return ((C0878e) this.zze).size();
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2579interface(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((AbstractC1229e) randomAccess).f3884e) {
            C0878e c0878e = (C0878e) randomAccess;
            int i = c0878e.f3274e;
            this.zze = c0878e.applovin(i + i);
        }
        AbstractC17836e.license(list, this.zze);
    }

    public final InterfaceC13229e isPro() {
        return this.zzf;
    }

    public final List isVip() {
        return this.zze;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m2580native() {
        this.zzf = C9782e.f19327e;
    }

    public final int premium() {
        return this.zzg.size();
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", C6293e.class, "zzg", C5993e.class});
        }
        if (i2 == 3) {
            return new C9486e();
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
        synchronized (C9486e.class) {
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

    public final List signatures() {
        return this.zzb;
    }

    public final int tapsense() {
        return ((C0878e) this.zzb).size();
    }

    /* renamed from: this, reason: not valid java name */
    public final void m2581this(ArrayList arrayList) {
        InterfaceC13229e interfaceC13229e = this.zzf;
        if (!((AbstractC1229e) interfaceC13229e).f3884e) {
            this.zzf = AbstractC1414e.advert(interfaceC13229e);
        }
        AbstractC17836e.license(arrayList, this.zzf);
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m2582throw() {
        this.zzg = C9782e.f19327e;
    }
}
