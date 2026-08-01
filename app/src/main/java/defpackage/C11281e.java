package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11281e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22664e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f22665e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f22666e;

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C13754e) abstractC2649e);
        return this;
    }

    public final C13754e billing() {
        C13754e c13754e = new C13754e(this);
        int i = this.f22665e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c13754e.f27249e = this.f22664e;
        if ((i & 2) == 2) {
            this.f22666e = DesugarCollections.unmodifiableList(this.f22666e);
            this.f22665e &= -3;
        }
        c13754e.f27246e = this.f22666e;
        c13754e.f27247e = i2;
        return c13754e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eُۜؗ, java.lang.Object] */
    public final Object clone() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f22666e = Collections.EMPTY_LIST;
        abstractC12173e.yandex(billing());
        return abstractC12173e;
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
            eٌُْ r1 = defpackage.C13754e.f27245e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٓؔۚ r1 = new eٓؔۚ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.yandex(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٓؔۚ r4 = (defpackage.C13754e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11281e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C13754e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void yandex(C13754e c13754e) {
        if (c13754e == C13754e.f27244e) {
            return;
        }
        if ((c13754e.f27247e & 1) == 1) {
            int i = c13754e.f27249e;
            this.f22665e = 1 | this.f22665e;
            this.f22664e = i;
        }
        if (!c13754e.f27246e.isEmpty()) {
            if (this.f22666e.isEmpty()) {
                this.f22666e = c13754e.f27246e;
                this.f22665e &= -3;
            } else {
                if ((this.f22665e & 2) != 2) {
                    this.f22666e = new ArrayList(this.f22666e);
                    this.f22665e |= 2;
                }
                this.f22666e.addAll(c13754e.f27246e);
            }
        }
        purchase(c13754e);
        this.f19037e = this.f19037e.billing(c13754e.f27248e);
    }
}
