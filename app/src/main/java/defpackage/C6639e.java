package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.billing;
import android.support.v4.media.session.vip;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6639e {
    public static final C18482e tapsense = new C18482e("MediaSessionManager", null);
    public C12894e Signature;
    public final Context ad;
    public final C13300e adcel;
    public boolean admob;
    public final RunnableC16721e advert;
    public C5710e amazon;
    public final C1727e appmetrica;
    public final ComponentName billing;
    public final C14618e license;
    public CastDevice loadAd;
    public final BinderC8922e metrica;
    public final HandlerC9134e mopub;
    public PlaybackStateCompat.CustomAction pro;
    public final ComponentName purchase;
    public PlaybackStateCompat.CustomAction remoteconfig;
    public PlaybackStateCompat.CustomAction signatures;
    public final C8327e smaato;
    public final C11328e startapp;
    public PlaybackStateCompat.CustomAction subscription;
    public final C12487e vip;
    public final C11328e yandex;

    public C6639e(Context context, C12487e c12487e, BinderC8922e binderC8922e) {
        C14618e c14618e;
        C1727e c1727e;
        this.ad = context;
        this.vip = c12487e;
        this.metrica = binderC8922e;
        C18482e c18482e = C8033e.adcel;
        AbstractC9528e.appmetrica();
        C8033e c8033e = C8033e.advert;
        C13300e c13300e = null;
        if (c8033e != null) {
            AbstractC9528e.appmetrica();
            c14618e = c8033e.vip;
        } else {
            c14618e = null;
        }
        this.license = c14618e;
        C4941e c4941e = c12487e.f25019e;
        this.appmetrica = c4941e == null ? null : c4941e.f10457e;
        this.smaato = new C8327e(2, this);
        String str = c4941e == null ? null : c4941e.f10456e;
        this.purchase = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = c4941e == null ? null : c4941e.f10458e;
        this.billing = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        C11328e c11328e = new C11328e(context, 3);
        this.yandex = c11328e;
        c11328e.f22770e = new C14240e(this);
        C11328e c11328e2 = new C11328e(context, 3);
        this.startapp = c11328e2;
        c11328e2.f22770e = new C0731e(6, this);
        this.mopub = new HandlerC9134e(Looper.getMainLooper(), 6);
        C18482e c18482e2 = C13300e.signatures;
        C4941e c4941e2 = c12487e.f25019e;
        if (c4941e2 != null && (c1727e = c4941e2.f10457e) != null) {
            C13645e c13645e = c1727e.f4695e;
            if (c13645e != null) {
                ArrayList ad = AbstractC16993e.ad(c13645e);
                int[] vip = AbstractC16993e.vip(c13645e);
                int size = ad == null ? 0 : ad.size();
                if (ad == null || ad.isEmpty()) {
                    Log.e(c18482e2.ad, c18482e2.license(AbstractC12731e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (ad.size() > 5) {
                    Log.e(c18482e2.ad, c18482e2.license(AbstractC12731e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (vip == null || (vip.length) == 0) {
                    Log.e(c18482e2.ad, c18482e2.license(AbstractC12731e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i : vip) {
                        if (i < 0 || i >= size) {
                            Log.e(c18482e2.ad, c18482e2.license(AbstractC12731e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                            break;
                        }
                    }
                }
            }
            c13300e = new C13300e(context);
        }
        this.adcel = c13300e;
        this.advert = new RunnableC16721e(21, this);
    }

    public final void ad(C5710e c5710e, CastDevice castDevice) {
        ComponentName componentName;
        C12487e c12487e = this.vip;
        C4941e c4941e = c12487e == null ? null : c12487e.f25019e;
        if (this.admob || c12487e == null || c4941e == null || this.appmetrica == null || c5710e == null || castDevice == null || (componentName = this.billing) == null) {
            tapsense.vip("skip attaching media session", new Object[0]);
            return;
        }
        this.amazon = c5710e;
        AbstractC9528e.appmetrica();
        C8327e c8327e = this.smaato;
        if (c8327e != null) {
            c5710e.yandex.add(c8327e);
        }
        this.loadAd = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.ad;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (c4941e.f10459e) {
            C12894e c12894e = new C12894e(context, componentName, broadcast);
            this.Signature = c12894e;
            license(0, null);
            CastDevice castDevice2 = this.loadAd;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f672e)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.loadAd.f672e);
                C2271e c2271e = MediaMetadataCompat.f20e;
                if (c2271e.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) c2271e.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                c12894e.m3413class(new MediaMetadataCompat(bundle));
            }
            c12894e.firebase(new C6592e(this), null);
            ((C15944e) c12894e.f25751e).ad.setActive(true);
            Iterator it = ((ArrayList) c12894e.f25752e).iterator();
            if (it.hasNext()) {
                throw AbstractC5087e.m1747goto(it);
            }
            this.metrica.m2505e(c12894e);
        }
        this.admob = true;
        vip();
    }

    public final void adcel() {
        if (this.vip.f25018e) {
            this.mopub.removeCallbacks(this.advert);
            Context context = this.ad;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final long appmetrica(String str, int i, Bundle bundle) {
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    if (i == 3) {
                        j = 514;
                        i = 3;
                    } else {
                        j = 512;
                    }
                    if (i != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                C5710e c5710e = this.amazon;
                if (c5710e != null && c5710e.purchase()) {
                    C0849e metrica = c5710e.metrica();
                    AbstractC9528e.startapp(metrica);
                    if ((128 & metrica.f3243e) != 0 || metrica.f3242e != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) metrica.f3250e.get(metrica.f3234e);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            C5710e c5710e2 = this.amazon;
            if (c5710e2 != null && c5710e2.purchase()) {
                C0849e metrica2 = c5710e2.metrica();
                AbstractC9528e.startapp(metrica2);
                if ((64 & metrica2.f3243e) != 0 || metrica2.f3242e != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) metrica2.f3250e.get(metrica2.f3234e);
                if (num2 != null && num2.intValue() < metrica2.f3240e.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri billing(C0342e c0342e) {
        C4941e c4941e = this.vip.f25019e;
        if (c4941e != null) {
            c4941e.billing();
        }
        List list = c0342e.f2381e;
        C5470e c5470e = (list == null || list.isEmpty()) ? null : (C5470e) c0342e.f2381e.get(0);
        if (c5470e == null) {
            return null;
        }
        return c5470e.f11741e;
    }

    public final void license(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat ad;
        C12894e c12894e;
        C0342e c0342e;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        PendingIntent activity;
        C12894e c12894e2 = this.Signature;
        if (c12894e2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        billing billingVar = new billing();
        C5710e c5710e = this.amazon;
        if (c5710e == null || this.adcel == null) {
            ad = billingVar.ad();
        } else {
            long ad2 = (c5710e.loadAd() == 0 || c5710e.billing()) ? 0L : c5710e.ad();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            billingVar.vip = i;
            billingVar.metrica = ad2;
            billingVar.purchase = elapsedRealtime;
            billingVar.license = 1.0f;
            if (i == 0) {
                ad = billingVar.ad();
            } else {
                C1727e c1727e = this.appmetrica;
                C13645e c13645e = c1727e != null ? c1727e.f4695e : null;
                C5710e c5710e2 = this.amazon;
                long j = (c5710e2 == null || c5710e2.billing() || this.amazon.adcel()) ? 0L : 256L;
                if (c13645e != null) {
                    ArrayList<C6372e> ad3 = AbstractC16993e.ad(c13645e);
                    if (ad3 != null) {
                        for (C6372e c6372e : ad3) {
                            String str = c6372e.f13234e;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j |= appmetrica(str, i, bundle);
                            } else {
                                purchase(billingVar, str, c6372e);
                            }
                        }
                    }
                } else if (c1727e != null) {
                    Iterator it = c1727e.f4717e.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            j |= appmetrica(str2, i, bundle);
                        } else {
                            purchase(billingVar, str2, null);
                        }
                    }
                }
                billingVar.appmetrica = j;
                ad = billingVar.ad();
            }
        }
        C15944e c15944e = (C15944e) c12894e2.f25751e;
        c15944e.purchase = ad;
        synchronized (c15944e.license) {
            for (int beginBroadcast = c15944e.appmetrica.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((InterfaceC2444e) c15944e.appmetrica.getBroadcastItem(beginBroadcast)).mo848e(ad);
                } catch (RemoteException unused) {
                }
            }
            c15944e.appmetrica.finishBroadcast();
        }
        MediaSession mediaSession = c15944e.ad;
        if (ad.f42e == null) {
            PlaybackState.Builder license = AbstractC8529e.license();
            AbstractC8529e.inmobi(license, ad.f50e, ad.f45e, ad.f48e, ad.f46e);
            AbstractC8529e.signatures(license, ad.f43e);
            AbstractC8529e.remoteconfig(license, ad.f41e);
            AbstractC8529e.tapsense(license, ad.f51e);
            for (PlaybackStateCompat.CustomAction customAction : ad.f49e) {
                PlaybackState.CustomAction customAction2 = customAction.f53e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder appmetrica = AbstractC8529e.appmetrica(customAction.f57e, customAction.f55e, customAction.f54e);
                    AbstractC8529e.isVip(appmetrica, customAction.f56e);
                    customAction2 = AbstractC8529e.vip(appmetrica);
                }
                AbstractC8529e.ad(license, customAction2);
            }
            AbstractC8529e.pro(license, ad.f44e);
            AbstractC15022e.vip(license, ad.f47e);
            ad.f42e = AbstractC8529e.metrica(license);
        }
        mediaSession.setPlaybackState(ad.f42e);
        C1727e c1727e2 = this.appmetrica;
        if (c1727e2 != null && c1727e2.f4712e) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (c1727e2 != null && c1727e2.f4709e) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((C15944e) c12894e2.f25751e).ad.setExtras(bundle);
        }
        if (i == 0) {
            c12894e2.m3413class(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.amazon != null) {
            ComponentName componentName = this.purchase;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.ad, 0, intent, 201326592);
            }
            if (activity != null) {
                ((C15944e) c12894e2.f25751e).ad.setSessionActivity(activity);
            }
        }
        C5710e c5710e3 = this.amazon;
        if (c5710e3 == null || (c12894e = this.Signature) == null || mediaInfo == null || (c0342e = mediaInfo.f697e) == null) {
            return;
        }
        long j2 = c5710e3.billing() ? 0L : mediaInfo.f684e;
        String billing = c0342e.billing("com.google.android.gms.cast.metadata.TITLE");
        String billing2 = c0342e.billing("com.google.android.gms.cast.metadata.SUBTITLE");
        C12894e c12894e3 = this.Signature;
        if (c12894e3 == null || (metadata = ((vip) ((C11883e) c12894e3.f25750e).f23815e).ad.getMetadata()) == null) {
            createFromParcel = null;
        } else {
            C2271e c2271e = MediaMetadataCompat.f20e;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f24e = metadata;
        }
        C6325e c6325e = createFromParcel == null ? new C6325e((byte) 0, 19) : new C6325e(createFromParcel);
        C2271e c2271e2 = MediaMetadataCompat.f20e;
        if (c2271e2.containsKey("android.media.metadata.DURATION") && ((Integer) c2271e2.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) c6325e.f13170e).putLong("android.media.metadata.DURATION", j2);
        if (billing != null) {
            c6325e.m2151class("android.media.metadata.TITLE", billing);
            c6325e.m2151class("android.media.metadata.DISPLAY_TITLE", billing);
        }
        if (billing2 != null) {
            c6325e.m2151class("android.media.metadata.DISPLAY_SUBTITLE", billing2);
        }
        c12894e.m3413class(new MediaMetadataCompat((Bundle) c6325e.f13170e));
        Uri billing3 = billing(c0342e);
        if (billing3 != null) {
            this.yandex.vip(billing3);
        } else {
            metrica(null, 0);
        }
        Uri billing4 = billing(c0342e);
        if (billing4 != null) {
            this.startapp.vip(billing4);
        } else {
            metrica(null, 3);
        }
    }

    public final void metrica(Bitmap bitmap, int i) {
        MediaMetadata metadata;
        C12894e c12894e = this.Signature;
        if (c12894e == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        C12894e c12894e2 = this.Signature;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (c12894e2 != null && (metadata = ((vip) ((C11883e) c12894e2.f25750e).f23815e).ad.getMetadata()) != null) {
            C2271e c2271e = MediaMetadataCompat.f20e;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f24e = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        Bundle bundle = (Bundle) (mediaMetadataCompat == null ? new C6325e((byte) 0, 19) : new C6325e(mediaMetadataCompat)).f13170e;
        String str = i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
        C2271e c2271e2 = MediaMetadataCompat.f20e;
        if (c2271e2.containsKey(str) && ((Integer) c2271e2.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("The ", str, " key cannot be used to put a Bitmap"));
        }
        bundle.putParcelable(str, bitmap);
        c12894e.m3413class(new MediaMetadataCompat(bundle));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(android.support.v4.media.session.billing r13, java.lang.String r14, defpackage.C6372e r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6639e.purchase(android.support.v4.media.session.billing, java.lang.String, eؙْٗ):void");
    }

    public final void startapp(boolean z) {
        if (this.vip.f25018e) {
            HandlerC9134e handlerC9134e = this.mopub;
            RunnableC16721e runnableC16721e = this.advert;
            if (runnableC16721e != null) {
                handlerC9134e.removeCallbacks(runnableC16721e);
            }
            Context context = this.ad;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    handlerC9134e.postDelayed(runnableC16721e, 1000L);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6639e.vip():void");
    }

    public final void yandex() {
        C13300e c13300e = this.adcel;
        if (c13300e != null) {
            tapsense.vip("Stopping media notification.", new Object[0]);
            C11328e c11328e = c13300e.startapp;
            c11328e.metrica();
            c11328e.f22770e = null;
            NotificationManager notificationManager = c13300e.vip;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }
}
