package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6240e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f13042e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f13043e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f13044e;

    public /* synthetic */ C6240e(int i) {
        this.f13043e = i;
    }

    public void adcel(C4307e c4307e) {
        if (c4307e == C4307e.f9417e) {
            return;
        }
        if (!c4307e.f9420e.isEmpty()) {
            if (this.f13044e.isEmpty()) {
                this.f13044e = c4307e.f9420e;
                this.f13042e &= -2;
            } else {
                if ((this.f13042e & 1) != 1) {
                    this.f13044e = new ArrayList(this.f13044e);
                    this.f13042e |= 1;
                }
                this.f13044e.addAll(c4307e.f9420e);
            }
        }
        this.f19037e = this.f19037e.billing(c4307e.f9422e);
    }

    public void amazon(C2553e c2553e) {
        if (c2553e == C2553e.f6409e) {
            return;
        }
        if (!c2553e.f6412e.isEmpty()) {
            if (this.f13044e.isEmpty()) {
                this.f13044e = c2553e.f6412e;
                this.f13042e &= -2;
            } else {
                if ((this.f13042e & 1) != 1) {
                    this.f13044e = new ArrayList(this.f13044e);
                    this.f13042e |= 1;
                }
                this.f13044e.addAll(c2553e.f6412e);
            }
        }
        this.f19037e = this.f19037e.billing(c2553e.f6414e);
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        switch (this.f13043e) {
            case 0:
                adcel((C4307e) abstractC2649e);
                return this;
            case 1:
                mopub((C12162e) abstractC2649e);
                return this;
            case 2:
                amazon((C2553e) abstractC2649e);
                return this;
            default:
                smaato((C8244e) abstractC2649e);
                return this;
        }
    }

    public C12162e billing() {
        C12162e c12162e = new C12162e(this);
        if ((this.f13042e & 1) == 1) {
            this.f13044e = DesugarCollections.unmodifiableList(this.f13044e);
            this.f13042e &= -2;
        }
        c12162e.f24452e = this.f13044e;
        return c12162e;
    }

    public final Object clone() {
        switch (this.f13043e) {
            case 0:
                C6240e c6240e = new C6240e(0);
                c6240e.f13044e = Collections.EMPTY_LIST;
                c6240e.adcel(purchase());
                return c6240e;
            case 1:
                C6240e c6240e2 = new C6240e(1);
                c6240e2.f13044e = Collections.EMPTY_LIST;
                c6240e2.mopub(billing());
                return c6240e2;
            case 2:
                C6240e c6240e3 = new C6240e(2);
                c6240e3.f13044e = Collections.EMPTY_LIST;
                c6240e3.amazon(startapp());
                return c6240e3;
            default:
                C6240e c6240e4 = new C6240e(3);
                c6240e4.f13044e = C1064e.f3589e;
                c6240e4.smaato(yandex());
                return c6240e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r3, defpackage.C18521e r4) {
        /*
            r2 = this;
            int r0 = r2.f13043e
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            eٌُْ r0 = defpackage.C8244e.f16744e     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            eً۟ٗ r0 = new eً۟ٗ     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r2.smaato(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            eؙِۛ r0 = r3.f28108e     // Catch: java.lang.Throwable -> L14
            eً۟ٗ r0 = (defpackage.C8244e) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.smaato(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            eٌُْ r1 = defpackage.C2553e.f6410e     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            eْٟؔ r1 = new eْٟؔ     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r2.amazon(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L33
            eْٟؔ r4 = (defpackage.C2553e) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.amazon(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            eٌُْ r1 = defpackage.C12162e.f24450e     // Catch: java.lang.Throwable -> L52 defpackage.C14226e -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 defpackage.C14226e -> L54
            eَّؐ r1 = new eَّؐ     // Catch: java.lang.Throwable -> L52 defpackage.C14226e -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 defpackage.C14226e -> L54
            r2.mopub(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L52
            eَّؐ r4 = (defpackage.C12162e) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.mopub(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            eٌُْ r1 = defpackage.C4307e.f9418e     // Catch: java.lang.Throwable -> L71 defpackage.C14226e -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 defpackage.C14226e -> L73
            eًؖۗ r1 = new eًؖۗ     // Catch: java.lang.Throwable -> L71 defpackage.C14226e -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 defpackage.C14226e -> L73
            r2.adcel(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L71
            eًؖۗ r4 = (defpackage.C4307e) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.adcel(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6240e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        switch (this.f13043e) {
            case 0:
                C4307e purchase = purchase();
                if (purchase.ad()) {
                    return purchase;
                }
                throw new C14803e();
            case 1:
                C12162e billing = billing();
                if (billing.ad()) {
                    return billing;
                }
                throw new C14803e();
            case 2:
                C2553e startapp = startapp();
                startapp.ad();
                return startapp;
            default:
                C8244e yandex = yandex();
                yandex.ad();
                return yandex;
        }
    }

    public void mopub(C12162e c12162e) {
        if (c12162e == C12162e.f24449e) {
            return;
        }
        if (!c12162e.f24452e.isEmpty()) {
            if (this.f13044e.isEmpty()) {
                this.f13044e = c12162e.f24452e;
                this.f13042e &= -2;
            } else {
                if ((this.f13042e & 1) != 1) {
                    this.f13044e = new ArrayList(this.f13044e);
                    this.f13042e |= 1;
                }
                this.f13044e.addAll(c12162e.f24452e);
            }
        }
        this.f19037e = this.f19037e.billing(c12162e.f24454e);
    }

    public C4307e purchase() {
        C4307e c4307e = new C4307e(this);
        if ((this.f13042e & 1) == 1) {
            this.f13044e = DesugarCollections.unmodifiableList(this.f13044e);
            this.f13042e &= -2;
        }
        c4307e.f9420e = this.f13044e;
        return c4307e;
    }

    public void smaato(C8244e c8244e) {
        if (c8244e == C8244e.f16743e) {
            return;
        }
        if (!c8244e.f16746e.isEmpty()) {
            if (((InterfaceC12326e) this.f13044e).isEmpty()) {
                this.f13044e = c8244e.f16746e;
                this.f13042e &= -2;
            } else {
                if ((this.f13042e & 1) != 1) {
                    this.f13044e = new C1064e((InterfaceC12326e) this.f13044e);
                    this.f13042e |= 1;
                }
                ((InterfaceC12326e) this.f13044e).addAll(c8244e.f16746e);
            }
        }
        this.f19037e = this.f19037e.billing(c8244e.f16748e);
    }

    public C2553e startapp() {
        C2553e c2553e = new C2553e(this);
        if ((this.f13042e & 1) == 1) {
            this.f13044e = DesugarCollections.unmodifiableList(this.f13044e);
            this.f13042e &= -2;
        }
        c2553e.f6412e = this.f13044e;
        return c2553e;
    }

    public C8244e yandex() {
        C8244e c8244e = new C8244e(this);
        if ((this.f13042e & 1) == 1) {
            this.f13044e = ((InterfaceC12326e) this.f13044e).signatures();
            this.f13042e &= -2;
        }
        c8244e.f16746e = (InterfaceC12326e) this.f13044e;
        return c8244e;
    }
}
