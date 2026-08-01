package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٝؔ */
/* loaded from: classes.dex */
public final class C14845e implements InterfaceC3190e {
    public Csuper Signature;
    public final Context ad;
    public String adcel;
    public Csuper admob;
    public int ads;
    public int advert;
    public int applovin;
    public boolean inmobi;
    public int isPro;
    public int isVip;
    public final PlaybackSession license;
    public C8256e loadAd;
    public final C6671e metrica;
    public PlaybackMetrics.Builder mopub;
    public boolean premium;
    public C16975e pro;
    public C16975e remoteconfig;
    public C16975e signatures;
    public Csuper subscription;
    public boolean tapsense;
    public final Executor vip = AbstractC8461e.purchase();
    public final C11501e purchase = new C11501e();
    public final C6158e billing = new C6158e();
    public final HashMap startapp = new HashMap();
    public final HashMap yandex = new HashMap();
    public final long appmetrica = SystemClock.elapsedRealtime();
    public int smaato = 0;
    public int amazon = 0;

    public C14845e(Context context, PlaybackSession playbackSession) {
        this.ad = context.getApplicationContext();
        this.license = playbackSession;
        C6671e c6671e = new C6671e();
        this.metrica = c6671e;
        c6671e.license = this;
    }

    /* renamed from: import */
    public static C14845e m3854import(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C14845e(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void Signature(C18177e c18177e, C0807e c0807e) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: abstract */
    public final /* synthetic */ void mo1295abstract(C18177e c18177e, C18255e c18255e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void ad(C18177e c18177e, boolean z) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void adcel(C18177e c18177e, Object obj) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void admob(C18177e c18177e, int i, int i2) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void ads(C18177e c18177e, String str) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void advert(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void amazon(C18177e c18177e, C17750e c17750e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void applovin(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void appmetrica(C18177e c18177e, boolean z) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void billing(C18177e c18177e, String str) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: break */
    public final /* synthetic */ void mo1296break(C18177e c18177e, boolean z) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: case */
    public final /* synthetic */ void mo1297case(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: catch */
    public final /* synthetic */ void mo1298catch(C18177e c18177e) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: class */
    public final /* synthetic */ void mo1299class(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void crashlytics(C18177e c18177e) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: default */
    public final /* synthetic */ void mo1300default(C18177e c18177e, Exception exc) {
    }

    /* renamed from: else */
    public final void m3860else(C18177e c18177e, String str) {
        C18208e c18208e = c18177e.license;
        if ((c18208e == null || !c18208e.vip()) && str.equals(this.adcel)) {
            m3861instanceof();
        }
        this.yandex.remove(str);
        this.startapp.remove(str);
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: extends */
    public final void mo1301extends(C18177e c18177e, C11387e c11387e) {
        this.isPro += c11387e.billing;
        this.applovin += c11387e.appmetrica;
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: final */
    public final void mo1302final(C18177e c18177e, C8256e c8256e) {
        this.loadAd = c8256e;
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void firebase(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: goto */
    public final void mo1303goto(int i, long j, C18177e c18177e) {
        C18208e c18208e = c18177e.license;
        if (c18208e != null) {
            String license = this.metrica.license(c18177e.vip, c18208e);
            HashMap hashMap = this.startapp;
            Long l = (Long) hashMap.get(license);
            HashMap hashMap2 = this.yandex;
            Long l2 = (Long) hashMap2.get(license);
            hashMap.put(license, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(license, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: implements */
    public final /* synthetic */ void mo1304implements(C18177e c18177e, int i, boolean z) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void inmobi(C18177e c18177e, C16975e c16975e) {
    }

    /* renamed from: instanceof */
    public final void m3861instanceof() {
        PlaybackMetrics.Builder builder = this.mopub;
        if (builder != null && this.premium) {
            builder.setAudioUnderrunCount(this.ads);
            this.mopub.setVideoFramesDropped(this.isPro);
            this.mopub.setVideoFramesPlayed(this.applovin);
            Long l = (Long) this.yandex.get(this.adcel);
            this.mopub.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.startapp.get(this.adcel);
            this.mopub.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.mopub.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.vip.execute(new RunnableC7410e(this, this.mopub.build(), 14));
        }
        this.mopub = null;
        this.adcel = null;
        this.ads = 0;
        this.isPro = 0;
        this.applovin = 0;
        this.remoteconfig = null;
        this.pro = null;
        this.signatures = null;
        this.premium = false;
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: interface */
    public final /* synthetic */ void mo1305interface(C18177e c18177e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void isPro(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void isVip(C18177e c18177e, int i) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void license(C18177e c18177e, String str) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void loadAd(C18177e c18177e, C16975e c16975e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void metrica(C18177e c18177e, boolean z) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void mopub(C18177e c18177e, long j) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: native */
    public final /* synthetic */ void mo1306native(C18177e c18177e, int i, long j, long j2) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void premium(C18177e c18177e, C12268e c12268e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void pro(C18177e c18177e, C12268e c12268e) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: protected */
    public final /* synthetic */ void mo1307protected(C18177e c18177e, String str) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void purchase(C18177e c18177e, C4194e c4194e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void remoteconfig(C18177e c18177e, C3335e c3335e) {
    }

    /* renamed from: return */
    public final void m3862return(C18177e c18177e, String str) {
        C18208e c18208e = c18177e.license;
        if (c18208e == null || !c18208e.vip()) {
            m3861instanceof();
            this.adcel = str;
            this.mopub = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.0");
            m3865synchronized(c18177e.vip, c18208e);
        }
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void signatures(C18177e c18177e) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x050b  */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [super] */
    /* JADX WARN: Type inference failed for: r8v71 */
    @Override // defpackage.InterfaceC3190e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void smaato(defpackage.InterfaceC16843e r24, defpackage.C18540e r25) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14845e.smaato(eؙٗۙ, eۨۗ):void");
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void startapp(C18177e c18177e, int i) {
    }

    /* renamed from: static */
    public final LogSessionId m3863static() {
        return this.license.getSessionId();
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void subs(C18177e c18177e, int i, int i2, boolean z) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void subscription(C18177e c18177e, int i) {
    }

    /* renamed from: switch */
    public final void m3864switch(int i, long j, C16975e c16975e, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.appmetrica);
        if (c16975e != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c16975e.amazon;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c16975e.loadAd;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c16975e.mopub;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = c16975e.adcel;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = c16975e.tapsense;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = c16975e.isVip;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = c16975e.f33282interface;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = c16975e.f33281goto;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = c16975e.license;
            if (str4 != null) {
                String str5 = AbstractC9413e.ad;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c16975e.applovin;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.premium = true;
        this.vip.execute(new RunnableC7410e(this, timeSinceCreatedMillis.build(), 11));
    }

    /* renamed from: synchronized */
    public final void m3865synchronized(AbstractC6690e abstractC6690e, C18208e c18208e) {
        int vip;
        PlaybackMetrics.Builder builder = this.mopub;
        if (c18208e == null || (vip = abstractC6690e.vip(c18208e.ad)) == -1) {
            return;
        }
        C6158e c6158e = this.billing;
        int i = 0;
        abstractC6690e.purchase(vip, c6158e, false);
        int i2 = c6158e.metrica;
        C11501e c11501e = this.purchase;
        abstractC6690e.amazon(i2, c11501e);
        C16914e c16914e = c11501e.metrica.vip;
        if (c16914e != null) {
            int m2570throw = AbstractC9413e.m2570throw(c16914e.ad, c16914e.vip);
            i = m2570throw != 0 ? m2570throw != 1 ? m2570throw != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (c11501e.smaato != -9223372036854775807L && !c11501e.mopub && !c11501e.startapp && !c11501e.ad()) {
            builder.setMediaDurationMillis(AbstractC9413e.m2567switch(c11501e.smaato));
        }
        builder.setPlaybackType(c11501e.ad() ? 2 : 1);
        this.premium = true;
    }

    @Override // defpackage.InterfaceC3190e
    public final void tapsense(C18177e c18177e, C2351e c2351e) {
        Csuper csuper = this.Signature;
        if (csuper != null) {
            C16975e c16975e = (C16975e) csuper.f36469e;
            if (c16975e.isVip == -1) {
                C11445e ad = c16975e.ad();
                ad.signatures = c2351e.ad;
                ad.tapsense = c2351e.vip;
                this.Signature = new Csuper(new C16975e(ad), csuper.f36470e, (String) csuper.f36471e, 18);
            }
        }
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: this */
    public final /* synthetic */ void mo1308this(C18177e c18177e, float f) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: throw */
    public final void mo1309throw(int i, C18177e c18177e, C0101e c0101e, C0101e c0101e2) {
        if (i == 1) {
            this.tapsense = true;
        }
        this.advert = i;
    }

    /* renamed from: transient */
    public final boolean m3866transient(Csuper csuper) {
        String str;
        if (csuper == null) {
            return false;
        }
        String str2 = (String) csuper.f36471e;
        C6671e c6671e = this.metrica;
        synchronized (c6671e) {
            str = c6671e.purchase;
        }
        return str2.equals(str);
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: try */
    public final /* synthetic */ void mo1310try(C18177e c18177e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void vip(C18177e c18177e) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: while */
    public final void mo1311while(C18177e c18177e, C0807e c0807e) {
        C18208e c18208e = c18177e.license;
        if (c18208e == null) {
            return;
        }
        C16975e c16975e = c0807e.metrica;
        c16975e.getClass();
        int i = c0807e.license;
        AbstractC6690e abstractC6690e = c18177e.vip;
        c18208e.getClass();
        Csuper csuper = new Csuper(c16975e, i, this.metrica.license(abstractC6690e, c18208e), 18);
        int i2 = c0807e.vip;
        if (i2 != 0) {
            if (i2 == 1) {
                this.admob = csuper;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.subscription = csuper;
                return;
            }
        }
        this.Signature = csuper;
    }

    @Override // defpackage.InterfaceC3190e
    public final void yandex(C18177e c18177e, C0807e c0807e, IOException iOException) {
        this.isVip = c0807e.ad;
    }
}
