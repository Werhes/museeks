package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٚۥ */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12582e implements InterfaceC4871e, InterfaceC5808e, InterfaceC6269e, InterfaceC12504e, InterfaceC0771e, InterfaceC9307e, InterfaceC2156e, InterfaceC8895e, InterfaceC2516e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f25290e;

    public /* synthetic */ C12582e(int i) {
        this.f25290e = i;
    }

    public /* synthetic */ C12582e(int i, Object obj) {
        this.f25290e = i;
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        int i;
        Object obj;
        switch (this.f25290e) {
            case 10:
                i = 403;
                break;
            case 11:
                i = -1;
                break;
            default:
                synchronized (c0560e.ad) {
                    AbstractC9528e.mopub("Task is not yet complete", c0560e.metrica);
                    if (c0560e.license) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(c0560e.purchase)) {
                        throw ((Throwable) IOException.class.cast(c0560e.purchase));
                    }
                    Exception exc = c0560e.purchase;
                    if (exc != null) {
                        throw new RuntimeException(exc);
                    }
                    obj = c0560e.appmetrica;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        C2772e c2772e = (C2772e) obj;
        String yandex = C11196e.vip.yandex(c2772e);
        c2772e.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        return yandex.getBytes(AbstractC5508e.ad);
    }

    @Override // defpackage.InterfaceC6269e
    public Uri appmetrica(Uri uri) {
        return uri;
    }

    @Override // defpackage.InterfaceC6269e
    public C2435e billing(C2435e c2435e) {
        C10839e c10839e = C10839e.ad;
        Uri uri = c2435e.ad;
        if (!AbstractC7890e.billing(uri.getScheme(), "vkx")) {
            return c2435e;
        }
        int i = 2;
        if (uri.getPathSegments().size() != 2) {
            return c2435e;
        }
        return (C2435e) AbstractC5336e.yandex(C2693e.f6576e, new C16600e(c2435e, null, i));
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
        switch (this.f25290e) {
            case 8:
                interfaceC8524e.ads(new C5681e(2, new C14803e("Player release timed out.", 3, (byte) 0), 1003));
                return;
            default:
                interfaceC8524e.mo1486extends();
                return;
        }
    }

    @Override // defpackage.InterfaceC8895e
    public Object license(AbstractC14783e abstractC14783e) {
        switch (this.f25290e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Object obj = new Object();
                if (AbstractC1786e.adcel(2)) {
                    return obj;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            default:
                return new C2557e((C1127e) abstractC14783e);
        }
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        InterfaceC4648e lambda$getComponents$0;
        C16382e components$lambda$0;
        InterfaceC12823e components$lambda$1;
        switch (this.f25290e) {
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.ad.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.metrica.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.vip.get();
            case 5:
                C6491e c6491e = ExecutorsRegistrar.ad;
                return EnumC12154e.f24437e;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(c18464e);
                return lambda$getComponents$0;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(c18464e);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(c18464e);
                return components$lambda$1;
        }
    }

    @Override // defpackage.InterfaceC2516e
    public C17424e yandex(AbstractC12699e abstractC12699e) {
        C9622e c9622e = (C9622e) abstractC12699e;
        C2455e m2323interface = C7818e.m2323interface();
        m2323interface.yandex("type.googleapis.com/google.crypto.tink.HmacKey");
        C9333e m3379class = C12706e.m3379class();
        C0988e firebase = C14739e.firebase();
        int i = c9622e.vip;
        firebase.appmetrica();
        C14739e.ads((C14739e) firebase.f9709e, i);
        EnumC10611e enumC10611e = (EnumC10611e) AbstractC11932e.vip.metrica(c9622e.license);
        firebase.appmetrica();
        C14739e.applovin((C14739e) firebase.f9709e, enumC10611e);
        C14739e c14739e = (C14739e) firebase.ad();
        m3379class.appmetrica();
        C12706e.applovin((C12706e) m3379class.f9709e, c14739e);
        int i2 = c9622e.ad;
        m3379class.appmetrica();
        C12706e.ads((C12706e) m3379class.f9709e, i2);
        m2323interface.startapp(((C12706e) m3379class.ad()).purchase());
        m2323interface.billing((EnumC3021e) AbstractC11932e.ad.metrica(c9622e.metrica));
        return C17424e.admob((C7818e) m2323interface.ad());
    }
}
