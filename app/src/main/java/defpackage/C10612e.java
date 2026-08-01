package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۢۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10612e implements InterfaceC8223e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20929e;

    public /* synthetic */ C10612e(int i) {
        this.f20929e = i;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [eؑٛؒ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [eٍؕٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eؚؒۚ, java.lang.Object] */
    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        C1410e billing;
        int i = 18;
        boolean z = true;
        switch (this.f20929e) {
            case 0:
                return ((InterfaceC1272e) obj).ad().getClass().getSimpleName();
            case 1:
                return Integer.valueOf(((C17817e) obj).subscription);
            case 2:
                long j = ((C17169e) obj).vip;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 3:
                C12931e c12931e = (C12931e) obj;
                c12931e.getClass();
                Bundle bundle = new Bundle();
                String str = C12931e.appmetrica;
                C1410e c1410e = c12931e.vip;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c1410e.f4224e);
                C2171e listIterator = c1410e.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((C16437e) listIterator.next()).license());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 4:
                return new C4174e((C17381e) obj);
            case 5:
                C12016e c12016e = (C12016e) obj;
                return c12016e.ad + ": " + c12016e.vip;
            case 6:
                C2220e c2220e = (C2220e) obj;
                c2220e.isVip();
                return AbstractC17475e.remoteconfig(AbstractC10589e.purchase(new C10612e(i), c2220e.f5639e.vip));
            case 7:
                C8319e c8319e = (C8319e) obj;
                c8319e.getClass();
                Bundle bundle2 = new Bundle();
                int i2 = c8319e.f16998e;
                if (i2 != 0) {
                    bundle2.putInt(C8319e.f16994e, i2);
                }
                int i3 = c8319e.f16997e;
                if (i3 != 0) {
                    bundle2.putInt(C8319e.f16993e, i3);
                }
                int i4 = c8319e.f16996e;
                if (i4 != 0) {
                    bundle2.putInt(C8319e.f16995e, i4);
                }
                return bundle2;
            case 8:
                C15875e c15875e = (C15875e) obj;
                c15875e.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(C15875e.yandex, c15875e.ad);
                String str2 = c15875e.vip;
                if (str2 != null) {
                    bundle3.putString(C15875e.startapp, str2);
                }
                String str3 = c15875e.metrica;
                if (str3 != null) {
                    bundle3.putString(C15875e.adcel, str3);
                }
                int i5 = c15875e.license;
                if (i5 != 0) {
                    bundle3.putInt(C15875e.mopub, i5);
                }
                int i6 = c15875e.appmetrica;
                if (i6 != 0) {
                    bundle3.putInt(C15875e.advert, i6);
                }
                String str4 = c15875e.purchase;
                if (str4 != null) {
                    bundle3.putString(C15875e.smaato, str4);
                }
                String str5 = c15875e.billing;
                if (str5 != null) {
                    bundle3.putString(C15875e.amazon, str5);
                }
                return bundle3;
            case 9:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(C15875e.yandex);
                uri.getClass();
                String string = bundle4.getString(C15875e.startapp);
                String string2 = bundle4.getString(C15875e.adcel);
                int i7 = bundle4.getInt(C15875e.mopub, 0);
                int i8 = bundle4.getInt(C15875e.advert, 0);
                String string3 = bundle4.getString(C15875e.smaato);
                String string4 = bundle4.getString(C15875e.amazon);
                ?? obj2 = new Object();
                obj2.license = uri;
                obj2.ad = AbstractC8542e.amazon(string);
                obj2.appmetrica = string2;
                obj2.vip = i7;
                obj2.metrica = i8;
                obj2.purchase = string3;
                obj2.billing = string4;
                return new C15875e(obj2);
            case 10:
                String str6 = (String) obj;
                C7274e c7274e = C0793e.billing;
                c7274e.getClass();
                int length = str6.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (c7274e.metrica(str6.charAt(length))) {
                            length--;
                        } else {
                            z = false;
                        }
                    }
                }
                if (z && !str6.isEmpty()) {
                    return str6;
                }
                StringBuilder sb = new StringBuilder(str6.length() + 16);
                sb.append('\"');
                while (r4 < str6.length()) {
                    char charAt = str6.charAt(r4);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(charAt);
                    r4++;
                }
                sb.append('\"');
                return sb.toString();
            case 11:
                Collection collection = (Collection) obj;
                int i9 = AbstractC13294e.f26365e;
                if (collection instanceof AbstractC13294e) {
                    return (AbstractC13294e) collection;
                }
                boolean z2 = collection instanceof InterfaceC8902e;
                int size = z2 ? ((C4947e) ((C11994e) ((InterfaceC8902e) collection)).loadAd()).size() : 11;
                ?? obj3 = new Object();
                obj3.vip = false;
                ?? obj4 = new Object();
                obj4.license(size);
                obj3.ad = obj4;
                if (z2) {
                    InterfaceC8902e interfaceC8902e = (InterfaceC8902e) collection;
                    C0917e c0917e = interfaceC8902e instanceof C11994e ? ((C11994e) interfaceC8902e).f23974e : null;
                    if (c0917e != null) {
                        obj4.ad(Math.max(obj4.metrica, c0917e.metrica));
                        r4 = c0917e.metrica == 0 ? -1 : 0;
                        while (r4 >= 0) {
                            AbstractC2301e.mopub(r4, c0917e.metrica);
                            Object obj5 = c0917e.ad[r4];
                            AbstractC2301e.mopub(r4, c0917e.metrica);
                            obj3.metrica(c0917e.vip[r4], obj5);
                            r4++;
                            if (r4 >= c0917e.metrica) {
                                r4 = -1;
                            }
                        }
                    } else {
                        AbstractC13294e abstractC13294e = (AbstractC13294e) interfaceC8902e;
                        AbstractC12614e Signature = abstractC13294e.Signature();
                        C0917e c0917e2 = obj3.ad;
                        c0917e2.ad(Math.max(c0917e2.metrica, Signature.size()));
                        for (C15079e c15079e : abstractC13294e.Signature()) {
                            obj3.metrica(c15079e.ad(), c15079e.ad);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        obj3.ad(it.next());
                    }
                }
                Objects.requireNonNull(obj3.ad);
                if (obj3.ad.metrica == 0) {
                    return C11994e.f23973e;
                }
                obj3.vip = true;
                return new C11994e(obj3.ad);
            case 12:
                return Long.valueOf(((C17169e) obj).vip);
            case 13:
                return Long.valueOf(((C17169e) obj).metrica);
            case 14:
                return AbstractC17475e.remoteconfig(AbstractC10589e.purchase(new C10612e(i), ((InterfaceC14239e) obj).amazon().vip));
            case 15:
                return (C4361e) obj;
            case 16:
                C13843e c13843e = (C13843e) obj;
                int i10 = c13843e.ad;
                int i11 = c13843e.vip;
                int i12 = c13843e.license;
                return new C13843e(i11 <= 1, i10, i11 > i12 ? i11 - 1 : i12, i12, c13843e.appmetrica);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Bundle bundle5 = (Bundle) obj;
                C16975e c16975e = C16975e.f33243default;
                C11445e c11445e = new C11445e();
                if (bundle5 != null) {
                    ClassLoader classLoader = AbstractC5092e.class.getClassLoader();
                    String str7 = AbstractC9413e.ad;
                    bundle5.setClassLoader(classLoader);
                }
                String string5 = bundle5.getString(C16975e.f33261implements);
                String str8 = c16975e.ad;
                if (string5 == null) {
                    string5 = str8;
                }
                c11445e.ad = string5;
                String string6 = bundle5.getString(C16975e.f33239case);
                String str9 = c16975e.vip;
                if (string6 == null) {
                    string6 = str9;
                }
                c11445e.vip = string6;
                ArrayList parcelableArrayList = bundle5.getParcelableArrayList(C16975e.f33248e);
                if (parcelableArrayList == null) {
                    billing = C1410e.f4222e;
                } else {
                    C13304e Signature2 = AbstractC17475e.Signature();
                    for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                        Bundle bundle6 = (Bundle) parcelableArrayList.get(i13);
                        bundle6.getClass();
                        String string7 = bundle6.getString(C12016e.metrica);
                        String string8 = bundle6.getString(C12016e.license);
                        string8.getClass();
                        Signature2.metrica(new C12016e(string7, string8));
                    }
                    billing = Signature2.billing();
                }
                c11445e.metrica = AbstractC17475e.remoteconfig(billing);
                String string9 = bundle5.getString(C16975e.f33240catch);
                String str10 = c16975e.license;
                if (string9 == null) {
                    string9 = str10;
                }
                c11445e.license = string9;
                c11445e.appmetrica = bundle5.getInt(C16975e.f33258final, c16975e.appmetrica);
                c11445e.purchase = bundle5.getInt(C16975e.f33271super, c16975e.purchase);
                c11445e.billing = bundle5.getInt(C16975e.f33255e, c16975e.billing);
                c11445e.yandex = bundle5.getInt(C16975e.f33264new, c16975e.yandex);
                c11445e.startapp = bundle5.getInt(C16975e.f33270strictfp, c16975e.startapp);
                String string10 = bundle5.getString(C16975e.f33266private);
                String str11 = c16975e.mopub;
                if (string10 == null) {
                    string10 = str11;
                }
                c11445e.adcel = string10;
                String string11 = bundle5.getString(C16975e.f33254e);
                String str12 = c16975e.smaato;
                if (string11 == null) {
                    string11 = str12;
                }
                c11445e.advert = string11;
                String string12 = bundle5.getString(C16975e.f33265package);
                String str13 = c16975e.amazon;
                if (string12 == null) {
                    string12 = str13;
                }
                c11445e.smaato = AbstractC8542e.amazon(string12);
                String string13 = bundle5.getString(C16975e.f33275transient);
                String str14 = c16975e.loadAd;
                if (string13 == null) {
                    string13 = str14;
                }
                c11445e.amazon = AbstractC8542e.amazon(string13);
                c11445e.loadAd = bundle5.getInt(C16975e.f33262import, c16975e.Signature);
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle5.getByteArray(C16975e.f33263instanceof + "_" + Integer.toString(r4, 36));
                    if (byteArray == null) {
                        c11445e.admob = arrayList2;
                        c11445e.subscription = (C9284e) bundle5.getParcelable(C16975e.f33269static);
                        c11445e.remoteconfig = bundle5.getLong(C16975e.f33273synchronized, c16975e.pro);
                        c11445e.signatures = bundle5.getInt(C16975e.f33268return, c16975e.tapsense);
                        c11445e.tapsense = bundle5.getInt(C16975e.f33244else, c16975e.isVip);
                        c11445e.isVip = bundle5.getInt(C16975e.f33249e, c16975e.inmobi);
                        c11445e.inmobi = bundle5.getInt(C16975e.f33250e, c16975e.isPro);
                        c11445e.isPro = bundle5.getFloat(C16975e.f33272switch, c16975e.applovin);
                        c11445e.applovin = bundle5.getInt(C16975e.f33274throws, c16975e.ads);
                        c11445e.ads = bundle5.getFloat(C16975e.f33259finally, c16975e.premium);
                        c11445e.premium = bundle5.getByteArray(C16975e.f33241const);
                        c11445e.subs = bundle5.getInt(C16975e.f33276volatile, c16975e.crashlytics);
                        c11445e.firebase = bundle5.getInt(C16975e.f33256e, c16975e.f33279class);
                        Bundle bundle7 = bundle5.getBundle(C16975e.f33260for);
                        if (bundle7 != null) {
                            c11445e.crashlytics = new C14754e(bundle7.getInt(C14754e.startapp, -1), bundle7.getInt(C14754e.adcel, -1), bundle7.getInt(C14754e.mopub, -1), bundle7.getByteArray(C14754e.advert), bundle7.getInt(C14754e.smaato, -1), bundle7.getInt(C14754e.amazon, -1));
                        }
                        c11445e.f23018class = bundle5.getInt(C16975e.f33242continue, c16975e.f33282interface);
                        c11445e.f23021interface = bundle5.getInt(C16975e.f33267public, c16975e.f33281goto);
                        c11445e.f23020goto = bundle5.getInt(C16975e.f33257e, c16975e.f33285this);
                        c11445e.f23024this = bundle5.getInt(C16975e.f33251e, c16975e.f33283native);
                        c11445e.f23022native = bundle5.getInt(C16975e.f33253e, c16975e.f33280extends);
                        c11445e.f23019extends = bundle5.getInt(C16975e.f33246e, c16975e.f33286throw);
                        c11445e.f23027while = bundle5.getInt(C16975e.f33247e, c16975e.f33287try);
                        c11445e.f23026try = bundle5.getInt(C16975e.f33252e, c16975e.f33284protected);
                        c11445e.f23023protected = bundle5.getInt(C16975e.f33245e, c16975e.f33278break);
                        return new C16975e(c11445e);
                    }
                    arrayList2.add(byteArray);
                    r4++;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Integer.valueOf(((C16437e) obj).metrica);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C6653e c6653e = (C6653e) obj;
                c6653e.getClass();
                Bundle bundle8 = new Bundle();
                bundle8.putBundle(C6653e.purchase, c6653e.vip.license());
                bundle8.putIntArray(C6653e.billing, c6653e.license);
                bundle8.putBooleanArray(C6653e.yandex, c6653e.appmetrica);
                bundle8.putBoolean(C6653e.startapp, c6653e.metrica);
                return bundle8;
            default:
                Bundle bundle9 = (Bundle) obj;
                Bundle bundle10 = bundle9.getBundle(C6653e.purchase);
                bundle10.getClass();
                C16437e ad = C16437e.ad(bundle10);
                int[] intArray = bundle9.getIntArray(C6653e.billing);
                int i14 = ad.ad;
                int[] iArr = new int[i14];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle9.getBooleanArray(C6653e.yandex);
                boolean[] zArr = new boolean[i14];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new C6653e(ad, bundle9.getBoolean(C6653e.startapp, false), intArray, booleanArray);
        }
    }
}
