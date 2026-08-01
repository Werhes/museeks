package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3191e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f7301e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public List f7302e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public List f7303e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C13212e f7304e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public List f7305e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13212e f7306e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f7307e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7308e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f7309e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f7310e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f7311e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eؙؕۖ] */
    public static C3191e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f7301e = 6;
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f7310e = list;
        C13212e c13212e = C13212e.f26218e;
        abstractC12173e.f7306e = c13212e;
        abstractC12173e.f7304e = c13212e;
        abstractC12173e.f7303e = list;
        abstractC12173e.f7302e = list;
        abstractC12173e.f7305e = list;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C16162e) abstractC2649e);
        return this;
    }

    public final C16162e billing() {
        C16162e c16162e = new C16162e(this);
        int i = this.f7308e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c16162e.f31755e = this.f7301e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c16162e.f31745e = this.f7311e;
        if ((i & 4) == 4) {
            this.f7310e = DesugarCollections.unmodifiableList(this.f7310e);
            this.f7308e &= -5;
        }
        c16162e.f31758e = this.f7310e;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c16162e.f31757e = this.f7306e;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c16162e.f31753e = this.f7309e;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        c16162e.f31756e = this.f7304e;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c16162e.f31749e = this.f7307e;
        if ((this.f7308e & 128) == 128) {
            this.f7303e = DesugarCollections.unmodifiableList(this.f7303e);
            this.f7308e &= -129;
        }
        c16162e.f31754e = this.f7303e;
        if ((this.f7308e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f7302e = DesugarCollections.unmodifiableList(this.f7302e);
            this.f7308e &= -257;
        }
        c16162e.f31747e = this.f7302e;
        if ((this.f7308e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f7305e = DesugarCollections.unmodifiableList(this.f7305e);
            this.f7308e &= -513;
        }
        c16162e.f31746e = this.f7305e;
        c16162e.f31748e = i2;
        return c16162e;
    }

    public final Object clone() {
        C3191e yandex = yandex();
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
            eٌُْ r1 = defpackage.C16162e.f31743e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eّٖۗ r1 = new eّٖۗ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eّٖۗ r4 = (defpackage.C16162e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3191e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C16162e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C16162e c16162e) {
        C13212e c13212e;
        C13212e c13212e2;
        if (c16162e == C16162e.f31744e) {
            return;
        }
        int i = c16162e.f31748e;
        if ((i & 1) == 1) {
            int i2 = c16162e.f31755e;
            this.f7308e = 1 | this.f7308e;
            this.f7301e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c16162e.f31745e;
            this.f7308e = 2 | this.f7308e;
            this.f7311e = i3;
        }
        if (!c16162e.f31758e.isEmpty()) {
            if (this.f7310e.isEmpty()) {
                this.f7310e = c16162e.f31758e;
                this.f7308e &= -5;
            } else {
                if ((this.f7308e & 4) != 4) {
                    this.f7310e = new ArrayList(this.f7310e);
                    this.f7308e |= 4;
                }
                this.f7310e.addAll(c16162e.f31758e);
            }
        }
        if ((c16162e.f31748e & 4) == 4) {
            C13212e c13212e3 = c16162e.f31757e;
            if ((this.f7308e & 8) != 8 || (c13212e2 = this.f7306e) == C13212e.f26218e) {
                this.f7306e = c13212e3;
            } else {
                C3333e subscription = C13212e.subscription(c13212e2);
                subscription.startapp(c13212e3);
                this.f7306e = subscription.billing();
            }
            this.f7308e |= 8;
        }
        int i4 = c16162e.f31748e;
        if ((i4 & 8) == 8) {
            int i5 = c16162e.f31753e;
            this.f7308e |= 16;
            this.f7309e = i5;
        }
        if ((i4 & 16) == 16) {
            C13212e c13212e4 = c16162e.f31756e;
            if ((this.f7308e & 32) != 32 || (c13212e = this.f7304e) == C13212e.f26218e) {
                this.f7304e = c13212e4;
            } else {
                C3333e subscription2 = C13212e.subscription(c13212e);
                subscription2.startapp(c13212e4);
                this.f7304e = subscription2.billing();
            }
            this.f7308e |= 32;
        }
        if ((c16162e.f31748e & 32) == 32) {
            int i6 = c16162e.f31749e;
            this.f7308e |= 64;
            this.f7307e = i6;
        }
        if (!c16162e.f31754e.isEmpty()) {
            if (this.f7303e.isEmpty()) {
                this.f7303e = c16162e.f31754e;
                this.f7308e &= -129;
            } else {
                if ((this.f7308e & 128) != 128) {
                    this.f7303e = new ArrayList(this.f7303e);
                    this.f7308e |= 128;
                }
                this.f7303e.addAll(c16162e.f31754e);
            }
        }
        if (!c16162e.f31747e.isEmpty()) {
            if (this.f7302e.isEmpty()) {
                this.f7302e = c16162e.f31747e;
                this.f7308e &= -257;
            } else {
                if ((this.f7308e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f7302e = new ArrayList(this.f7302e);
                    this.f7308e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f7302e.addAll(c16162e.f31747e);
            }
        }
        if (!c16162e.f31746e.isEmpty()) {
            if (this.f7305e.isEmpty()) {
                this.f7305e = c16162e.f31746e;
                this.f7308e &= -513;
            } else {
                if ((this.f7308e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f7305e = new ArrayList(this.f7305e);
                    this.f7308e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f7305e.addAll(c16162e.f31746e);
            }
        }
        purchase(c16162e);
        this.f19037e = this.f19037e.billing(c16162e.f31751e);
    }
}
