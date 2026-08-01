package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11877e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f23796e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f23797e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f23798e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public EnumC0791e f23799e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C4599e f23800e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f23801e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f23802e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f23803e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f23804e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f23805e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f23806e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public double f23807e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٜ٘, eِٞؕ] */
    public static C11877e billing() {
        ?? abstractC9594e = new AbstractC9594e();
        abstractC9594e.f23799e = EnumC0791e.BYTE;
        abstractC9594e.f23800e = C4599e.f9906e;
        abstractC9594e.f23803e = Collections.EMPTY_LIST;
        return abstractC9594e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        yandex((C3545e) abstractC2649e);
        return this;
    }

    public final Object clone() {
        C11877e billing = billing();
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
            eٌُْ r1 = defpackage.C3545e.f7985e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٟؕۜ r1 = new eٟؕۜ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.yandex(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٟؕۜ r4 = (defpackage.C3545e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11877e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C3545e purchase = purchase();
        if (purchase.ad()) {
            return purchase;
        }
        throw new C14803e();
    }

    public final C3545e purchase() {
        C3545e c3545e = new C3545e(this);
        int i = this.f23801e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c3545e.f7990e = this.f23799e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c3545e.f7997e = this.f23804e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c3545e.f7987e = this.f23796e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c3545e.f8001e = this.f23807e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c3545e.f8000e = this.f23806e;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        c3545e.f7995e = this.f23802e;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        c3545e.f7998e = this.f23805e;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        c3545e.f7991e = this.f23800e;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f23803e = DesugarCollections.unmodifiableList(this.f23803e);
            this.f23801e &= -257;
        }
        c3545e.f7996e = this.f23803e;
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c3545e.f7989e = this.f23798e;
        if ((i & 1024) == 1024) {
            i2 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        }
        c3545e.f7988e = this.f23797e;
        c3545e.f7993e = i2;
        return c3545e;
    }

    public final void yandex(C3545e c3545e) {
        C4599e c4599e;
        if (c3545e == C3545e.f7986e) {
            return;
        }
        if ((c3545e.f7993e & 1) == 1) {
            EnumC0791e enumC0791e = c3545e.f7990e;
            enumC0791e.getClass();
            this.f23801e = 1 | this.f23801e;
            this.f23799e = enumC0791e;
        }
        int i = c3545e.f7993e;
        if ((i & 2) == 2) {
            long j = c3545e.f7997e;
            this.f23801e |= 2;
            this.f23804e = j;
        }
        if ((i & 4) == 4) {
            float f = c3545e.f7987e;
            this.f23801e = 4 | this.f23801e;
            this.f23796e = f;
        }
        if ((i & 8) == 8) {
            double d = c3545e.f8001e;
            this.f23801e |= 8;
            this.f23807e = d;
        }
        if ((i & 16) == 16) {
            int i2 = c3545e.f8000e;
            this.f23801e = 16 | this.f23801e;
            this.f23806e = i2;
        }
        if ((i & 32) == 32) {
            int i3 = c3545e.f7995e;
            this.f23801e = 32 | this.f23801e;
            this.f23802e = i3;
        }
        if ((i & 64) == 64) {
            int i4 = c3545e.f7998e;
            this.f23801e = 64 | this.f23801e;
            this.f23805e = i4;
        }
        if ((i & 128) == 128) {
            C4599e c4599e2 = c3545e.f7991e;
            if ((this.f23801e & 128) != 128 || (c4599e = this.f23800e) == C4599e.f9906e) {
                this.f23800e = c4599e2;
            } else {
                C2766e c2766e = new C2766e(0);
                c2766e.f6672e = Collections.EMPTY_LIST;
                c2766e.startapp(c4599e);
                c2766e.startapp(c4599e2);
                this.f23800e = c2766e.purchase();
            }
            this.f23801e |= 128;
        }
        if (!c3545e.f7996e.isEmpty()) {
            if (this.f23803e.isEmpty()) {
                this.f23803e = c3545e.f7996e;
                this.f23801e &= -257;
            } else {
                if ((this.f23801e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f23803e = new ArrayList(this.f23803e);
                    this.f23801e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f23803e.addAll(c3545e.f7996e);
            }
        }
        int i5 = c3545e.f7993e;
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            int i6 = c3545e.f7989e;
            this.f23801e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
            this.f23798e = i6;
        }
        if ((i5 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            int i7 = c3545e.f7988e;
            this.f23801e |= 1024;
            this.f23797e = i7;
        }
        this.f19037e = this.f19037e.billing(c3545e.f7999e);
    }
}
