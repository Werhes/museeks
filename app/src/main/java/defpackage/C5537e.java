package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5537e extends AbstractC9882e {
    public static final int premium;
    public final ComponentName Signature;
    public final C9156e adcel;
    public C18501e admob;
    public C5298e ads;
    public final boolean advert;
    public final C13391e amazon;
    public C6689e applovin;
    public final C11106e billing;
    public AbstractC17475e inmobi;
    public AbstractC17475e isPro;
    public final Bundle isVip;
    public final C13264e loadAd;
    public final HandlerC17797e mopub;
    public C9156e pro;
    public volatile long remoteconfig;
    public int signatures;
    public final C7366e smaato;
    public final C5389e startapp;
    public final boolean subscription;
    public C0381e tapsense;
    public final C6584e yandex;

    static {
        premium = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cf  */
    /* JADX WARN: Type inference failed for: r3v2, types: [eٍؐؗ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5537e(defpackage.C6584e r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, boolean r18, defpackage.AbstractC17475e r19, defpackage.AbstractC17475e r20, defpackage.C6689e r21, defpackage.C5298e r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5537e.<init>(eؙۗ, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, e٘ؑٔ, e٘ؑٔ, eؙ۟ۢ, eِؗۧ, android.os.Bundle):void");
    }

    /* renamed from: case, reason: not valid java name */
    public static void m1921case(C13391e c13391e, ArrayList arrayList) {
        if (arrayList != null) {
            c13391e.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j = ((C17638e) it.next()).f34567e;
                if (hashSet.contains(Long.valueOf(j))) {
                    AbstractC2803e.billing("MediaSessionCompat", AbstractC0869e.isVip(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        C2584e c2584e = (C2584e) c13391e.f26645e;
        MediaSession mediaSession = c2584e.ad;
        c2584e.yandex = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C17638e c17638e = (C17638e) it2.next();
            MediaSession.QueueItem queueItem = c17638e.f34566e;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(c17638e.f34568e.vip(), c17638e.f34567e);
                c17638e.f34566e = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    /* renamed from: catch, reason: not valid java name */
    public static void m1922catch(C13391e c13391e, C3737e c3737e) {
        C2584e c2584e = (C2584e) c13391e.f26645e;
        c2584e.startapp = c3737e;
        MediaSession mediaSession = c2584e.ad;
        Bundle bundle = c3737e.f8324e;
        if (c3737e.f8323e == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) C3737e.f8321e.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (intValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (intValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (intValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            c3737e.f8323e = builder.build();
        }
        mediaSession.setMetadata(c3737e.f8323e);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eٌّؒ, eٔؐۜ] */
    /* renamed from: final, reason: not valid java name */
    public static C1962e m1923final(String str, Uri uri, String str2, Bundle bundle) {
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        C13325e c13325e = C13325e.license;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str3 = str;
        C18478e c18478e = new C18478e(23, false);
        c18478e.f36228e = uri;
        c18478e.f36227e = str2;
        c18478e.f36229e = bundle;
        return new C1962e(str3, new C14435e(c9466e), null, new C15197e(c9457e), C12053e.f24142throw, new C13325e(c18478e));
    }

    /* renamed from: private, reason: not valid java name */
    public static ComponentName m1924private(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.AbstractC9882e
    public final boolean adcel(Intent intent) {
        C18287e metrica = ((C2584e) this.amazon.f26645e).metrica();
        metrica.getClass();
        return this.yandex.isPro(new C18424e(metrica, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.AbstractC9882e
    public final void ads(long j) {
        m1931new(5, new C0649e(this, j, 1), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void advert() {
        m1931new(1, new C2319e(this, 10), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void applovin() {
        m1931new(11, new C2319e(this, 4), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void appmetrica(C17571e c17571e, int i) {
        if (c17571e != null) {
            if (i == -1 || i >= 0) {
                m1931new(20, new C17825e(this, c17571e, i), ((C2584e) this.amazon.f26645e).metrica(), false);
            }
        }
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: break, reason: not valid java name */
    public final void mo1925break() {
        m1931new(3, new C2319e(this, 7), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: class, reason: not valid java name */
    public final void mo1926class(C7434e c7434e) {
        AbstractC5340e admob = AbstractC13256e.admob(c7434e);
        if (admob != null) {
            m1935strictfp(null, 40010, new C18070e(this, admob, 3), ((C2584e) this.amazon.f26645e).metrica());
            return;
        }
        AbstractC2803e.smaato("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + c7434e);
    }

    @Override // defpackage.AbstractC9882e
    public final void crashlytics(float f) {
        if (f <= 0.0f) {
            return;
        }
        m1931new(13, new C6596e(this, f), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void firebase(C7434e c7434e) {
        mo1926class(c7434e);
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: goto, reason: not valid java name */
    public final void mo1927goto(int i) {
        m1931new(14, new C14211e(this, i, 1), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    /* renamed from: import, reason: not valid java name */
    public final void m1928import() {
        C7366e c7366e;
        this.inmobi = C11161e.adcel(C11161e.billing(this.isPro, this.applovin, this.ads), true, true, 9);
        boolean z = this.advert;
        Bundle bundle = this.isVip;
        if (z && ((c7366e = this.smaato) == null || !c7366e.appmetrica.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.inmobi.isEmpty() || C11161e.metrica(2, this.inmobi)) ? false : true);
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        } else {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !C11161e.metrica(2, this.inmobi));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !C11161e.metrica(3, this.inmobi));
        }
    }

    @Override // defpackage.AbstractC9882e
    public final void inmobi(Uri uri, Bundle bundle) {
        m1932package(m1923final(null, uri, null, bundle), true, false);
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m1929instanceof() {
        Bundle bundle = this.isVip;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        m1928import();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((C2584e) this.amazon.f26645e).ad.setExtras(bundle);
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: interface, reason: not valid java name */
    public final void mo1930interface(int i) {
        m1931new(15, new C14211e(this, i, 0), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void isPro(C17571e c17571e) {
        if (c17571e == null) {
            return;
        }
        m1931new(20, new C18070e(this, c17571e, 5), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void isVip(String str, Bundle bundle) {
        m1932package(m1923final(null, null, str, bundle), true, false);
    }

    @Override // defpackage.AbstractC9882e
    public final void license(C17571e c17571e) {
        if (c17571e != null) {
            m1931new(20, new C17825e(this, c17571e, -1), ((C2584e) this.amazon.f26645e).metrica(), false);
        }
    }

    @Override // defpackage.AbstractC9882e
    public final void loadAd() {
        m1931new(1, new C2319e(this, 5), ((C2584e) this.amazon.f26645e).metrica(), false);
    }

    /* renamed from: new, reason: not valid java name */
    public final void m1931new(final int i, final InterfaceC6995e interfaceC6995e, final C18287e c18287e, final boolean z) {
        C6584e c6584e = this.yandex;
        if (c6584e.loadAd()) {
            return;
        }
        if (c18287e != null) {
            AbstractC9413e.m2565strictfp(c6584e.advert, new Runnable() { // from class: eؙۖۡ
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC6995e interfaceC6995e2 = interfaceC6995e;
                    C5537e c5537e = C5537e.this;
                    C6584e c6584e2 = c5537e.yandex;
                    if (c6584e2.loadAd()) {
                        return;
                    }
                    boolean isActive = ((C2584e) c5537e.amazon.f26645e).ad.isActive();
                    int i2 = i;
                    C18287e c18287e2 = c18287e;
                    if (!isActive) {
                        StringBuilder premium2 = AbstractC4653e.premium("Ignore incoming player command before initialization. command=", i2, ", pid=");
                        premium2.append(c18287e2.ad.vip);
                        AbstractC2803e.smaato("MediaSessionLegacyStub", premium2.toString());
                        return;
                    }
                    C18424e m1939transient = c5537e.m1939transient(c18287e2);
                    if (!c5537e.billing.m3008final(m1939transient, i2)) {
                        if (i2 != 1 || c6584e2.pro.mo2129interface()) {
                            return;
                        }
                        AbstractC2803e.smaato("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    C1439e c1439e = c6584e2.appmetrica;
                    c6584e2.m2208native(m1939transient);
                    c1439e.getClass();
                    try {
                        interfaceC6995e2.ad(m1939transient);
                    } catch (RemoteException e) {
                        AbstractC2803e.amazon("MediaSessionLegacyStub", "Exception in " + m1939transient, e);
                    }
                    if (z) {
                        new SparseBooleanArray().append(i2, true);
                        c6584e2.ads(m1939transient);
                    }
                }
            });
            return;
        }
        AbstractC2803e.license("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
    }

    /* renamed from: package, reason: not valid java name */
    public final void m1932package(C1962e c1962e, boolean z, boolean z2) {
        m1931new(31, new C13844e(this, c1962e, z, z2), ((C2584e) this.amazon.f26645e).metrica(), false);
    }

    @Override // defpackage.AbstractC9882e
    public final void pro(Uri uri, Bundle bundle) {
        m1932package(m1923final(null, uri, null, bundle), true, true);
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: protected, reason: not valid java name */
    public final void mo1933protected(long j) {
        if (j < 0) {
            return;
        }
        m1931new(10, new C0649e(this, j, 0), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void purchase(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.yandex.adcel.vip());
        } else {
            C11858e c11858e = new C11858e(str, Bundle.EMPTY);
            m1935strictfp(c11858e, 0, new C12879e(this, c11858e, bundle, resultReceiver), ((C2584e) this.amazon.f26645e).metrica());
        }
    }

    @Override // defpackage.AbstractC9882e
    public final void remoteconfig(String str, Bundle bundle) {
        m1932package(m1923final(null, null, str, bundle), true, true);
    }

    @Override // defpackage.AbstractC9882e
    public final void signatures() {
        m1931new(2, new C2319e(this, 6), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    @Override // defpackage.AbstractC9882e
    public final void startapp() {
        m1931new(12, new C2319e(this, 9), ((C2584e) this.amazon.f26645e).metrica(), true);
    }

    /* renamed from: static, reason: not valid java name */
    public final void m1934static(C6268e c6268e) {
        AbstractC9413e.m2565strictfp(this.yandex.advert, new RunnableC1013e(this, c6268e, 1));
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m1935strictfp(C11858e c11858e, int i, InterfaceC6995e interfaceC6995e, C18287e c18287e) {
        if (c18287e != null) {
            AbstractC9413e.m2565strictfp(this.yandex.advert, new RunnableC11063e(this, c11858e, i, c18287e, interfaceC6995e));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object obj = c11858e;
        if (c11858e == null) {
            obj = Integer.valueOf(i);
        }
        sb.append(obj);
        AbstractC2803e.license("MediaSessionLegacyStub", sb.toString());
    }

    @Override // defpackage.AbstractC9882e
    public final void subscription(String str, Bundle bundle) {
        m1932package(m1923final(str, null, null, bundle), true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f8, code lost:
    
        r6 = true;
     */
    /* renamed from: super, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C4820e m1936super(defpackage.C6268e r32) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5537e.m1936super(eًؙٞ):eِؗٛ");
    }

    @Override // defpackage.AbstractC9882e
    public final void tapsense(String str, Bundle bundle) {
        m1932package(m1923final(str, null, null, bundle), true, false);
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: this, reason: not valid java name */
    public final void mo1937this() {
        boolean mo2107e = this.yandex.pro.mo2107e(9);
        C13391e c13391e = this.amazon;
        if (mo2107e) {
            m1931new(9, new C2319e(this, 3), ((C2584e) c13391e.f26645e).metrica(), true);
        } else {
            m1931new(8, new C2319e(this, 8), ((C2584e) c13391e.f26645e).metrica(), true);
        }
    }

    @Override // defpackage.AbstractC9882e
    /* renamed from: throw, reason: not valid java name */
    public final void mo1938throw() {
        boolean mo2107e = this.yandex.pro.mo2107e(7);
        C13391e c13391e = this.amazon;
        if (mo2107e) {
            m1931new(7, new C2319e(this, 1), ((C2584e) c13391e.f26645e).metrica(), true);
        } else {
            m1931new(6, new C2319e(this, 2), ((C2584e) c13391e.f26645e).metrica(), true);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final C18424e m1939transient(C18287e c18287e) {
        C18424e m3007extends = this.billing.m3007extends(c18287e);
        if (m3007extends == null) {
            C18424e c18424e = new C18424e(c18287e, 0, 0, this.startapp.ads(c18287e), new C14736e(c18287e), Bundle.EMPTY);
            C9069e remoteconfig = this.yandex.remoteconfig(c18424e);
            this.billing.purchase(c18287e, c18424e, remoteconfig.ad, remoteconfig.vip);
            this.yandex.premium(c18424e);
            m3007extends = c18424e;
        }
        HandlerC17797e handlerC17797e = this.mopub;
        long j = this.remoteconfig;
        handlerC17797e.removeMessages(1001, m3007extends);
        handlerC17797e.sendMessageDelayed(handlerC17797e.obtainMessage(1001, m3007extends), j);
        return m3007extends;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // defpackage.AbstractC9882e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(java.lang.String r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L9
            return
        L9:
            if (r8 == 0) goto Lc
            goto Le
        Lc:
            android.os.Bundle r8 = android.os.Bundle.EMPTY
        Le:
            eِٜٔ r0 = new eِٜٔ
            r0.<init>(r7, r8)
            boolean r1 = defpackage.C11161e.amazon(r7)
            eْٝۜ r2 = r6.amazon
            r3 = 0
            if (r1 == 0) goto Lc0
            java.lang.String r8 = "MediaSessionLegacyStub"
            eُٟؐ r0 = defpackage.C11161e.license(r0)     // Catch: java.lang.RuntimeException -> Lab
            int r1 = r0.vip
            java.lang.Object r4 = r0.adcel
            boolean r5 = r0.vip()
            if (r5 != 0) goto L36
            java.lang.String r0 = "Can't execute predefined custom command: "
            java.lang.String r7 = r0.concat(r7)
            defpackage.AbstractC2803e.smaato(r8, r7)
            return
        L36:
            eِٜٔ r7 = r0.ad
            r8 = 1
            if (r7 == 0) goto L5e
            int r7 = r7.ad
            r0 = 40010(0x9c4a, float:5.6066E-41)
            if (r7 != r0) goto L43
            r3 = r8
        L43:
            defpackage.AbstractC2301e.subscription(r3)
            r4.getClass()
            eؘؐۙ r4 = (defpackage.AbstractC5340e) r4
            e٘ۡۢ r7 = new e٘ۡۢ
            r8 = 3
            r7.<init>(r6, r4, r8)
            java.lang.Object r8 = r2.f26645e
            eؔٔٚ r8 = (defpackage.C2584e) r8
            eٟۦ r8 = r8.metrica()
            r1 = 0
            r6.m1935strictfp(r1, r0, r7, r8)
            return
        L5e:
            eؙۗ r7 = r6.yandex
            eًؙٞ r7 = r7.pro
            if (r1 == r8) goto L65
            goto L6f
        L65:
            if (r4 != 0) goto L71
            boolean r7 = r7.mo2129interface()
            if (r7 != 0) goto L6f
            r7 = r8
            goto L78
        L6f:
            r7 = r3
            goto L78
        L71:
            r7 = r4
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L78:
            if (r7 == 0) goto L8c
            eؔؒؖ r7 = new eؔؒؖ
            r0 = 5
            r7.<init>(r6, r0)
            java.lang.Object r0 = r2.f26645e
            eؔٔٚ r0 = (defpackage.C2584e) r0
            eٟۦ r0 = r0.metrica()
            r6.m1931new(r8, r7, r0, r3)
            return
        L8c:
            r7 = 31
            if (r1 != r7) goto L99
            r4.getClass()
            eِؓٝ r4 = (defpackage.C1962e) r4
            r6.m1932package(r4, r3, r3)
            return
        L99:
            e٘ۡۢ r7 = new e٘ۡۢ
            r3 = 4
            r7.<init>(r6, r0, r3)
            java.lang.Object r0 = r2.f26645e
            eؔٔٚ r0 = (defpackage.C2584e) r0
            eٟۦ r0 = r0.metrica()
            r6.m1931new(r1, r7, r0, r8)
            return
        Lab:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to convert predefined custom command: "
            r1.<init>(r2)
            java.lang.String r0 = r0.vip
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.AbstractC2803e.amazon(r8, r0, r7)
            return
        Lc0:
            eٍٗ٘ r7 = new eٍٗ٘
            r1 = 9
            r7.<init>(r1, r6, r0, r8)
            java.lang.Object r8 = r2.f26645e
            eؔٔٚ r8 = (defpackage.C2584e) r8
            eٟۦ r8 = r8.metrica()
            r6.m1935strictfp(r0, r3, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5537e.yandex(java.lang.String, android.os.Bundle):void");
    }
}
