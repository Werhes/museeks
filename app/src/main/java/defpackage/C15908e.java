package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؐۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15908e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f31344e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C3545e f31345e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f31346e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f31347e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f31348e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f31349e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C13212e f31350e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C13212e f31351e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31352e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؐۦ, eؙّؑ] */
    public static C15908e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        C13212e c13212e = C13212e.f26218e;
        abstractC12173e.f31351e = c13212e;
        abstractC12173e.f31350e = c13212e;
        abstractC12173e.f31348e = Collections.EMPTY_LIST;
        abstractC12173e.f31345e = C3545e.f7986e;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C10067e) abstractC2649e);
        return this;
    }

    public final C10067e billing() {
        C10067e c10067e = new C10067e(this);
        int i = this.f31349e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c10067e.f19888e = this.f31344e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c10067e.f19880e = this.f31352e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c10067e.f19891e = this.f31351e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c10067e.f19890e = this.f31347e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c10067e.f19886e = this.f31350e;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c10067e.f19889e = this.f31346e;
        if ((i & 64) == 64) {
            this.f31348e = DesugarCollections.unmodifiableList(this.f31348e);
            this.f31349e &= -65;
        }
        c10067e.f19884e = this.f31348e;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c10067e.f19887e = this.f31345e;
        c10067e.f19883e = i2;
        return c10067e;
    }

    public final Object clone() {
        C15908e yandex = yandex();
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
            eٌُْ r1 = defpackage.C10067e.f19879e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eَؖۥ r1 = new eَؖۥ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eَؖۥ r4 = (defpackage.C10067e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15908e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C10067e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C10067e c10067e) {
        C3545e c3545e;
        C13212e c13212e;
        C13212e c13212e2;
        if (c10067e == C10067e.f19878e) {
            return;
        }
        int i = c10067e.f19883e;
        if ((i & 1) == 1) {
            int i2 = c10067e.f19888e;
            this.f31349e = 1 | this.f31349e;
            this.f31344e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c10067e.f19880e;
            this.f31349e = 2 | this.f31349e;
            this.f31352e = i3;
        }
        if ((i & 4) == 4) {
            C13212e c13212e3 = c10067e.f19891e;
            if ((this.f31349e & 4) != 4 || (c13212e2 = this.f31351e) == C13212e.f26218e) {
                this.f31351e = c13212e3;
            } else {
                C3333e subscription = C13212e.subscription(c13212e2);
                subscription.startapp(c13212e3);
                this.f31351e = subscription.billing();
            }
            this.f31349e |= 4;
        }
        int i4 = c10067e.f19883e;
        if ((i4 & 8) == 8) {
            int i5 = c10067e.f19890e;
            this.f31349e = 8 | this.f31349e;
            this.f31347e = i5;
        }
        if ((i4 & 16) == 16) {
            C13212e c13212e4 = c10067e.f19886e;
            if ((this.f31349e & 16) != 16 || (c13212e = this.f31350e) == C13212e.f26218e) {
                this.f31350e = c13212e4;
            } else {
                C3333e subscription2 = C13212e.subscription(c13212e);
                subscription2.startapp(c13212e4);
                this.f31350e = subscription2.billing();
            }
            this.f31349e |= 16;
        }
        if ((c10067e.f19883e & 32) == 32) {
            int i6 = c10067e.f19889e;
            this.f31349e = 32 | this.f31349e;
            this.f31346e = i6;
        }
        if (!c10067e.f19884e.isEmpty()) {
            if (this.f31348e.isEmpty()) {
                this.f31348e = c10067e.f19884e;
                this.f31349e &= -65;
            } else {
                if ((this.f31349e & 64) != 64) {
                    this.f31348e = new ArrayList(this.f31348e);
                    this.f31349e |= 64;
                }
                this.f31348e.addAll(c10067e.f19884e);
            }
        }
        if ((c10067e.f19883e & 64) == 64) {
            C3545e c3545e2 = c10067e.f19887e;
            if ((this.f31349e & 128) != 128 || (c3545e = this.f31345e) == C3545e.f7986e) {
                this.f31345e = c3545e2;
            } else {
                C11877e adcel = C3545e.adcel(c3545e);
                adcel.yandex(c3545e2);
                this.f31345e = adcel.purchase();
            }
            this.f31349e |= 128;
        }
        purchase(c10067e);
        this.f19037e = this.f19037e.billing(c10067e.f19885e);
    }
}
