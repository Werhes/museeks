package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7406e {
    public long Signature;
    public final C2362e ad;
    public long adcel;
    public long admob;
    public boolean ads;
    public long advert;
    public long amazon;
    public long applovin;
    public final int appmetrica;
    public final boolean billing;
    public long inmobi;
    public long isPro;
    public long isVip;
    public final AudioTrack license;
    public long loadAd;
    public final long[] metrica;
    public long mopub;
    public long premium;
    public int pro;
    public final long purchase;
    public int remoteconfig;
    public long signatures;
    public Method smaato;
    public float startapp;
    public long subscription;
    public long tapsense;
    public final C17381e vip;
    public final C14813e yandex;

    public C7406e(C2362e c2362e, C17381e c17381e, AudioTrack audioTrack, int i, int i2, int i3) {
        this.ad = c2362e;
        this.vip = c17381e;
        this.license = audioTrack;
        try {
            this.smaato = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.metrica = new long[10];
        this.applovin = -9223372036854775807L;
        this.isPro = -9223372036854775807L;
        this.yandex = new C14813e(audioTrack, c2362e);
        int sampleRate = audioTrack.getSampleRate();
        this.appmetrica = sampleRate;
        boolean m2572try = AbstractC9413e.m2572try(i);
        this.billing = m2572try;
        this.purchase = m2572try ? AbstractC9413e.m2560package(sampleRate, i3 / i2) : -9223372036854775807L;
        this.admob = 0L;
        this.subscription = 0L;
        this.ads = false;
        this.premium = 0L;
        this.signatures = -9223372036854775807L;
        this.tapsense = -9223372036854775807L;
        this.loadAd = 0L;
        this.amazon = 0L;
        this.startapp = 1.0f;
        this.adcel = -9223372036854775807L;
    }

    public final long ad() {
        if (this.signatures != -9223372036854775807L) {
            return Math.min(this.inmobi, metrica());
        }
        this.vip.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.Signature >= 5) {
            int playState = this.license.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = r4.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition != 0 || this.admob <= 0 || playState != 3) {
                        this.tapsense = -9223372036854775807L;
                    } else if (this.tapsense == -9223372036854775807L) {
                        this.tapsense = elapsedRealtime;
                    }
                }
                long j = this.admob;
                if (j > playbackHeadPosition) {
                    if (this.ads) {
                        this.premium += j;
                        this.ads = false;
                    } else {
                        this.subscription++;
                    }
                }
                this.admob = playbackHeadPosition;
            }
            this.Signature = elapsedRealtime;
        }
        return this.admob + this.premium + (this.subscription << 32);
    }

    public final void license(long j) {
        long j2 = this.adcel;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long m2557interface = AbstractC9413e.m2557interface(this.startapp, j - j2);
        this.vip.getClass();
        long currentTimeMillis = System.currentTimeMillis() - AbstractC9413e.m2567switch(m2557interface);
        this.adcel = -9223372036854775807L;
        C0222e c0222e = ((C11863e) this.ad.f5914e).adcel;
        c0222e.getClass();
        if (Thread.currentThread() == ((Thread) c0222e.metrica)) {
            c0222e.billing(-1, new C8739e(currentTimeMillis));
        }
    }

    public final long metrica() {
        if (this.license.getPlayState() == 2) {
            return this.isVip;
        }
        this.vip.getClass();
        return this.isVip + AbstractC9413e.m2555import(AbstractC9413e.crashlytics(this.startapp, AbstractC9413e.m2546case(SystemClock.elapsedRealtime()) - this.signatures), this.appmetrica, 1000000L, RoundingMode.UP);
    }

    public final long vip(long j) {
        int i = this.pro;
        int i2 = this.appmetrica;
        long max = Math.max(0L, (i == 0 ? this.signatures != -9223372036854775807L ? AbstractC9413e.m2560package(i2, metrica()) : AbstractC9413e.m2560package(i2, ad()) : AbstractC9413e.crashlytics(this.startapp, j + this.mopub)) - this.amazon);
        return this.signatures != -9223372036854775807L ? Math.min(AbstractC9413e.m2560package(i2, this.inmobi), max) : max;
    }
}
