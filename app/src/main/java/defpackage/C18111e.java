package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۤٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18111e extends AbstractC14228e {
    public static final String signatures;
    public final C9427e Signature;
    public final C9427e adcel;
    public final C9427e admob;
    public final C9427e advert;
    public final C9427e amazon;
    public long appmetrica;
    public Long billing;
    public final C9427e loadAd;
    public final C9427e mopub;
    public final C9427e pro;
    public C0849e purchase;
    public final C9427e remoteconfig;
    public final C9427e smaato;
    public int startapp;
    public final C9427e subscription;
    public C10182e yandex;

    static {
        Pattern pattern = AbstractC5942e.ad;
        signatures = "urn:x-cast:com.google.cast.media";
    }

    public C18111e() {
        super(signatures);
        this.startapp = -1;
        C9427e c9427e = new C9427e(86400000L, "load");
        this.adcel = c9427e;
        C9427e c9427e2 = new C9427e(86400000L, "pause");
        this.mopub = c9427e2;
        C9427e c9427e3 = new C9427e(86400000L, "play");
        this.advert = c9427e3;
        C9427e c9427e4 = new C9427e(86400000L, "stop");
        C9427e c9427e5 = new C9427e(10000L, "seek");
        this.smaato = c9427e5;
        C9427e c9427e6 = new C9427e(86400000L, "volume");
        this.amazon = c9427e6;
        C9427e c9427e7 = new C9427e(86400000L, "mute");
        this.loadAd = c9427e7;
        C9427e c9427e8 = new C9427e(86400000L, "status");
        this.Signature = c9427e8;
        C9427e c9427e9 = new C9427e(86400000L, "activeTracks");
        C9427e c9427e10 = new C9427e(86400000L, "trackStyle");
        C9427e c9427e11 = new C9427e(86400000L, "queueInsert");
        C9427e c9427e12 = new C9427e(86400000L, "queueUpdate");
        this.admob = c9427e12;
        C9427e c9427e13 = new C9427e(86400000L, "queueRemove");
        C9427e c9427e14 = new C9427e(86400000L, "queueReorder");
        C9427e c9427e15 = new C9427e(86400000L, "queueFetchItemIds");
        this.subscription = c9427e15;
        C9427e c9427e16 = new C9427e(86400000L, "queueFetchItemRange");
        this.pro = c9427e16;
        this.remoteconfig = new C9427e(86400000L, "queueFetchItems");
        C9427e c9427e17 = new C9427e(86400000L, "setPlaybackRate");
        C9427e c9427e18 = new C9427e(86400000L, "skipAd");
        ad(c9427e);
        ad(c9427e2);
        ad(c9427e3);
        ad(c9427e4);
        ad(c9427e5);
        ad(c9427e6);
        ad(c9427e7);
        ad(c9427e8);
        ad(c9427e9);
        ad(c9427e10);
        ad(c9427e11);
        ad(c9427e12);
        ad(c9427e13);
        ad(c9427e14);
        ad(c9427e15);
        ad(c9427e16);
        ad(c9427e16);
        ad(c9427e17);
        ad(c9427e18);
        smaato();
    }

    public static C10914e amazon(JSONObject jSONObject) {
        MediaError.billing(jSONObject);
        C10914e c10914e = new C10914e(14);
        Pattern pattern = AbstractC5942e.ad;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return c10914e;
    }

    public static int[] yandex(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public final long Signature() {
        C15940e c15940e;
        C0849e c0849e = this.purchase;
        MediaInfo mediaInfo = c0849e == null ? null : c0849e.f3251e;
        if (mediaInfo != null && c0849e != null) {
            Long l = this.billing;
            if (l != null) {
                if (l.equals(4294967296000L)) {
                    C0849e c0849e2 = this.purchase;
                    if (c0849e2.f3236e != null) {
                        long longValue = l.longValue();
                        C0849e c0849e3 = this.purchase;
                        if (c0849e3 != null && (c15940e = c0849e3.f3236e) != null) {
                            long j = c15940e.f31398e;
                            r3 = !c15940e.f31399e ? purchase(1.0d, j, -1L) : j;
                        }
                        return Math.min(longValue, r3);
                    }
                    MediaInfo mediaInfo2 = c0849e2 == null ? null : c0849e2.f3251e;
                    if ((mediaInfo2 != null ? mediaInfo2.f684e : 0L) >= 0) {
                        long longValue2 = l.longValue();
                        C0849e c0849e4 = this.purchase;
                        MediaInfo mediaInfo3 = c0849e4 != null ? c0849e4.f3251e : null;
                        return Math.min(longValue2, mediaInfo3 != null ? mediaInfo3.f684e : 0L);
                    }
                }
                return l.longValue();
            }
            if (this.appmetrica != 0) {
                double d = c0849e.f3247e;
                long j2 = c0849e.f3252e;
                return (d == 0.0d || c0849e.f3231e != 2) ? j2 : purchase(d, j2, mediaInfo.f684e);
            }
        }
        return 0L;
    }

    public final void adcel() {
        C10182e c10182e = this.yandex;
        if (c10182e != null) {
            C5710e c5710e = (C5710e) c10182e.f20137e;
            c5710e.getClass();
            Iterator it = c5710e.billing.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            Iterator it2 = c5710e.yandex.iterator();
            while (it2.hasNext()) {
                C8327e c8327e = (C8327e) it2.next();
                switch (c8327e.ad) {
                    case 2:
                        ((C6639e) c8327e.vip).vip();
                        break;
                }
            }
        }
    }

    public final void advert() {
        C10182e c10182e = this.yandex;
        if (c10182e != null) {
            C5710e c5710e = (C5710e) c10182e.f20137e;
            Iterator it = c5710e.billing.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            Iterator it2 = c5710e.yandex.iterator();
            while (it2.hasNext()) {
                C8327e c8327e = (C8327e) it2.next();
                switch (c8327e.ad) {
                    case 2:
                        ((C6639e) c8327e.vip).vip();
                        break;
                }
            }
        }
    }

    public final long appmetrica() {
        C0849e c0849e = this.purchase;
        if (c0849e != null) {
            return c0849e.f3239e;
        }
        throw new Exception();
    }

    public final void billing(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.startapp = jSONObject.optInt("sequenceNumber", -1);
        } else {
            C18482e c18482e = (C18482e) this.ad;
            Log.w(c18482e.ad, c18482e.license(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void license(InterfaceC10846e interfaceC10846e, int i) {
        JSONObject jSONObject = new JSONObject();
        long metrica = metrica();
        try {
            jSONObject.put("requestId", metrica);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", appmetrica());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.startapp;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        vip(metrica, jSONObject.toString());
        this.admob.ad(metrica, new C17659e(this, interfaceC10846e));
    }

    public final void loadAd() {
        List list = (List) this.license;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C9427e) it.next()).appmetrica(2002);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        smaato();
    }

    public final void mopub() {
        C10182e c10182e = this.yandex;
        if (c10182e != null) {
            C5710e c5710e = (C5710e) c10182e.f20137e;
            Iterator it = c5710e.billing.iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            Iterator it2 = c5710e.yandex.iterator();
            while (it2.hasNext()) {
                C8327e c8327e = (C8327e) it2.next();
                switch (c8327e.ad) {
                    case 2:
                        ((C6639e) c8327e.vip).vip();
                        break;
                }
            }
        }
    }

    public final long purchase(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.appmetrica;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j3 = j + ((long) (elapsedRealtime * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0L;
    }

    public final void smaato() {
        this.appmetrica = 0L;
        this.purchase = null;
        Iterator it = ((List) this.license).iterator();
        while (it.hasNext()) {
            ((C9427e) it.next()).appmetrica(2002);
        }
    }

    public final void startapp() {
        C10182e c10182e = this.yandex;
        if (c10182e != null) {
            C5710e c5710e = (C5710e) c10182e.f20137e;
            c5710e.getClass();
            Iterator it = c5710e.startapp.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                if (c5710e.purchase()) {
                    throw null;
                }
                if (!c5710e.purchase()) {
                    throw null;
                }
                throw null;
            }
            Iterator it2 = c5710e.billing.iterator();
            if (it2.hasNext()) {
                throw AbstractC5087e.m1747goto(it2);
            }
            Iterator it3 = c5710e.yandex.iterator();
            while (it3.hasNext()) {
                C8327e c8327e = (C8327e) it3.next();
                switch (c8327e.ad) {
                    case 0:
                        C9407e c9407e = (C9407e) c8327e.vip;
                        long appmetrica = c9407e.appmetrica();
                        if (appmetrica == c9407e.vip) {
                            break;
                        } else {
                            c9407e.vip = appmetrica;
                            c9407e.ad();
                            if (c9407e.vip == 0) {
                                break;
                            } else {
                                c9407e.vip();
                                break;
                            }
                        }
                    case 1:
                        C10078e c10078e = (C10078e) c8327e.vip;
                        C5710e c5710e2 = c10078e.adcel;
                        C0849e metrica = c5710e2 != null ? c5710e2.metrica() : null;
                        C10182e c10182e2 = c10078e.advert;
                        if (c10182e2 != null && metrica != null) {
                            C0385e license = ((C11328e) c10182e2.f20137e).license();
                            C18451e c18451e = new C18451e(new C5401e(metrica));
                            C18451e c18451e2 = license.smaato;
                            if (c18451e2 != null && c18451e2.license == 2) {
                                break;
                            } else {
                                c18451e.metrica = license.yandex;
                                license.smaato = c18451e;
                                break;
                            }
                        }
                        break;
                    default:
                        ((C6639e) c8327e.vip).vip();
                        break;
                }
            }
        }
    }
}
