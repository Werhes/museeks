package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٞٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4259e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f9338e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public List f9339e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public EnumC0655e f9340e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f9341e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f9342e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f9343e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f9344e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9345e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eؖٞٛ] */
    public static C4259e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f9340e = EnumC0655e.INV;
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f9343e = list;
        abstractC12173e.f9339e = list;
        abstractC12173e.f9341e = list;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C8372e) abstractC2649e);
        return this;
    }

    public final C8372e billing() {
        C8372e c8372e = new C8372e(this);
        int i = this.f9342e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8372e.f17133e = this.f9338e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c8372e.f17125e = this.f9345e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c8372e.f17136e = this.f9344e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c8372e.f17135e = this.f9340e;
        if ((i & 16) == 16) {
            this.f9343e = DesugarCollections.unmodifiableList(this.f9343e);
            this.f9342e &= -17;
        }
        c8372e.f17131e = this.f9343e;
        if ((this.f9342e & 32) == 32) {
            this.f9339e = DesugarCollections.unmodifiableList(this.f9339e);
            this.f9342e &= -33;
        }
        c8372e.f17134e = this.f9339e;
        if ((this.f9342e & 64) == 64) {
            this.f9341e = DesugarCollections.unmodifiableList(this.f9341e);
            this.f9342e &= -65;
        }
        c8372e.f17132e = this.f9341e;
        c8372e.f17128e = i2;
        return c8372e;
    }

    public final Object clone() {
        C4259e yandex = yandex();
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
            eٌُْ r1 = defpackage.C8372e.f17124e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eًۨ r1 = new eًۨ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eًۨ r4 = (defpackage.C8372e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4259e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C8372e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C8372e c8372e) {
        if (c8372e == C8372e.f17123e) {
            return;
        }
        int i = c8372e.f17128e;
        if ((i & 1) == 1) {
            int i2 = c8372e.f17133e;
            this.f9342e = 1 | this.f9342e;
            this.f9338e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c8372e.f17125e;
            this.f9342e = 2 | this.f9342e;
            this.f9345e = i3;
        }
        if ((i & 4) == 4) {
            boolean z = c8372e.f17136e;
            this.f9342e = 4 | this.f9342e;
            this.f9344e = z;
        }
        if ((i & 8) == 8) {
            EnumC0655e enumC0655e = c8372e.f17135e;
            enumC0655e.getClass();
            this.f9342e = 8 | this.f9342e;
            this.f9340e = enumC0655e;
        }
        if (!c8372e.f17131e.isEmpty()) {
            if (this.f9343e.isEmpty()) {
                this.f9343e = c8372e.f17131e;
                this.f9342e &= -17;
            } else {
                if ((this.f9342e & 16) != 16) {
                    this.f9343e = new ArrayList(this.f9343e);
                    this.f9342e |= 16;
                }
                this.f9343e.addAll(c8372e.f17131e);
            }
        }
        if (!c8372e.f17134e.isEmpty()) {
            if (this.f9339e.isEmpty()) {
                this.f9339e = c8372e.f17134e;
                this.f9342e &= -33;
            } else {
                if ((this.f9342e & 32) != 32) {
                    this.f9339e = new ArrayList(this.f9339e);
                    this.f9342e |= 32;
                }
                this.f9339e.addAll(c8372e.f17134e);
            }
        }
        if (!c8372e.f17132e.isEmpty()) {
            if (this.f9341e.isEmpty()) {
                this.f9341e = c8372e.f17132e;
                this.f9342e &= -65;
            } else {
                if ((this.f9342e & 64) != 64) {
                    this.f9341e = new ArrayList(this.f9341e);
                    this.f9342e |= 64;
                }
                this.f9341e.addAll(c8372e.f17132e);
            }
        }
        purchase(c8372e);
        this.f19037e = this.f19037e.billing(c8372e.f17130e);
    }
}
