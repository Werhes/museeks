package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18536e {

    /* renamed from: instanceof, reason: not valid java name */
    public static final AtomicInteger f36344instanceof = new AtomicInteger();
    public C6433e Signature;

    /* renamed from: abstract, reason: not valid java name */
    public boolean f36345abstract;
    public final Context ad;
    public int adcel;
    public C6433e admob;
    public long ads;
    public final C16777e advert;
    public C5350e amazon;
    public boolean applovin;
    public final C2305e appmetrica;
    public final C1410e billing;

    /* renamed from: break, reason: not valid java name */
    public boolean f36346break;

    /* renamed from: case, reason: not valid java name */
    public C18228e f36347case;

    /* renamed from: catch, reason: not valid java name */
    public AudioDeviceInfo f36348catch;

    /* renamed from: class, reason: not valid java name */
    public boolean f36349class;
    public long crashlytics;

    /* renamed from: default, reason: not valid java name */
    public int f36350default;

    /* renamed from: extends, reason: not valid java name */
    public int f36351extends;

    /* renamed from: final, reason: not valid java name */
    public int f36352final;
    public int firebase;

    /* renamed from: goto, reason: not valid java name */
    public long f36353goto;

    /* renamed from: implements, reason: not valid java name */
    public boolean f36354implements;

    /* renamed from: import, reason: not valid java name */
    public Handler f36355import;
    public C2219e inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f36356interface;
    public C4194e isPro;
    public C2219e isVip;
    public final C3818e license;
    public C2691e loadAd;
    public final C5105e metrica;
    public C3659e mopub;

    /* renamed from: native, reason: not valid java name */
    public ByteBuffer f36357native;

    /* renamed from: new, reason: not valid java name */
    public long f36358new;

    /* renamed from: package, reason: not valid java name */
    public long f36359package;
    public long premium;

    /* renamed from: private, reason: not valid java name */
    public boolean f36360private;
    public C16605e pro;

    /* renamed from: protected, reason: not valid java name */
    public boolean f36361protected;
    public final C15345e purchase;
    public InterfaceC11978e remoteconfig;
    public C11863e signatures;
    public final C16777e smaato;
    public final boolean startapp;

    /* renamed from: strictfp, reason: not valid java name */
    public boolean f36362strictfp;
    public long subs;
    public C11681e subscription;

    /* renamed from: super, reason: not valid java name */
    public boolean f36363super;
    public C3335e tapsense;

    /* renamed from: this, reason: not valid java name */
    public float f36364this;

    /* renamed from: throw, reason: not valid java name */
    public ByteBuffer f36365throw;

    /* renamed from: transient, reason: not valid java name */
    public long f36366transient;

    /* renamed from: try, reason: not valid java name */
    public boolean f36367try;
    public final C12894e vip;

    /* renamed from: while, reason: not valid java name */
    public boolean f36368while;
    public final ArrayDeque yandex;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, eؖؑٞ, eٌٍؙ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؔؑٓ, eٌٍؙ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eٌٕٛ, eٌٍؙ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eًؗۘ, java.lang.Object, eٌٍؙ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [eّٜ, java.lang.Object] */
    public C18536e(C14341e c14341e) {
        int deviceId;
        Context context = (Context) c14341e.f28367e;
        this.ad = context == null ? null : context.getApplicationContext();
        this.tapsense = C3335e.startapp;
        this.vip = (C12894e) c14341e.f28366e;
        this.startapp = c14341e.f28371e;
        this.adcel = 0;
        this.remoteconfig = (C8577e) c14341e.f28372e;
        ?? abstractC9288e = new AbstractC9288e();
        this.metrica = abstractC9288e;
        ?? abstractC9288e2 = new AbstractC9288e();
        abstractC9288e2.smaato = AbstractC9413e.vip;
        this.license = abstractC9288e2;
        this.appmetrica = new AbstractC9288e();
        this.purchase = new AbstractC9288e();
        this.billing = AbstractC17475e.premium(abstractC9288e2, abstractC9288e);
        this.f36364this = 1.0f;
        this.f36350default = 0;
        this.f36347case = new Object();
        C4194e c4194e = C4194e.license;
        this.inmobi = new C2219e(c4194e, 0L, 0L);
        this.isPro = c4194e;
        this.applovin = false;
        this.yandex = new ArrayDeque();
        this.advert = new C16777e();
        this.smaato = new C16777e();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.f36352final = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int startapp(int r10, java.nio.ByteBuffer r11) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18536e.startapp(int, java.nio.ByteBuffer):int");
    }

    public final void Signature() {
        if (this.f36367try) {
            return;
        }
        this.f36367try = true;
        if (this.signatures.metrica()) {
            this.f36361protected = false;
        }
        C11863e c11863e = this.signatures;
        if (c11863e.mopub) {
            return;
        }
        c11863e.mopub = true;
        C7406e c7406e = c11863e.purchase;
        long vip = c11863e.vip();
        c7406e.isVip = c7406e.ad();
        c7406e.vip.getClass();
        c7406e.signatures = AbstractC9413e.m2546case(SystemClock.elapsedRealtime());
        c7406e.inmobi = vip;
        c11863e.ad.stop();
        c11863e.Signature = 0;
    }

    public final void ad(long j) {
        C4194e c4194e;
        boolean tapsense = tapsense();
        boolean z = false;
        C12894e c12894e = this.vip;
        if (tapsense) {
            c4194e = C4194e.license;
        } else {
            if (this.f36363super || !C6433e.ad(this.admob)) {
                c4194e = C4194e.license;
            } else {
                int i = ((C16975e) this.admob.f13319e).f33285this;
                c4194e = this.isPro;
                C9051e c9051e = (C9051e) c12894e.f25752e;
                float f = c4194e.ad;
                c9051e.getClass();
                AbstractC2301e.billing(f > 0.0f);
                if (c9051e.metrica != f) {
                    c9051e.metrica = f;
                    c9051e.startapp = true;
                }
                float f2 = c4194e.vip;
                AbstractC2301e.billing(f2 > 0.0f);
                if (c9051e.license != f2) {
                    c9051e.license = f2;
                    c9051e.startapp = true;
                }
            }
            this.isPro = c4194e;
        }
        C4194e c4194e2 = c4194e;
        if (!this.f36363super && C6433e.ad(this.admob)) {
            int i2 = ((C16975e) this.admob.f13319e).f33285this;
            z = this.applovin;
            ((C15359e) c12894e.f25750e).loadAd = z;
        }
        this.applovin = z;
        this.yandex.add(new C2219e(c4194e2, Math.max(0L, j), AbstractC9413e.m2560package(((C11816e) this.admob.f13318e).vip, adcel())));
        C11681e c11681e = (C11681e) this.admob.f13323e;
        this.subscription = c11681e;
        c11681e.ad();
        C2691e c2691e = this.loadAd;
        if (c2691e != null) {
            final boolean z2 = this.applovin;
            final C17424e c17424e = ((C9860e) c2691e.f6570e).f19459e;
            Handler handler = (Handler) c17424e.f34142e;
            if (handler != null) {
                handler.post(new Runnable() { // from class: eؚۧ۠
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) C17424e.this.f34141e;
                        String str = AbstractC9413e.ad;
                        C17148e c17148e = surfaceHolderCallbackC0960e.ad;
                        boolean z3 = c17148e.f33587e;
                        boolean z4 = z2;
                        if (z3 == z4) {
                            return;
                        }
                        c17148e.f33587e = z4;
                        c17148e.f33577e.billing(23, new C1941e(z4, 2));
                    }
                });
            }
        }
    }

    public final long adcel() {
        if (!C6433e.ad(this.admob)) {
            return this.crashlytics;
        }
        long j = this.subs;
        long j2 = this.admob.f13320e;
        return ((j + j2) - 1) / j2;
    }

    public final void admob(long j) {
        ByteBuffer byteBuffer;
        license(j);
        if (this.f36365throw != null) {
            return;
        }
        if (!this.subscription.license()) {
            ByteBuffer byteBuffer2 = this.f36357native;
            if (byteBuffer2 != null) {
                signatures(byteBuffer2);
                license(j);
                return;
            }
            return;
        }
        while (!this.subscription.metrica()) {
            do {
                C11681e c11681e = this.subscription;
                if (c11681e.license()) {
                    ByteBuffer byteBuffer3 = c11681e.metrica[c11681e.vip()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        c11681e.appmetrica(InterfaceC9018e.ad);
                        byteBuffer = c11681e.metrica[c11681e.vip()];
                    }
                } else {
                    byteBuffer = InterfaceC9018e.ad;
                }
                if (byteBuffer.hasRemaining()) {
                    signatures(byteBuffer);
                    license(j);
                } else {
                    ByteBuffer byteBuffer4 = this.f36357native;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    C11681e c11681e2 = this.subscription;
                    ByteBuffer byteBuffer5 = this.f36357native;
                    if (c11681e2.license() && !c11681e2.license) {
                        c11681e2.appmetrica(byteBuffer5);
                    }
                }
            } while (this.f36365throw == null);
            return;
        }
    }

    public final boolean advert() {
        if (!amazon()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.signatures.metrica() && this.f36361protected) {
            return false;
        }
        long adcel = adcel();
        long ad = this.signatures.ad();
        C11863e c11863e = this.signatures;
        c11863e.getClass();
        return adcel > AbstractC9413e.m2555import(ad, (long) c11863e.ad.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean amazon() {
        return this.signatures != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean appmetrica() {
        /*
            r6 = this;
            eِِ r0 = r6.subscription
            boolean r0 = r0.license()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.license(r1)
            java.nio.ByteBuffer r0 = r6.f36365throw
            if (r0 != 0) goto L44
            goto L43
        L14:
            eِِ r0 = r6.subscription
            boolean r5 = r0.license()
            if (r5 == 0) goto L2e
            boolean r5 = r0.license
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.license = r4
            java.util.ArrayList r0 = r0.vip
            java.lang.Object r0 = r0.get(r3)
            eٌ۟ۡ r0 = (defpackage.InterfaceC9018e) r0
            r0.advert()
        L2e:
            r6.admob(r1)
            eِِ r0 = r6.subscription
            boolean r0 = r0.metrica()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.f36365throw
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18536e.appmetrica():boolean");
    }

    public final C4181e billing(C16975e c16975e) {
        C4181e c4181e = new C4181e(c16975e);
        c4181e.vip = this.tapsense;
        c4181e.license = this.startapp;
        c4181e.appmetrica = this.adcel != 0;
        c4181e.metrica = this.f36348catch;
        c4181e.purchase = this.f36350default;
        c4181e.yandex = this.f36363super;
        c4181e.startapp = -1;
        c4181e.billing = this.f36352final;
        return new C4181e(c4181e);
    }

    public final void license(long j) {
        C2691e c2691e;
        C14805e c14805e;
        if (this.f36365throw == null) {
            return;
        }
        C16777e c16777e = this.smaato;
        if (c16777e.ad != null && (f36344instanceof.get() > 0 || SystemClock.elapsedRealtime() < c16777e.metrica)) {
            return;
        }
        int remaining = this.f36365throw.remaining();
        try {
            boolean billing = this.signatures.billing(this.f36351extends, j, this.f36365throw);
            this.f36358new = SystemClock.elapsedRealtime();
            c16777e.ad = null;
            c16777e.vip = -9223372036854775807L;
            c16777e.metrica = -9223372036854775807L;
            if (this.signatures.metrica()) {
                if (this.crashlytics > 0) {
                    this.f36360private = false;
                }
                if (this.f36346break && (c2691e = this.loadAd) != null && !billing && !this.f36360private && (c14805e = ((C9860e) c2691e.f6570e).f35009e) != null) {
                    c14805e.ad.f22581e = true;
                }
            }
            if (C6433e.ad(this.admob)) {
                this.subs += remaining - this.f36365throw.remaining();
            }
            if (billing) {
                if (!C6433e.ad(this.admob)) {
                    AbstractC2301e.subscription(this.f36365throw == this.f36357native);
                    this.crashlytics = (this.firebase * this.f36351extends) + this.crashlytics;
                }
                this.f36365throw = null;
            }
        } catch (C9542e e) {
            boolean z = e.f18905e;
            if (z) {
                if (adcel() <= 0) {
                    if (this.signatures.metrica()) {
                        if (((C11816e) this.admob.f13318e).appmetrica) {
                            this.f36362strictfp = true;
                        }
                    }
                }
                r4 = true;
            }
            C5905e c5905e = new C5905e(e.f18906e, (C16975e) this.admob.f13319e, r4);
            C2691e c2691e2 = this.loadAd;
            if (c2691e2 != null) {
                c2691e2.m1044native(c5905e);
            }
            if (z) {
                throw c5905e;
            }
            c16777e.ad(c5905e);
        }
    }

    public final void loadAd() {
        this.f36346break = true;
        if (amazon()) {
            C11863e c11863e = this.signatures;
            C7406e c7406e = c11863e.purchase;
            if (c7406e.signatures != -9223372036854775807L) {
                c7406e.vip.getClass();
                c7406e.signatures = AbstractC9413e.m2546case(SystemClock.elapsedRealtime());
            }
            c7406e.adcel = AbstractC9413e.m2560package(c7406e.appmetrica, c7406e.ad());
            c7406e.yandex.ad(0);
            if (!c11863e.mopub || c11863e.metrica()) {
                c11863e.ad.play();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [eّۗؐ, eْٗۤ] */
    public final void metrica(C16975e c16975e, int[] iArr) {
        C11681e c11681e;
        C16975e c16975e2;
        int i;
        int i2;
        if (this.pro == null && this.ad != null) {
            C16605e c16605e = new C16605e(this);
            this.pro = c16605e;
            C8577e c8577e = (C8577e) this.remoteconfig;
            c8577e.purchase();
            if (c8577e.purchase == null) {
                c8577e.purchase = new C0222e(Thread.currentThread());
            }
            c8577e.purchase.ad(c16605e);
        }
        String str = c16975e.loadAd;
        int i3 = c16975e.f33282interface;
        int i4 = c16975e.f33285this;
        if ("audio/raw".equals(str)) {
            AbstractC2301e.billing(AbstractC9413e.m2572try(i4));
            int tapsense = AbstractC9413e.tapsense(i4) * i3;
            ?? abstractC12670e = new AbstractC12670e(4);
            abstractC12670e.license(this.billing);
            abstractC12670e.metrica(this.appmetrica);
            abstractC12670e.purchase((InterfaceC9018e[]) this.vip.f25751e);
            c11681e = new C11681e(abstractC12670e.billing());
            if (c11681e.equals(this.subscription)) {
                c11681e = this.subscription;
            }
            int i5 = c16975e.f33283native;
            int i6 = c16975e.f33280extends;
            C3818e c3818e = this.license;
            c3818e.startapp = i5;
            c3818e.adcel = i6;
            this.metrica.startapp = iArr;
            C10348e c10348e = new C10348e(c16975e.f33281goto, i3, i4);
            try {
                AbstractC17475e abstractC17475e = c11681e.ad;
                if (c10348e.equals(C10348e.appmetrica)) {
                    throw new C6721e(c10348e);
                }
                for (int i7 = 0; i7 < abstractC17475e.size(); i7++) {
                    InterfaceC9018e interfaceC9018e = (InterfaceC9018e) abstractC17475e.get(i7);
                    C10348e mopub = interfaceC9018e.mopub(c10348e);
                    if (interfaceC9018e.purchase()) {
                        AbstractC2301e.subscription(!mopub.equals(C10348e.appmetrica));
                        c10348e = mopub;
                    }
                }
                int i8 = c10348e.vip;
                int i9 = c10348e.metrica;
                C11445e ad = c16975e.ad();
                ad.f23020goto = i9;
                ad.f23021interface = c10348e.ad;
                ad.f23018class = i8;
                c16975e2 = new C16975e(ad);
                i = tapsense;
                i2 = AbstractC9413e.tapsense(i9) * i8;
            } catch (C6721e e) {
                throw new C8102e(e, c16975e);
            }
        } else {
            c11681e = new C11681e(C1410e.f4222e);
            c16975e2 = c16975e;
            i = -1;
            i2 = -1;
        }
        C11681e c11681e2 = c11681e;
        C4181e billing = billing(c16975e2);
        C16975e c16975e3 = billing.ad;
        try {
            C11816e metrica = ((C8577e) this.remoteconfig).metrica(billing);
            boolean z = metrica.appmetrica;
            if (metrica.ad == 0) {
                throw new C8102e("Invalid output encoding (isOffload=" + z + ")", c16975e3);
            }
            if (metrica.metrica == 0) {
                throw new C8102e("Invalid output channel config (isOffload=" + z + ")", c16975e3);
            }
            this.f36362strictfp = false;
            C6433e c6433e = new C6433e(c16975e, c16975e2, i, i2, metrica, c11681e2);
            if (amazon()) {
                this.Signature = c6433e;
            } else {
                this.admob = c6433e;
            }
        } catch (C3377e e2) {
            throw new C8102e(e2, c16975e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        if (r5 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0091, code lost:
    
        if (smaato() == false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mopub(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18536e.mopub(int, long, java.nio.ByteBuffer):boolean");
    }

    public final void pro() {
        if (amazon()) {
            C11863e c11863e = this.signatures;
            C4194e c4194e = this.isPro;
            AudioTrack audioTrack = c11863e.ad;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(AbstractC9413e.startapp(c4194e.ad, 0.1f, c11863e.metrica)).setPitch(AbstractC9413e.startapp(c4194e.vip, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AbstractC2803e.amazon("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            C7406e c7406e = c11863e.purchase;
            c7406e.startapp = audioTrack.getPlaybackParams().getSpeed();
            c7406e.yandex.ad(0);
            c7406e.mopub = 0L;
            c7406e.pro = 0;
            c7406e.remoteconfig = 0;
            c7406e.advert = 0L;
            c7406e.isPro = -9223372036854775807L;
            c7406e.applovin = -9223372036854775807L;
            PlaybackParams playbackParams = this.signatures.ad.getPlaybackParams();
            this.isPro = new C4194e(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public final void purchase() {
        C17682e c17682e;
        if (amazon()) {
            this.ads = 0L;
            this.premium = 0L;
            this.subs = 0L;
            this.crashlytics = 0L;
            this.f36360private = false;
            this.firebase = 0;
            this.inmobi = new C2219e(this.isPro, 0L, 0L);
            this.f36353goto = 0L;
            this.isVip = null;
            this.yandex.clear();
            this.f36357native = null;
            this.f36351extends = 0;
            this.f36365throw = null;
            this.f36367try = false;
            this.f36368while = false;
            this.f36361protected = false;
            this.license.loadAd = 0L;
            C11681e c11681e = (C11681e) this.admob.f13323e;
            this.subscription = c11681e;
            c11681e.ad();
            this.mopub = null;
            C6433e c6433e = this.Signature;
            if (c6433e != null) {
                this.admob = c6433e;
                this.Signature = null;
            }
            f36344instanceof.incrementAndGet();
            C11863e c11863e = this.signatures;
            if (c11863e.purchase.license.getPlayState() == 3) {
                c11863e.ad.pause();
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && c11863e.metrica()) {
                C6375e c6375e = c11863e.startapp;
                c6375e.getClass();
                C6375e.ad(c6375e);
            }
            if (i >= 24 && (c17682e = c11863e.appmetrica) != null) {
                C17682e.vip(c17682e);
                c11863e.appmetrica = null;
            }
            AudioTrack audioTrack = c11863e.ad;
            C0222e c0222e = c11863e.adcel;
            Handler subscription = AbstractC9413e.subscription(null);
            synchronized (C11863e.pro) {
                try {
                    if (C11863e.signatures == null) {
                        C11863e.signatures = Executors.newSingleThreadScheduledExecutor(new Object());
                    }
                    C11863e.tapsense++;
                    C11863e.signatures.schedule(new RunnableC4904e(3, audioTrack, subscription, c0222e), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.signatures = null;
        }
        C16777e c16777e = this.smaato;
        c16777e.ad = null;
        c16777e.vip = -9223372036854775807L;
        c16777e.metrica = -9223372036854775807L;
        C16777e c16777e2 = this.advert;
        c16777e2.ad = null;
        c16777e2.vip = -9223372036854775807L;
        c16777e2.metrica = -9223372036854775807L;
        this.f36359package = 0L;
        this.f36366transient = 0L;
        Handler handler = this.f36355import;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void remoteconfig() {
        purchase();
        C2171e listIterator = this.billing.listIterator(0);
        while (listIterator.hasNext()) {
            ((InterfaceC9018e) listIterator.next()).reset();
        }
        this.appmetrica.reset();
        this.purchase.reset();
        C11681e c11681e = this.subscription;
        if (c11681e != null) {
            AbstractC17475e abstractC17475e = c11681e.ad;
            for (int i = 0; i < abstractC17475e.size(); i++) {
                InterfaceC9018e interfaceC9018e = (InterfaceC9018e) abstractC17475e.get(i);
                interfaceC9018e.startapp(C2976e.vip);
                interfaceC9018e.reset();
            }
            c11681e.vip.clear();
            c11681e.metrica = new ByteBuffer[0];
            C10348e c10348e = C10348e.appmetrica;
            c11681e.license = false;
        }
        this.f36346break = false;
        this.f36362strictfp = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void signatures(java.nio.ByteBuffer r23) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18536e.signatures(java.nio.ByteBuffer):void");
    }

    public final boolean smaato() {
        C11863e vip;
        C2559e c2559e;
        C16777e c16777e = this.advert;
        if (c16777e.ad != null && (f36344instanceof.get() > 0 || SystemClock.elapsedRealtime() < c16777e.metrica)) {
            return false;
        }
        try {
            vip = vip((C11816e) this.admob.f13318e);
        } catch (C2707e e) {
            int i = ((C11816e) this.admob.f13318e).purchase;
            while (i > 1000000) {
                int i2 = i / 2;
                C6433e c6433e = this.admob;
                int i3 = c6433e.f13320e;
                if (i3 == -1) {
                    i3 = 1;
                }
                int i4 = i2 % i3;
                int i5 = i4 != 0 ? (i3 - i4) + i2 : i2;
                C10099e ad = ((C11816e) c6433e.f13318e).ad();
                ad.purchase = i5;
                C11816e c11816e = new C11816e(ad);
                try {
                    vip = vip(c11816e);
                    C6433e c6433e2 = this.admob;
                    this.admob = new C6433e((C16975e) c6433e2.f13319e, (C16975e) c6433e2.f13321e, c6433e2.f13322e, c6433e2.f13320e, c11816e, (C11681e) c6433e2.f13323e);
                } catch (C2707e e2) {
                    e.addSuppressed(e2);
                    i = i5;
                }
            }
            if (!((C11816e) this.admob.f13318e).appmetrica) {
                throw e;
            }
            this.f36362strictfp = true;
            throw e;
        }
        this.signatures = vip;
        C3659e c3659e = new C3659e(this, (C11816e) this.admob.f13318e);
        this.mopub = c3659e;
        vip.adcel.ad(c3659e);
        if (this.signatures.metrica()) {
            C6433e c6433e3 = this.admob;
            if (((C11816e) c6433e3.f13318e).mopub) {
                C11863e c11863e = this.signatures;
                C16975e c16975e = (C16975e) c6433e3.f13319e;
                c11863e.license(c16975e.f33283native, c16975e.f33280extends);
            }
        }
        C5350e c5350e = this.amazon;
        if (c5350e != null) {
            this.signatures.purchase(c5350e);
        }
        if (amazon()) {
            this.signatures.ad.setVolume(this.f36364this);
        }
        this.f36347case.getClass();
        AudioDeviceInfo audioDeviceInfo = this.f36348catch;
        if (audioDeviceInfo != null) {
            this.signatures.ad.setPreferredDevice(audioDeviceInfo);
        }
        this.f36356interface = true;
        int audioSessionId = this.signatures.ad.getAudioSessionId();
        boolean z = audioSessionId != this.f36350default;
        this.f36350default = audioSessionId;
        C2691e c2691e = this.loadAd;
        if (c2691e != null) {
            C11816e c11816e2 = (C11816e) this.admob.f13318e;
            C12268e c12268e = new C12268e(c11816e2.ad, c11816e2.vip, c11816e2.metrica, c11816e2.license, c11816e2.appmetrica, c11816e2.purchase);
            C17424e c17424e = ((C9860e) c2691e.f6570e).f19459e;
            Handler handler = (Handler) c17424e.f34142e;
            if (handler != null) {
                handler.post(new RunnableC6952e(c17424e, c12268e, 1));
            }
            if (z) {
                this.f36354implements = true;
                C6433e c6433e4 = this.admob;
                C10099e ad2 = ((C11816e) c6433e4.f13318e).ad();
                ad2.yandex = this.f36350default;
                this.admob = new C6433e((C16975e) c6433e4.f13319e, (C16975e) c6433e4.f13321e, c6433e4.f13322e, c6433e4.f13320e, new C11816e(ad2), (C11681e) c6433e4.f13323e);
                C6433e c6433e5 = this.Signature;
                if (c6433e5 != null) {
                    C10099e ad3 = ((C11816e) c6433e5.f13318e).ad();
                    ad3.yandex = this.f36350default;
                    this.Signature = new C6433e((C16975e) c6433e5.f13319e, (C16975e) c6433e5.f13321e, c6433e5.f13322e, c6433e5.f13320e, new C11816e(ad3), (C11681e) c6433e5.f13323e);
                }
                C2691e c2691e2 = this.loadAd;
                int i6 = this.f36350default;
                C9860e c9860e = (C9860e) c2691e2.f6570e;
                if (Build.VERSION.SDK_INT >= 35 && (c2559e = c9860e.f19458e) != null) {
                    c2559e.license(i6);
                }
                C17424e c17424e2 = c9860e.f19459e;
                Handler handler2 = (Handler) c17424e2.f34142e;
                if (handler2 != null) {
                    handler2.post(new RunnableC9766e(c17424e2, i6, 2));
                }
            }
        }
        return true;
    }

    public final void subscription() {
        if (this.admob != null) {
            C6433e c6433e = this.Signature;
            if (c6433e != null) {
                this.admob = c6433e;
                this.Signature = null;
            }
            try {
                C11816e metrica = ((C8577e) this.remoteconfig).metrica(billing((C16975e) this.admob.f13321e));
                C6433e c6433e2 = this.admob;
                this.admob = new C6433e((C16975e) c6433e2.f13319e, (C16975e) c6433e2.f13321e, c6433e2.f13322e, c6433e2.f13320e, metrica, (C11681e) c6433e2.f13323e);
            } catch (C3377e e) {
                throw new IllegalStateException(new C8102e(e, (C16975e) this.admob.f13319e));
            }
        }
        purchase();
    }

    public final boolean tapsense() {
        C6433e c6433e = this.admob;
        return c6433e != null && ((C11816e) c6433e.f13318e).adcel;
    }

    public final C11863e vip(C11816e c11816e) {
        try {
            return ((C8577e) this.remoteconfig).ad(c11816e);
        } catch (C14892e e) {
            C2707e c2707e = new C2707e(c11816e.vip, c11816e.metrica, c11816e.ad, c11816e.purchase, (C16975e) this.admob.f13319e, c11816e.appmetrica, e);
            C2691e c2691e = this.loadAd;
            if (c2691e == null) {
                throw c2707e;
            }
            c2691e.m1044native(c2707e);
            throw c2707e;
        }
    }

    public final int yandex(C16975e c16975e) {
        boolean z;
        if (!AbstractC9413e.m2572try(c16975e.f33285this) || c16975e.f33285this == 2) {
            z = false;
        } else {
            C11445e ad = c16975e.ad();
            ad.f23020goto = 2;
            c16975e = new C16975e(ad);
            z = true;
        }
        int i = ((C8577e) this.remoteconfig).vip(billing(c16975e)).license;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }
}
