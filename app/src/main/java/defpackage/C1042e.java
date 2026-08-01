package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1042e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3501e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public List f3502e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f3503e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public List f3504e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public List f3505e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public List f3506e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f3507e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f3508e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public List f3509e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C10067e f3510e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13212e f3511e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public List f3512e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C4307e f3513e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C13212e f3514e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public List f3515e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public List f3516e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C4307e f3517e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public List f3518e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f3519e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public List f3520e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f3521e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public List f3522e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f3523e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3524e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public List f3525e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eْؒۙ, eؙّؑ] */
    public static C1042e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f3501e = 518;
        abstractC12173e.f3524e = 2054;
        C13212e c13212e = C13212e.f26218e;
        abstractC12173e.f3511e = c13212e;
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f3504e = list;
        abstractC12173e.f3514e = c13212e;
        abstractC12173e.f3502e = list;
        abstractC12173e.f3506e = list;
        abstractC12173e.f3509e = list;
        abstractC12173e.f3510e = C10067e.f19878e;
        abstractC12173e.f3518e = list;
        abstractC12173e.f3525e = list;
        abstractC12173e.f3505e = list;
        abstractC12173e.f3516e = list;
        abstractC12173e.f3520e = list;
        abstractC12173e.f3522e = list;
        abstractC12173e.f3515e = list;
        abstractC12173e.f3512e = list;
        C4307e c4307e = C4307e.f9417e;
        abstractC12173e.f3513e = c4307e;
        abstractC12173e.f3517e = c4307e;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C17485e) abstractC2649e);
        return this;
    }

    public final C17485e billing() {
        C17485e c17485e = new C17485e(this);
        int i = this.f3519e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c17485e.f34273e = this.f3501e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c17485e.f34251e = this.f3524e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c17485e.f34278e = this.f3523e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c17485e.f34277e = this.f3511e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c17485e.f34265e = this.f3521e;
        if ((i & 32) == 32) {
            this.f3504e = DesugarCollections.unmodifiableList(this.f3504e);
            this.f3519e &= -33;
        }
        c17485e.f34275e = this.f3504e;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c17485e.f34255e = this.f3514e;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c17485e.f34268e = this.f3503e;
        if ((this.f3519e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f3502e = DesugarCollections.unmodifiableList(this.f3502e);
            this.f3519e &= -257;
        }
        c17485e.f34253e = this.f3502e;
        if ((this.f3519e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f3506e = DesugarCollections.unmodifiableList(this.f3506e);
            this.f3519e &= -513;
        }
        c17485e.f34252e = this.f3506e;
        if ((this.f3519e & 1024) == 1024) {
            this.f3509e = DesugarCollections.unmodifiableList(this.f3509e);
            this.f3519e &= -1025;
        }
        c17485e.f34262e = this.f3509e;
        if ((i & 2048) == 2048) {
            i2 |= 128;
        }
        c17485e.f34263e = this.f3510e;
        if ((i & 4096) == 4096) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c17485e.f34261e = this.f3508e;
        if ((i & 8192) == 8192) {
            i2 |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        }
        c17485e.f34258e = this.f3507e;
        if ((this.f3519e & 16384) == 16384) {
            this.f3518e = DesugarCollections.unmodifiableList(this.f3518e);
            this.f3519e &= -16385;
        }
        c17485e.f34272e = this.f3518e;
        if ((this.f3519e & 32768) == 32768) {
            this.f3525e = DesugarCollections.unmodifiableList(this.f3525e);
            this.f3519e &= -32769;
        }
        c17485e.f34279e = this.f3525e;
        if ((this.f3519e & 65536) == 65536) {
            this.f3505e = DesugarCollections.unmodifiableList(this.f3505e);
            this.f3519e &= -65537;
        }
        c17485e.f34256e = this.f3505e;
        if ((this.f3519e & 131072) == 131072) {
            this.f3516e = DesugarCollections.unmodifiableList(this.f3516e);
            this.f3519e &= -131073;
        }
        c17485e.f34270e = this.f3516e;
        if ((this.f3519e & 262144) == 262144) {
            this.f3520e = DesugarCollections.unmodifiableList(this.f3520e);
            this.f3519e &= -262145;
        }
        c17485e.f34274e = this.f3520e;
        if ((this.f3519e & 524288) == 524288) {
            this.f3522e = DesugarCollections.unmodifiableList(this.f3522e);
            this.f3519e &= -524289;
        }
        c17485e.f34276e = this.f3522e;
        if ((this.f3519e & 1048576) == 1048576) {
            this.f3515e = DesugarCollections.unmodifiableList(this.f3515e);
            this.f3519e &= -1048577;
        }
        c17485e.f34269e = this.f3515e;
        if ((this.f3519e & 2097152) == 2097152) {
            this.f3512e = DesugarCollections.unmodifiableList(this.f3512e);
            this.f3519e &= -2097153;
        }
        c17485e.f34266e = this.f3512e;
        if ((i & 4194304) == 4194304) {
            i2 |= 1024;
        }
        c17485e.f34267e = this.f3513e;
        if ((i & 8388608) == 8388608) {
            i2 |= 2048;
        }
        c17485e.f34271e = this.f3517e;
        c17485e.f34254e = i2;
        return c17485e;
    }

    public final Object clone() {
        C1042e yandex = yandex();
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
            eٌُْ r1 = defpackage.C17485e.f34249e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            e٘ؒ r1 = new e٘ؒ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            e٘ؒ r4 = (defpackage.C17485e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1042e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C17485e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C17485e c17485e) {
        C4307e c4307e;
        C4307e c4307e2;
        C10067e c10067e;
        C13212e c13212e;
        C13212e c13212e2;
        if (c17485e == C17485e.f34250e) {
            return;
        }
        int i = c17485e.f34254e;
        if ((i & 1) == 1) {
            int i2 = c17485e.f34273e;
            this.f3519e = 1 | this.f3519e;
            this.f3501e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c17485e.f34251e;
            this.f3519e = 2 | this.f3519e;
            this.f3524e = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c17485e.f34278e;
            this.f3519e = 4 | this.f3519e;
            this.f3523e = i4;
        }
        if ((i & 8) == 8) {
            C13212e c13212e3 = c17485e.f34277e;
            if ((this.f3519e & 8) != 8 || (c13212e2 = this.f3511e) == C13212e.f26218e) {
                this.f3511e = c13212e3;
            } else {
                C3333e subscription = C13212e.subscription(c13212e2);
                subscription.startapp(c13212e3);
                this.f3511e = subscription.billing();
            }
            this.f3519e |= 8;
        }
        if ((c17485e.f34254e & 16) == 16) {
            int i5 = c17485e.f34265e;
            this.f3519e = 16 | this.f3519e;
            this.f3521e = i5;
        }
        if (!c17485e.f34275e.isEmpty()) {
            if (this.f3504e.isEmpty()) {
                this.f3504e = c17485e.f34275e;
                this.f3519e &= -33;
            } else {
                if ((this.f3519e & 32) != 32) {
                    this.f3504e = new ArrayList(this.f3504e);
                    this.f3519e |= 32;
                }
                this.f3504e.addAll(c17485e.f34275e);
            }
        }
        if ((c17485e.f34254e & 32) == 32) {
            C13212e c13212e4 = c17485e.f34255e;
            if ((this.f3519e & 64) != 64 || (c13212e = this.f3514e) == C13212e.f26218e) {
                this.f3514e = c13212e4;
            } else {
                C3333e subscription2 = C13212e.subscription(c13212e);
                subscription2.startapp(c13212e4);
                this.f3514e = subscription2.billing();
            }
            this.f3519e |= 64;
        }
        if ((c17485e.f34254e & 64) == 64) {
            int i6 = c17485e.f34268e;
            this.f3519e |= 128;
            this.f3503e = i6;
        }
        if (!c17485e.f34253e.isEmpty()) {
            if (this.f3502e.isEmpty()) {
                this.f3502e = c17485e.f34253e;
                this.f3519e &= -257;
            } else {
                if ((this.f3519e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f3502e = new ArrayList(this.f3502e);
                    this.f3519e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f3502e.addAll(c17485e.f34253e);
            }
        }
        if (!c17485e.f34252e.isEmpty()) {
            if (this.f3506e.isEmpty()) {
                this.f3506e = c17485e.f34252e;
                this.f3519e &= -513;
            } else {
                if ((this.f3519e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f3506e = new ArrayList(this.f3506e);
                    this.f3519e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f3506e.addAll(c17485e.f34252e);
            }
        }
        if (!c17485e.f34262e.isEmpty()) {
            if (this.f3509e.isEmpty()) {
                this.f3509e = c17485e.f34262e;
                this.f3519e &= -1025;
            } else {
                if ((this.f3519e & 1024) != 1024) {
                    this.f3509e = new ArrayList(this.f3509e);
                    this.f3519e |= 1024;
                }
                this.f3509e.addAll(c17485e.f34262e);
            }
        }
        if ((c17485e.f34254e & 128) == 128) {
            C10067e c10067e2 = c17485e.f34263e;
            if ((this.f3519e & 2048) != 2048 || (c10067e = this.f3510e) == C10067e.f19878e) {
                this.f3510e = c10067e2;
            } else {
                C15908e yandex = C15908e.yandex();
                yandex.startapp(c10067e);
                yandex.startapp(c10067e2);
                this.f3510e = yandex.billing();
            }
            this.f3519e |= 2048;
        }
        int i7 = c17485e.f34254e;
        if ((i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            int i8 = c17485e.f34261e;
            this.f3519e |= 4096;
            this.f3508e = i8;
        }
        if ((i7 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            int i9 = c17485e.f34258e;
            this.f3519e |= 8192;
            this.f3507e = i9;
        }
        if (!c17485e.f34272e.isEmpty()) {
            if (this.f3518e.isEmpty()) {
                this.f3518e = c17485e.f34272e;
                this.f3519e &= -16385;
            } else {
                if ((this.f3519e & 16384) != 16384) {
                    this.f3518e = new ArrayList(this.f3518e);
                    this.f3519e |= 16384;
                }
                this.f3518e.addAll(c17485e.f34272e);
            }
        }
        if (!c17485e.f34279e.isEmpty()) {
            if (this.f3525e.isEmpty()) {
                this.f3525e = c17485e.f34279e;
                this.f3519e &= -32769;
            } else {
                if ((this.f3519e & 32768) != 32768) {
                    this.f3525e = new ArrayList(this.f3525e);
                    this.f3519e |= 32768;
                }
                this.f3525e.addAll(c17485e.f34279e);
            }
        }
        if (!c17485e.f34256e.isEmpty()) {
            if (this.f3505e.isEmpty()) {
                this.f3505e = c17485e.f34256e;
                this.f3519e &= -65537;
            } else {
                if ((this.f3519e & 65536) != 65536) {
                    this.f3505e = new ArrayList(this.f3505e);
                    this.f3519e |= 65536;
                }
                this.f3505e.addAll(c17485e.f34256e);
            }
        }
        if (!c17485e.f34270e.isEmpty()) {
            if (this.f3516e.isEmpty()) {
                this.f3516e = c17485e.f34270e;
                this.f3519e &= -131073;
            } else {
                if ((this.f3519e & 131072) != 131072) {
                    this.f3516e = new ArrayList(this.f3516e);
                    this.f3519e |= 131072;
                }
                this.f3516e.addAll(c17485e.f34270e);
            }
        }
        if (!c17485e.f34274e.isEmpty()) {
            if (this.f3520e.isEmpty()) {
                this.f3520e = c17485e.f34274e;
                this.f3519e &= -262145;
            } else {
                if ((this.f3519e & 262144) != 262144) {
                    this.f3520e = new ArrayList(this.f3520e);
                    this.f3519e |= 262144;
                }
                this.f3520e.addAll(c17485e.f34274e);
            }
        }
        if (!c17485e.f34276e.isEmpty()) {
            if (this.f3522e.isEmpty()) {
                this.f3522e = c17485e.f34276e;
                this.f3519e &= -524289;
            } else {
                if ((this.f3519e & 524288) != 524288) {
                    this.f3522e = new ArrayList(this.f3522e);
                    this.f3519e |= 524288;
                }
                this.f3522e.addAll(c17485e.f34276e);
            }
        }
        if (!c17485e.f34269e.isEmpty()) {
            if (this.f3515e.isEmpty()) {
                this.f3515e = c17485e.f34269e;
                this.f3519e &= -1048577;
            } else {
                if ((this.f3519e & 1048576) != 1048576) {
                    this.f3515e = new ArrayList(this.f3515e);
                    this.f3519e |= 1048576;
                }
                this.f3515e.addAll(c17485e.f34269e);
            }
        }
        if (!c17485e.f34266e.isEmpty()) {
            if (this.f3512e.isEmpty()) {
                this.f3512e = c17485e.f34266e;
                this.f3519e &= -2097153;
            } else {
                if ((this.f3519e & 2097152) != 2097152) {
                    this.f3512e = new ArrayList(this.f3512e);
                    this.f3519e |= 2097152;
                }
                this.f3512e.addAll(c17485e.f34266e);
            }
        }
        if ((c17485e.f34254e & 1024) == 1024) {
            C4307e c4307e3 = c17485e.f34267e;
            if ((this.f3519e & 4194304) != 4194304 || (c4307e2 = this.f3513e) == C4307e.f9417e) {
                this.f3513e = c4307e3;
            } else {
                C6240e c6240e = new C6240e(0);
                c6240e.f13044e = Collections.EMPTY_LIST;
                c6240e.adcel(c4307e2);
                c6240e.adcel(c4307e3);
                this.f3513e = c6240e.purchase();
            }
            this.f3519e |= 4194304;
        }
        if ((c17485e.f34254e & 2048) == 2048) {
            C4307e c4307e4 = c17485e.f34271e;
            if ((this.f3519e & 8388608) != 8388608 || (c4307e = this.f3517e) == C4307e.f9417e) {
                this.f3517e = c4307e4;
            } else {
                C6240e c6240e2 = new C6240e(0);
                c6240e2.f13044e = Collections.EMPTY_LIST;
                c6240e2.adcel(c4307e);
                c6240e2.adcel(c4307e4);
                this.f3517e = c6240e2.purchase();
            }
            this.f3519e |= 8388608;
        }
        purchase(c17485e);
        this.f19037e = this.f19037e.billing(c17485e.f34260e);
    }
}
