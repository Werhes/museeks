package defpackage;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۤۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3733e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f8315e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18405e f8316e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8317e;

    public /* synthetic */ RunnableC3733e(C18405e c18405e, long j, int i) {
        this.f8317e = i;
        this.f8316e = c18405e;
        this.f8315e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8317e) {
            case 0:
                C18405e c18405e = this.f8316e;
                long j = this.f8315e;
                switch (AbstractC8703e.m2467class(c18405e.f36090class)) {
                    case 0:
                    case 2:
                    case 3:
                    case 5:
                    case 7:
                        return;
                    case 1:
                        AbstractC9464e.yandex(c18405e.ad, "Pause on ".concat(AbstractC9476e.advert(j)));
                        c18405e.loadAd.addLast(Range.create(Long.valueOf(j), Long.MAX_VALUE));
                        c18405e.yandex(3);
                        return;
                    case 4:
                        c18405e.yandex(6);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e.f36090class)));
                }
            case 1:
                C18405e c18405e2 = this.f8316e;
                long j2 = this.f8315e;
                switch (AbstractC8703e.m2467class(c18405e2.f36090class)) {
                    case 0:
                        c18405e2.isPro = null;
                        AbstractC9464e.yandex(c18405e2.ad, "Start on ".concat(AbstractC9476e.advert(j2)));
                        try {
                            if (c18405e2.premium) {
                                c18405e2.purchase();
                            }
                            c18405e2.tapsense = Range.create(Long.valueOf(j2), Long.MAX_VALUE);
                            AbstractC9464e.yandex(c18405e2.ad, "mMediaCodec.start()");
                            c18405e2.appmetrica.start();
                            InterfaceC17421e interfaceC17421e = c18405e2.purchase;
                            if (interfaceC17421e instanceof C9396e) {
                                ((C9396e) interfaceC17421e).ad(true);
                            }
                            c18405e2.yandex(2);
                            return;
                        } catch (MediaCodec.CodecException e) {
                            c18405e2.ad(1, e.getMessage(), e);
                            return;
                        }
                    case 1:
                    case 4:
                    case 7:
                        return;
                    case 2:
                        c18405e2.isPro = null;
                        Range range = (Range) c18405e2.loadAd.removeLast();
                        AbstractC4265e.yandex("There should be a \"pause\" before \"resume\"", range != null && ((Long) range.getUpper()).longValue() == Long.MAX_VALUE);
                        Long l = (Long) range.getLower();
                        long longValue = l.longValue();
                        c18405e2.loadAd.addLast(Range.create(l, Long.valueOf(j2)));
                        AbstractC9464e.yandex(c18405e2.ad, "Resume on " + AbstractC9476e.advert(j2) + "\nPaused duration = " + AbstractC9476e.advert(j2 - longValue));
                        if ((c18405e2.metrica || AbstractC12904e.ad.vip(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!c18405e2.metrica || AbstractC12904e.ad.vip(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                            c18405e2.billing(false);
                            InterfaceC17421e interfaceC17421e2 = c18405e2.purchase;
                            if (interfaceC17421e2 instanceof C9396e) {
                                ((C9396e) interfaceC17421e2).ad(true);
                            }
                        }
                        if (c18405e2.metrica) {
                            c18405e2.appmetrica();
                        }
                        c18405e2.yandex(2);
                        return;
                    case 3:
                    case 5:
                        c18405e2.yandex(5);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e2.f36090class)));
                }
            default:
                C18405e c18405e3 = this.f8316e;
                long j3 = this.f8315e;
                String str = c18405e3.ad;
                switch (AbstractC8703e.m2467class(c18405e3.f36090class)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = c18405e3.f36090class;
                        c18405e3.yandex(4);
                        Long l2 = (Long) c18405e3.tapsense.getLower();
                        long longValue2 = l2.longValue();
                        if (longValue2 == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        if (j3 < longValue2) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        c18405e3.tapsense = Range.create(l2, Long.valueOf(j3));
                        AbstractC9464e.yandex(str, "Stop on ".concat(AbstractC9476e.advert(j3)));
                        if (i == 3 && c18405e3.isPro != null) {
                            c18405e3.startapp();
                            return;
                        } else {
                            c18405e3.inmobi = true;
                            c18405e3.applovin = AbstractC3062e.amazon().schedule(new RunnableC4127e(c18405e3, 5), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        c18405e3.yandex(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e3.f36090class)));
                }
        }
    }
}
