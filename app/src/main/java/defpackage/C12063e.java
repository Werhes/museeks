package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12063e extends AbstractC0241e implements Handler.Callback {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public InterfaceC3772e f24170e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final C13391e f24171e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final Handler f24172e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public C16975e f24173e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public int f24174e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C13396e f24175e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C0598e f24176e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public InterfaceC11391e f24177e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final InterfaceC7081e f24178e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final SurfaceHolderCallbackC0960e f24179e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f24180e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C0598e f24181e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C5170e f24182e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f24183e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f24184e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public int f24185e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public long f24186e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public long f24187e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C7507e f24188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C12063e(SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, Looper looper) {
        super(3);
        Handler handler;
        C9770e c9770e = InterfaceC7081e.f14537e;
        this.f24179e = surfaceHolderCallbackC0960e;
        if (looper == null) {
            handler = null;
        } else {
            String str = AbstractC9413e.ad;
            handler = new Handler(looper, this);
        }
        this.f24172e = handler;
        this.f24178e = c9770e;
        this.f24182e = new C5170e((byte) 0, 27);
        this.f24188e = new C7507e(1);
        this.f24171e = new C13391e(23, (boolean) (0 == true ? 1 : 0));
        this.f24187e = -9223372036854775807L;
        this.f24186e = -9223372036854775807L;
    }

    @Override // defpackage.AbstractC0241e
    public final void adcel() {
        this.f24173e = null;
        this.f24187e = -9223372036854775807L;
        C9039e c9039e = new C9039e(m3317interface(this.f24186e), C1410e.f4222e);
        Handler handler = this.f24172e;
        if (handler != null) {
            handler.obtainMessage(1, c9039e).sendToTarget();
        } else {
            m3319this(c9039e);
        }
        this.f24186e = -9223372036854775807L;
        if (this.f24177e != null) {
            m3318native();
            InterfaceC11391e interfaceC11391e = this.f24177e;
            interfaceC11391e.getClass();
            interfaceC11391e.release();
            this.f24177e = null;
            this.f24185e = 0;
        }
    }

    @Override // defpackage.AbstractC0241e
    public final void advert(long j, boolean z, boolean z2) {
        this.f24186e = j;
        InterfaceC3772e interfaceC3772e = this.f24170e;
        if (interfaceC3772e != null) {
            interfaceC3772e.clear();
        }
        C9039e c9039e = new C9039e(m3317interface(this.f24186e), C1410e.f4222e);
        Handler handler = this.f24172e;
        if (handler != null) {
            handler.obtainMessage(1, c9039e).sendToTarget();
        } else {
            m3319this(c9039e);
        }
        this.f24183e = false;
        this.f24180e = false;
        this.f24187e = -9223372036854775807L;
        C16975e c16975e = this.f24173e;
        if (c16975e == null || Objects.equals(c16975e.loadAd, "application/x-media3-cues")) {
            return;
        }
        if (this.f24185e == 0) {
            m3318native();
            InterfaceC11391e interfaceC11391e = this.f24177e;
            interfaceC11391e.getClass();
            interfaceC11391e.flush();
            interfaceC11391e.ad(this.f1491e);
            return;
        }
        m3318native();
        InterfaceC11391e interfaceC11391e2 = this.f24177e;
        interfaceC11391e2.getClass();
        interfaceC11391e2.release();
        this.f24177e = null;
        this.f24185e = 0;
        m3316goto();
    }

    /* renamed from: class, reason: not valid java name */
    public final long m3315class() {
        if (this.f24174e == -1) {
            return Long.MAX_VALUE;
        }
        this.f24176e.getClass();
        if (this.f24174e >= this.f24176e.loadAd()) {
            return Long.MAX_VALUE;
        }
        return this.f24176e.adcel(this.f24174e);
    }

    public final void firebase() {
        boolean z = Objects.equals(this.f24173e.loadAd, "application/cea-608") || Objects.equals(this.f24173e.loadAd, "application/x-mp4-cea-608") || Objects.equals(this.f24173e.loadAd, "application/cea-708");
        String str = this.f24173e.loadAd;
        if (!z) {
            throw new IllegalStateException(AbstractC12992e.adcel("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r3.equals("application/cea-608") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003e. Please report as an issue. */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3316goto() {
        /*
            r7 = this;
            r0 = 1
            r7.f24184e = r0
            eٌْٗ r1 = r7.f24173e
            r1.getClass()
            eُؚۡ r2 = r7.f24178e
            eٍۜۖ r2 = (defpackage.C9770e) r2
            java.lang.Object r2 = r2.f19315e
            eْؖۧ r2 = (defpackage.C4524e) r2
            java.lang.String r3 = r1.loadAd
            int r4 = r1.f33286throw
            if (r3 == 0) goto L50
            int r5 = r3.hashCode()
            r6 = -1
            switch(r5) {
                case 930165504: goto L34;
                case 1566015601: goto L2b;
                case 1566016562: goto L20;
                default: goto L1e;
            }
        L1e:
            r0 = r6
            goto L3e
        L20:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L29
            goto L1e
        L29:
            r0 = 2
            goto L3e
        L2b:
            java.lang.String r5 = "application/cea-608"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L3e
            goto L1e
        L34:
            java.lang.String r0 = "application/x-mp4-cea-608"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3d
            goto L1e
        L3d:
            r0 = 0
        L3e:
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L50
        L42:
            eؑٗٙ r0 = new eؑٗٙ
            java.util.List r1 = r1.subscription
            r0.<init>(r4, r1)
            goto L6d
        L4a:
            eٌ٘ؔ r0 = new eٌ٘ؔ
            r0.<init>(r3, r4)
            goto L6d
        L50:
            boolean r0 = r2.mopub(r1)
            if (r0 == 0) goto L75
            eَۣٟ r0 = r2.remoteconfig(r1)
            eؘٕٚ r1 = new eؘٕٚ
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "Decoder"
            r2.concat(r3)
            r1.<init>(r0)
            r0 = r1
        L6d:
            r7.f24177e = r0
            long r1 = r7.f1491e
            r0.ad(r1)
            return
        L75:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r1 = defpackage.AbstractC17861e.Signature(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12063e.m3316goto():void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m3319this((C9039e) message.obj);
        return true;
    }

    /* renamed from: interface, reason: not valid java name */
    public final long m3317interface(long j) {
        AbstractC2301e.subscription(j != -9223372036854775807L);
        return j - this.f1501e;
    }

    /* renamed from: native, reason: not valid java name */
    public final void m3318native() {
        this.f24175e = null;
        this.f24174e = -1;
        C0598e c0598e = this.f24176e;
        if (c0598e != null) {
            c0598e.Signature();
            this.f24176e = null;
        }
        C0598e c0598e2 = this.f24181e;
        if (c0598e2 != null) {
            c0598e2.Signature();
            this.f24181e = null;
        }
    }

    @Override // defpackage.AbstractC0241e
    public final int premium(C16975e c16975e) {
        boolean equals = Objects.equals(c16975e.loadAd, "application/x-media3-cues");
        String str = c16975e.loadAd;
        if (!equals) {
            C9770e c9770e = (C9770e) this.f24178e;
            c9770e.getClass();
            if (!((C4524e) c9770e.f19315e).mopub(c16975e) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return AbstractC8542e.advert(str) ? AbstractC0054e.tapsense(1, 0, 0, 0) : AbstractC0054e.tapsense(0, 0, 0, 0);
            }
        }
        return AbstractC0054e.tapsense(c16975e.f33278break == 0 ? 4 : 2, 0, 0, 0);
    }

    @Override // defpackage.AbstractC0241e
    public final String purchase() {
        return "TextRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239 A[EXC_TOP_SPLITTER, LOOP:2: B:99:0x0239->B:120:0x0239, LOOP_START, SYNTHETIC] */
    @Override // defpackage.AbstractC0241e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void signatures(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12063e.signatures(long, long):void");
    }

    @Override // defpackage.AbstractC0241e
    public final boolean startapp() {
        C16975e c16975e = this.f24173e;
        if (c16975e != null) {
            if (Objects.equals(c16975e.loadAd, "application/x-media3-cues")) {
                InterfaceC3772e interfaceC3772e = this.f24170e;
                interfaceC3772e.getClass();
                if (interfaceC3772e.ad(this.f24186e) == Long.MIN_VALUE) {
                    try {
                        InterfaceC4543e interfaceC4543e = this.f1503e;
                        interfaceC4543e.getClass();
                        interfaceC4543e.smaato();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f24180e) {
                    return false;
                }
                if (this.f24183e) {
                    C0598e c0598e = this.f24176e;
                    long j = this.f24186e;
                    if (c0598e == null || c0598e.loadAd() <= 0 || c0598e.adcel(c0598e.loadAd() - 1) <= j) {
                        C0598e c0598e2 = this.f24181e;
                        long j2 = this.f24186e;
                        if ((c0598e2 == null || c0598e2.loadAd() <= 0 || c0598e2.adcel(c0598e2.loadAd() - 1) <= j2) && this.f24175e != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC0241e
    public final void subscription(C16975e[] c16975eArr, long j, long j2, C18208e c18208e) {
        C16975e c16975e = c16975eArr[0];
        this.f24173e = c16975e;
        if (Objects.equals(c16975e.loadAd, "application/x-media3-cues")) {
            this.f24170e = this.f24173e.f33288while == 1 ? new C9004e() : new C15783e(1);
            return;
        }
        firebase();
        if (this.f24177e != null) {
            this.f24185e = 1;
        } else {
            m3316goto();
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3319this(C9039e c9039e) {
        C1410e c1410e = c9039e.ad;
        SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = this.f24179e;
        surfaceHolderCallbackC0960e.ad.f33577e.billing(27, new C1519e(0, c1410e));
        C17148e c17148e = surfaceHolderCallbackC0960e.ad;
        c17148e.f33579e = c9039e;
        c17148e.f33577e.billing(27, new C0211e(29, c9039e));
    }

    @Override // defpackage.AbstractC0241e
    public final boolean yandex() {
        return this.f24180e;
    }
}
