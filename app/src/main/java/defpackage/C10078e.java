package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10078e extends AbstractC1215e {
    public static final C18482e smaato = new C18482e("CastSession", null);
    public C5710e adcel;
    public C10182e advert;
    public final InterfaceC4112e appmetrica;
    public final BinderC8922e billing;
    public final HashSet license;
    public final Context metrica;
    public CastDevice mopub;
    public final C12487e purchase;
    public C4612e startapp;
    public final C6639e yandex;

    public C10078e(Context context, String str, String str2, C12487e c12487e, BinderC8922e binderC8922e, C6639e c6639e) {
        super(context, str, str2);
        this.license = new HashSet();
        this.metrica = context.getApplicationContext();
        this.purchase = c12487e;
        this.billing = binderC8922e;
        this.yandex = c6639e;
        InterfaceC15751e metrica = metrica();
        BinderC1109e binderC1109e = new BinderC1109e(this);
        C18482e c18482e = AbstractC5672e.ad;
        InterfaceC4112e interfaceC4112e = null;
        if (metrica != null) {
            try {
                interfaceC4112e = AbstractC5672e.vip(context).m3626e(c12487e, metrica, binderC1109e);
            } catch (RemoteException | C13373e e) {
                AbstractC5672e.ad.ad(e, "Unable to call %s on %s.", "newCastSessionImpl", C13624e.class.getSimpleName());
            }
        }
        this.appmetrica = interfaceC4112e;
    }

    public final void appmetrica(int i) {
        C6639e c6639e = this.yandex;
        if (c6639e.admob) {
            c6639e.admob = false;
            C5710e c5710e = c6639e.amazon;
            if (c5710e != null) {
                C8327e c8327e = c6639e.smaato;
                AbstractC9528e.appmetrica();
                if (c8327e != null) {
                    c5710e.yandex.remove(c8327e);
                }
            }
            AudioManager audioManager = (AudioManager) c6639e.ad.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            c6639e.metrica.m2505e(null);
            C11328e c11328e = c6639e.yandex;
            if (c11328e != null) {
                c11328e.metrica();
                c11328e.f22770e = null;
            }
            C11328e c11328e2 = c6639e.startapp;
            if (c11328e2 != null) {
                c11328e2.metrica();
                c11328e2.f22770e = null;
            }
            C12894e c12894e = c6639e.Signature;
            if (c12894e != null) {
                c12894e.firebase(null, null);
                c6639e.Signature.m3413class(new MediaMetadataCompat(new Bundle()));
                c6639e.license(0, null);
            }
            C12894e c12894e2 = c6639e.Signature;
            if (c12894e2 != null) {
                ((C15944e) c12894e2.f25751e).ad.setActive(false);
                Iterator it = ((ArrayList) c12894e2.f25752e).iterator();
                if (it.hasNext()) {
                    throw AbstractC5087e.m1747goto(it);
                }
                C15944e c15944e = (C15944e) c6639e.Signature.f25751e;
                MediaSession mediaSession = c15944e.ad;
                c15944e.appmetrica.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                    }
                }
                mediaSession.setCallback(null);
                c15944e.vip.metrica.set(null);
                mediaSession.release();
                c6639e.Signature = null;
            }
            c6639e.amazon = null;
            c6639e.loadAd = null;
            c6639e.yandex();
            if (i == 0) {
                c6639e.adcel();
            }
        }
        C4612e c4612e = this.startapp;
        if (c4612e != null) {
            C9321e ad = C0381e.ad();
            ad.ad = C7249e.f14839e;
            ad.appmetrica = 8403;
            c4612e.appmetrica(1, ad.ad());
            c4612e.startapp();
            C9364e c9364e = (C9364e) c4612e.license(c4612e.mopub, "castDeviceControllerListenerKey").vip;
            AbstractC9528e.adcel(c9364e, "Key must not be null");
            c4612e.metrica(c9364e, 8415);
            this.startapp = null;
        }
        this.mopub = null;
        C5710e c5710e2 = this.adcel;
        if (c5710e2 != null) {
            c5710e2.smaato(null);
            this.adcel = null;
        }
    }

    public final void license(String str, C0560e c0560e) {
        C18482e c18482e = smaato;
        InterfaceC4112e interfaceC4112e = this.appmetrica;
        if (interfaceC4112e == null) {
            return;
        }
        try {
            if (!c0560e.advert()) {
                Exception startapp = c0560e.startapp();
                if (!(startapp instanceof C10427e)) {
                    C13560e c13560e = (C13560e) interfaceC4112e;
                    Parcel m4156e = c13560e.m4156e();
                    m4156e.writeInt(2476);
                    c13560e.m4155e(m4156e, 5);
                    return;
                }
                int i = ((C10427e) startapp).f20605e.f733e;
                C13560e c13560e2 = (C13560e) interfaceC4112e;
                Parcel m4156e2 = c13560e2.m4156e();
                m4156e2.writeInt(i);
                c13560e2.m4155e(m4156e2, 5);
                return;
            }
            C14045e c14045e = (C14045e) c0560e.adcel();
            Status status = c14045e.f27787e;
            if (!c14045e.f27787e.billing()) {
                Status status2 = c14045e.f27787e;
                c18482e.vip("%s() -> failure result", str);
                int i2 = c14045e.f27787e.f733e;
                C13560e c13560e3 = (C13560e) interfaceC4112e;
                Parcel m4156e3 = c13560e3.m4156e();
                m4156e3.writeInt(i2);
                c13560e3.m4155e(m4156e3, 5);
                return;
            }
            c18482e.vip("%s() -> success result", str);
            C5710e c5710e = new C5710e(new C18111e());
            this.adcel = c5710e;
            c5710e.smaato(this.startapp);
            C5710e c5710e2 = this.adcel;
            C8327e c8327e = new C8327e(this);
            c5710e2.getClass();
            AbstractC9528e.appmetrica();
            c5710e2.yandex.add(c8327e);
            this.adcel.amazon();
            C6639e c6639e = this.yandex;
            C5710e c5710e3 = this.adcel;
            AbstractC9528e.appmetrica();
            c6639e.ad(c5710e3, this.mopub);
            C17005e c17005e = c14045e.f27785e;
            AbstractC9528e.startapp(c17005e);
            String str2 = c14045e.f27784e;
            String str3 = c14045e.f27786e;
            AbstractC9528e.startapp(str3);
            boolean z = c14045e.f27783e;
            C13560e c13560e4 = (C13560e) interfaceC4112e;
            Parcel m4156e4 = c13560e4.m4156e();
            AbstractC3336e.vip(m4156e4, c17005e);
            m4156e4.writeString(str2);
            m4156e4.writeString(str3);
            m4156e4.writeInt(z ? 1 : 0);
            c13560e4.m4155e(m4156e4, 4);
        } catch (RemoteException e) {
            c18482e.ad(e, "Unable to call %s on %s.", "methods", InterfaceC4112e.class.getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10078e.purchase(android.os.Bundle):void");
    }
}
