package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10213e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C8244e f20194e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f20195e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f20196e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C14882e f20197e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C12162e f20198e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eٍَّ] */
    public static C10213e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f20194e = C8244e.f16743e;
        abstractC12173e.f20198e = C12162e.f24449e;
        abstractC12173e.f20197e = C14882e.f29476e;
        abstractC12173e.f20195e = Collections.EMPTY_LIST;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C15503e) abstractC2649e);
        return this;
    }

    public final C15503e billing() {
        C15503e c15503e = new C15503e(this);
        int i = this.f20196e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c15503e.f30631e = this.f20194e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c15503e.f30627e = this.f20198e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c15503e.f30634e = this.f20197e;
        if ((i & 8) == 8) {
            this.f20195e = DesugarCollections.unmodifiableList(this.f20195e);
            this.f20196e &= -9;
        }
        c15503e.f30633e = this.f20195e;
        c15503e.f30628e = i2;
        return c15503e;
    }

    public final Object clone() {
        C10213e yandex = yandex();
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
            eٌُْ r1 = defpackage.C15503e.f30626e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٕٖٜ r1 = new eٕٖٜ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٕٖٜ r4 = (defpackage.C15503e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10213e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C15503e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C15503e c15503e) {
        C14882e c14882e;
        C12162e c12162e;
        C8244e c8244e;
        if (c15503e == C15503e.f30625e) {
            return;
        }
        if ((c15503e.f30628e & 1) == 1) {
            C8244e c8244e2 = c15503e.f30631e;
            if ((this.f20196e & 1) != 1 || (c8244e = this.f20194e) == C8244e.f16743e) {
                this.f20194e = c8244e2;
            } else {
                C6240e c6240e = new C6240e(3);
                c6240e.f13044e = C1064e.f3589e;
                c6240e.smaato(c8244e);
                c6240e.smaato(c8244e2);
                this.f20194e = c6240e.yandex();
            }
            this.f20196e |= 1;
        }
        if ((c15503e.f30628e & 2) == 2) {
            C12162e c12162e2 = c15503e.f30627e;
            if ((this.f20196e & 2) != 2 || (c12162e = this.f20198e) == C12162e.f24449e) {
                this.f20198e = c12162e2;
            } else {
                C6240e c6240e2 = new C6240e(1);
                c6240e2.f13044e = Collections.EMPTY_LIST;
                c6240e2.mopub(c12162e);
                c6240e2.mopub(c12162e2);
                this.f20198e = c6240e2.billing();
            }
            this.f20196e |= 2;
        }
        if ((c15503e.f30628e & 4) == 4) {
            C14882e c14882e2 = c15503e.f30634e;
            if ((this.f20196e & 4) != 4 || (c14882e = this.f20197e) == C14882e.f29476e) {
                this.f20197e = c14882e2;
            } else {
                C7708e yandex = C7708e.yandex();
                yandex.startapp(c14882e);
                yandex.startapp(c14882e2);
                this.f20197e = yandex.billing();
            }
            this.f20196e |= 4;
        }
        if (!c15503e.f30633e.isEmpty()) {
            if (this.f20195e.isEmpty()) {
                this.f20195e = c15503e.f30633e;
                this.f20196e &= -9;
            } else {
                if ((this.f20196e & 8) != 8) {
                    this.f20195e = new ArrayList(this.f20195e);
                    this.f20196e |= 8;
                }
                this.f20195e.addAll(c15503e.f30633e);
            }
        }
        purchase(c15503e);
        this.f19037e = this.f19037e.billing(c15503e.f30629e);
    }
}
