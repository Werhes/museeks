package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7708e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f15634e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C3526e f15635e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f15636e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C2553e f15637e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f15638e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f15639e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eًؚؕ] */
    public static C7708e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f15634e = list;
        abstractC12173e.f15639e = list;
        abstractC12173e.f15638e = list;
        abstractC12173e.f15635e = C3526e.f7947e;
        abstractC12173e.f15637e = C2553e.f6409e;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C14882e) abstractC2649e);
        return this;
    }

    public final C14882e billing() {
        C14882e c14882e = new C14882e(this);
        int i = this.f15636e;
        if ((i & 1) == 1) {
            this.f15634e = DesugarCollections.unmodifiableList(this.f15634e);
            this.f15636e &= -2;
        }
        c14882e.f29482e = this.f15634e;
        if ((this.f15636e & 2) == 2) {
            this.f15639e = DesugarCollections.unmodifiableList(this.f15639e);
            this.f15636e &= -3;
        }
        c14882e.f29477e = this.f15639e;
        if ((this.f15636e & 4) == 4) {
            this.f15638e = DesugarCollections.unmodifiableList(this.f15638e);
            this.f15636e &= -5;
        }
        c14882e.f29485e = this.f15638e;
        int i2 = (i & 8) != 8 ? 0 : 1;
        c14882e.f29484e = this.f15635e;
        if ((i & 16) == 16) {
            i2 |= 2;
        }
        c14882e.f29481e = this.f15637e;
        c14882e.f29478e = i2;
        return c14882e;
    }

    public final Object clone() {
        C7708e yandex = yandex();
        yandex.startapp(billing());
        return yandex;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r3, defpackage.C18521e r4) {
        /*
            r2 = this;
            r0 = 0
            eٌُْ r1 = defpackage.C14882e.f29475e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٟٔٛ r1 = new eٟٔٛ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٟٔٛ r4 = (defpackage.C14882e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.startapp(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7708e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C14882e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C14882e c14882e) {
        C2553e c2553e;
        C3526e c3526e;
        if (c14882e == C14882e.f29476e) {
            return;
        }
        if (!c14882e.f29482e.isEmpty()) {
            if (this.f15634e.isEmpty()) {
                this.f15634e = c14882e.f29482e;
                this.f15636e &= -2;
            } else {
                if ((this.f15636e & 1) != 1) {
                    this.f15634e = new ArrayList(this.f15634e);
                    this.f15636e |= 1;
                }
                this.f15634e.addAll(c14882e.f29482e);
            }
        }
        if (!c14882e.f29477e.isEmpty()) {
            if (this.f15639e.isEmpty()) {
                this.f15639e = c14882e.f29477e;
                this.f15636e &= -3;
            } else {
                if ((this.f15636e & 2) != 2) {
                    this.f15639e = new ArrayList(this.f15639e);
                    this.f15636e |= 2;
                }
                this.f15639e.addAll(c14882e.f29477e);
            }
        }
        if (!c14882e.f29485e.isEmpty()) {
            if (this.f15638e.isEmpty()) {
                this.f15638e = c14882e.f29485e;
                this.f15636e &= -5;
            } else {
                if ((this.f15636e & 4) != 4) {
                    this.f15638e = new ArrayList(this.f15638e);
                    this.f15636e |= 4;
                }
                this.f15638e.addAll(c14882e.f29485e);
            }
        }
        if ((c14882e.f29478e & 1) == 1) {
            C3526e c3526e2 = c14882e.f29484e;
            if ((this.f15636e & 8) != 8 || (c3526e = this.f15635e) == C3526e.f7947e) {
                this.f15635e = c3526e2;
            } else {
                C2766e startapp = C3526e.startapp(c3526e);
                startapp.adcel(c3526e2);
                this.f15635e = startapp.billing();
            }
            this.f15636e |= 8;
        }
        if ((c14882e.f29478e & 2) == 2) {
            C2553e c2553e2 = c14882e.f29481e;
            if ((this.f15636e & 16) != 16 || (c2553e = this.f15637e) == C2553e.f6409e) {
                this.f15637e = c2553e2;
            } else {
                C6240e c6240e = new C6240e(2);
                c6240e.f13044e = Collections.EMPTY_LIST;
                c6240e.amazon(c2553e);
                c6240e.amazon(c2553e2);
                this.f15637e = c6240e.startapp();
            }
            this.f15636e |= 16;
        }
        purchase(c14882e);
        this.f19037e = this.f19037e.billing(c14882e.f29480e);
    }
}
