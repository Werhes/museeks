package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11863e {
    public static final Object pro = new Object();
    public static ScheduledExecutorService signatures;
    public static int tapsense;
    public int Signature;
    public final AudioTrack ad;
    public final C0222e adcel = new C0222e(Thread.currentThread());
    public int admob;
    public long advert;
    public long amazon;
    public C17682e appmetrica;
    public final boolean billing;
    public final C12916e license;
    public ByteBuffer loadAd;
    public final float metrica;
    public boolean mopub;
    public final C7406e purchase;
    public boolean remoteconfig;
    public long smaato;
    public final C6375e startapp;
    public int subscription;
    public final C11816e vip;
    public final int yandex;

    public C11863e(AudioTrack audioTrack, C11816e c11816e, C12916e c12916e, float f, C17381e c17381e) {
        this.ad = audioTrack;
        this.vip = c11816e;
        this.metrica = f;
        this.license = c12916e;
        boolean m2572try = AbstractC9413e.m2572try(c11816e.ad);
        this.billing = m2572try;
        if (m2572try) {
            this.yandex = AbstractC9413e.tapsense(c11816e.ad) * Integer.bitCount(c11816e.metrica);
        } else {
            this.yandex = -1;
        }
        this.purchase = new C7406e(new C2362e(5, this), c17381e, audioTrack, c11816e.ad, this.yandex, c11816e.purchase);
        if (Build.VERSION.SDK_INT >= 24 && c12916e != null) {
            this.appmetrica = new C17682e(audioTrack, c12916e);
        }
        this.startapp = metrica() ? new C6375e(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long ad() {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11863e.ad():long");
    }

    public final void appmetrica() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.ad;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        C7406e c7406e = this.purchase;
        c7406e.ads = true;
        c7406e.yandex.ad.purchase = true;
    }

    public final boolean billing(int i, long j, ByteBuffer byteBuffer) {
        AudioTrack audioTrack;
        int write;
        boolean z;
        C12916e c12916e;
        C8577e c8577e;
        C7116e c7116e;
        int i2;
        long j2 = j;
        C11816e c11816e = this.vip;
        boolean z2 = this.billing;
        if (!z2 && this.admob == 0) {
            this.admob = C18536e.startapp(c11816e.ad, byteBuffer);
        }
        C0222e c0222e = this.adcel;
        c0222e.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = (Thread) c0222e.metrica;
        AudioTrack audioTrack2 = this.ad;
        if (currentThread == thread) {
            long vip = vip();
            if (Build.VERSION.SDK_INT >= 24) {
                i2 = audioTrack2.getUnderrunCount();
                audioTrack = audioTrack2;
            } else {
                boolean z3 = this.remoteconfig;
                long ad = ad();
                int sampleRate = audioTrack2.getSampleRate();
                String str = AbstractC9413e.ad;
                audioTrack = audioTrack2;
                boolean z4 = vip > AbstractC9413e.m2555import(ad, (long) sampleRate, 1000000L, RoundingMode.UP);
                this.remoteconfig = z4;
                i2 = (!z3 || z4 || audioTrack.getPlayState() == 1) ? this.subscription : this.subscription + 1;
            }
            boolean z5 = i2 > this.subscription;
            this.subscription = i2;
            if (z5) {
                c0222e.billing(-1, new C4403e(12));
            }
        } else {
            audioTrack = audioTrack2;
        }
        int remaining = byteBuffer.remaining();
        if (c11816e.license) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.amazon;
            } else {
                this.amazon = j2;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j2 * 1000);
            } else {
                AudioTrack audioTrack3 = audioTrack;
                if (this.loadAd == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.loadAd = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.loadAd.putInt(1431633921);
                }
                if (this.Signature == 0) {
                    this.loadAd.putInt(4, remaining2);
                    this.loadAd.putLong(8, j2 * 1000);
                    this.loadAd.position(0);
                    this.Signature = remaining2;
                }
                int remaining3 = this.loadAd.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack3.write(this.loadAd, remaining3, 1);
                    if (write2 < 0) {
                        this.Signature = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack3.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.Signature = 0;
                } else {
                    this.Signature -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write >= 0) {
            z = write == remaining;
            if (z2) {
                this.advert += write;
                return z;
            }
            if (z) {
                this.smaato = (this.admob * i) + this.smaato;
            }
            return z;
        }
        z = (Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32;
        if (z && (c12916e = this.license) != null && (c7116e = (c8577e = (C8577e) c12916e.f25784e).startapp) != null) {
            C16717e c16717e = C16717e.purchase;
            c8577e.yandex = c16717e;
            c7116e.vip(c16717e);
        }
        throw new C9542e(write, z);
    }

    public final void license(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.ad.setOffloadDelayPadding(i, i2);
    }

    public final boolean metrica() {
        return Build.VERSION.SDK_INT >= 29 && this.ad.isOffloadedPlayback();
    }

    public final void purchase(C5350e c5350e) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId ad = c5350e.ad();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (ad.equals(logSessionId)) {
            return;
        }
        this.ad.setLogSessionId(ad);
    }

    public final long vip() {
        if (!this.billing) {
            return this.smaato;
        }
        long j = this.advert;
        long j2 = this.yandex;
        String str = AbstractC9413e.ad;
        return ((j + j2) - 1) / j2;
    }
}
