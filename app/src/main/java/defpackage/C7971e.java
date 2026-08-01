package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7971e extends AbstractC8031e {

    /* renamed from: class, reason: not valid java name */
    public final C17548e f16143class;
    public final C17548e crashlytics;
    public final C17548e firebase;

    /* renamed from: goto, reason: not valid java name */
    public final C17548e f16144goto;

    /* renamed from: interface, reason: not valid java name */
    public final C17548e f16145interface;

    /* renamed from: native, reason: not valid java name */
    public C5976e f16146native;
    public long subs;

    /* renamed from: this, reason: not valid java name */
    public final C17548e f16147this;

    public C7971e(Context context, Looper looper, C2532e c2532e, C1623e c1623e, C1623e c1623e2) {
        super(context, looper, 54, c2532e, c1623e, c1623e2);
        this.crashlytics = new C17548e(0);
        this.firebase = new C17548e(0);
        this.f16143class = new C17548e(0);
        this.f16145interface = new C17548e(0);
        this.f16144goto = new C17548e(0);
        this.f16147this = new C17548e(0);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            AbstractC0250e.ad = cacheDir;
        }
    }

    public static Status crashlytics(int i) {
        String str;
        if (i == 8025) {
            str = "MISSING_SETTING_LOCATION_MUST_BE_ON";
        } else if (i != 8050) {
            switch (i) {
                case 8000:
                    str = "STATUS_NETWORK_NOT_CONNECTED";
                    break;
                case 8001:
                    str = "STATUS_ALREADY_ADVERTISING";
                    break;
                case 8002:
                    str = "STATUS_ALREADY_DISCOVERING";
                    break;
                case 8003:
                    str = "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
                    break;
                case 8004:
                    str = "STATUS_CONNECTION_REJECTED";
                    break;
                case 8005:
                    str = "STATUS_NOT_CONNECTED_TO_ENDPOINT";
                    break;
                case 8006:
                    str = "STATUS_CAN_NOT_OBTAIN_DEVICE_PROVIDER";
                    break;
                case 8007:
                    str = "STATUS_RADIO_ERROR";
                    break;
                case 8008:
                    str = "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                    break;
                case 8009:
                    str = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                case 8010:
                    str = "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                    break;
                case 8011:
                    str = "STATUS_ENDPOINT_UNKNOWN";
                    break;
                case 8012:
                    str = "STATUS_ENDPOINT_IO_ERROR";
                    break;
                case 8013:
                    str = "STATUS_PAYLOAD_IO_ERROR";
                    break;
                case 8014:
                    str = "STATUS_PAYLOAD_UNKNOWN";
                    break;
                case 8015:
                    str = "STATUS_ALREADY_LISTENING";
                    break;
                case 8016:
                    str = "STATUS_AUTH_ERROR";
                    break;
                default:
                    switch (i) {
                        case 8029:
                            str = "MISSING_PERMISSION_NEARBY_WIFI_DEVICES";
                            break;
                        case 8030:
                            str = "MISSING_PERMISSION_BLUETOOTH";
                            break;
                        case 8031:
                            str = "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                            break;
                        case 8032:
                            str = "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                            break;
                        case 8033:
                            str = "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                            break;
                        case 8034:
                            str = "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                            break;
                        case 8035:
                            str = "MISSING_PERMISSION_RECORD_AUDIO";
                            break;
                        case 8036:
                            str = "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                            break;
                        case 8037:
                            str = "MISSING_PERMISSION_BLUETOOTH_SCAN";
                            break;
                        case 8038:
                            str = "MISSING_PERMISSION_BLUETOOTH_ADVERTISE";
                            break;
                        case 8039:
                            str = "MISSING_PERMISSION_BLUETOOTH_CONNECT";
                            break;
                        default:
                            str = AbstractC18129e.purchase(i);
                            break;
                    }
            }
        } else {
            str = "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        return new Status(i, str, null, null);
    }

    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final boolean ad() {
        Object obj;
        String str;
        Boolean bool;
        String str2;
        Context context = this.metrica;
        boolean z = true;
        if (((Context) C5277e.ad(context).ad).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
            return true;
        }
        ContentResolver contentResolver = context.getContentResolver();
        C10017e c10017e = AbstractC5381e.ad;
        c10017e.getClass();
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (c10017e) {
            try {
                c10017e.license(contentResolver);
                obj = c10017e.f19787e;
                HashMap hashMap = (HashMap) c10017e.f19788e;
                Object obj2 = Boolean.TRUE;
                str = null;
                if (hashMap.containsKey("gms:nearby:requires_gms_check")) {
                    Object obj3 = hashMap.get("gms:nearby:requires_gms_check");
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                } else {
                    obj2 = null;
                }
                bool = (Boolean) obj2;
            } finally {
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (c10017e) {
            try {
                c10017e.license(contentResolver);
                Object obj4 = c10017e.f19787e;
                if (((HashMap) c10017e.f19785e).containsKey("gms:nearby:requires_gms_check")) {
                    String str3 = (String) ((HashMap) c10017e.f19785e).get("gms:nearby:requires_gms_check");
                    if (str3 != null) {
                        str = str3;
                    }
                } else {
                    try {
                        Cursor query = contentResolver.query(AbstractC1139e.ad, null, null, new String[]{"gms:nearby:requires_gms_check"}, null);
                        try {
                            if (query == null) {
                                throw new Exception("Failed to connect to GservicesProvider");
                            }
                            if (query.moveToFirst()) {
                                str2 = query.getString(1);
                                query.close();
                            } else {
                                query.close();
                                str2 = null;
                            }
                            if (str2 != null && str2.equals(null)) {
                                str2 = null;
                            }
                            synchronized (c10017e) {
                                try {
                                    if (obj4 == c10017e.f19787e) {
                                        ((HashMap) c10017e.f19785e).put("gms:nearby:requires_gms_check", str2);
                                    }
                                } finally {
                                }
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                        } finally {
                        }
                    } catch (C16713e unused) {
                    }
                }
            } finally {
            }
        }
        if (str != null && !str.isEmpty()) {
            if (AbstractC1139e.vip.matcher(str).matches()) {
                bool = Boolean.TRUE;
            } else if (AbstractC1139e.metrica.matcher(str).matches()) {
                bool = Boolean.FALSE;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read Gservices key gms:nearby:requires_gms_check (value \"" + str + "\") as boolean");
            }
        }
        synchronized (c10017e) {
            try {
                HashMap hashMap2 = (HashMap) c10017e.f19788e;
                if (obj == c10017e.f19787e) {
                    hashMap2.put("gms:nearby:requires_gms_check", bool);
                    ((HashMap) c10017e.f19785e).remove("gms:nearby:requires_gms_check");
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // defpackage.AbstractC6785e
    public final Bundle advert() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.subs);
        return bundle;
    }

    @Override // defpackage.AbstractC6785e
    public final IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return queryLocalInterface instanceof C11125e ? (C11125e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService", 4);
    }

    public final void firebase() {
        C17548e c17548e = this.crashlytics;
        c17548e.getClass();
        C6748e c6748e = new C6748e(c17548e);
        while (c6748e.hasNext()) {
            BinderC16545e binderC16545e = (BinderC16545e) c6748e.next();
            synchronized (binderC16545e) {
                try {
                    C17548e c17548e2 = binderC16545e.appmetrica;
                    c17548e2.getClass();
                    C6748e c6748e2 = new C6748e(c17548e2);
                    while (c6748e2.hasNext()) {
                        binderC16545e.license.ad(new C13496e((String) c6748e2.next(), 2));
                    }
                    binderC16545e.appmetrica.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C17548e c17548e3 = this.firebase;
        c17548e3.getClass();
        C6748e c6748e3 = new C6748e(c17548e3);
        if (c6748e3.hasNext()) {
            c6748e3.next().getClass();
            throw new ClassCastException();
        }
        C17548e c17548e4 = this.f16143class;
        c17548e4.getClass();
        C6748e c6748e4 = new C6748e(c17548e4);
        while (c6748e4.hasNext()) {
            ((InterfaceC9895e) c6748e4.next()).appmetrica();
        }
        C17548e c17548e5 = this.f16145interface;
        c17548e5.getClass();
        C6748e c6748e5 = new C6748e(c17548e5);
        while (c6748e5.hasNext()) {
            ((InterfaceC9895e) c6748e5.next()).appmetrica();
        }
        C17548e c17548e6 = this.f16144goto;
        c17548e6.getClass();
        C6748e c6748e6 = new C6748e(c17548e6);
        while (c6748e6.hasNext()) {
            ((InterfaceC9895e) c6748e6.next()).appmetrica();
        }
        C17548e c17548e7 = this.f16147this;
        c17548e7.getClass();
        C6748e c6748e7 = new C6748e(c17548e7);
        while (c6748e7.hasNext()) {
            ((InterfaceC9895e) c6748e7.next()).appmetrica();
        }
        this.crashlytics.clear();
        this.firebase.clear();
        this.f16143class.clear();
        this.f16145interface.clear();
        this.f16144goto.clear();
        this.f16147this.clear();
        C5976e c5976e = this.f16146native;
        if (c5976e != null) {
            c5976e.metrica();
            this.f16146native = null;
        }
    }

    @Override // defpackage.AbstractC6785e
    public final boolean isPro() {
        return true;
    }

    @Override // defpackage.AbstractC6785e
    public final void isVip(int i) {
        if (i == 1) {
            firebase();
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.AbstractC6785e
    public final void purchase() {
        if (remoteconfig()) {
            try {
                C11125e c11125e = (C11125e) loadAd();
                Parcel m4156e = c11125e.m4156e();
                int i = AbstractC0923e.ad;
                m4156e.writeInt(1);
                AbstractC16852e.ads(m4156e, AbstractC16852e.applovin(m4156e, 20293));
                c11125e.m4153e(m4156e, 2011);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        firebase();
        super.purchase();
    }

    @Override // defpackage.AbstractC6785e
    public final void signatures(IInterface iInterface) {
        System.currentTimeMillis();
        this.f16146native = new C5976e();
    }

    @Override // defpackage.AbstractC6785e
    public final C1032e[] startapp() {
        return new C1032e[]{AbstractC12684e.billing, AbstractC12684e.adcel, AbstractC12684e.amazon, AbstractC12684e.advert, AbstractC12684e.loadAd, AbstractC12684e.mopub, AbstractC12684e.yandex, AbstractC12684e.smaato, AbstractC12684e.startapp, AbstractC12684e.Signature};
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 12451000;
    }
}
