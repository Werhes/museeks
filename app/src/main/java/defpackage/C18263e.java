package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ad;
import android.text.TextUtils;
import android.util.Log;
import ealvatag.tag.datatype.DataTypes;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٞۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18263e extends MediaSession.Callback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C18263e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public static void appmetrica(C2584e c2584e) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c2584e.ad;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                AbstractC2803e.billing("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c2584e.license(new C18287e(str, -1, -1));
    }

    public static void license(C15944e c15944e) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c15944e.ad;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c15944e.purchase(new C15938e(str, -1, -1));
    }

    private final void metrica(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC11282e interfaceC11282e;
        C2584e vip = vip();
        if (vip == null) {
            return;
        }
        Bundle Signature = AbstractC9413e.Signature(bundle);
        appmetrica(vip);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    C13765e c13765e = vip.metrica;
                    InterfaceC16274e ad = c13765e.ad();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", ad == null ? null : ad.asBinder());
                    synchronized (c13765e.f27278e) {
                        interfaceC11282e = c13765e.f27277e;
                    }
                    AbstractC12534e.appmetrica(bundle2, interfaceC11282e);
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (Signature != null) {
                    ((AbstractC9882e) this.vip).license((C17571e) AbstractC11866e.ad(Signature.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C17571e.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (Signature != null) {
                    ((AbstractC9882e) this.vip).appmetrica((C17571e) AbstractC11866e.ad(Signature.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C17571e.CREATOR), Signature.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (Signature != null) {
                    ((AbstractC9882e) this.vip).isPro((C17571e) AbstractC11866e.ad(Signature.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), C17571e.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = vip.yandex;
                if (list != null && Signature != null) {
                    int i = Signature.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    C17638e c17638e = (i < 0 || i >= list.size()) ? null : (C17638e) list.get(i);
                    if (c17638e != null) {
                        ((AbstractC9882e) this.vip).isPro(c17638e.f34568e);
                    }
                }
            } else {
                ((AbstractC9882e) this.vip).purchase(str, Signature, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            AbstractC2803e.purchase("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        vip.license(null);
    }

    public C15944e ad() {
        C15944e c15944e;
        synchronized (((AbstractC9882e) this.vip).vip) {
            c15944e = (C15944e) ((WeakReference) ((AbstractC9882e) this.vip).license).get();
        }
        if (c15944e == null || ((AbstractC9882e) this.vip) != c15944e.vip()) {
            return null;
        }
        return c15944e;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC11282e interfaceC11282e;
        switch (this.ad) {
            case 0:
                metrica(str, bundle, resultReceiver);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        MediaSessionCompat$Token mediaSessionCompat$Token = ad.metrica;
                        ad ad2 = mediaSessionCompat$Token.ad();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", ad2 == null ? null : ad2.asBinder());
                        synchronized (mediaSessionCompat$Token.f35e) {
                            interfaceC11282e = mediaSessionCompat$Token.f34e;
                        }
                        AbstractC12534e.appmetrica(bundle2, interfaceC11282e);
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    } else {
                        str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT");
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        switch (this.ad) {
            case 0:
                AbstractC9882e abstractC9882e = (AbstractC9882e) this.vip;
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        if (Signature != null) {
                            abstractC9882e.pro((Uri) Signature.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), AbstractC9413e.Signature(Signature.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        abstractC9882e.signatures();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        if (Signature != null) {
                            abstractC9882e.tapsense(Signature.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), AbstractC9413e.Signature(Signature.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        if (Signature != null) {
                            abstractC9882e.isVip(Signature.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), AbstractC9413e.Signature(Signature.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        if (Signature != null) {
                            abstractC9882e.inmobi((Uri) Signature.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), AbstractC9413e.Signature(Signature.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS")));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        if (Signature != null) {
                            Signature.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        if (Signature != null) {
                            abstractC9882e.mo1930interface(Signature.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        if (Signature != null) {
                            abstractC9882e.mo1927goto(Signature.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        }
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        if (Signature != null) {
                            C7434e c7434e = (C7434e) AbstractC11866e.ad(Signature.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), C7434e.CREATOR);
                            AbstractC9413e.Signature(Signature.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            abstractC9882e.mo1926class(c7434e);
                        }
                    } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        abstractC9882e.yandex(str, Signature);
                    } else if (Signature != null) {
                        abstractC9882e.crashlytics(Signature.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    }
                } catch (BadParcelableException unused) {
                    AbstractC2803e.purchase("MediaSessionCompat", "Could not unparcel the data.");
                }
                vip.license(null);
                return;
            default:
                AbstractC9882e abstractC9882e2 = (AbstractC9882e) this.vip;
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        C12894e.subscription(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                        if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            C12894e.subscription(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            C12894e.subscription(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            C12894e.subscription(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            C12894e.subscription(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        } else {
                            abstractC9882e2.billing(str);
                        }
                    }
                } catch (BadParcelableException unused2) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).startapp();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip != null) {
                    appmetrica(vip);
                    boolean adcel = ((AbstractC9882e) this.vip).adcel(intent);
                    vip.license(null);
                    if (adcel || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
            default:
                C15944e ad = ad();
                if (ad != null) {
                    license(ad);
                    boolean adcel2 = ((AbstractC9882e) this.vip).adcel(intent);
                    ad.purchase(null);
                    if (adcel2 || super.onMediaButtonEvent(intent)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).advert();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ((AbstractC9882e) this.vip).advert();
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).loadAd();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ((AbstractC9882e) this.vip).loadAd();
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                ((AbstractC9882e) this.vip).subscription(str, Signature);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                ((AbstractC9882e) this.vip).remoteconfig(str, Signature);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                ((AbstractC9882e) this.vip).pro(uri, Signature);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).signatures();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                ((AbstractC9882e) this.vip).tapsense(str, Signature);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                ((AbstractC9882e) this.vip).isVip(str, Signature);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                Bundle Signature = AbstractC9413e.Signature(bundle);
                appmetrica(vip);
                ((AbstractC9882e) this.vip).inmobi(uri, Signature);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                C12894e.subscription(bundle);
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).applovin();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).ads(j);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ((AbstractC9882e) this.vip).ads(j);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).crashlytics(f);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0022. Please report as an issue. */
    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f;
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).firebase(C7434e.ad(rating));
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                if (rating != null) {
                    int vip2 = AbstractC10281e.vip(rating);
                    RatingCompat ratingCompat = null;
                    if (!AbstractC10281e.appmetrica(rating)) {
                        switch (vip2) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                ratingCompat = new RatingCompat(vip2, -1.0f);
                                break;
                        }
                    } else {
                        switch (vip2) {
                            case 1:
                                ratingCompat = new RatingCompat(1, AbstractC10281e.license(rating) ? 1.0f : 0.0f);
                                break;
                            case 2:
                                ratingCompat = new RatingCompat(2, AbstractC10281e.purchase(rating) ? 1.0f : 0.0f);
                                break;
                            case 3:
                            case 4:
                            case 5:
                                float metrica = AbstractC10281e.metrica(rating);
                                if (vip2 == 3) {
                                    f = 3.0f;
                                } else if (vip2 == 4) {
                                    f = 4.0f;
                                } else if (vip2 != 5) {
                                    Log.e(DataTypes.OBJ_RATING, "Invalid rating style (" + vip2 + ") for a star rating");
                                    break;
                                } else {
                                    f = 5.0f;
                                }
                                if (metrica >= 0.0f && metrica <= f) {
                                    ratingCompat = new RatingCompat(vip2, metrica);
                                    break;
                                } else {
                                    Log.e(DataTypes.OBJ_RATING, "Trying to set out of range star-based rating");
                                    break;
                                }
                                break;
                            case 6:
                                float ad2 = AbstractC10281e.ad(rating);
                                if (ad2 >= 0.0f && ad2 <= 100.0f) {
                                    ratingCompat = new RatingCompat(6, ad2);
                                    break;
                                } else {
                                    Log.e(DataTypes.OBJ_RATING, "Invalid percentage-based rating value");
                                    break;
                                }
                                break;
                        }
                    }
                    ratingCompat.getClass();
                }
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).mo1937this();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ((AbstractC9882e) this.vip).mo1937this();
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).mo1938throw();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ((AbstractC9882e) this.vip).mo1938throw();
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).mo1933protected(j);
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        switch (this.ad) {
            case 0:
                C2584e vip = vip();
                if (vip == null) {
                    return;
                }
                appmetrica(vip);
                ((AbstractC9882e) this.vip).mo1925break();
                vip.license(null);
                return;
            default:
                C15944e ad = ad();
                if (ad == null) {
                    return;
                }
                license(ad);
                ad.purchase(null);
                return;
        }
    }

    public C2584e vip() {
        C2584e c2584e;
        synchronized (((AbstractC9882e) this.vip).vip) {
            c2584e = (C2584e) ((WeakReference) ((AbstractC9882e) this.vip).license).get();
        }
        if (c2584e == null || ((AbstractC9882e) this.vip) != c2584e.vip()) {
            return null;
        }
        return c2584e;
    }
}
