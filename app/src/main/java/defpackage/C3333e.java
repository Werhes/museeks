package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3333e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f7515e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f7516e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f7517e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f7518e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public C13212e f7519e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f7520e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f7521e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f7522e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C13212e f7523e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13212e f7524e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f7525e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public List f7526e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f7527e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f7528e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f7529e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f7530e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eْؕؒ] */
    public static C3333e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f7515e = list;
        C13212e c13212e = C13212e.f26218e;
        abstractC12173e.f7524e = c13212e;
        abstractC12173e.f7519e = c13212e;
        abstractC12173e.f7523e = c13212e;
        abstractC12173e.f7526e = list;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C13212e) abstractC2649e);
        return this;
    }

    public final C13212e billing() {
        C13212e c13212e = new C13212e(this);
        int i = this.f7527e;
        if ((i & 1) == 1) {
            this.f7515e = DesugarCollections.unmodifiableList(this.f7515e);
            this.f7527e &= -2;
        }
        c13212e.f26234e = this.f7515e;
        int i2 = (i & 2) != 2 ? 0 : 1;
        c13212e.f26220e = this.f7530e;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        c13212e.f26237e = this.f7529e;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        c13212e.f26236e = this.f7524e;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        c13212e.f26231e = this.f7528e;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        c13212e.f26235e = this.f7518e;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c13212e.f26224e = this.f7525e;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c13212e.f26232e = this.f7517e;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            i2 |= 128;
        }
        c13212e.f26222e = this.f7516e;
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c13212e.f26221e = this.f7519e;
        if ((i & 1024) == 1024) {
            i2 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        }
        c13212e.f26225e = this.f7522e;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        c13212e.f26229e = this.f7523e;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        c13212e.f26230e = this.f7521e;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        c13212e.f26228e = this.f7520e;
        if ((this.f7527e & 16384) == 16384) {
            this.f7526e = DesugarCollections.unmodifiableList(this.f7526e);
            this.f7527e &= -16385;
        }
        c13212e.f26226e = this.f7526e;
        c13212e.f26223e = i2;
        return c13212e;
    }

    public final Object clone() {
        C3333e yandex = yandex();
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
            eٌُْ r1 = defpackage.C13212e.f26219e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eِْۜ r1 = new eِْۜ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eِْۜ r4 = (defpackage.C13212e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3333e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C13212e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final C3333e startapp(C13212e c13212e) {
        C13212e c13212e2;
        C13212e c13212e3;
        C13212e c13212e4;
        C13212e c13212e5 = C13212e.f26218e;
        if (c13212e == c13212e5) {
            return this;
        }
        if (!c13212e.f26234e.isEmpty()) {
            if (this.f7515e.isEmpty()) {
                this.f7515e = c13212e.f26234e;
                this.f7527e &= -2;
            } else {
                if ((this.f7527e & 1) != 1) {
                    this.f7515e = new ArrayList(this.f7515e);
                    this.f7527e |= 1;
                }
                this.f7515e.addAll(c13212e.f26234e);
            }
        }
        int i = c13212e.f26223e;
        if ((i & 1) == 1) {
            boolean z = c13212e.f26220e;
            this.f7527e |= 2;
            this.f7530e = z;
        }
        if ((i & 2) == 2) {
            int i2 = c13212e.f26237e;
            this.f7527e |= 4;
            this.f7529e = i2;
        }
        if ((i & 4) == 4) {
            C13212e c13212e6 = c13212e.f26236e;
            if ((this.f7527e & 8) != 8 || (c13212e4 = this.f7524e) == c13212e5) {
                this.f7524e = c13212e6;
            } else {
                C3333e subscription = C13212e.subscription(c13212e4);
                subscription.startapp(c13212e6);
                this.f7524e = subscription.billing();
            }
            this.f7527e |= 8;
        }
        if ((c13212e.f26223e & 8) == 8) {
            int i3 = c13212e.f26231e;
            this.f7527e |= 16;
            this.f7528e = i3;
        }
        if (c13212e.Signature()) {
            int i4 = c13212e.f26235e;
            this.f7527e |= 32;
            this.f7518e = i4;
        }
        int i5 = c13212e.f26223e;
        if ((i5 & 32) == 32) {
            int i6 = c13212e.f26224e;
            this.f7527e |= 64;
            this.f7525e = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = c13212e.f26232e;
            this.f7527e |= 128;
            this.f7517e = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = c13212e.f26222e;
            this.f7527e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.f7516e = i8;
        }
        if ((i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            C13212e c13212e7 = c13212e.f26221e;
            if ((this.f7527e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 512 || (c13212e3 = this.f7519e) == c13212e5) {
                this.f7519e = c13212e7;
            } else {
                C3333e subscription2 = C13212e.subscription(c13212e3);
                subscription2.startapp(c13212e7);
                this.f7519e = subscription2.billing();
            }
            this.f7527e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        }
        int i9 = c13212e.f26223e;
        if ((i9 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            int i10 = c13212e.f26225e;
            this.f7527e |= 1024;
            this.f7522e = i10;
        }
        if ((i9 & 1024) == 1024) {
            C13212e c13212e8 = c13212e.f26229e;
            if ((this.f7527e & 2048) != 2048 || (c13212e2 = this.f7523e) == c13212e5) {
                this.f7523e = c13212e8;
            } else {
                C3333e subscription3 = C13212e.subscription(c13212e2);
                subscription3.startapp(c13212e8);
                this.f7523e = subscription3.billing();
            }
            this.f7527e |= 2048;
        }
        int i11 = c13212e.f26223e;
        if ((i11 & 2048) == 2048) {
            int i12 = c13212e.f26230e;
            this.f7527e |= 4096;
            this.f7521e = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = c13212e.f26228e;
            this.f7527e |= 8192;
            this.f7520e = i13;
        }
        if (!c13212e.f26226e.isEmpty()) {
            if (this.f7526e.isEmpty()) {
                this.f7526e = c13212e.f26226e;
                this.f7527e &= -16385;
            } else {
                if ((this.f7527e & 16384) != 16384) {
                    this.f7526e = new ArrayList(this.f7526e);
                    this.f7527e |= 16384;
                }
                this.f7526e.addAll(c13212e.f26226e);
            }
        }
        purchase(c13212e);
        this.f19037e = this.f19037e.billing(c13212e.f26227e);
        return this;
    }
}
