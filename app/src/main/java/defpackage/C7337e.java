package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7337e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f15004e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f15005e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f15006e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f15007e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f15008e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f15009e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public EnumC15990e f15010e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, eؚٟؕ] */
    public static C7337e billing() {
        ?? abstractC9594e = new AbstractC9594e();
        abstractC9594e.f15005e = 1;
        abstractC9594e.f15004e = BuildConfig.FLAVOR;
        abstractC9594e.f15010e = EnumC15990e.NONE;
        List list = Collections.EMPTY_LIST;
        abstractC9594e.f15009e = list;
        abstractC9594e.f15007e = list;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C8726e) abstractC2649e);
        return this;
    }

    public final Object clone() {
        C7337e billing = billing();
        billing.yandex(purchase());
        return billing;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // defpackage.AbstractC9594e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC9594e license(defpackage.C4285e r2, defpackage.C18521e r3) {
        /*
            r1 = this;
            r3 = 0
            eٌُْ r0 = defpackage.C8726e.f17603e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٌْٖ r0 = new eٌْٖ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.yandex(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            eؙِۛ r0 = r2.f28108e     // Catch: java.lang.Throwable -> Lf
            eٌْٖ r0 = (defpackage.C8726e) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.yandex(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7337e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C8726e purchase = purchase();
        purchase.ad();
        return purchase;
    }

    public final C8726e purchase() {
        C8726e c8726e = new C8726e(this);
        int i = this.f15006e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c8726e.f17606e = this.f15005e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c8726e.f17611e = this.f15008e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c8726e.f17604e = this.f15004e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c8726e.f17615e = this.f15010e;
        if ((i & 16) == 16) {
            this.f15009e = DesugarCollections.unmodifiableList(this.f15009e);
            this.f15006e &= -17;
        }
        c8726e.f17614e = this.f15009e;
        if ((this.f15006e & 32) == 32) {
            this.f15007e = DesugarCollections.unmodifiableList(this.f15007e);
            this.f15006e &= -33;
        }
        c8726e.f17612e = this.f15007e;
        c8726e.f17608e = i2;
        return c8726e;
    }

    public final void yandex(C8726e c8726e) {
        if (c8726e == C8726e.f17602e) {
            return;
        }
        int i = c8726e.f17608e;
        if ((i & 1) == 1) {
            int i2 = c8726e.f17606e;
            this.f15006e = 1 | this.f15006e;
            this.f15005e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c8726e.f17611e;
            this.f15006e = 2 | this.f15006e;
            this.f15008e = i3;
        }
        if ((i & 4) == 4) {
            this.f15006e |= 4;
            this.f15004e = c8726e.f17604e;
        }
        if ((i & 8) == 8) {
            EnumC15990e enumC15990e = c8726e.f17615e;
            enumC15990e.getClass();
            this.f15006e = 8 | this.f15006e;
            this.f15010e = enumC15990e;
        }
        if (!c8726e.f17614e.isEmpty()) {
            if (this.f15009e.isEmpty()) {
                this.f15009e = c8726e.f17614e;
                this.f15006e &= -17;
            } else {
                if ((this.f15006e & 16) != 16) {
                    this.f15009e = new ArrayList(this.f15009e);
                    this.f15006e |= 16;
                }
                this.f15009e.addAll(c8726e.f17614e);
            }
        }
        if (!c8726e.f17612e.isEmpty()) {
            if (this.f15007e.isEmpty()) {
                this.f15007e = c8726e.f17612e;
                this.f15006e &= -33;
            } else {
                if ((this.f15006e & 32) != 32) {
                    this.f15007e = new ArrayList(this.f15007e);
                    this.f15006e |= 32;
                }
                this.f15007e.addAll(c8726e.f17612e);
            }
        }
        this.f19037e = this.f19037e.billing(c8726e.f17613e);
    }
}
