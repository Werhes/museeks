package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10087e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f19909e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public List f19910e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public List f19911e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public List f19912e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C13212e f19913e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public List f19914e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public List f19915e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public List f19916e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public List f19917e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public List f19918e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public List f19919e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C2553e f19920e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public List f19921e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public List f19922e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public List f19923e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public int f19924e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public List f19925e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f19926e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public List f19927e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public List f19928e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public C3526e f19929e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f19930e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19931e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f19932e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙّؑ, eَؘَ] */
    public static C10087e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f19909e = 6;
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f19919e = list;
        abstractC12173e.f19928e = list;
        abstractC12173e.f19912e = list;
        abstractC12173e.f19922e = list;
        abstractC12173e.f19911e = list;
        abstractC12173e.f19910e = list;
        abstractC12173e.f19914e = list;
        abstractC12173e.f19917e = list;
        abstractC12173e.f19918e = list;
        abstractC12173e.f19916e = list;
        abstractC12173e.f19915e = list;
        abstractC12173e.f19925e = list;
        abstractC12173e.f19913e = C13212e.f26218e;
        abstractC12173e.f19927e = list;
        abstractC12173e.f19929e = C3526e.f7947e;
        abstractC12173e.f19923e = list;
        abstractC12173e.f19920e = C2553e.f6409e;
        abstractC12173e.f19921e = list;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C2009e) abstractC2649e);
        return this;
    }

    public final C2009e billing() {
        C2009e c2009e = new C2009e(this);
        int i = this.f19926e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c2009e.f5282e = this.f19909e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c2009e.f5258e = this.f19931e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c2009e.f5287e = this.f19930e;
        if ((i & 8) == 8) {
            this.f19919e = DesugarCollections.unmodifiableList(this.f19919e);
            this.f19926e &= -9;
        }
        c2009e.f5286e = this.f19919e;
        if ((this.f19926e & 16) == 16) {
            this.f19928e = DesugarCollections.unmodifiableList(this.f19928e);
            this.f19926e &= -17;
        }
        c2009e.f5273e = this.f19928e;
        if ((this.f19926e & 32) == 32) {
            this.f19912e = DesugarCollections.unmodifiableList(this.f19912e);
            this.f19926e &= -33;
        }
        c2009e.f5284e = this.f19912e;
        if ((this.f19926e & 64) == 64) {
            this.f19922e = DesugarCollections.unmodifiableList(this.f19922e);
            this.f19926e &= -65;
        }
        c2009e.f5276e = this.f19922e;
        if ((this.f19926e & 128) == 128) {
            this.f19911e = DesugarCollections.unmodifiableList(this.f19911e);
            this.f19926e &= -129;
        }
        c2009e.f5259e = this.f19911e;
        if ((this.f19926e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f19910e = DesugarCollections.unmodifiableList(this.f19910e);
            this.f19926e &= -257;
        }
        c2009e.f5264e = this.f19910e;
        if ((this.f19926e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f19914e = DesugarCollections.unmodifiableList(this.f19914e);
            this.f19926e &= -513;
        }
        c2009e.f5271e = this.f19914e;
        if ((this.f19926e & 1024) == 1024) {
            this.f19917e = DesugarCollections.unmodifiableList(this.f19917e);
            this.f19926e &= -1025;
        }
        c2009e.f5269e = this.f19917e;
        if ((this.f19926e & 2048) == 2048) {
            this.f19918e = DesugarCollections.unmodifiableList(this.f19918e);
            this.f19926e &= -2049;
        }
        c2009e.f5265e = this.f19918e;
        if ((this.f19926e & 4096) == 4096) {
            this.f19916e = DesugarCollections.unmodifiableList(this.f19916e);
            this.f19926e &= -4097;
        }
        c2009e.f5281e = this.f19916e;
        if ((this.f19926e & 8192) == 8192) {
            this.f19915e = DesugarCollections.unmodifiableList(this.f19915e);
            this.f19926e &= -8193;
        }
        c2009e.f5288e = this.f19915e;
        if ((this.f19926e & 16384) == 16384) {
            this.f19925e = DesugarCollections.unmodifiableList(this.f19925e);
            this.f19926e &= -16385;
        }
        c2009e.f5263e = this.f19925e;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        c2009e.f5283e = this.f19932e;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        c2009e.f5285e = this.f19913e;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        c2009e.f5277e = this.f19924e;
        if ((this.f19926e & 262144) == 262144) {
            this.f19927e = DesugarCollections.unmodifiableList(this.f19927e);
            this.f19926e &= -262145;
        }
        c2009e.f5274e = this.f19927e;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        c2009e.f5275e = this.f19929e;
        if ((this.f19926e & 1048576) == 1048576) {
            this.f19923e = DesugarCollections.unmodifiableList(this.f19923e);
            this.f19926e &= -1048577;
        }
        c2009e.f5280e = this.f19923e;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        c2009e.f5272e = this.f19920e;
        if ((this.f19926e & 4194304) == 4194304) {
            this.f19921e = DesugarCollections.unmodifiableList(this.f19921e);
            this.f19926e &= -4194305;
        }
        c2009e.f5267e = this.f19921e;
        c2009e.f5261e = i2;
        return c2009e;
    }

    public final Object clone() {
        C10087e yandex = yandex();
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
            eٌُْ r1 = defpackage.C2009e.f5256e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٟؓۦ r1 = new eٟؓۦ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٟؓۦ r4 = (defpackage.C2009e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10087e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C2009e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C2009e c2009e) {
        C2553e c2553e;
        C3526e c3526e;
        C13212e c13212e;
        if (c2009e == C2009e.f5257e) {
            return;
        }
        int i = c2009e.f5261e;
        if ((i & 1) == 1) {
            int i2 = c2009e.f5282e;
            this.f19926e = 1 | this.f19926e;
            this.f19909e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c2009e.f5258e;
            this.f19926e = 2 | this.f19926e;
            this.f19931e = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c2009e.f5287e;
            this.f19926e = 4 | this.f19926e;
            this.f19930e = i4;
        }
        if (!c2009e.f5286e.isEmpty()) {
            if (this.f19919e.isEmpty()) {
                this.f19919e = c2009e.f5286e;
                this.f19926e &= -9;
            } else {
                if ((this.f19926e & 8) != 8) {
                    this.f19919e = new ArrayList(this.f19919e);
                    this.f19926e |= 8;
                }
                this.f19919e.addAll(c2009e.f5286e);
            }
        }
        if (!c2009e.f5273e.isEmpty()) {
            if (this.f19928e.isEmpty()) {
                this.f19928e = c2009e.f5273e;
                this.f19926e &= -17;
            } else {
                if ((this.f19926e & 16) != 16) {
                    this.f19928e = new ArrayList(this.f19928e);
                    this.f19926e |= 16;
                }
                this.f19928e.addAll(c2009e.f5273e);
            }
        }
        if (!c2009e.f5284e.isEmpty()) {
            if (this.f19912e.isEmpty()) {
                this.f19912e = c2009e.f5284e;
                this.f19926e &= -33;
            } else {
                if ((this.f19926e & 32) != 32) {
                    this.f19912e = new ArrayList(this.f19912e);
                    this.f19926e |= 32;
                }
                this.f19912e.addAll(c2009e.f5284e);
            }
        }
        if (!c2009e.f5276e.isEmpty()) {
            if (this.f19922e.isEmpty()) {
                this.f19922e = c2009e.f5276e;
                this.f19926e &= -65;
            } else {
                if ((this.f19926e & 64) != 64) {
                    this.f19922e = new ArrayList(this.f19922e);
                    this.f19926e |= 64;
                }
                this.f19922e.addAll(c2009e.f5276e);
            }
        }
        if (!c2009e.f5259e.isEmpty()) {
            if (this.f19911e.isEmpty()) {
                this.f19911e = c2009e.f5259e;
                this.f19926e &= -129;
            } else {
                if ((this.f19926e & 128) != 128) {
                    this.f19911e = new ArrayList(this.f19911e);
                    this.f19926e |= 128;
                }
                this.f19911e.addAll(c2009e.f5259e);
            }
        }
        if (!c2009e.f5264e.isEmpty()) {
            if (this.f19910e.isEmpty()) {
                this.f19910e = c2009e.f5264e;
                this.f19926e &= -257;
            } else {
                if ((this.f19926e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f19910e = new ArrayList(this.f19910e);
                    this.f19926e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f19910e.addAll(c2009e.f5264e);
            }
        }
        if (!c2009e.f5271e.isEmpty()) {
            if (this.f19914e.isEmpty()) {
                this.f19914e = c2009e.f5271e;
                this.f19926e &= -513;
            } else {
                if ((this.f19926e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f19914e = new ArrayList(this.f19914e);
                    this.f19926e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f19914e.addAll(c2009e.f5271e);
            }
        }
        if (!c2009e.f5269e.isEmpty()) {
            if (this.f19917e.isEmpty()) {
                this.f19917e = c2009e.f5269e;
                this.f19926e &= -1025;
            } else {
                if ((this.f19926e & 1024) != 1024) {
                    this.f19917e = new ArrayList(this.f19917e);
                    this.f19926e |= 1024;
                }
                this.f19917e.addAll(c2009e.f5269e);
            }
        }
        if (!c2009e.f5265e.isEmpty()) {
            if (this.f19918e.isEmpty()) {
                this.f19918e = c2009e.f5265e;
                this.f19926e &= -2049;
            } else {
                if ((this.f19926e & 2048) != 2048) {
                    this.f19918e = new ArrayList(this.f19918e);
                    this.f19926e |= 2048;
                }
                this.f19918e.addAll(c2009e.f5265e);
            }
        }
        if (!c2009e.f5281e.isEmpty()) {
            if (this.f19916e.isEmpty()) {
                this.f19916e = c2009e.f5281e;
                this.f19926e &= -4097;
            } else {
                if ((this.f19926e & 4096) != 4096) {
                    this.f19916e = new ArrayList(this.f19916e);
                    this.f19926e |= 4096;
                }
                this.f19916e.addAll(c2009e.f5281e);
            }
        }
        if (!c2009e.f5288e.isEmpty()) {
            if (this.f19915e.isEmpty()) {
                this.f19915e = c2009e.f5288e;
                this.f19926e &= -8193;
            } else {
                if ((this.f19926e & 8192) != 8192) {
                    this.f19915e = new ArrayList(this.f19915e);
                    this.f19926e |= 8192;
                }
                this.f19915e.addAll(c2009e.f5288e);
            }
        }
        if (!c2009e.f5263e.isEmpty()) {
            if (this.f19925e.isEmpty()) {
                this.f19925e = c2009e.f5263e;
                this.f19926e &= -16385;
            } else {
                if ((this.f19926e & 16384) != 16384) {
                    this.f19925e = new ArrayList(this.f19925e);
                    this.f19926e |= 16384;
                }
                this.f19925e.addAll(c2009e.f5263e);
            }
        }
        int i5 = c2009e.f5261e;
        if ((i5 & 8) == 8) {
            int i6 = c2009e.f5283e;
            this.f19926e |= 32768;
            this.f19932e = i6;
        }
        if ((i5 & 16) == 16) {
            C13212e c13212e2 = c2009e.f5285e;
            if ((this.f19926e & 65536) != 65536 || (c13212e = this.f19913e) == C13212e.f26218e) {
                this.f19913e = c13212e2;
            } else {
                C3333e subscription = C13212e.subscription(c13212e);
                subscription.startapp(c13212e2);
                this.f19913e = subscription.billing();
            }
            this.f19926e |= 65536;
        }
        if ((c2009e.f5261e & 32) == 32) {
            int i7 = c2009e.f5277e;
            this.f19926e |= 131072;
            this.f19924e = i7;
        }
        if (!c2009e.f5274e.isEmpty()) {
            if (this.f19927e.isEmpty()) {
                this.f19927e = c2009e.f5274e;
                this.f19926e &= -262145;
            } else {
                if ((this.f19926e & 262144) != 262144) {
                    this.f19927e = new ArrayList(this.f19927e);
                    this.f19926e |= 262144;
                }
                this.f19927e.addAll(c2009e.f5274e);
            }
        }
        if ((c2009e.f5261e & 64) == 64) {
            C3526e c3526e2 = c2009e.f5275e;
            if ((this.f19926e & 524288) != 524288 || (c3526e = this.f19929e) == C3526e.f7947e) {
                this.f19929e = c3526e2;
            } else {
                C2766e startapp = C3526e.startapp(c3526e);
                startapp.adcel(c3526e2);
                this.f19929e = startapp.billing();
            }
            this.f19926e |= 524288;
        }
        if (!c2009e.f5280e.isEmpty()) {
            if (this.f19923e.isEmpty()) {
                this.f19923e = c2009e.f5280e;
                this.f19926e &= -1048577;
            } else {
                if ((this.f19926e & 1048576) != 1048576) {
                    this.f19923e = new ArrayList(this.f19923e);
                    this.f19926e |= 1048576;
                }
                this.f19923e.addAll(c2009e.f5280e);
            }
        }
        if ((c2009e.f5261e & 128) == 128) {
            C2553e c2553e2 = c2009e.f5272e;
            if ((this.f19926e & 2097152) != 2097152 || (c2553e = this.f19920e) == C2553e.f6409e) {
                this.f19920e = c2553e2;
            } else {
                C6240e c6240e = new C6240e(2);
                c6240e.f13044e = Collections.EMPTY_LIST;
                c6240e.amazon(c2553e);
                c6240e.amazon(c2553e2);
                this.f19920e = c6240e.startapp();
            }
            this.f19926e |= 2097152;
        }
        if (!c2009e.f5267e.isEmpty()) {
            if (this.f19921e.isEmpty()) {
                this.f19921e = c2009e.f5267e;
                this.f19926e &= -4194305;
            } else {
                if ((this.f19926e & 4194304) != 4194304) {
                    this.f19921e = new ArrayList(this.f19921e);
                    this.f19926e |= 4194304;
                }
                this.f19921e.addAll(c2009e.f5267e);
            }
        }
        purchase(c2009e);
        this.f19037e = this.f19037e.billing(c2009e.f5268e);
    }
}
