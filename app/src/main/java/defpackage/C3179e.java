package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3179e extends AbstractC15319e {
    private static final C3179e zzi;
    private static volatile InterfaceC11283e zzj;
    private int zzb;
    private InterfaceC13229e zze = C9782e.f19327e;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private int zzh;

    static {
        C3179e c3179e = new C3179e();
        zzi = c3179e;
        AbstractC15319e.Signature(C3179e.class, c3179e);
    }

    public static C16393e premium() {
        return (C16393e) zzi.mopub();
    }

    public static C16393e subs(C3179e c3179e) {
        AbstractC6041e mopub = zzi.mopub();
        mopub.purchase(c3179e);
        return (C16393e) mopub;
    }

    public final String ads() {
        return this.zzg;
    }

    public final boolean applovin() {
        return (this.zzb & 2) != 0;
    }

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ void m1290class(ArrayList arrayList) {
        m1293native();
        AbstractC17836e.license(arrayList, this.zze);
    }

    public final /* synthetic */ void crashlytics(int i, C2709e c2709e) {
        m1293native();
        this.zze.set(i, c2709e);
    }

    public final /* synthetic */ void firebase(C2709e c2709e) {
        m1293native();
        this.zze.add(c2709e);
    }

    /* renamed from: goto, reason: not valid java name */
    public final /* synthetic */ void m1291goto(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final boolean inmobi() {
        return (this.zzb & 1) != 0;
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m1292interface() {
        this.zze = C9782e.f19327e;
    }

    public final String isPro() {
        return this.zzf;
    }

    public final C2709e isVip(int i) {
        return (C2709e) this.zze.get(i);
    }

    /* renamed from: native, reason: not valid java name */
    public final void m1293native() {
        InterfaceC13229e interfaceC13229e = this.zze;
        if (((AbstractC1229e) interfaceC13229e).f3884e) {
            return;
        }
        this.zze = AbstractC1414e.advert(interfaceC13229e);
    }

    @Override // defpackage.AbstractC15319e
    public final Object pro(int i) {
        InterfaceC11283e interfaceC11283e;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C0537e(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", C2709e.class, "zzf", "zzg", "zzh", C13746e.mopub});
        }
        if (i2 == 3) {
            return new C3179e();
        }
        if (i2 == 4) {
            return new AbstractC6041e(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        InterfaceC11283e interfaceC11283e2 = zzj;
        if (interfaceC11283e2 != null) {
            return interfaceC11283e2;
        }
        synchronized (C3179e.class) {
            try {
                interfaceC11283e = zzj;
                if (interfaceC11283e == null) {
                    interfaceC11283e = new C3466e(zzi);
                    zzj = interfaceC11283e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC11283e;
    }

    public final List signatures() {
        return this.zze;
    }

    public final int tapsense() {
        return this.zze.size();
    }

    /* renamed from: this, reason: not valid java name */
    public final /* synthetic */ void m1294this(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }
}
