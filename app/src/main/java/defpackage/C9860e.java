package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9860e extends AbstractC17844e implements InterfaceC7387e {

    /* renamed from: eؓؕۙ, reason: contains not printable characters */
    public boolean f19448e;

    /* renamed from: eؚؗۛ, reason: contains not printable characters */
    public C16975e f19449e;

    /* renamed from: eؗٞؑ, reason: contains not printable characters */
    public long f19450e;

    /* renamed from: eؗۗؓ, reason: contains not printable characters */
    public final Context f19451e;

    /* renamed from: eؗۢؗ, reason: contains not printable characters */
    public int f19452e;

    /* renamed from: eؚِۛ, reason: contains not printable characters */
    public C16975e f19453e;

    /* renamed from: eًؙٞ, reason: contains not printable characters */
    public boolean f19454e;

    /* renamed from: eٌؗۗ, reason: contains not printable characters */
    public boolean f19455e;

    /* renamed from: eٌۜۧ, reason: contains not printable characters */
    public boolean f19456e;

    /* renamed from: eَؚؗ, reason: contains not printable characters */
    public int f19457e;

    /* renamed from: eِؔۛ, reason: contains not printable characters */
    public final C2559e f19458e;

    /* renamed from: eٓۦْ, reason: contains not printable characters */
    public final C17424e f19459e;

    /* renamed from: eِۣٔ, reason: contains not printable characters */
    public long f19460e;

    /* renamed from: eٖٜۡ, reason: contains not printable characters */
    public boolean f19461e;

    /* renamed from: e٘ؖؐ, reason: contains not printable characters */
    public boolean f19462e;

    /* renamed from: e٘ؖۙ, reason: contains not printable characters */
    public boolean f19463e;

    /* renamed from: e۠ۢ, reason: contains not printable characters */
    public final C18536e f19464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9860e(Context context, InterfaceC3696e interfaceC3696e, boolean z, Handler handler, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e, C18536e c18536e) {
        super(context.getApplicationContext(), 1, interfaceC3696e, z, 44100.0f);
        C2559e c2559e = Build.VERSION.SDK_INT >= 35 ? new C2559e() : null;
        this.f19451e = context.getApplicationContext();
        this.f19464e = c18536e;
        this.f19458e = c2559e;
        this.f19457e = -1000;
        this.f19459e = new C17424e(handler, surfaceHolderCallbackC0960e, false, 6);
        this.f19450e = -9223372036854775807L;
        c18536e.loadAd = new C2691e(12, this);
    }

    @Override // defpackage.InterfaceC7387e
    public final void Signature(C4194e c4194e) {
        C18536e c18536e = this.f19464e;
        if (c18536e.tapsense()) {
            c18536e.isPro = c4194e;
            c18536e.pro();
            return;
        }
        C4194e c4194e2 = new C4194e(AbstractC9413e.startapp(c4194e.ad, 0.1f, 8.0f), AbstractC9413e.startapp(c4194e.vip, 0.1f, 8.0f));
        c18536e.isPro = c4194e2;
        C2219e c2219e = new C2219e(c4194e2, -9223372036854775807L, -9223372036854775807L);
        if (c18536e.amazon()) {
            c18536e.isVip = c2219e;
        } else {
            c18536e.inmobi = c2219e;
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: abstract, reason: not valid java name */
    public final long mo2717abstract(long j, long j2, boolean z) {
        long m2555import;
        C18536e c18536e = this.f19464e;
        boolean z2 = c18536e.advert() && this.f19450e != -9223372036854775807L;
        if (this.f19455e) {
            if (!c18536e.amazon()) {
                m2555import = -9223372036854775807L;
            } else if (C6433e.ad(c18536e.admob)) {
                m2555import = AbstractC9413e.m2560package(((C11816e) c18536e.admob.f13318e).vip, c18536e.signatures.ad.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = c18536e.signatures.ad.getBufferSizeInFrames();
                int purchase = AbstractC9357e.purchase(((C11816e) c18536e.admob.f13318e).ad);
                AbstractC2301e.subscription(purchase != -2147483647);
                m2555import = AbstractC9413e.m2555import(bufferSizeInFrames, 1000000L, purchase, RoundingMode.DOWN);
            }
            if (this.f19462e && z2 && m2555import != -9223372036854775807L) {
                float min = (float) Math.min(m2555import, this.f19450e - j);
                return Math.max(10000L, (min / (c18536e.isPro != null ? r1.ad : 1.0f)) / 2.0f);
            }
        } else if (z2 || this.f34958e) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e, defpackage.InterfaceC0396e
    public final void ad(int i, Object obj) {
        C2559e c2559e;
        C18536e c18536e = this.f19464e;
        if (i == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (c18536e.f36364this != floatValue) {
                c18536e.f36364this = floatValue;
                if (c18536e.amazon()) {
                    c18536e.signatures.ad.setVolume(c18536e.f36364this);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            C3335e c3335e = (C3335e) obj;
            c3335e.getClass();
            if (c18536e.tapsense.equals(c3335e)) {
                return;
            }
            c18536e.tapsense = c3335e;
            if (c18536e.f36363super) {
                return;
            }
            c18536e.subscription();
            return;
        }
        if (i == 6) {
            C18228e c18228e = (C18228e) obj;
            c18228e.getClass();
            if (c18536e.f36347case.equals(c18228e)) {
                return;
            }
            if (c18536e.signatures != null) {
                c18536e.f36347case.getClass();
            }
            c18536e.f36347case = c18228e;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            c18536e.f36348catch = audioDeviceInfo;
            C11863e c11863e = c18536e.signatures;
            if (c11863e != null) {
                c11863e.ad.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f19457e = ((Integer) obj).intValue();
            InterfaceC5827e interfaceC5827e = this.f34976e;
            if (interfaceC5827e != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f19457e));
                interfaceC5827e.ad(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            c18536e.applovin = ((Boolean) obj).booleanValue();
            C2219e c2219e = new C2219e(c18536e.tapsense() ? C4194e.license : c18536e.isPro, -9223372036854775807L, -9223372036854775807L);
            if (c18536e.amazon()) {
                c18536e.isVip = c2219e;
                return;
            } else {
                c18536e.inmobi = c2219e;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (c18536e.f36354implements) {
                if (c18536e.f36350default == intValue) {
                    c18536e.f36354implements = false;
                }
                if (Build.VERSION.SDK_INT >= 35 || (c2559e = this.f19458e) == null) {
                    return;
                }
                c2559e.license(intValue);
                return;
            }
            if (c18536e.f36350default != intValue) {
                c18536e.f36350default = intValue;
                c18536e.f36345abstract = intValue != 0;
                c18536e.subscription();
            }
            if (Build.VERSION.SDK_INT >= 35) {
                return;
            } else {
                return;
            }
        }
        if (i == 19) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = C18536e.f36344instanceof;
            if (intValue2 == 0 || intValue2 == -1) {
                intValue2 = -1;
            }
            if (c18536e.f36352final == intValue2) {
                return;
            }
            c18536e.f36352final = intValue2;
            c18536e.subscription();
            return;
        }
        if (i != 20) {
            super.ad(i, obj);
            return;
        }
        obj.getClass();
        InterfaceC11978e interfaceC11978e = (InterfaceC11978e) obj;
        if (interfaceC11978e.equals(c18536e.remoteconfig)) {
            return;
        }
        ((C8577e) c18536e.remoteconfig).license();
        c18536e.remoteconfig = interfaceC11978e;
        C16605e c16605e = c18536e.pro;
        if (c16605e != null) {
            C8577e c8577e = (C8577e) interfaceC11978e;
            c8577e.purchase();
            if (c8577e.purchase == null) {
                c8577e.purchase = new C0222e(Thread.currentThread());
            }
            c8577e.purchase.ad(c16605e);
        }
        c18536e.subscription();
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void adcel() {
        C17424e c17424e = this.f19459e;
        this.f19448e = true;
        this.f19453e = null;
        this.f19450e = -9223372036854775807L;
        this.f19462e = false;
        try {
            this.f19464e.purchase();
            try {
                super.adcel();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.adcel();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public final void admob() {
        m2723e();
        this.f19455e = false;
        C18536e c18536e = this.f19464e;
        c18536e.f36346break = false;
        if (c18536e.amazon()) {
            C11863e c11863e = c18536e.signatures;
            C7406e c7406e = c11863e.purchase;
            c7406e.mopub = 0L;
            c7406e.pro = 0;
            c7406e.remoteconfig = 0;
            c7406e.advert = 0L;
            c7406e.isPro = -9223372036854775807L;
            c7406e.applovin = -9223372036854775807L;
            if (c7406e.signatures == -9223372036854775807L) {
                c7406e.yandex.ad(0);
            }
            c7406e.isVip = c7406e.ad();
            if (!c11863e.mopub || c11863e.metrica()) {
                c11863e.ad.pause();
            }
        }
        this.f19462e = false;
    }

    @Override // defpackage.AbstractC17844e, defpackage.AbstractC0241e
    public final void advert(long j, boolean z, boolean z2) {
        super.advert(j, z, z2);
        this.f19464e.purchase();
        this.f19460e = j;
        this.f19450e = -9223372036854775807L;
        this.f19463e = false;
        this.f19462e = false;
        this.f19461e = true;
    }

    @Override // defpackage.AbstractC0241e
    public final void amazon() {
        C18536e c18536e = this.f19464e;
        this.f19463e = false;
        this.f19462e = false;
        this.f19450e = -9223372036854775807L;
        try {
            try {
                this.f34995e = false;
                m4447continue();
                m4463volatile();
                InterfaceC16612e interfaceC16612e = this.f34974e;
                if (interfaceC16612e != null) {
                    interfaceC16612e.metrica(null);
                }
                this.f34974e = null;
            } catch (Throwable th) {
                InterfaceC16612e interfaceC16612e2 = this.f34974e;
                if (interfaceC16612e2 != null) {
                    interfaceC16612e2.metrica(null);
                }
                this.f34974e = null;
                throw th;
            }
        } finally {
            if (this.f19448e) {
                this.f19448e = false;
                c18536e.remoteconfig();
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public final InterfaceC7387e appmetrica() {
        return this;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: break, reason: not valid java name */
    public final ArrayList mo2718break(C2282e c2282e, C16975e c16975e, boolean z) {
        C1410e billing;
        if (c16975e.loadAd == null) {
            billing = C1410e.f4222e;
        } else {
            if (this.f19464e.yandex(c16975e) != 0) {
                List appmetrica = AbstractC7473e.appmetrica("audio/raw", false, false);
                C10643e c10643e = appmetrica.isEmpty() ? null : (C10643e) appmetrica.get(0);
                if (c10643e != null) {
                    billing = AbstractC17475e.ads(c10643e);
                }
            }
            billing = AbstractC7473e.billing(c2282e, c16975e, z, false);
        }
        HashMap hashMap = AbstractC7473e.ad;
        ArrayList arrayList = new ArrayList(billing);
        Collections.sort(arrayList, new C15401e(1, new C11565e(this.f19451e, c16975e)));
        return arrayList;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: case, reason: not valid java name */
    public final void mo2719case(C7507e c7507e) {
        C16975e c16975e;
        C6433e c6433e;
        if (Build.VERSION.SDK_INT < 29 || (c16975e = c7507e.f15297e) == null || !Objects.equals(c16975e.loadAd, "audio/opus") || !this.f34995e) {
            return;
        }
        ByteBuffer byteBuffer = c7507e.f15298e;
        byteBuffer.getClass();
        C16975e c16975e2 = c7507e.f15297e;
        c16975e2.getClass();
        int i = c16975e2.f33283native;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            C18536e c18536e = this.f19464e;
            C11863e c11863e = c18536e.signatures;
            if (c11863e == null || !c11863e.metrica() || (c6433e = c18536e.admob) == null || !((C11816e) c6433e.f13318e).mopub) {
                return;
            }
            c18536e.signatures.license(i, i2);
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: else, reason: not valid java name */
    public final void mo2720else() {
        this.f19464e.f36349class = true;
    }

    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public final int m2721e(C10643e c10643e, C16975e c16975e) {
        if ("OMX.google.raw.decoder".equals(c10643e.ad) && Build.VERSION.SDK_INT == 23 && !AbstractC9413e.m2544abstract(this.f19451e)) {
            return -1;
        }
        return c16975e.Signature;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public final boolean mo2722e(C16975e c16975e) {
        C11443e c11443e = this.f1502e;
        c11443e.getClass();
        if (c11443e.ad != 0) {
            int m2724e = m2724e(c16975e);
            if ((m2724e & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                C11443e c11443e2 = this.f1502e;
                c11443e2.getClass();
                if (c11443e2.ad == 2 || (m2724e & 1024) != 0 || (c16975e.f33283native == 0 && c16975e.f33280extends == 0)) {
                    return true;
                }
            }
        }
        return this.f19464e.yandex(c16975e) != 0;
    }

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public final void m2723e() {
        long j;
        long j2;
        long j3;
        yandex();
        C18536e c18536e = this.f19464e;
        C12894e c12894e = c18536e.vip;
        if (!c18536e.amazon() || c18536e.f36356interface) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            long min = Math.min(c18536e.signatures.ad(), AbstractC9413e.m2560package(((C11816e) c18536e.admob.f13318e).vip, c18536e.adcel()));
            ArrayDeque arrayDeque = c18536e.yandex;
            while (!arrayDeque.isEmpty() && min >= ((C2219e) arrayDeque.getFirst()).metrica) {
                c18536e.inmobi = (C2219e) arrayDeque.remove();
            }
            C2219e c2219e = c18536e.inmobi;
            long j4 = min - c2219e.metrica;
            long crashlytics = AbstractC9413e.crashlytics(c2219e.ad.ad, j4);
            if (arrayDeque.isEmpty()) {
                C9051e c9051e = (C9051e) c12894e.f25752e;
                if (c9051e.purchase()) {
                    if (c9051e.amazon >= 1024) {
                        long j5 = c9051e.smaato;
                        c9051e.adcel.getClass();
                        long loadAd = j5 - (r10.startapp.loadAd() * (r10.adcel * r10.vip));
                        int i = c9051e.yandex.ad;
                        int i2 = c9051e.billing.ad;
                        if (i == i2) {
                            j4 = AbstractC9413e.m2555import(j4, loadAd, c9051e.amazon, RoundingMode.DOWN);
                        } else {
                            j = Long.MIN_VALUE;
                            j4 = AbstractC9413e.m2555import(j4, loadAd * i, c9051e.amazon * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        j4 = (long) (c9051e.metrica * j4);
                    }
                    C2219e c2219e2 = c18536e.inmobi;
                    j3 = c2219e2.vip + j4;
                    c2219e2.license = j4 - crashlytics;
                }
                j = Long.MIN_VALUE;
                C2219e c2219e22 = c18536e.inmobi;
                j3 = c2219e22.vip + j4;
                c2219e22.license = j4 - crashlytics;
            } else {
                j = Long.MIN_VALUE;
                C2219e c2219e3 = c18536e.inmobi;
                j3 = c2219e3.vip + crashlytics + c2219e3.license;
            }
            long j6 = ((C15359e) c12894e.f25750e).admob;
            j2 = AbstractC9413e.m2560package(((C11816e) c18536e.admob.f13318e).vip, j6) + j3;
            long j7 = c18536e.f36359package;
            if (j6 > j7) {
                long m2560package = AbstractC9413e.m2560package(((C11816e) c18536e.admob.f13318e).vip, j6 - j7);
                c18536e.f36359package = j6;
                c18536e.f36366transient += m2560package;
                if (c18536e.f36355import == null) {
                    c18536e.f36355import = new Handler(Looper.myLooper());
                }
                c18536e.f36355import.removeCallbacksAndMessages(null);
                c18536e.f36355import.postDelayed(new RunnableC17584e(22, c18536e), 100L);
            }
        }
        if (j2 != j) {
            if (!this.f19461e) {
                j2 = Math.max(this.f19460e, j2);
            }
            this.f19460e = j2;
            this.f19461e = false;
        }
    }

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final int m2724e(C16975e c16975e) {
        C13395e ad;
        C18536e c18536e = this.f19464e;
        if (c18536e.f36362strictfp) {
            ad = C13395e.license;
        } else {
            C12251e vip = ((C8577e) c18536e.remoteconfig).vip(c18536e.billing(c16975e));
            C10233e c10233e = new C10233e(0);
            c10233e.vip = vip.ad;
            c10233e.metrica = vip.vip;
            c10233e.license = vip.metrica;
            ad = c10233e.ad();
        }
        if (!ad.ad) {
            return 0;
        }
        int i = ad.vip ? 1536 : AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        return ad.metrica ? i | 2048 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r7.isEmpty() ? null : (defpackage.C10643e) r7.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @Override // defpackage.AbstractC17844e
    /* renamed from: eّٔؖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo2725e(defpackage.C2282e r19, defpackage.C16975e r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9860e.mo2725e(eٍؔؐ, eٌْٗ):int");
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: finally, reason: not valid java name */
    public final boolean mo2726finally(long j, long j2, InterfaceC5827e interfaceC5827e, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C16975e c16975e) {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.f19450e = -9223372036854775807L;
        if (this.f19449e != null && (i2 & 2) != 0) {
            interfaceC5827e.getClass();
            interfaceC5827e.billing(i);
            return true;
        }
        C18536e c18536e = this.f19464e;
        if (z) {
            if (interfaceC5827e != null) {
                interfaceC5827e.billing(i);
            }
            this.f34987e.purchase += i3;
            c18536e.f36349class = true;
            return true;
        }
        try {
            if (!c18536e.mopub(i3, j3, byteBuffer)) {
                this.f19450e = j3;
                return false;
            }
            if (interfaceC5827e != null) {
                interfaceC5827e.billing(i);
            }
            this.f34987e.appmetrica += i3;
            return true;
        } catch (C2707e e) {
            C16975e c16975e2 = this.f19453e;
            if (this.f34995e) {
                C11443e c11443e = this.f1502e;
                c11443e.getClass();
                if (c11443e.ad != 0) {
                    i5 = 5004;
                    throw vip(e, c16975e2, e.f6582e, i5);
                }
            }
            i5 = 5001;
            throw vip(e, c16975e2, e.f6582e, i5);
        } catch (C5905e e2) {
            if (this.f34995e) {
                C11443e c11443e2 = this.f1502e;
                c11443e2.getClass();
                if (c11443e2.ad != 0) {
                    i4 = 5003;
                    throw vip(e2, c16975e, e2.f12464e, i4);
                }
            }
            i4 = 5002;
            throw vip(e2, c16975e, e2.f12464e, i4);
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: for, reason: not valid java name */
    public final void mo2727for() {
        try {
            C18536e c18536e = this.f19464e;
            if (!c18536e.f36368while && c18536e.amazon() && c18536e.appmetrica()) {
                c18536e.Signature();
                c18536e.f36368while = true;
            }
            long j = this.f35007e.appmetrica;
            if (j != -9223372036854775807L) {
                this.f19450e = j;
            }
        } catch (C5905e e) {
            throw vip(e, e.f12463e, e.f12464e, this.f34995e ? 5003 : 5002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if ("AXON 7 mini".equals(r7) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    @Override // defpackage.AbstractC17844e
    /* renamed from: implements, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C2532e mo2728implements(defpackage.C10643e r17, defpackage.C16975e r18, android.media.MediaCrypto r19, float r20) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9860e.mo2728implements(eَۥؒ, eٌْٗ, android.media.MediaCrypto, float):eِّؔ");
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: import, reason: not valid java name */
    public final void mo2729import(String str) {
        C17424e c17424e = this.f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC16019e(c17424e, str, 7));
        }
    }

    @Override // defpackage.InterfaceC7387e
    public final long inmobi() {
        if (this.f1500e == 2) {
            m2723e();
        }
        return this.f19460e;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: instanceof, reason: not valid java name */
    public final C4268e mo2730instanceof(C13391e c13391e) {
        C16975e c16975e = (C16975e) c13391e.f26644e;
        c16975e.getClass();
        this.f19453e = c16975e;
        C4268e mo2730instanceof = super.mo2730instanceof(c13391e);
        C17424e c17424e = this.f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC4904e(2, c17424e, c16975e, mo2730instanceof));
        }
        return mo2730instanceof;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: interface, reason: not valid java name */
    public final C4268e mo2731interface(C10643e c10643e, C16975e c16975e, C16975e c16975e2) {
        C4268e vip = c10643e.vip(c16975e, c16975e2);
        int i = vip.appmetrica;
        if (this.f34974e == null && mo2722e(c16975e2)) {
            i |= 32768;
        }
        if (m2721e(c10643e, c16975e2) > this.f19452e) {
            i |= 64;
        }
        int i2 = i;
        return new C4268e(c10643e.ad, c16975e, c16975e2, i2 != 0 ? 0 : vip.license, i2);
    }

    @Override // defpackage.InterfaceC7387e
    public final boolean isPro() {
        boolean z = this.f19463e;
        this.f19463e = false;
        return z;
    }

    @Override // defpackage.InterfaceC7387e
    public final C4194e isVip() {
        return this.f19464e.isPro;
    }

    @Override // defpackage.AbstractC0241e
    public final void loadAd() {
        this.f19464e.loadAd();
        this.f19455e = true;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, eُۥۦ] */
    @Override // defpackage.AbstractC0241e
    public final void mopub(boolean z, boolean z2) {
        ?? obj = new Object();
        this.f34987e = obj;
        C17424e c17424e = this.f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC8041e(c17424e, obj, 1));
        }
        C11443e c11443e = this.f1502e;
        c11443e.getClass();
        boolean z3 = c11443e.vip;
        C18536e c18536e = this.f19464e;
        if (z3) {
            AbstractC2301e.subscription(c18536e.f36345abstract);
            if (!c18536e.f36363super) {
                c18536e.f36363super = true;
                c18536e.subscription();
            }
        } else if (c18536e.f36363super) {
            c18536e.f36363super = false;
            c18536e.subscription();
        }
        C5350e c5350e = this.f1506e;
        c5350e.getClass();
        c18536e.amazon = c5350e;
        C17381e c17381e = this.f1505e;
        c17381e.getClass();
        ((C8577e) c18536e.remoteconfig).billing = c17381e;
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: package, reason: not valid java name */
    public final void mo2732package(String str, long j, long j2) {
        C17424e c17424e = this.f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC10239e(c17424e, str, j, j2, 0));
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: private, reason: not valid java name */
    public final void mo2733private(Exception exc) {
        AbstractC2803e.billing("MediaCodecAudioRenderer", "Audio codec error", exc);
        C17424e c17424e = this.f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC13868e(c17424e, exc, 0));
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: protected, reason: not valid java name */
    public final float mo2734protected(float f, C16975e c16975e, C16975e[] c16975eArr) {
        int i = -1;
        for (C16975e c16975e2 : c16975eArr) {
            int i2 = c16975e2.f33281goto;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.AbstractC0241e
    public final String purchase() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.AbstractC0241e
    public final void smaato() {
        C2559e c2559e;
        ((C8577e) this.f19464e.remoteconfig).license();
        if (Build.VERSION.SDK_INT < 35 || (c2559e = this.f19458e) == null) {
            return;
        }
        c2559e.vip();
    }

    @Override // defpackage.AbstractC0241e
    public final boolean startapp() {
        return this.f19464e.advert();
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: static, reason: not valid java name */
    public final void mo2735static(C16975e c16975e, MediaFormat mediaFormat) {
        C16975e c16975e2 = this.f19449e;
        boolean z = true;
        int[] iArr = null;
        if (c16975e2 != null) {
            c16975e = c16975e2;
        } else if (this.f34976e != null) {
            mediaFormat.getClass();
            String str = c16975e.loadAd;
            int i = c16975e.f33282interface;
            int m2548class = "audio/raw".equals(str) ? c16975e.f33285this : (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? AbstractC9413e.m2548class(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2 : mediaFormat.getInteger("pcm-encoding");
            C11445e c11445e = new C11445e();
            c11445e.amazon = AbstractC8542e.amazon("audio/raw");
            c11445e.f23020goto = m2548class;
            c11445e.f23024this = c16975e.f33283native;
            c11445e.f23022native = c16975e.f33280extends;
            c11445e.mopub = c16975e.advert;
            c11445e.ad = c16975e.ad;
            c11445e.vip = c16975e.vip;
            c11445e.metrica = AbstractC17475e.remoteconfig(c16975e.metrica);
            c11445e.license = c16975e.license;
            c11445e.appmetrica = c16975e.appmetrica;
            c11445e.purchase = c16975e.purchase;
            c11445e.f23018class = mediaFormat.getInteger("channel-count");
            c11445e.f23021interface = mediaFormat.getInteger("sample-rate");
            c16975e = new C16975e(c11445e);
            boolean z2 = this.f19456e;
            int i2 = c16975e.f33282interface;
            if (z2 && i2 == 6 && i < 6) {
                iArr = new int[i];
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = i3;
                }
            } else if (this.f19454e) {
                if (i2 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i2 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i2 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i2 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i2 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
        }
        try {
            int i4 = Build.VERSION.SDK_INT;
            C18536e c18536e = this.f19464e;
            if (i4 >= 29) {
                if (this.f34995e) {
                    C11443e c11443e = this.f1502e;
                    c11443e.getClass();
                    if (c11443e.ad != 0) {
                        C11443e c11443e2 = this.f1502e;
                        c11443e2.getClass();
                        int i5 = c11443e2.ad;
                        c18536e.getClass();
                        if (i4 < 29) {
                            z = false;
                        }
                        AbstractC2301e.subscription(z);
                        c18536e.adcel = i5;
                    }
                }
                c18536e.getClass();
                if (i4 < 29) {
                    z = false;
                }
                AbstractC2301e.subscription(z);
                c18536e.adcel = 0;
            }
            c18536e.metrica(c16975e, iArr);
        } catch (C8102e e) {
            throw vip(e, e.f16451e, false, 5001);
        }
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: synchronized, reason: not valid java name */
    public final void mo2736synchronized() {
        this.f19464e.getClass();
    }

    @Override // defpackage.AbstractC17844e
    /* renamed from: transient, reason: not valid java name */
    public final void mo2737transient(C18520e c18520e) {
        C17424e c17424e = this.f19459e;
        Handler handler = (Handler) c17424e.f34142e;
        if (handler != null) {
            handler.post(new RunnableC16019e(c17424e, c18520e, 8));
        }
    }

    @Override // defpackage.AbstractC0241e
    public final boolean yandex() {
        if (!this.f34958e) {
            return false;
        }
        C18536e c18536e = this.f19464e;
        if (c18536e.amazon()) {
            return c18536e.f36368while && !c18536e.advert();
        }
        return true;
    }
}
