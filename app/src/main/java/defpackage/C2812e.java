package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۙؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2812e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f6759e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f6760e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f6761e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f6762e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f6763e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f6764e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eؔۙؐ] */
    public static C2812e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f6759e = 6;
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f6764e = list;
        abstractC12173e.f6763e = list;
        abstractC12173e.f6760e = list;
        abstractC12173e.f6762e = list;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C11505e) abstractC2649e);
        return this;
    }

    public final C11505e billing() {
        C11505e c11505e = new C11505e(this);
        int i = this.f6761e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c11505e.f23121e = this.f6759e;
        if ((i & 2) == 2) {
            this.f6764e = DesugarCollections.unmodifiableList(this.f6764e);
            this.f6761e &= -3;
        }
        c11505e.f23116e = this.f6764e;
        if ((this.f6761e & 4) == 4) {
            this.f6763e = DesugarCollections.unmodifiableList(this.f6763e);
            this.f6761e &= -5;
        }
        c11505e.f23124e = this.f6763e;
        if ((this.f6761e & 8) == 8) {
            this.f6760e = DesugarCollections.unmodifiableList(this.f6760e);
            this.f6761e &= -9;
        }
        c11505e.f23123e = this.f6760e;
        if ((this.f6761e & 16) == 16) {
            this.f6762e = DesugarCollections.unmodifiableList(this.f6762e);
            this.f6761e &= -17;
        }
        c11505e.f23120e = this.f6762e;
        c11505e.f23117e = i2;
        return c11505e;
    }

    public final Object clone() {
        C2812e yandex = yandex();
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
            eٌُْ r1 = defpackage.C11505e.f23114e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eؙِؕ r1 = new eؙِؕ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eؙِؕ r4 = (defpackage.C11505e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2812e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C11505e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C11505e c11505e) {
        if (c11505e == C11505e.f23115e) {
            return;
        }
        if ((c11505e.f23117e & 1) == 1) {
            int i = c11505e.f23121e;
            this.f6761e = 1 | this.f6761e;
            this.f6759e = i;
        }
        if (!c11505e.f23116e.isEmpty()) {
            if (this.f6764e.isEmpty()) {
                this.f6764e = c11505e.f23116e;
                this.f6761e &= -3;
            } else {
                if ((this.f6761e & 2) != 2) {
                    this.f6764e = new ArrayList(this.f6764e);
                    this.f6761e |= 2;
                }
                this.f6764e.addAll(c11505e.f23116e);
            }
        }
        if (!c11505e.f23124e.isEmpty()) {
            if (this.f6763e.isEmpty()) {
                this.f6763e = c11505e.f23124e;
                this.f6761e &= -5;
            } else {
                if ((this.f6761e & 4) != 4) {
                    this.f6763e = new ArrayList(this.f6763e);
                    this.f6761e |= 4;
                }
                this.f6763e.addAll(c11505e.f23124e);
            }
        }
        if (!c11505e.f23123e.isEmpty()) {
            if (this.f6760e.isEmpty()) {
                this.f6760e = c11505e.f23123e;
                this.f6761e &= -9;
            } else {
                if ((this.f6761e & 8) != 8) {
                    this.f6760e = new ArrayList(this.f6760e);
                    this.f6761e |= 8;
                }
                this.f6760e.addAll(c11505e.f23123e);
            }
        }
        if (!c11505e.f23120e.isEmpty()) {
            if (this.f6762e.isEmpty()) {
                this.f6762e = c11505e.f23120e;
                this.f6761e &= -17;
            } else {
                if ((this.f6761e & 16) != 16) {
                    this.f6762e = new ArrayList(this.f6762e);
                    this.f6761e |= 16;
                }
                this.f6762e.addAll(c11505e.f23120e);
            }
        }
        purchase(c11505e);
        this.f19037e = this.f19037e.billing(c11505e.f23119e);
    }
}
