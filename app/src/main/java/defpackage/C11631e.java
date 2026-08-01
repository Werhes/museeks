package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11631e extends AbstractC9410e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C3136e f23335e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final MediaRouter2$RouteCallback f23336e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C16089e f23337e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C5294e f23338e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final ArrayMap f23339e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public ArrayList f23340e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final ExecutorC17160e f23341e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f23342e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final ArrayMap f23343e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public String f23344e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final MediaRouter2 f23345e;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public C11631e(Context context, C16089e c16089e) {
        super(context, null);
        this.f23343e = new ArrayMap();
        this.f23335e = new C3136e(this);
        this.f23338e = new C5294e(1, this);
        this.f23340e = new ArrayList();
        this.f23339e = new ArrayMap();
        this.f23345e = MediaRouter2.getInstance(context);
        this.f23337e = c16089e;
        this.f23341e = new ExecutorC17160e(0, new Handler(Looper.getMainLooper()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.f23336e = new C4534e(this, 1);
        } else {
            this.f23336e = new C4534e(this, 0);
        }
    }

    public static String adcel(AbstractC13922e abstractC13922e) {
        MediaRouter2.RoutingController routingController;
        if ((abstractC13922e instanceof C16899e) && (routingController = ((C16899e) abstractC13922e).billing) != null) {
            return routingController.getId();
        }
        return null;
    }

    public static Messenger yandex(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC16709e ad(String str, C17039e c17039e) {
        Iterator it = this.f23343e.entrySet().iterator();
        while (it.hasNext()) {
            C16899e c16899e = (C16899e) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c16899e.purchase)) {
                return c16899e;
            }
        }
        return null;
    }

    public final void advert(MediaRouter2.RoutingController routingController) {
        C11106e c11106e;
        C16899e c16899e = (C16899e) this.f23343e.get(routingController);
        if (c16899e == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList yandex = AbstractC5096e.yandex(selectedRoutes);
        C16289e inmobi = AbstractC5096e.inmobi(C7815e.vip(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f18732e.getString(R.string.mr_dialog_default_group_name);
        C16289e c16289e = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c16289e = new C16289e(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (c16289e == null) {
            c11106e = new C11106e(routingController.getId(), string);
            Bundle bundle2 = (Bundle) c11106e.f22008e;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            c11106e = new C11106e(c16289e);
        }
        Bundle bundle3 = (Bundle) c11106e.f22008e;
        bundle3.putInt("volume", routingController.getVolume());
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ((ArrayList) c11106e.f22009e).clear();
        c11106e.appmetrica(inmobi.vip());
        ((ArrayList) c11106e.f22007e).clear();
        c11106e.startapp(yandex);
        C16289e signatures = c11106e.signatures();
        ArrayList yandex2 = AbstractC5096e.yandex(routingController.getSelectableRoutes());
        ArrayList yandex3 = AbstractC5096e.yandex(routingController.getDeselectableRoutes());
        C13486e c13486e = this.f18733e;
        if (c13486e == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C16289e> list = c13486e.vip;
        if (!list.isEmpty()) {
            for (C16289e c16289e2 : list) {
                String license = c16289e2.license();
                arrayList.add(new C7712e(c16289e2, yandex.contains(license) ? 3 : 1, yandex3.contains(license), yandex2.contains(license), true));
            }
        }
        c16899e.loadAd = signatures;
        c16899e.advert(signatures, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0132 A[SYNTHETIC] */
    @Override // defpackage.AbstractC9410e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void appmetrica(defpackage.C13882e r12) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11631e.appmetrica(eٍّٓ):void");
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC13922e license(String str, String str2) {
        String str3 = (String) this.f23339e.get(str);
        for (C16899e c16899e : this.f23343e.values()) {
            if (TextUtils.equals(str2, c16899e.Signature())) {
                return new C17146e(str3, c16899e);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C17146e(str3, null);
    }

    public final void mopub() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.f23345e.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info vip = C7815e.vip(it.next());
            if (vip != null && !arraySet.contains(vip) && !vip.isSystemRoute()) {
                if (this.f23342e) {
                    if (!vip.getId().startsWith(this.f18732e.getPackageName() + "/")) {
                    }
                }
                arraySet.add(vip);
                arrayList.add(vip);
            }
        }
        if (arrayList.equals(this.f23340e)) {
            return;
        }
        this.f23340e = arrayList;
        ArrayMap arrayMap = this.f23339e;
        arrayMap.clear();
        Iterator it2 = this.f23340e.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info vip2 = C7815e.vip(it2.next());
            Bundle extras = vip2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + vip2);
            } else {
                arrayMap.put(vip2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.f23340e.iterator();
        while (it3.hasNext()) {
            C16289e inmobi = AbstractC5096e.inmobi(C7815e.vip(it3.next()));
            if (inmobi != null) {
                arrayList2.add(inmobi);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C16289e c16289e = (C16289e) it4.next();
                if (c16289e == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3.contains(c16289e)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(c16289e);
            }
        }
        purchase(new C13486e(arrayList3, true));
    }

    public final void smaato(String str) {
        MediaRoute2Info startapp = startapp(str);
        if (startapp == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
        } else if (!TextUtils.equals(this.f23344e, str)) {
            this.f23344e = str;
            this.f23345e.transferTo(startapp);
        } else {
            Log.w("MR2Provider", "Ignoring attempt to transfer to pending transfer route: " + startapp);
        }
    }

    public final MediaRoute2Info startapp(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.f23340e.iterator();
        while (it.hasNext()) {
            MediaRoute2Info vip = C7815e.vip(it.next());
            if (TextUtils.equals(vip.getId(), str)) {
                return vip;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC13922e vip(String str) {
        return new C17146e((String) this.f23339e.get(str), null);
    }
}
