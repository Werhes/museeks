package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۡٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11328e implements InterfaceC11455e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f22770e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f22771e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f22772e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f22773e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f22774e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11328e(Context context, int i) {
        this(context, new C11894e(-1, 0, 0));
        switch (i) {
            case 3:
                return;
            default:
                C6094e c6094e = AbstractC17610e.vip;
                InterfaceC8614e interfaceC8614e = AbstractC17610e.ad[0];
                C7850e c7850e = new C7850e(25, (InterfaceC8018e) c6094e.ad(context));
                C6094e c6094e2 = AbstractC18497e.vip;
                InterfaceC8614e interfaceC8614e2 = AbstractC18497e.ad[0];
                C6325e c6325e = new C6325e(29, (InterfaceC8018e) c6094e2.ad(context));
                C6094e c6094e3 = AbstractC2957e.vip;
                InterfaceC8614e interfaceC8614e3 = AbstractC2957e.ad[0];
                C16452e c16452e = new C16452e((InterfaceC8018e) c6094e3.ad(context));
                C6094e c6094e4 = AbstractC5872e.vip;
                InterfaceC8614e interfaceC8614e4 = AbstractC5872e.ad[0];
                C0444e c0444e = new C0444e((InterfaceC8018e) c6094e4.ad(context));
                C0731e c0731e = new C0731e(2, AbstractC16214e.ad(context));
                this.f22774e = c7850e;
                this.f22772e = c6325e;
                this.f22771e = c16452e;
                this.f22773e = c0444e;
                this.f22770e = c0731e;
                return;
        }
    }

    public C11328e(Context context, C11894e c11894e) {
        this.f22774e = context;
        this.f22772e = c11894e;
        metrica();
    }

    public C11328e(C13500e c13500e, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f22774e = c13500e;
        this.f22773e = hashMap2;
        this.f22770e = hashMap3;
        this.f22771e = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c13500e.license(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f22772e = jArr;
    }

    public void ad(C11742e c11742e) {
        int i = c11742e.appmetrica;
        if (i == 2 && ((C0385e) this.f22773e) != null) {
            appmetrica();
        }
        if (i == 2) {
            this.f22773e = new C0385e((C0140e) this.f22774e, (String) this.f22771e);
        } else {
            this.f22773e = license();
        }
        C0385e c0385e = (C0385e) this.f22773e;
        AbstractC9528e.startapp(c0385e);
        c11742e.license = c0385e.yandex;
        c0385e.vip.add(c11742e);
    }

    @Override // defpackage.InterfaceC11455e
    public long adcel(int i) {
        return ((long[]) this.f22772e)[i];
    }

    @Override // defpackage.InterfaceC11455e
    public List advert(long j) {
        C13500e c13500e = (C13500e) this.f22774e;
        Map map = (Map) this.f22771e;
        HashMap hashMap = (HashMap) this.f22773e;
        HashMap hashMap2 = (HashMap) this.f22770e;
        ArrayList arrayList = new ArrayList();
        c13500e.billing(j, c13500e.yandex, arrayList);
        TreeMap treeMap = new TreeMap();
        c13500e.startapp(j, false, c13500e.yandex, treeMap);
        c13500e.yandex(j, map, hashMap, c13500e.yandex, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C13446e c13446e = (C13446e) hashMap.get(pair.first);
                c13446e.getClass();
                arrayList2.add(new C17817e(null, null, null, decodeByteArray, c13446e.metrica, 0, c13446e.appmetrica, c13446e.vip, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, c13446e.purchase, c13446e.billing, false, -16777216, c13446e.adcel, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C13446e c13446e2 = (C13446e) hashMap.get(entry.getKey());
            c13446e2.getClass();
            C4715e c4715e = (C4715e) entry.getValue();
            CharSequence charSequence = c4715e.ad;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C8097e c8097e : (C8097e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C8097e.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c8097e), spannableStringBuilder.getSpanEnd(c8097e), (CharSequence) BuildConfig.FLAVOR);
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = c13446e2.metrica;
            int i9 = c13446e2.license;
            c4715e.appmetrica = f;
            c4715e.purchase = i9;
            c4715e.billing = c13446e2.appmetrica;
            c4715e.yandex = c13446e2.vip;
            c4715e.advert = c13446e2.purchase;
            float f2 = c13446e2.startapp;
            int i10 = c13446e2.yandex;
            c4715e.mopub = f2;
            c4715e.adcel = i10;
            c4715e.Signature = c13446e2.adcel;
            arrayList2.add(c4715e.ad());
        }
        return arrayList2;
    }

    public void appmetrica() {
        int i;
        int i2;
        int i3;
        long j;
        C0385e c0385e = (C0385e) this.f22773e;
        if (c0385e != null) {
            C10078e c10078e = c0385e.adcel;
            if (c10078e != null) {
                c10078e.advert = null;
                c0385e.adcel = null;
            }
            long j2 = c0385e.startapp;
            C17488e smaato = C4469e.smaato();
            smaato.ad();
            ((C4469e) smaato.f20053e).loadAd(j2);
            String str = c0385e.advert;
            if (str != null) {
                smaato.ad();
                ((C4469e) smaato.f20053e).pro(str);
            }
            C18245e advert = C10631e.advert();
            if (!TextUtils.isEmpty(c0385e.amazon)) {
                String str2 = c0385e.amazon;
                smaato.ad();
                ((C4469e) smaato.f20053e).Signature(str2);
                String str3 = c0385e.amazon;
                advert.ad();
                ((C10631e) advert.f20053e).smaato(str3);
            }
            if (!TextUtils.isEmpty(c0385e.loadAd)) {
                String str4 = c0385e.loadAd;
                advert.ad();
                ((C10631e) advert.f20053e).amazon(str4);
            }
            if (!TextUtils.isEmpty(c0385e.Signature)) {
                String str5 = c0385e.Signature;
                advert.ad();
                ((C10631e) advert.f20053e).loadAd(str5);
            }
            if (!TextUtils.isEmpty(c0385e.admob)) {
                String str6 = c0385e.admob;
                advert.ad();
                ((C10631e) advert.f20053e).Signature(str6);
            }
            if (!TextUtils.isEmpty(c0385e.subscription)) {
                String str7 = c0385e.subscription;
                advert.ad();
                ((C10631e) advert.f20053e).admob(str7);
            }
            if (!TextUtils.isEmpty(c0385e.remoteconfig)) {
                String str8 = c0385e.remoteconfig;
                advert.ad();
                ((C10631e) advert.f20053e).subscription(str8);
            }
            int i4 = c0385e.pro;
            int i5 = 1;
            int i6 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? 1 : 6 : 5 : 4 : 3 : 2;
            advert.ad();
            ((C10631e) advert.f20053e).remoteconfig(i6);
            C10631e c10631e = (C10631e) advert.metrica();
            smaato.ad();
            ((C4469e) smaato.f20053e).applovin(c10631e);
            C7083e advert2 = C2542e.advert();
            String str9 = C0385e.isVip;
            advert2.ad();
            ((C2542e) advert2.f20053e).amazon(str9);
            String str10 = c0385e.billing;
            advert2.ad();
            ((C2542e) advert2.f20053e).smaato(str10);
            C2542e c2542e = (C2542e) advert2.metrica();
            smaato.ad();
            ((C4469e) smaato.f20053e).inmobi(c2542e);
            C8209e c8209e = c0385e.ad;
            C15029e advert3 = C13051e.advert();
            String str11 = (String) c8209e.ad();
            if (str11 != null) {
                C5469e advert4 = C14569e.advert();
                advert4.ad();
                ((C14569e) advert4.f20053e).smaato(str11);
                C14569e c14569e = (C14569e) advert4.metrica();
                advert3.ad();
                ((C13051e) advert3.f20053e).smaato(c14569e);
            }
            String str12 = c0385e.mopub;
            int i7 = 16;
            if (str12 != null) {
                try {
                    String replace = str12.replace("-", BuildConfig.FLAVOR);
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    C18482e c18482e = C0385e.tapsense;
                    Log.w(c18482e.ad, c18482e.license("receiverSessionId %s is not valid for hash", str12), e);
                    j = 0;
                }
                advert3.ad();
                ((C13051e) advert3.f20053e).amazon(j);
            }
            List<C11742e> list = c0385e.vip;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C11742e c11742e : list) {
                    c11742e.getClass();
                    C10235e advert5 = C8859e.advert();
                    int i8 = c11742e.appmetrica;
                    advert5.ad();
                    ((C8859e) advert5.f20053e).admob(i8);
                    int i9 = (int) (c11742e.vip - c11742e.license);
                    advert5.ad();
                    ((C8859e) advert5.f20053e).Signature(i9);
                    advert5.ad();
                    ((C8859e) advert5.f20053e).smaato(i9);
                    Integer num = c11742e.ad;
                    if (num != null) {
                        int intValue = num.intValue();
                        advert5.ad();
                        ((C8859e) advert5.f20053e).amazon(intValue);
                    }
                    Boolean bool = c11742e.metrica;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        advert5.ad();
                        ((C8859e) advert5.f20053e).loadAd(booleanValue);
                    }
                    arrayList.add((C8859e) advert5.metrica());
                }
                advert3.ad();
                ((C13051e) advert3.f20053e).loadAd(arrayList);
            }
            List list2 = c0385e.metrica;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    throw AbstractC5087e.m1747goto(it);
                }
                advert3.ad();
                ((C13051e) advert3.f20053e).admob(arrayList2);
            }
            List<C9633e> list3 = c0385e.license;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (C9633e c9633e : list3) {
                    String str13 = c9633e.ad;
                    C9516e advert6 = C12509e.advert();
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i3 = 13;
                                break;
                            }
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i3 = 22;
                                break;
                            }
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i3 = 15;
                                break;
                            }
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i3 = 19;
                                break;
                            }
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i3 = 23;
                                break;
                            }
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i3 = 9;
                                break;
                            }
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i3 = 21;
                                break;
                            }
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i3 = 10;
                                break;
                            }
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i3 = 14;
                                break;
                            }
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i3 = 7;
                                break;
                            }
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i3 = 20;
                                break;
                            }
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i3 = 2;
                                break;
                            }
                            break;
                        case 3363353:
                            if (str13.equals("mute")) {
                                i3 = 8;
                                break;
                            }
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i3 = 3;
                                break;
                            }
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i3 = 6;
                                break;
                            }
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i3 = 5;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str13.equals("pause")) {
                                i3 = 4;
                                break;
                            }
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i3 = 18;
                                break;
                            }
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i3 = i7;
                                break;
                            }
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i3 = 12;
                                break;
                            }
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i3 = 11;
                                break;
                            }
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i3 = 17;
                                break;
                            }
                            break;
                    }
                    i3 = i5;
                    advert6.ad();
                    ((C12509e) advert6.f20053e).admob(i3);
                    int i10 = (int) c9633e.vip;
                    advert6.ad();
                    ((C12509e) advert6.f20053e).smaato(i10);
                    int i11 = c9633e.metrica;
                    advert6.ad();
                    ((C12509e) advert6.f20053e).amazon(i11);
                    int i12 = (int) (c9633e.license - c9633e.purchase);
                    advert6.ad();
                    ((C12509e) advert6.f20053e).loadAd(i12);
                    int i13 = (int) (c9633e.appmetrica - c9633e.purchase);
                    advert6.ad();
                    ((C12509e) advert6.f20053e).Signature(i13);
                    arrayList3.add((C12509e) advert6.metrica());
                    i5 = 1;
                    i7 = 16;
                }
                advert3.ad();
                ((C13051e) advert3.f20053e).Signature(arrayList3);
            }
            if (c0385e.smaato != null) {
                ArrayList arrayList4 = new ArrayList();
                C18451e c18451e = c0385e.smaato;
                int i14 = c18451e.license;
                C13159e advert7 = C17165e.advert();
                if (i14 == 1) {
                    i = 2;
                } else if (i14 != 2) {
                    i2 = i14 != 3 ? i14 != 4 ? 1 : 5 : 4;
                    advert7.ad();
                    ((C17165e) advert7.f20053e).amazon(i2);
                    int i15 = (int) (c18451e.vip - c18451e.metrica);
                    advert7.ad();
                    ((C17165e) advert7.f20053e).smaato(i15);
                    arrayList4.add((C17165e) advert7.metrica());
                    advert3.ad();
                    ((C13051e) advert3.f20053e).remoteconfig(arrayList4);
                } else {
                    i = 3;
                }
                i2 = i;
                advert7.ad();
                ((C17165e) advert7.f20053e).amazon(i2);
                int i152 = (int) (c18451e.vip - c18451e.metrica);
                advert7.ad();
                ((C17165e) advert7.f20053e).smaato(i152);
                arrayList4.add((C17165e) advert7.metrica());
                advert3.ad();
                ((C13051e) advert3.f20053e).remoteconfig(arrayList4);
            }
            Map map = c0385e.appmetrica;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (C7411e c7411e : map.values()) {
                    c7411e.getClass();
                    C18346e advert8 = C5866e.advert();
                    int i16 = c7411e.appmetrica;
                    advert8.ad();
                    ((C5866e) advert8.f20053e).Signature(i16);
                    int i17 = c7411e.license.get();
                    advert8.ad();
                    ((C5866e) advert8.f20053e).smaato(i17);
                    int i18 = (int) (c7411e.ad - c7411e.metrica);
                    advert8.ad();
                    ((C5866e) advert8.f20053e).amazon(i18);
                    int i19 = (int) (c7411e.vip - c7411e.metrica);
                    advert8.ad();
                    ((C5866e) advert8.f20053e).loadAd(i19);
                    arrayList5.add((C5866e) advert8.metrica());
                }
                advert3.ad();
                ((C13051e) advert3.f20053e).subscription(arrayList5);
            }
            int i20 = c0385e.signatures;
            advert3.ad();
            ((C13051e) advert3.f20053e).pro(i20);
            C13051e c13051e = (C13051e) advert3.metrica();
            smaato.ad();
            ((C4469e) smaato.f20053e).isVip(c13051e);
            c0385e.purchase.ad((C4469e) smaato.metrica(), 233);
            this.f22773e = null;
        }
    }

    public C0385e license() {
        if (((C0385e) this.f22773e) == null) {
            C0385e c0385e = new C0385e((C0140e) this.f22774e, (String) this.f22771e);
            this.f22773e = c0385e;
            c0385e.vip(1);
        }
        return (C0385e) this.f22773e;
    }

    @Override // defpackage.InterfaceC11455e
    public int loadAd() {
        return ((long[]) this.f22772e).length;
    }

    public void metrica() {
        AsyncTaskC16040e asyncTaskC16040e = (AsyncTaskC16040e) this.f22773e;
        if (asyncTaskC16040e != null) {
            asyncTaskC16040e.cancel(true);
            this.f22773e = null;
        }
        this.f22771e = null;
    }

    @Override // defpackage.InterfaceC11455e
    public int purchase(long j) {
        long[] jArr = (long[]) this.f22772e;
        int vip = AbstractC9413e.vip(jArr, j, false);
        if (vip < jArr.length) {
            return vip;
        }
        return -1;
    }

    public void vip(Uri uri) {
        int i;
        Context context = (Context) this.f22774e;
        if (uri == null) {
            metrica();
            return;
        }
        if (uri.equals((Uri) this.f22771e)) {
            return;
        }
        metrica();
        this.f22771e = uri;
        C11894e c11894e = (C11894e) this.f22772e;
        int i2 = c11894e.f23829e;
        if (i2 == 0 || (i = c11894e.f23828e) == 0) {
            this.f22773e = new AsyncTaskC16040e(context, 0, 0, this);
        } else {
            this.f22773e = new AsyncTaskC16040e(context, i2, i, this);
        }
        AsyncTaskC16040e asyncTaskC16040e = (AsyncTaskC16040e) this.f22773e;
        AbstractC9528e.startapp(asyncTaskC16040e);
        Uri uri2 = (Uri) this.f22771e;
        AbstractC9528e.startapp(uri2);
        asyncTaskC16040e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }
}
