package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4664e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public EnumC3014e f9991e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9992e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f9993e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f9994e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f9995e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f9996e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f9997e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C13212e f9998e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, eؗؖۢ] */
    public static C4664e billing() {
        ?? abstractC9594e = new AbstractC9594e();
        abstractC9594e.f9991e = EnumC3014e.TRUE;
        abstractC9594e.f9998e = C13212e.f26218e;
        List list = Collections.EMPTY_LIST;
        abstractC9594e.f9994e = list;
        abstractC9594e.f9996e = list;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C3845e) abstractC2649e);
        return this;
    }

    public final Object clone() {
        C4664e billing = billing();
        billing.yandex(purchase());
        return billing;
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
            eٌُْ r1 = defpackage.C3845e.f8490e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eۣؖؓ r1 = new eۣؖؓ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.yandex(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eۣؖؓ r4 = (defpackage.C3845e) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.yandex(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4664e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C3845e purchase = purchase();
        if (purchase.ad()) {
            return purchase;
        }
        throw new C14803e();
    }

    public final C3845e purchase() {
        C3845e c3845e = new C3845e(this);
        int i = this.f9993e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c3845e.f8493e = this.f9992e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c3845e.f8498e = this.f9995e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c3845e.f8492e = this.f9991e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c3845e.f8502e = this.f9998e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c3845e.f8501e = this.f9997e;
        if ((i & 32) == 32) {
            this.f9994e = DesugarCollections.unmodifiableList(this.f9994e);
            this.f9993e &= -33;
        }
        c3845e.f8496e = this.f9994e;
        if ((this.f9993e & 64) == 64) {
            this.f9996e = DesugarCollections.unmodifiableList(this.f9996e);
            this.f9993e &= -65;
        }
        c3845e.f8499e = this.f9996e;
        c3845e.f8495e = i2;
        return c3845e;
    }

    public final void yandex(C3845e c3845e) {
        C13212e c13212e;
        if (c3845e == C3845e.f8491e) {
            return;
        }
        int i = c3845e.f8495e;
        if ((i & 1) == 1) {
            int i2 = c3845e.f8493e;
            this.f9993e = 1 | this.f9993e;
            this.f9992e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c3845e.f8498e;
            this.f9993e = 2 | this.f9993e;
            this.f9995e = i3;
        }
        if ((i & 4) == 4) {
            EnumC3014e enumC3014e = c3845e.f8492e;
            enumC3014e.getClass();
            this.f9993e = 4 | this.f9993e;
            this.f9991e = enumC3014e;
        }
        if ((c3845e.f8495e & 8) == 8) {
            C13212e c13212e2 = c3845e.f8502e;
            if ((this.f9993e & 8) != 8 || (c13212e = this.f9998e) == C13212e.f26218e) {
                this.f9998e = c13212e2;
            } else {
                C3333e subscription = C13212e.subscription(c13212e);
                subscription.startapp(c13212e2);
                this.f9998e = subscription.billing();
            }
            this.f9993e |= 8;
        }
        if ((c3845e.f8495e & 16) == 16) {
            int i4 = c3845e.f8501e;
            this.f9993e = 16 | this.f9993e;
            this.f9997e = i4;
        }
        if (!c3845e.f8496e.isEmpty()) {
            if (this.f9994e.isEmpty()) {
                this.f9994e = c3845e.f8496e;
                this.f9993e &= -33;
            } else {
                if ((this.f9993e & 32) != 32) {
                    this.f9994e = new ArrayList(this.f9994e);
                    this.f9993e |= 32;
                }
                this.f9994e.addAll(c3845e.f8496e);
            }
        }
        if (!c3845e.f8499e.isEmpty()) {
            if (this.f9996e.isEmpty()) {
                this.f9996e = c3845e.f8499e;
                this.f9993e &= -65;
            } else {
                if ((this.f9993e & 64) != 64) {
                    this.f9996e = new ArrayList(this.f9996e);
                    this.f9993e |= 64;
                }
                this.f9996e.addAll(c3845e.f8499e);
            }
        }
        this.f19037e = this.f19037e.billing(c3845e.f8500e);
    }
}
