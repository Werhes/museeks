package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10214e extends AbstractC12173e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f20199e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public List f20200e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f20201e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public List f20202e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public List f20203e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public List f20204e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public List f20205e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C3526e f20206e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public List f20207e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public List f20208e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C13212e f20209e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C13212e f20210e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public List f20211e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C4307e f20212e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f20213e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f20214e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f20215e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f20216e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public List f20217e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eََّ, eؙّؑ] */
    public static C10214e yandex() {
        ?? abstractC12173e = new AbstractC12173e();
        abstractC12173e.f20199e = 6;
        abstractC12173e.f20216e = 6;
        C13212e c13212e = C13212e.f26218e;
        abstractC12173e.f20209e = c13212e;
        List list = Collections.EMPTY_LIST;
        abstractC12173e.f20202e = list;
        abstractC12173e.f20210e = c13212e;
        abstractC12173e.f20200e = list;
        abstractC12173e.f20204e = list;
        abstractC12173e.f20207e = list;
        abstractC12173e.f20208e = list;
        abstractC12173e.f20206e = C3526e.f7947e;
        abstractC12173e.f20205e = list;
        abstractC12173e.f20212e = C4307e.f9417e;
        abstractC12173e.f20217e = list;
        abstractC12173e.f20203e = list;
        abstractC12173e.f20211e = list;
        return abstractC12173e;
    }

    @Override // defpackage.AbstractC9594e
    public final /* bridge */ /* synthetic */ AbstractC9594e appmetrica(AbstractC2649e abstractC2649e) {
        startapp((C9920e) abstractC2649e);
        return this;
    }

    public final C9920e billing() {
        C9920e c9920e = new C9920e(this);
        int i = this.f20213e;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c9920e.f19598e = this.f20199e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        c9920e.f19582e = this.f20216e;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        c9920e.f19603e = this.f20215e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        c9920e.f19602e = this.f20209e;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        c9920e.f19594e = this.f20214e;
        if ((i & 32) == 32) {
            this.f20202e = DesugarCollections.unmodifiableList(this.f20202e);
            this.f20213e &= -33;
        }
        c9920e.f19600e = this.f20202e;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        c9920e.f19586e = this.f20210e;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        c9920e.f19595e = this.f20201e;
        if ((this.f20213e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            this.f20200e = DesugarCollections.unmodifiableList(this.f20200e);
            this.f20213e &= -257;
        }
        c9920e.f19584e = this.f20200e;
        if ((this.f20213e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            this.f20204e = DesugarCollections.unmodifiableList(this.f20204e);
            this.f20213e &= -513;
        }
        c9920e.f19583e = this.f20204e;
        if ((this.f20213e & 1024) == 1024) {
            this.f20207e = DesugarCollections.unmodifiableList(this.f20207e);
            this.f20213e &= -1025;
        }
        c9920e.f19592e = this.f20207e;
        if ((this.f20213e & 2048) == 2048) {
            this.f20208e = DesugarCollections.unmodifiableList(this.f20208e);
            this.f20213e &= -2049;
        }
        c9920e.f19593e = this.f20208e;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        c9920e.f19591e = this.f20206e;
        if ((this.f20213e & 8192) == 8192) {
            this.f20205e = DesugarCollections.unmodifiableList(this.f20205e);
            this.f20213e &= -8193;
        }
        c9920e.f19589e = this.f20205e;
        if ((i & 16384) == 16384) {
            i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        c9920e.f19597e = this.f20212e;
        if ((this.f20213e & 32768) == 32768) {
            this.f20217e = DesugarCollections.unmodifiableList(this.f20217e);
            this.f20213e &= -32769;
        }
        c9920e.f19604e = this.f20217e;
        if ((this.f20213e & 65536) == 65536) {
            this.f20203e = DesugarCollections.unmodifiableList(this.f20203e);
            this.f20213e &= -65537;
        }
        c9920e.f19587e = this.f20203e;
        if ((this.f20213e & 131072) == 131072) {
            this.f20211e = DesugarCollections.unmodifiableList(this.f20211e);
            this.f20213e &= -131073;
        }
        c9920e.f19596e = this.f20211e;
        c9920e.f19585e = i2;
        return c9920e;
    }

    public final Object clone() {
        C10214e yandex = yandex();
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
            eٌُْ r1 = defpackage.C9920e.f19580e     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            eٍؚۧ r1 = new eٍؚۧ     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf defpackage.C14226e -> L11
            r2.startapp(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            eؙِۛ r4 = r3.f28108e     // Catch: java.lang.Throwable -> Lf
            eٍؚۧ r4 = (defpackage.C9920e) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10214e.license(eؖۖؓ, eۧ۠):eٍٜ٘");
    }

    @Override // defpackage.AbstractC9594e
    public final AbstractC6649e metrica() {
        C9920e billing = billing();
        if (billing.ad()) {
            return billing;
        }
        throw new C14803e();
    }

    public final void startapp(C9920e c9920e) {
        C4307e c4307e;
        C3526e c3526e;
        C13212e c13212e;
        C13212e c13212e2;
        if (c9920e == C9920e.f19581e) {
            return;
        }
        int i = c9920e.f19585e;
        if ((i & 1) == 1) {
            int i2 = c9920e.f19598e;
            this.f20213e = 1 | this.f20213e;
            this.f20199e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = c9920e.f19582e;
            this.f20213e = 2 | this.f20213e;
            this.f20216e = i3;
        }
        if ((i & 4) == 4) {
            int i4 = c9920e.f19603e;
            this.f20213e = 4 | this.f20213e;
            this.f20215e = i4;
        }
        if ((i & 8) == 8) {
            C13212e c13212e3 = c9920e.f19602e;
            if ((this.f20213e & 8) != 8 || (c13212e2 = this.f20209e) == C13212e.f26218e) {
                this.f20209e = c13212e3;
            } else {
                C3333e subscription = C13212e.subscription(c13212e2);
                subscription.startapp(c13212e3);
                this.f20209e = subscription.billing();
            }
            this.f20213e |= 8;
        }
        if ((c9920e.f19585e & 16) == 16) {
            int i5 = c9920e.f19594e;
            this.f20213e = 16 | this.f20213e;
            this.f20214e = i5;
        }
        if (!c9920e.f19600e.isEmpty()) {
            if (this.f20202e.isEmpty()) {
                this.f20202e = c9920e.f19600e;
                this.f20213e &= -33;
            } else {
                if ((this.f20213e & 32) != 32) {
                    this.f20202e = new ArrayList(this.f20202e);
                    this.f20213e |= 32;
                }
                this.f20202e.addAll(c9920e.f19600e);
            }
        }
        if ((c9920e.f19585e & 32) == 32) {
            C13212e c13212e4 = c9920e.f19586e;
            if ((this.f20213e & 64) != 64 || (c13212e = this.f20210e) == C13212e.f26218e) {
                this.f20210e = c13212e4;
            } else {
                C3333e subscription2 = C13212e.subscription(c13212e);
                subscription2.startapp(c13212e4);
                this.f20210e = subscription2.billing();
            }
            this.f20213e |= 64;
        }
        if ((c9920e.f19585e & 64) == 64) {
            int i6 = c9920e.f19595e;
            this.f20213e |= 128;
            this.f20201e = i6;
        }
        if (!c9920e.f19584e.isEmpty()) {
            if (this.f20200e.isEmpty()) {
                this.f20200e = c9920e.f19584e;
                this.f20213e &= -257;
            } else {
                if ((this.f20213e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                    this.f20200e = new ArrayList(this.f20200e);
                    this.f20213e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                this.f20200e.addAll(c9920e.f19584e);
            }
        }
        if (!c9920e.f19583e.isEmpty()) {
            if (this.f20204e.isEmpty()) {
                this.f20204e = c9920e.f19583e;
                this.f20213e &= -513;
            } else {
                if ((this.f20213e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 512) {
                    this.f20204e = new ArrayList(this.f20204e);
                    this.f20213e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                }
                this.f20204e.addAll(c9920e.f19583e);
            }
        }
        if (!c9920e.f19592e.isEmpty()) {
            if (this.f20207e.isEmpty()) {
                this.f20207e = c9920e.f19592e;
                this.f20213e &= -1025;
            } else {
                if ((this.f20213e & 1024) != 1024) {
                    this.f20207e = new ArrayList(this.f20207e);
                    this.f20213e |= 1024;
                }
                this.f20207e.addAll(c9920e.f19592e);
            }
        }
        if (!c9920e.f19593e.isEmpty()) {
            if (this.f20208e.isEmpty()) {
                this.f20208e = c9920e.f19593e;
                this.f20213e &= -2049;
            } else {
                if ((this.f20213e & 2048) != 2048) {
                    this.f20208e = new ArrayList(this.f20208e);
                    this.f20213e |= 2048;
                }
                this.f20208e.addAll(c9920e.f19593e);
            }
        }
        if ((c9920e.f19585e & 128) == 128) {
            C3526e c3526e2 = c9920e.f19591e;
            if ((this.f20213e & 4096) != 4096 || (c3526e = this.f20206e) == C3526e.f7947e) {
                this.f20206e = c3526e2;
            } else {
                C2766e startapp = C3526e.startapp(c3526e);
                startapp.adcel(c3526e2);
                this.f20206e = startapp.billing();
            }
            this.f20213e |= 4096;
        }
        if (!c9920e.f19589e.isEmpty()) {
            if (this.f20205e.isEmpty()) {
                this.f20205e = c9920e.f19589e;
                this.f20213e &= -8193;
            } else {
                if ((this.f20213e & 8192) != 8192) {
                    this.f20205e = new ArrayList(this.f20205e);
                    this.f20213e |= 8192;
                }
                this.f20205e.addAll(c9920e.f19589e);
            }
        }
        if ((c9920e.f19585e & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            C4307e c4307e2 = c9920e.f19597e;
            if ((this.f20213e & 16384) != 16384 || (c4307e = this.f20212e) == C4307e.f9417e) {
                this.f20212e = c4307e2;
            } else {
                C6240e c6240e = new C6240e(0);
                c6240e.f13044e = Collections.EMPTY_LIST;
                c6240e.adcel(c4307e);
                c6240e.adcel(c4307e2);
                this.f20212e = c6240e.purchase();
            }
            this.f20213e |= 16384;
        }
        if (!c9920e.f19604e.isEmpty()) {
            if (this.f20217e.isEmpty()) {
                this.f20217e = c9920e.f19604e;
                this.f20213e &= -32769;
            } else {
                if ((this.f20213e & 32768) != 32768) {
                    this.f20217e = new ArrayList(this.f20217e);
                    this.f20213e |= 32768;
                }
                this.f20217e.addAll(c9920e.f19604e);
            }
        }
        if (!c9920e.f19587e.isEmpty()) {
            if (this.f20203e.isEmpty()) {
                this.f20203e = c9920e.f19587e;
                this.f20213e &= -65537;
            } else {
                if ((this.f20213e & 65536) != 65536) {
                    this.f20203e = new ArrayList(this.f20203e);
                    this.f20213e |= 65536;
                }
                this.f20203e.addAll(c9920e.f19587e);
            }
        }
        if (!c9920e.f19596e.isEmpty()) {
            if (this.f20211e.isEmpty()) {
                this.f20211e = c9920e.f19596e;
                this.f20213e &= -131073;
            } else {
                if ((this.f20213e & 131072) != 131072) {
                    this.f20211e = new ArrayList(this.f20211e);
                    this.f20213e |= 131072;
                }
                this.f20211e.addAll(c9920e.f19596e);
            }
        }
        purchase(c9920e);
        this.f19037e = this.f19037e.billing(c9920e.f19590e);
    }
}
