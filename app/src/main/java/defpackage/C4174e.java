package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4174e implements InterfaceC8524e, InterfaceC11421e, InterfaceC15826e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final SparseArray f9200e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11501e f9201e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6158e f9202e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C2399e f9203e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C2532e f9204e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f9205e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C17381e f9206e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC16843e f9207e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C0222e f9208e;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eِّؔ] */
    public C4174e(C17381e c17381e) {
        c17381e.getClass();
        this.f9206e = c17381e;
        this.f9208e = new C0222e(AbstractC9413e.applovin().getThread());
        C6158e c6158e = new C6158e();
        this.f9202e = c6158e;
        this.f9201e = new C11501e();
        ?? obj = new Object();
        obj.f6388e = c6158e;
        C2171e c2171e = AbstractC17475e.f34223e;
        obj.f6386e = C1410e.f4222e;
        obj.f6385e = C0409e.f2448e;
        this.f9204e = obj;
        this.f9200e = new SparseArray();
    }

    @Override // defpackage.InterfaceC8524e
    public final void Signature(int i) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 8, new C5055e(m1498super, i, 4));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: abstract, reason: not valid java name */
    public final void mo1480abstract(C5298e c5298e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 13, new C7815e(m1498super, c5298e, 26));
    }

    @Override // defpackage.InterfaceC15826e
    public final void ad(int i, C18208e c18208e, Exception exc) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1024, new C11565e((Object) m1495private, (Object) exc, 16));
    }

    @Override // defpackage.InterfaceC15826e
    public final void adcel(int i, C18208e c18208e, C8455e c8455e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1023, new C4245e(m1495private, c8455e, 4));
    }

    @Override // defpackage.InterfaceC8524e
    public final void admob(float f) {
        C18177e m1494package = m1494package();
        m1501transient(m1494package, 22, new C6596e(m1494package, f));
    }

    @Override // defpackage.InterfaceC8524e
    public final void ads(C8256e c8256e) {
        C18208e c18208e;
        C18177e m1498super = (!(c8256e instanceof C5681e) || (c18208e = ((C5681e) c8256e).f12057e) == null) ? m1498super() : m1493new(c18208e);
        m1501transient(m1498super, 10, new C11565e((Object) m1498super, (Object) c8256e, 12));
    }

    @Override // defpackage.InterfaceC15826e
    public final void advert(int i, C18208e c18208e, int i2) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1022, new C5055e(m1495private, i2, 6));
    }

    @Override // defpackage.InterfaceC8524e
    public final void amazon(C17750e c17750e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 28, new C11565e((Object) m1498super, (Object) c17750e, 10));
    }

    @Override // defpackage.InterfaceC15826e
    public final void applovin(int i, C18208e c18208e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1025, new C4245e(m1495private, 5));
    }

    @Override // defpackage.InterfaceC8524e
    public final void appmetrica(int i) {
    }

    @Override // defpackage.InterfaceC11421e
    public final void billing(int i, C18208e c18208e, C0807e c0807e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1004, new C10258e(m1495private, c0807e, 1));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: break, reason: not valid java name */
    public final void mo1481break(C4194e c4194e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 12, new C11565e((Object) m1498super, (Object) c4194e, 7));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: case, reason: not valid java name */
    public final void mo1482case(int i, int i2) {
        C18177e m1494package = m1494package();
        m1501transient(m1494package, 24, new C13892e(m1494package, i, i2));
    }

    @Override // defpackage.InterfaceC11421e
    /* renamed from: catch, reason: not valid java name */
    public final void mo1483catch(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e, int i2) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1000, new C7815e(m1495private, c6913e, c0807e, i2));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: class, reason: not valid java name */
    public final void mo1484class(long j) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 16, new C7815e(m1498super, j, 16, (byte) 0));
    }

    @Override // defpackage.InterfaceC8524e
    public final void crashlytics(C8256e c8256e) {
        C18208e c18208e;
        C18177e m1498super = (!(c8256e instanceof C5681e) || (c18208e = ((C5681e) c8256e).f12057e) == null) ? m1498super() : m1493new(c18208e);
        m1501transient(m1498super, 10, new C7815e(m1498super, c8256e, 7));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: default, reason: not valid java name */
    public final void mo1485default(C5251e c5251e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 29, new C7815e(m1498super, c5251e, 10));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: extends, reason: not valid java name */
    public final void mo1486extends() {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: final, reason: not valid java name */
    public final void mo1487final(boolean z) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 7, new C9474e(m1498super, z, 1));
    }

    @Override // defpackage.InterfaceC8524e
    public final void firebase(int i, boolean z) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 30, new C7815e(m1498super, i, z));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: goto, reason: not valid java name */
    public final void mo1488goto(C12053e c12053e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 15, new C7815e(m1498super, c12053e, 12));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: implements, reason: not valid java name */
    public final void mo1489implements(long j) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 18, new C7815e(m1498super, j, 17, (byte) 0));
    }

    /* renamed from: import, reason: not valid java name */
    public final void m1490import(C17148e c17148e, Looper looper) {
        AbstractC2301e.subscription(this.f9207e == null || ((AbstractC17475e) this.f9204e.f6386e).isEmpty());
        c17148e.getClass();
        this.f9207e = c17148e;
        this.f9203e = this.f9206e.ad(looper, null);
        C0222e c0222e = this.f9208e;
        C11565e c11565e = new C11565e(this, c17148e, 8);
        c0222e.getClass();
        C17381e c17381e = this.f9206e;
        AbstractC2301e.subscription(c17381e != null);
        this.f9208e = new C0222e((CopyOnWriteArraySet) c0222e.purchase, looper, looper.getThread(), c17381e, c11565e, c0222e.vip);
    }

    @Override // defpackage.InterfaceC11421e
    public final void inmobi(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e, IOException iOException, boolean z) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1003, new C9509e(m1495private, c6913e, c0807e, iOException, z));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: interface, reason: not valid java name */
    public final void mo1491interface(C12053e c12053e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 14, new C7815e(m1498super, c12053e, 15));
    }

    @Override // defpackage.InterfaceC8524e
    public final void isPro(C9039e c9039e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 27, new C7815e(m1498super, c9039e, 11));
    }

    @Override // defpackage.InterfaceC8524e
    public final void isVip(boolean z) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 9, new C9474e(m1498super, z, 2));
    }

    @Override // defpackage.InterfaceC8524e
    public final void license(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void loadAd(int i, boolean z) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 5, new C14393e(m1498super, z, i));
    }

    @Override // defpackage.InterfaceC8524e
    public final void metrica(int i) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 6, new C5055e(m1498super, i, 0));
    }

    @Override // defpackage.InterfaceC8524e
    public final void mopub(C4491e c4491e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 19, new C7815e(m1498super, c4491e, 21));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: native, reason: not valid java name */
    public final void mo1492native(AbstractC6690e abstractC6690e, int i) {
        InterfaceC16843e interfaceC16843e = this.f9207e;
        interfaceC16843e.getClass();
        C2532e c2532e = this.f9204e;
        c2532e.f6387e = C2532e.m874super(interfaceC16843e, (AbstractC17475e) c2532e.f6386e, (C18208e) c2532e.f6384e, (C6158e) c2532e.f6388e);
        c2532e.m892e(interfaceC16843e.mo2105e());
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 0, new C5055e(m1498super, i, 7));
    }

    /* renamed from: new, reason: not valid java name */
    public final C18177e m1493new(C18208e c18208e) {
        this.f9207e.getClass();
        AbstractC6690e abstractC6690e = c18208e == null ? null : (AbstractC6690e) ((C0409e) this.f9204e.f6385e).get(c18208e);
        if (c18208e != null && abstractC6690e != null) {
            return m1497strictfp(abstractC6690e, abstractC6690e.billing(c18208e.ad, this.f9202e).metrica, c18208e);
        }
        int mo2115e = this.f9207e.mo2115e();
        AbstractC6690e mo2105e = this.f9207e.mo2105e();
        if (mo2115e >= mo2105e.loadAd()) {
            mo2105e = AbstractC6690e.ad;
        }
        return m1497strictfp(mo2105e, mo2115e, null);
    }

    /* renamed from: package, reason: not valid java name */
    public final C18177e m1494package() {
        return m1493new((C18208e) this.f9204e.f6389e);
    }

    @Override // defpackage.InterfaceC8524e
    public final void premium(C18255e c18255e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 2, new C11565e((Object) m1498super, (Object) c18255e, 11));
    }

    /* renamed from: private, reason: not valid java name */
    public final C18177e m1495private(int i, C18208e c18208e) {
        this.f9207e.getClass();
        if (c18208e != null) {
            return ((AbstractC6690e) ((C0409e) this.f9204e.f6385e).get(c18208e)) != null ? m1493new(c18208e) : m1497strictfp(AbstractC6690e.ad, i, c18208e);
        }
        AbstractC6690e mo2105e = this.f9207e.mo2105e();
        if (i >= mo2105e.loadAd()) {
            mo2105e = AbstractC6690e.ad;
        }
        return m1497strictfp(mo2105e, i, null);
    }

    @Override // defpackage.InterfaceC8524e
    public final void pro(int i) {
        C18177e m1494package = m1494package();
        m1501transient(m1494package, 21, new C5055e(m1494package, i, 3));
    }

    @Override // defpackage.InterfaceC15826e
    /* renamed from: protected, reason: not valid java name */
    public final void mo1496protected(int i, C18208e c18208e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1027, new C4245e(m1495private, 3));
    }

    @Override // defpackage.InterfaceC8524e
    public final void purchase(C0101e c0101e, C0101e c0101e2, int i) {
        if (i == 1) {
            this.f9205e = false;
        }
        InterfaceC16843e interfaceC16843e = this.f9207e;
        interfaceC16843e.getClass();
        C2532e c2532e = this.f9204e;
        c2532e.f6387e = C2532e.m874super(interfaceC16843e, (AbstractC17475e) c2532e.f6386e, (C18208e) c2532e.f6384e, (C6158e) c2532e.f6388e);
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 11, new C1308e(i, m1498super, c0101e, c0101e2));
    }

    @Override // defpackage.InterfaceC11421e
    public final void remoteconfig(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1002, new C7815e(m1495private, c6913e, c0807e, 24, (byte) 0));
    }

    @Override // defpackage.InterfaceC8524e
    public final void signatures(int i) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 4, new C5055e(m1498super, i, 2));
    }

    @Override // defpackage.InterfaceC8524e
    public final void smaato(boolean z) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 3, new C9474e(m1498super, z, 3));
    }

    @Override // defpackage.InterfaceC8524e
    public final void startapp(C3335e c3335e) {
        C18177e m1494package = m1494package();
        m1501transient(m1494package, 20, new C11565e((Object) m1494package, (Object) c3335e, 9));
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final C18177e m1497strictfp(AbstractC6690e abstractC6690e, int i, C18208e c18208e) {
        C18208e c18208e2 = abstractC6690e.Signature() ? null : c18208e;
        this.f9206e.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = abstractC6690e.equals(this.f9207e.mo2105e()) && i == this.f9207e.mo2115e();
        long j = 0;
        if (c18208e2 == null || !c18208e2.vip()) {
            if (z) {
                j = this.f9207e.mo2075e();
            } else if (!abstractC6690e.Signature()) {
                j = AbstractC9413e.m2567switch(abstractC6690e.smaato(i, this.f9201e, 0L).advert);
            }
        } else if (z && this.f9207e.mo2090e() == c18208e2.vip && this.f9207e.mo2128import() == c18208e2.metrica) {
            j = this.f9207e.mo2071e();
        }
        return new C18177e(elapsedRealtime, abstractC6690e, i, c18208e2, j, this.f9207e.mo2105e(), this.f9207e.mo2115e(), (C18208e) this.f9204e.f6387e, this.f9207e.mo2071e(), this.f9207e.premium());
    }

    @Override // defpackage.InterfaceC8524e
    public final void subs(InterfaceC16843e interfaceC16843e, C3164e c3164e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void subscription(int i, C1962e c1962e) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 1, new C5055e(m1498super, c1962e, i));
    }

    /* renamed from: super, reason: not valid java name */
    public final C18177e m1498super() {
        return m1493new((C18208e) this.f9204e.f6387e);
    }

    @Override // defpackage.InterfaceC11421e
    public final void tapsense(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1001, new C7815e(m1495private, c6913e, c0807e, 25, (byte) 0));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: this, reason: not valid java name */
    public final void mo1499this(long j) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 17, new C7815e(m1498super, j, 19, (byte) 0));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: throw, reason: not valid java name */
    public final void mo1500throw(boolean z) {
        C18177e m1494package = m1494package();
        m1501transient(m1494package, 23, new C9474e(m1494package, z, 0));
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m1501transient(C18177e c18177e, int i, InterfaceC12504e interfaceC12504e) {
        this.f9200e.put(i, c18177e);
        this.f9208e.billing(i, interfaceC12504e);
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: try, reason: not valid java name */
    public final void mo1502try(int i, boolean z) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, -1, new C7815e(m1498super, z, i));
    }

    @Override // defpackage.InterfaceC8524e
    public final void vip(C2351e c2351e) {
        C18177e m1494package = m1494package();
        m1501transient(m1494package, 25, new C11565e((Object) m1494package, (Object) c2351e, 14));
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: while, reason: not valid java name */
    public final void mo1503while(List list) {
        C18177e m1498super = m1498super();
        m1501transient(m1498super, 27, new C7815e(m1498super, list, 9));
    }

    @Override // defpackage.InterfaceC11421e
    public final void yandex(int i, C18208e c18208e, C0807e c0807e) {
        C18177e m1495private = m1495private(i, c18208e);
        m1501transient(m1495private, 1005, new C10258e(m1495private, c0807e, 0));
    }
}
