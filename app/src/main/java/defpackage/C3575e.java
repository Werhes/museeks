package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3575e {
    public static final String Signature;
    public static final String admob;
    public static final String ads;
    public static final String applovin;
    public static final String inmobi;
    public static final String isPro;
    public static final String isVip;
    public static final String loadAd;
    public static final String premium;
    public static final String pro;
    public static final String remoteconfig;
    public static final String signatures;
    public static final String subs;
    public static final String subscription;
    public static final String tapsense;
    public final int ad;
    public final C2411e adcel;
    public final AbstractC17475e advert;
    public final AbstractC17475e amazon;
    public final C6689e appmetrica;
    public final C5298e billing;
    public final PendingIntent license;
    public final InterfaceC3001e metrica;
    public final AbstractC17475e mopub;
    public final C5298e purchase;
    public final MediaSession.Token smaato;
    public final Bundle startapp;
    public final int vip;
    public final Bundle yandex;

    static {
        String str = AbstractC9413e.ad;
        loadAd = Integer.toString(0, 36);
        Signature = Integer.toString(1, 36);
        admob = Integer.toString(2, 36);
        subscription = Integer.toString(9, 36);
        remoteconfig = Integer.toString(14, 36);
        pro = Integer.toString(13, 36);
        signatures = Integer.toString(3, 36);
        tapsense = Integer.toString(4, 36);
        isVip = Integer.toString(5, 36);
        inmobi = Integer.toString(6, 36);
        isPro = Integer.toString(11, 36);
        applovin = Integer.toString(7, 36);
        ads = Integer.toString(8, 36);
        premium = Integer.toString(10, 36);
        subs = Integer.toString(12, 36);
    }

    public C3575e(int i, int i2, InterfaceC3001e interfaceC3001e, PendingIntent pendingIntent, AbstractC17475e abstractC17475e, AbstractC17475e abstractC17475e2, AbstractC17475e abstractC17475e3, C6689e c6689e, C5298e c5298e, C5298e c5298e2, Bundle bundle, Bundle bundle2, C2411e c2411e, MediaSession.Token token) {
        this.ad = i;
        this.vip = i2;
        this.metrica = interfaceC3001e;
        this.license = pendingIntent;
        this.mopub = abstractC17475e;
        this.advert = abstractC17475e2;
        this.amazon = abstractC17475e3;
        this.appmetrica = c6689e;
        this.purchase = c5298e;
        this.billing = c5298e2;
        this.yandex = bundle;
        this.startapp = bundle2;
        this.adcel = c2411e;
        this.smaato = token;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [eّٟؔ, java.lang.Object] */
    public static C3575e ad(Bundle bundle) {
        C1410e c1410e;
        C1410e c1410e2;
        C1410e c1410e3;
        InterfaceC3001e interfaceC3001e;
        IBinder binder = bundle.getBinder(premium);
        if (binder instanceof BinderC4166e) {
            return ((BinderC4166e) binder).metrica;
        }
        int i = bundle.getInt(loadAd, 0);
        int i2 = bundle.getInt(ads, 0);
        IBinder binder2 = bundle.getBinder(Signature);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(admob);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(subscription);
        if (parcelableArrayList != null) {
            C13304e Signature2 = AbstractC17475e.Signature();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                Signature2.metrica(C11161e.startapp(i2, bundle2));
            }
            c1410e = Signature2.billing();
        } else {
            C2171e c2171e = AbstractC17475e.f34223e;
            c1410e = C1410e.f4222e;
        }
        C1410e c1410e4 = c1410e;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(remoteconfig);
        if (parcelableArrayList2 != null) {
            C13304e Signature3 = AbstractC17475e.Signature();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                Signature3.metrica(C11161e.startapp(i2, bundle3));
            }
            c1410e2 = Signature3.billing();
        } else {
            C2171e c2171e2 = AbstractC17475e.f34223e;
            c1410e2 = C1410e.f4222e;
        }
        C1410e c1410e5 = c1410e2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(pro);
        if (parcelableArrayList3 != null) {
            C13304e Signature4 = AbstractC17475e.Signature();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                Signature4.metrica(C11161e.startapp(i2, bundle4));
            }
            c1410e3 = Signature4.billing();
        } else {
            C2171e c2171e3 = AbstractC17475e.f34223e;
            c1410e3 = C1410e.f4222e;
        }
        C1410e c1410e6 = c1410e3;
        Bundle bundle5 = bundle.getBundle(signatures);
        C6689e vip = bundle5 == null ? C6689e.vip : C6689e.vip(bundle5);
        Bundle bundle6 = bundle.getBundle(isVip);
        C5298e vip2 = bundle6 == null ? C5298e.vip : C5298e.vip(bundle6);
        Bundle bundle7 = bundle.getBundle(tapsense);
        C5298e vip3 = bundle7 == null ? C5298e.vip : C5298e.vip(bundle7);
        Bundle Signature5 = AbstractC9413e.Signature(bundle.getBundle(inmobi));
        Bundle Signature6 = AbstractC9413e.Signature(bundle.getBundle(isPro));
        Bundle bundle8 = bundle.getBundle(applovin);
        C2411e subscription2 = bundle8 == null ? C2411e.f6162goto : C2411e.subscription(i2, bundle8);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(subs);
        Bundle bundle9 = Signature6;
        int i6 = BinderC17428e.adcel;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3001e)) {
            ?? obj = new Object();
            obj.metrica = iBinder;
            interfaceC3001e = obj;
        } else {
            interfaceC3001e = (InterfaceC3001e) queryLocalInterface;
        }
        if (Signature5 == null) {
            Signature5 = Bundle.EMPTY;
        }
        Bundle bundle10 = Signature5;
        if (bundle9 == null) {
            bundle9 = Bundle.EMPTY;
        }
        return new C3575e(i, i2, interfaceC3001e, pendingIntent, c1410e4, c1410e5, c1410e6, vip, vip3, vip2, bundle10, bundle9, subscription2, token);
    }

    public final Bundle vip(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(loadAd, this.ad);
        bundle.putBinder(Signature, this.metrica.asBinder());
        bundle.putParcelable(admob, this.license);
        AbstractC17475e abstractC17475e = this.mopub;
        boolean isEmpty = abstractC17475e.isEmpty();
        String str = subscription;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC17475e.size());
            Iterator<E> it = abstractC17475e.iterator();
            while (it.hasNext()) {
                arrayList.add(((C11161e) it.next()).loadAd(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        AbstractC17475e abstractC17475e2 = this.advert;
        if (!abstractC17475e2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(abstractC17475e2.size());
                Iterator<E> it2 = abstractC17475e2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C11161e) it2.next()).loadAd(i));
                }
                bundle.putParcelableArrayList(remoteconfig, arrayList2);
            } else {
                C1410e adcel = C11161e.adcel(abstractC17475e2, true, true, 9);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(adcel.f4224e);
                C2171e listIterator = adcel.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((C11161e) listIterator.next()).loadAd(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        AbstractC17475e abstractC17475e3 = this.amazon;
        if (!abstractC17475e3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(abstractC17475e3.size());
            Iterator<E> it3 = abstractC17475e3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C11161e) it3.next()).loadAd(i));
            }
            bundle.putParcelableArrayList(pro, arrayList4);
        }
        C6689e c6689e = this.appmetrica;
        c6689e.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        AbstractC7014e it4 = c6689e.ad.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C11858e) it4.next()).vip());
        }
        bundle2.putParcelableArrayList(C6689e.metrica, arrayList5);
        bundle.putBundle(signatures, bundle2);
        String str2 = tapsense;
        C5298e c5298e = this.purchase;
        bundle.putBundle(str2, c5298e.metrica());
        String str3 = isVip;
        C5298e c5298e2 = this.billing;
        bundle.putBundle(str3, c5298e2.metrica());
        bundle.putBundle(inmobi, this.yandex);
        bundle.putBundle(isPro, this.startapp);
        bundle.putBundle(applovin, this.adcel.admob(AbstractC1008e.license(c5298e, c5298e2), false, false).pro(i));
        bundle.putInt(ads, this.vip);
        MediaSession.Token token = this.smaato;
        if (token != null) {
            bundle.putParcelable(subs, token);
        }
        return bundle;
    }
}
