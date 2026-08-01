package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۥۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6779e extends AbstractC12089e {

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final ArrayList f13979e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final ArrayList f13980e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final MediaRouter.RouteCategory f13981e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C9952e f13982e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final MediaRouter f13983e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f13984e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final ArrayList f13985e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final ArrayList f13986e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public boolean f13987e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f13988e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C12291e f13989e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C14090e f13990e;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f13979e = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f13980e = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public C6779e(Context context, C14090e c14090e) {
        super(context, new C2362e(19, new ComponentName("android", AbstractC12089e.class.getName())));
        this.f13986e = new ArrayList();
        this.f13985e = new ArrayList();
        this.f13990e = c14090e;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f13983e = mediaRouter;
        this.f13989e = new C12291e(this);
        this.f13982e = new C9952e(this);
        this.f13981e = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        remoteconfig();
    }

    public static void pro(C8147e c8147e) {
        MediaRouter.UserRouteInfo userRouteInfo = c8147e.vip;
        C6541e c6541e = c8147e.ad;
        userRouteInfo.setName(c6541e.license);
        userRouteInfo.setPlaybackType(c6541e.advert);
        userRouteInfo.setPlaybackStream(c6541e.smaato);
        userRouteInfo.setVolume(c6541e.Signature);
        userRouteInfo.setVolumeMax(c6541e.admob);
        userRouteInfo.setVolumeHandling((!c6541e.appmetrica() || C10085e.billing()) ? c6541e.loadAd : 0);
        userRouteInfo.setDescription(c6541e.appmetrica);
    }

    public static C8147e smaato(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof C8147e) {
            return (C8147e) tag;
        }
        return null;
    }

    public final void Signature(C6541e c6541e) {
        int mopub;
        if (c6541e.metrica() == this || (mopub = mopub(c6541e)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((C8147e) this.f13985e.remove(mopub)).vip;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.f13983e.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    public final int adcel(String str) {
        ArrayList arrayList = this.f13986e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0418e) arrayList.get(i)).vip.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final void admob(C6541e c6541e) {
        if (c6541e.billing()) {
            AbstractC9410e metrica = c6541e.metrica();
            MediaRouter mediaRouter = this.f13983e;
            if (metrica != this) {
                int mopub = mopub(c6541e);
                if (mopub >= 0) {
                    mediaRouter.selectRoute(8388611, ((C8147e) this.f13985e.get(mopub)).vip);
                    return;
                }
                return;
            }
            int adcel = adcel(c6541e.vip);
            if (adcel >= 0) {
                mediaRouter.selectRoute(8388611, ((C0418e) this.f13986e.get(adcel)).ad);
            }
        }
    }

    public final String advert(MediaRouter.RouteInfo routeInfo) {
        Context context = this.f18732e;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return BuildConfig.FLAVOR;
        }
        int deviceType = Build.VERSION.SDK_INT >= 24 ? routeInfo.getDeviceType() : 0;
        return context.getString(deviceType != 1 ? deviceType != 2 ? deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth : R.string.mr_route_name_speaker : R.string.mr_route_name_tv);
    }

    public void amazon(C0418e c0418e, C11106e c11106e) {
        Bundle bundle = (Bundle) c11106e.f22008e;
        MediaRouter.RouteInfo routeInfo = c0418e.ad;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            c11106e.appmetrica(f13979e);
        }
        if ((supportedTypes & 2) != 0) {
            c11106e.appmetrica(f13980e);
        }
        bundle.putInt("playbackType", routeInfo.getPlaybackType());
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (8388608 & supportedTypes) == 0);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
    }

    @Override // defpackage.AbstractC9410e
    public final void appmetrica(C13882e c13882e) {
        boolean z;
        int i = 0;
        if (c13882e != null) {
            c13882e.ad();
            ArrayList metrica = c13882e.vip.metrica();
            int size = metrica.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) metrica.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            z = c13882e.vip();
            i = i2;
        } else {
            z = false;
        }
        if (this.f13984e == i && this.f13987e == z) {
            return;
        }
        this.f13984e = i;
        this.f13987e = z;
        remoteconfig();
    }

    public final void loadAd(C6541e c6541e) {
        AbstractC9410e metrica = c6541e.metrica();
        MediaRouter mediaRouter = this.f13983e;
        if (metrica == this) {
            int startapp = startapp(mediaRouter.getSelectedRoute(8388611));
            if (startapp < 0 || !((C0418e) this.f13986e.get(startapp)).vip.equals(c6541e.vip)) {
                return;
            }
            c6541e.advert(false);
            return;
        }
        MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f13981e);
        C8147e c8147e = new C8147e(c6541e, createUserRoute);
        createUserRoute.setTag(c8147e);
        createUserRoute.setVolumeCallback(this.f13982e);
        pro(c8147e);
        this.f13985e.add(c8147e);
        mediaRouter.addUserRoute(createUserRoute);
    }

    public final int mopub(C6541e c6541e) {
        ArrayList arrayList = this.f13985e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C8147e) arrayList.get(i)).ad == c6541e) {
                return i;
            }
        }
        return -1;
    }

    public final void remoteconfig() {
        boolean z = this.f13988e;
        C12291e c12291e = this.f13989e;
        MediaRouter mediaRouter = this.f13983e;
        if (z) {
            mediaRouter.removeCallback(c12291e);
        }
        this.f13988e = true;
        mediaRouter.addCallback(this.f13984e, c12291e, (this.f13987e ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z2 = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z2 |= yandex((MediaRouter.RouteInfo) it.next());
        }
        if (z2) {
            subscription();
        }
    }

    public final int startapp(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.f13986e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0418e) arrayList.get(i)).ad == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final void subscription() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f13986e;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C16289e c16289e = ((C0418e) arrayList2.get(i)).metrica;
            if (c16289e == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(c16289e)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(c16289e);
        }
        purchase(new C13486e(arrayList, false));
    }

    @Override // defpackage.AbstractC9410e
    public final AbstractC13922e vip(String str) {
        int adcel = adcel(str);
        if (adcel >= 0) {
            return new C14268e(((C0418e) this.f13986e.get(adcel)).ad);
        }
        return null;
    }

    public final boolean yandex(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (smaato(routeInfo) != null || startapp(routeInfo) >= 0) {
            return false;
        }
        String format = this.f13983e.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(advert(routeInfo).hashCode()));
        if (adcel(format) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                str = format + "_" + i;
                if (adcel(str) < 0) {
                    break;
                }
                i++;
            }
            format = str;
        }
        C0418e c0418e = new C0418e(routeInfo, format);
        C11106e c11106e = new C11106e(format, advert(routeInfo));
        amazon(c0418e, c11106e);
        c0418e.metrica = c11106e.signatures();
        this.f13986e.add(c0418e);
        return true;
    }
}
