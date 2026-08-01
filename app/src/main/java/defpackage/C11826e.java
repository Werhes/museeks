package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11826e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f23718e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f23719e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f23720e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Serializable f23721e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Serializable f23722e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Serializable f23723e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AbstractC2649e f23724e;

    public /* synthetic */ C11826e(int i) {
        this.f23720e = i;
    }

    public static C11826e startapp() {
        C11826e c11826e = new C11826e(1);
        c11826e.f23722e = EnumC12838e.RETURNS_CONSTANT;
        c11826e.f23718e = Collections.EMPTY_LIST;
        c11826e.f23724e = C3845e.f8491e;
        c11826e.f23723e = EnumC2829e.AT_MOST_ONCE;
        c11826e.f23721e = EnumC1233e.CONCLUSION_CONDITION;
        return c11826e;
    }

    public static C11826e yandex() {
        C11826e c11826e = new C11826e(0);
        c11826e.f23722e = C17298e.f33934e;
        C17758e c17758e = C17758e.f34831e;
        c11826e.f23718e = c17758e;
        c11826e.f23724e = c17758e;
        c11826e.f23723e = c17758e;
        c11826e.f23721e = c17758e;
        return c11826e;
    }

    public void adcel(C4442e c4442e) {
        C17758e c17758e;
        C17758e c17758e2;
        C17758e c17758e3;
        C17758e c17758e4;
        C17298e c17298e;
        if (c4442e == C4442e.f9636e) {
            return;
        }
        if ((c4442e.f9640e & 1) == 1) {
            C17298e c17298e2 = c4442e.f9639e;
            if ((this.f23719e & 1) != 1 || (c17298e = (C17298e) this.f23722e) == C17298e.f33934e) {
                this.f23722e = c17298e2;
            } else {
                C9197e c9197e = new C9197e(0);
                c9197e.yandex(c17298e);
                c9197e.yandex(c17298e2);
                this.f23722e = c9197e.purchase();
            }
            this.f23719e |= 1;
        }
        if ((c4442e.f9640e & 2) == 2) {
            C17758e c17758e5 = c4442e.f9642e;
            if ((this.f23719e & 2) != 2 || (c17758e4 = (C17758e) this.f23718e) == C17758e.f34831e) {
                this.f23718e = c17758e5;
            } else {
                C9197e startapp = C17758e.startapp(c17758e4);
                startapp.startapp(c17758e5);
                this.f23718e = startapp.billing();
            }
            this.f23719e |= 2;
        }
        if (c4442e.startapp()) {
            C17758e c17758e6 = c4442e.f9638e;
            if ((this.f23719e & 4) != 4 || (c17758e3 = (C17758e) this.f23724e) == C17758e.f34831e) {
                this.f23724e = c17758e6;
            } else {
                C9197e startapp2 = C17758e.startapp(c17758e3);
                startapp2.startapp(c17758e6);
                this.f23724e = startapp2.billing();
            }
            this.f23719e |= 4;
        }
        if ((c4442e.f9640e & 8) == 8) {
            C17758e c17758e7 = c4442e.f9646e;
            if ((this.f23719e & 8) != 8 || (c17758e2 = (C17758e) this.f23723e) == C17758e.f34831e) {
                this.f23723e = c17758e7;
            } else {
                C9197e startapp3 = C17758e.startapp(c17758e2);
                startapp3.startapp(c17758e7);
                this.f23723e = startapp3.billing();
            }
            this.f23719e |= 8;
        }
        if ((c4442e.f9640e & 16) == 16) {
            C17758e c17758e8 = c4442e.f9645e;
            if ((this.f23719e & 16) != 16 || (c17758e = (C17758e) this.f23721e) == C17758e.f34831e) {
                this.f23721e = c17758e8;
            } else {
                C9197e startapp4 = C17758e.startapp(c17758e);
                startapp4.startapp(c17758e8);
                this.f23721e = startapp4.billing();
            }
            this.f23719e |= 16;
        }
        this.f19037e = this.f19037e.billing(c4442e.f9644e);
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        switch (this.f23720e) {
            case 0:
                adcel((C4442e) abstractC2649e);
                return this;
            default:
                mopub((C12000e) abstractC2649e);
                return this;
        }
    }

    public C12000e billing() {
        C12000e c12000e = new C12000e(this);
        int i = this.f23719e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c12000e.f23985e = (EnumC12838e) this.f23722e;
        if ((i & 2) == 2) {
            this.f23718e = DesugarCollections.unmodifiableList((List) this.f23718e);
            this.f23719e &= -3;
        }
        c12000e.f23988e = (List) this.f23718e;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c12000e.f23984e = (C3845e) this.f23724e;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c12000e.f23992e = (EnumC2829e) this.f23723e;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c12000e.f23991e = (EnumC1233e) this.f23721e;
        c12000e.f23986e = i2;
        return c12000e;
    }

    public final Object clone() {
        switch (this.f23720e) {
            case 0:
                C11826e yandex = yandex();
                yandex.adcel(purchase());
                return yandex;
            default:
                C11826e startapp = startapp();
                startapp.mopub(billing());
                return startapp;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r3, defpackage.C18521e r4) {
        /*
            r2 = this;
            int r0 = r2.f23720e
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            eٌُْ r1 = defpackage.C12000e.f23983e     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            eِۜؔ r1 = new eِۜؔ     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r2.mopub(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L14
            eِۜؔ r4 = (defpackage.C12000e) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.mopub(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            eٌُْ r1 = defpackage.C4442e.f9637e     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            eؖۢؔ r1 = new eؖۢؔ     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 defpackage.C14226e -> L35
            r2.adcel(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L33
            eؖۢؔ r4 = (defpackage.C4442e) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.adcel(r0)
        L42:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11826e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        switch (this.f23720e) {
            case 0:
                C4442e purchase = purchase();
                purchase.ad();
                return purchase;
            default:
                C12000e billing = billing();
                if (billing.ad()) {
                    return billing;
                }
                throw new C14803e();
        }
    }

    public void mopub(C12000e c12000e) {
        C3845e c3845e;
        if (c12000e == C12000e.f23982e) {
            return;
        }
        if ((c12000e.f23986e & 1) == 1) {
            EnumC12838e enumC12838e = c12000e.f23985e;
            enumC12838e.getClass();
            this.f23719e = 1 | this.f23719e;
            this.f23722e = enumC12838e;
        }
        if (!c12000e.f23988e.isEmpty()) {
            if (((List) this.f23718e).isEmpty()) {
                this.f23718e = c12000e.f23988e;
                this.f23719e &= -3;
            } else {
                if ((this.f23719e & 2) != 2) {
                    this.f23718e = new ArrayList((List) this.f23718e);
                    this.f23719e |= 2;
                }
                ((List) this.f23718e).addAll(c12000e.f23988e);
            }
        }
        if ((c12000e.f23986e & 2) == 2) {
            C3845e c3845e2 = c12000e.f23984e;
            if ((this.f23719e & 4) != 4 || (c3845e = (C3845e) this.f23724e) == C3845e.f8491e) {
                this.f23724e = c3845e2;
            } else {
                C4664e billing = C4664e.billing();
                billing.yandex(c3845e);
                billing.yandex(c3845e2);
                this.f23724e = billing.purchase();
            }
            this.f23719e |= 4;
        }
        if ((c12000e.f23986e & 4) == 4) {
            EnumC2829e enumC2829e = c12000e.f23992e;
            enumC2829e.getClass();
            this.f23719e |= 8;
            this.f23723e = enumC2829e;
        }
        if ((c12000e.f23986e & 8) == 8) {
            EnumC1233e enumC1233e = c12000e.f23991e;
            enumC1233e.getClass();
            this.f23719e |= 16;
            this.f23721e = enumC1233e;
        }
        this.f19037e = this.f19037e.billing(c12000e.f23990e);
    }

    public C4442e purchase() {
        C4442e c4442e = new C4442e(this);
        int i = this.f23719e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c4442e.f9639e = (C17298e) this.f23722e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c4442e.f9642e = (C17758e) this.f23718e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c4442e.f9638e = (C17758e) this.f23724e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c4442e.f9646e = (C17758e) this.f23723e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c4442e.f9645e = (C17758e) this.f23721e;
        c4442e.f9640e = i2;
        return c4442e;
    }
}
