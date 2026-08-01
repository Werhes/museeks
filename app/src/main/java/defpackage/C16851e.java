package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16851e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public List f33024e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f33025e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public List f33026e;

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        billing((C12499e) abstractC2649e);
        return this;
    }

    public final void billing(C12499e c12499e) {
        if (c12499e == C12499e.f25032e) {
            return;
        }
        if (!c12499e.f25035e.isEmpty()) {
            if (this.f33024e.isEmpty()) {
                this.f33024e = c12499e.f25035e;
                this.f33025e &= -2;
            } else {
                if ((this.f33025e & 1) != 1) {
                    this.f33024e = new ArrayList(this.f33024e);
                    this.f33025e |= 1;
                }
                this.f33024e.addAll(c12499e.f25035e);
            }
        }
        if (!c12499e.f25034e.isEmpty()) {
            if (this.f33026e.isEmpty()) {
                this.f33026e = c12499e.f25034e;
                this.f33025e &= -3;
            } else {
                if ((this.f33025e & 2) != 2) {
                    this.f33026e = new ArrayList(this.f33026e);
                    this.f33025e |= 2;
                }
                this.f33026e.addAll(c12499e.f25034e);
            }
        }
        this.f19037e = this.f19037e.billing(c12499e.f25037e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, java.lang.Object, eؚٗؐ] */
    public final Object clone() {
        ?? abstractC9594e = new AbstractC9594e();
        List list = Collections.EMPTY_LIST;
        abstractC9594e.f33024e = list;
        abstractC9594e.f33026e = list;
        abstractC9594e.billing(purchase());
        return abstractC9594e;
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
            eٌُْ r1 = defpackage.C12499e.f25031e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eّٕۖ r1 = new eّٕۖ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.billing(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eّٕۖ r4 = (defpackage.C12499e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.billing(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16851e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C12499e purchase = purchase();
        purchase.ad();
        return purchase;
    }

    public final C12499e purchase() {
        C12499e c12499e = new C12499e(this);
        if ((this.f33025e & 1) == 1) {
            this.f33024e = DesugarCollections.unmodifiableList(this.f33024e);
            this.f33025e &= -2;
        }
        c12499e.f25035e = this.f33024e;
        if ((this.f33025e & 2) == 2) {
            this.f33026e = DesugarCollections.unmodifiableList(this.f33026e);
            this.f33025e &= -3;
        }
        c12499e.f25034e = this.f33026e;
        return c12499e;
    }
}
