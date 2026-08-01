package defpackage;

/* renamed from: eٕٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15466e extends Cextends implements premium {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C12553e f30554e = C12553e.yandex;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C10154e f30555e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC4665e f30556e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f30557e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C16221e[] f30558e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f30559e;

    public C15466e(InterfaceC4665e interfaceC4665e, Ccatch ccatch) {
        int size = ccatch.size();
        this.f30556e = interfaceC4665e;
        this.f30558e = new C16221e[size];
        boolean z = true;
        for (int i = 0; i < size; i++) {
            subs mo171interface = ccatch.mo171interface(i);
            C16221e Signature = C16221e.Signature(mo171interface);
            z &= Signature == mo171interface;
            this.f30558e[i] = Signature;
        }
        this.f30555e = z ? (C10154e) ccatch.ads() : new C10154e(this.f30558e);
    }

    public static C15466e Signature(Object obj) {
        if (obj instanceof C15466e) {
            return (C15466e) obj;
        }
        if (obj == null) {
            return null;
        }
        return new C15466e(f30554e, Ccatch.m168class(obj));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eٕٔٛ, java.lang.Object] */
    public static C15466e loadAd(InterfaceC4665e interfaceC4665e, Object obj) {
        if (!(obj instanceof C15466e)) {
            if (obj != null) {
                return new C15466e(interfaceC4665e, Ccatch.m168class(obj));
            }
            return null;
        }
        C15466e c15466e = (C15466e) obj;
        ?? obj2 = new Object();
        obj2.f30556e = interfaceC4665e;
        obj2.f30558e = c15466e.f30558e;
        obj2.f30555e = c15466e.f30555e;
        return obj2;
    }

    public final C16221e[] admob() {
        return (C16221e[]) this.f30558e.clone();
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f30555e;
    }

    @Override // defpackage.Cextends
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15466e) && !(obj instanceof Ccatch)) {
            return false;
        }
        if (this.f30555e.isVip(((subs) obj).billing())) {
            return true;
        }
        try {
            return this.f30556e.vip(this, Signature(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.Cextends
    public final int hashCode() {
        if (this.f30559e) {
            return this.f30557e;
        }
        this.f30559e = true;
        ((AbstractC2728e) this.f30556e).getClass();
        C16221e[] admob = admob();
        int i = 0;
        for (int i2 = 0; i2 != admob.length; i2++) {
            C16221e c16221e = admob[i2];
            if (c16221e.f31872e.f36388e.length > 1) {
                C0153e[] admob2 = c16221e.admob();
                for (int i3 = 0; i3 != admob2.length; i3++) {
                    i = (i ^ AbstractC12442e.isVip(admob2[i3].f1387e.f36491e)) ^ AbstractC1358e.metrica(admob2[i3].f1386e).hashCode();
                }
            } else {
                i = (i ^ AbstractC12442e.isVip(c16221e.loadAd().f1387e.f36491e)) ^ AbstractC1358e.metrica(admob[i2].loadAd().f1386e).hashCode();
            }
        }
        this.f30557e = i;
        return i;
    }

    public final String toString() {
        return this.f30556e.ad(this);
    }
}
