package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2766e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f6669e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6670e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f6671e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f6672e;

    public /* synthetic */ C2766e(int i) {
        this.f6671e = i;
    }

    public static C2766e yandex() {
        C2766e c2766e = new C2766e(1);
        c2766e.f6672e = Collections.EMPTY_LIST;
        c2766e.f6669e = -1;
        return c2766e;
    }

    public void adcel(C3526e c3526e) {
        if (c3526e == C3526e.f7947e) {
            return;
        }
        if (!c3526e.f7949e.isEmpty()) {
            if (this.f6672e.isEmpty()) {
                this.f6672e = c3526e.f7949e;
                this.f6670e &= -2;
            } else {
                if ((this.f6670e & 1) != 1) {
                    this.f6672e = new ArrayList(this.f6672e);
                    this.f6670e |= 1;
                }
                this.f6672e.addAll(c3526e.f7949e);
            }
        }
        if ((c3526e.f7950e & 1) == 1) {
            int i = c3526e.f7951e;
            this.f6670e |= 2;
            this.f6669e = i;
        }
        this.f19037e = this.f19037e.billing(c3526e.f7952e);
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        switch (this.f6671e) {
            case 0:
                startapp((C4599e) abstractC2649e);
                return this;
            default:
                adcel((C3526e) abstractC2649e);
                return this;
        }
    }

    public C3526e billing() {
        C3526e c3526e = new C3526e(this);
        int i = this.f6670e;
        if ((i & 1) == 1) {
            this.f6672e = DesugarCollections.unmodifiableList(this.f6672e);
            this.f6670e &= -2;
        }
        c3526e.f7949e = this.f6672e;
        int i2 = (i & 2) != 2 ? 0 : 1;
        c3526e.f7951e = this.f6669e;
        c3526e.f7950e = i2;
        return c3526e;
    }

    public final Object clone() {
        switch (this.f6671e) {
            case 0:
                C2766e c2766e = new C2766e(0);
                c2766e.f6672e = Collections.EMPTY_LIST;
                c2766e.startapp(purchase());
                return c2766e;
            default:
                C2766e yandex = yandex();
                yandex.adcel(billing());
                return yandex;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r3, defpackage.C18521e r4) {
        /*
            r2 = this;
            int r0 = r2.f6671e
            switch(r0) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            eٌُْ r1 = defpackage.C3526e.f7946e     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            eؕٞۙ r1 = new eؕٞۙ     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 defpackage.C14226e -> L16
            r2.adcel(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L14
            eؕٞۙ r4 = (defpackage.C3526e) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.adcel(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            eٌُْ r1 = defpackage.C4599e.f9905e     // Catch: java.lang.Throwable -> L31 defpackage.C14226e -> L33
            java.lang.Object r3 = r1.ad(r3, r4)     // Catch: java.lang.Throwable -> L31 defpackage.C14226e -> L33
            eؗؒۨ r3 = (defpackage.C4599e) r3     // Catch: java.lang.Throwable -> L31 defpackage.C14226e -> L33
            r2.startapp(r3)
            return r2
        L31:
            r3 = move-exception
            goto L3b
        L33:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> L31
            eؗؒۨ r4 = (defpackage.C4599e) r4     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L39
        L39:
            r3 = move-exception
            r0 = r4
        L3b:
            if (r0 == 0) goto L40
            r2.startapp(r0)
        L40:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2766e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        switch (this.f6671e) {
            case 0:
                C4599e purchase = purchase();
                if (purchase.ad()) {
                    return purchase;
                }
                throw new C14803e();
            default:
                C3526e billing = billing();
                if (billing.ad()) {
                    return billing;
                }
                throw new C14803e();
        }
    }

    public C4599e purchase() {
        C4599e c4599e = new C4599e(this);
        int i = this.f6670e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c4599e.f9908e = this.f6669e;
        if ((i & 2) == 2) {
            this.f6672e = DesugarCollections.unmodifiableList(this.f6672e);
            this.f6670e &= -3;
        }
        c4599e.f9910e = this.f6672e;
        c4599e.f9909e = i2;
        return c4599e;
    }

    public void startapp(C4599e c4599e) {
        if (c4599e == C4599e.f9906e) {
            return;
        }
        if ((c4599e.f9909e & 1) == 1) {
            int i = c4599e.f9908e;
            this.f6670e = 1 | this.f6670e;
            this.f6669e = i;
        }
        if (!c4599e.f9910e.isEmpty()) {
            if (this.f6672e.isEmpty()) {
                this.f6672e = c4599e.f9910e;
                this.f6670e &= -3;
            } else {
                if ((this.f6670e & 2) != 2) {
                    this.f6672e = new ArrayList(this.f6672e);
                    this.f6670e |= 2;
                }
                this.f6672e.addAll(c4599e.f9910e);
            }
        }
        this.f19037e = this.f19037e.billing(c4599e.f9911e);
    }
}
