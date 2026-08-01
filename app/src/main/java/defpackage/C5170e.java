package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.view.Display;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5170e implements InterfaceC9274e, InterfaceC1598e, InterfaceC13730e, InterfaceC0774e, InterfaceC11962e, InterfaceC15316e, InterfaceC14165e, InterfaceC11628e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C5170e f11055e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C5170e f11056e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C5170e f11057e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile String f11058e = "";

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C5170e f11059e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C5170e f11060e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C5170e f11061e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C5170e f11062e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C5170e f11063e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C5170e f11064e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C5170e f11065e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C5170e f11066e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C5170e f11067e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C5170e f11068e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C5170e f11069e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C5170e f11070e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C5170e f11071e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C5170e f11072e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C5170e f11073e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C5170e f11074e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C5170e f11075e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C5170e f11076e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C5170e f11077e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final /* synthetic */ C5170e f11078e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11079e;

    static {
        byte b = 0;
        f11063e = new C5170e(b, 0);
        f11072e = new C5170e(b, 1);
        f11055e = new C5170e(b, 2);
        f11077e = new C5170e(b, 3);
        f11076e = new C5170e(b, 4);
        f11067e = new C5170e(b, 5);
        f11074e = new C5170e(b, 6);
        f11059e = new C5170e(b, 7);
        f11068e = new C5170e(b, 8);
        f11057e = new C5170e(b, 9);
        f11056e = new C5170e(b, 10);
        f11061e = new C5170e(b, 11);
        f11065e = new C5170e(b, 12);
        f11066e = new C5170e(b, 13);
        f11064e = new C5170e(b, 14);
        f11062e = new C5170e(b, 15);
        f11071e = new C5170e(b, 16);
        f11078e = new C5170e(b, 17);
        f11060e = new C5170e(b, 18);
        f11070e = new C5170e(b, 19);
        f11073e = new C5170e(b, 20);
        f11075e = new C5170e(b, 21);
        f11069e = new C5170e(b, 22);
    }

    public /* synthetic */ C5170e(byte b, int i) {
        this.f11079e = i;
    }

    public C5170e(int i) {
        int i2;
        this.f11079e = 24;
        HashMap hashMap = new HashMap();
        int i3 = i - 2;
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i3);
        int mopub = AbstractC6143e.mopub(-i);
        for (int i4 = 1; i4 < numberOfLeadingZeros; i4++) {
            int i5 = 1 << (i4 - 1);
            if (i5 >= 64 && !hashMap.containsKey(Integer.valueOf(i5))) {
                hashMap.put(Integer.valueOf(i5), Integer.valueOf(mopub(i, mopub, i5)));
            }
            int i6 = 1 << i4;
            if ((i3 & i6) != 0 && (i2 = (i6 - 1) & i3) >= 64 && !hashMap.containsKey(Integer.valueOf(i2))) {
                hashMap.put(Integer.valueOf(i2), Integer.valueOf(mopub(i, mopub, i2)));
            }
        }
    }

    public static InterfaceC4752e Signature(InterfaceC5876e interfaceC5876e, InterfaceC9905e interfaceC9905e, InterfaceC9905e interfaceC9905e2) {
        InterfaceC9905e remoteconfig;
        int purchase = interfaceC5876e.purchase(interfaceC9905e);
        int i = 0;
        while (true) {
            if (i >= purchase) {
                return null;
            }
            InterfaceC0023e mo1255e = interfaceC5876e.mo1255e(interfaceC9905e, i);
            InterfaceC0023e interfaceC0023e = interfaceC5876e.adcel(mo1255e) ? null : mo1255e;
            if (interfaceC0023e != null && (remoteconfig = interfaceC5876e.remoteconfig(interfaceC0023e)) != null) {
                boolean z = interfaceC5876e.mo1241else(interfaceC5876e.firebase(remoteconfig)) && interfaceC5876e.mo1241else(interfaceC5876e.firebase(interfaceC9905e2));
                if (remoteconfig.equals(interfaceC9905e2) || (z && AbstractC7890e.billing(interfaceC5876e.mo1238const(remoteconfig), interfaceC5876e.mo1238const(interfaceC9905e2)))) {
                    break;
                }
                InterfaceC4752e Signature = Signature(interfaceC5876e, remoteconfig, interfaceC9905e2);
                if (Signature != null) {
                    return Signature;
                }
            }
            i++;
        }
        return interfaceC5876e.mo1282synchronized(interfaceC5876e.mo1238const(interfaceC9905e), i);
    }

    public static boolean adcel(C17611e c17611e, InterfaceC9905e interfaceC9905e, InterfaceC9905e interfaceC9905e2) {
        C13520e c13520e = c17611e.appmetrica;
        C10990e c10990e = c17611e.license;
        InterfaceC5876e interfaceC5876e = c17611e.metrica;
        if (interfaceC9905e == interfaceC9905e2) {
            return true;
        }
        if (admob(interfaceC5876e, interfaceC9905e) && admob(interfaceC5876e, interfaceC9905e2)) {
            c13520e.getClass();
            AbstractC15728e loadAd = c10990e.loadAd((AbstractC1186e) interfaceC9905e);
            c13520e.getClass();
            AbstractC15728e loadAd2 = c10990e.loadAd((AbstractC1186e) interfaceC9905e2);
            InterfaceC14822e firebase = interfaceC5876e.firebase(loadAd);
            if (!interfaceC5876e.mo1277return(interfaceC5876e.mo1238const(loadAd), interfaceC5876e.mo1238const(loadAd2))) {
                return false;
            }
            if (interfaceC5876e.purchase(firebase) == 0) {
                return interfaceC5876e.premium(loadAd) || interfaceC5876e.premium(loadAd2) || interfaceC5876e.mo1260e(firebase) == interfaceC5876e.mo1260e(interfaceC5876e.firebase(loadAd2));
            }
        }
        C5170e c5170e = f11072e;
        return remoteconfig(c5170e, c17611e, interfaceC9905e, interfaceC9905e2) && remoteconfig(c5170e, c17611e, interfaceC9905e2, interfaceC9905e);
    }

    public static boolean admob(InterfaceC5876e interfaceC5876e, InterfaceC9905e interfaceC9905e) {
        if (!interfaceC5876e.mo1267goto(interfaceC5876e.mo1238const(interfaceC9905e))) {
            return false;
        }
        interfaceC5876e.subscription(interfaceC9905e);
        return (interfaceC5876e.mo1287try(interfaceC9905e) || interfaceC5876e.mo1281switch(interfaceC9905e) || interfaceC5876e.mo1247e(interfaceC9905e)) ? false : true;
    }

    public static String advert() {
        return loadAd(16) + ':' + loadAd(32);
    }

    public static List appmetrica(C17611e c17611e, InterfaceC5876e interfaceC5876e, InterfaceC14822e interfaceC14822e, InterfaceC10269e interfaceC10269e) {
        AbstractC0181e mo1268implements;
        C11803e c11803e = C11803e.adcel;
        interfaceC5876e.getClass();
        if (interfaceC5876e.inmobi(interfaceC10269e) || !interfaceC5876e.ads(interfaceC14822e)) {
            if (!interfaceC5876e.mo1246e(interfaceC10269e)) {
                C15587e c15587e = new C15587e();
                c17611e.vip();
                InterfaceC5876e interfaceC5876e2 = c17611e.metrica;
                ArrayDeque arrayDeque = c17611e.billing;
                C7495e c7495e = c17611e.yandex;
                arrayDeque.push(interfaceC14822e);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC14822e interfaceC14822e2 = (InterfaceC14822e) arrayDeque.pop();
                    if (c7495e.add(interfaceC14822e2)) {
                        InterfaceC14822e mo1266for = interfaceC5876e.mo1266for(interfaceC14822e2);
                        if (mo1266for == null) {
                            mo1266for = interfaceC14822e2;
                        }
                        if (interfaceC5876e.mo1277return(interfaceC5876e.mo1272native(mo1266for), interfaceC10269e)) {
                            c15587e.add(mo1266for);
                            mo1268implements = c11803e;
                        } else {
                            mo1268implements = interfaceC5876e.purchase(mo1266for) == 0 ? C11803e.startapp : interfaceC5876e2.mo1268implements(mo1266for);
                        }
                        if (mo1268implements.equals(c11803e)) {
                            mo1268implements = null;
                        }
                        if (mo1268implements != null) {
                            Iterator it = interfaceC5876e2.mo1271interface(interfaceC5876e2.mo1272native(interfaceC14822e2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(mo1268implements.license(c17611e, (InterfaceC9905e) it.next()));
                            }
                        }
                    }
                }
                c17611e.ad();
                return c15587e;
            }
            if (interfaceC5876e.mo1277return(interfaceC5876e.mo1272native(interfaceC14822e), interfaceC10269e)) {
                InterfaceC14822e mo1266for2 = interfaceC5876e.mo1266for(interfaceC14822e);
                if (mo1266for2 != null) {
                    interfaceC14822e = mo1266for2;
                }
                return Collections.singletonList(interfaceC14822e);
            }
        }
        return C13664e.f27089e;
    }

    public static final boolean license(InterfaceC5876e interfaceC5876e, C17611e c17611e, InterfaceC14822e interfaceC14822e, InterfaceC14822e interfaceC14822e2, boolean z) {
        Collection<InterfaceC9905e> mo1235case = interfaceC5876e.mo1235case(interfaceC14822e);
        if ((mo1235case instanceof Collection) && mo1235case.isEmpty()) {
            return false;
        }
        for (InterfaceC9905e interfaceC9905e : mo1235case) {
            if (AbstractC7890e.billing(interfaceC5876e.mo1238const(interfaceC9905e), interfaceC5876e.mo1272native(interfaceC14822e2))) {
                return true;
            }
            if (z && remoteconfig(f11072e, c17611e, interfaceC14822e2, interfaceC9905e)) {
                return true;
            }
        }
        return false;
    }

    public static String loadAd(int i) {
        ArrayList m3588implements = AbstractC13480e.m3588implements(new AbstractC9848e('a', 'z'), new AbstractC9848e('0', '9'));
        C11241e c11241e = new C11241e(1, i, 1);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c11241e, 10));
        Iterator it = c11241e.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                return AbstractC13480e.m3608try(arrayList, BuildConfig.FLAVOR, null, null, null, 62);
            }
            c3296e.nextInt();
            AbstractC5427e abstractC5427e = AbstractC15440e.f30517e;
            Character ch = (Character) AbstractC13480e.m3601super(m3588implements);
            ch.getClass();
            arrayList.add(ch);
        }
    }

    public static final boolean metrica(InterfaceC5876e interfaceC5876e, InterfaceC14822e interfaceC14822e) {
        InterfaceC9905e remoteconfig;
        InterfaceC14822e mo1279strictfp;
        return interfaceC5876e.mo1240default(interfaceC14822e) || ((interfaceC14822e instanceof InterfaceC12198e) && (remoteconfig = interfaceC5876e.remoteconfig(interfaceC5876e.mo1270instanceof(interfaceC5876e.signatures((InterfaceC12198e) interfaceC14822e)))) != null && (mo1279strictfp = interfaceC5876e.mo1279strictfp(remoteconfig)) != null && interfaceC5876e.mo1240default(mo1279strictfp));
    }

    public static int mopub(int i, int i2, int i3) {
        int i4 = 1;
        while (i3 >= 32) {
            i4 = (int) ((((4294967295L & (i2 * i4)) * i) + i4) >>> 32);
            i3 -= 32;
        }
        if (i3 <= 0) {
            return i4;
        }
        return (int) ((((4294967295L & ((i2 * i4) & ((-1) >>> (-i3)))) * i) + i4) >>> i3);
    }

    public static void pro(InterfaceC5876e interfaceC5876e, InterfaceC9905e interfaceC9905e, InterfaceC9905e interfaceC9905e2) {
        InterfaceC14822e mo1239continue = interfaceC5876e.mo1239continue(interfaceC9905e);
        if (mo1239continue instanceof InterfaceC12198e) {
            InterfaceC12198e interfaceC12198e = (InterfaceC12198e) mo1239continue;
            if (!interfaceC5876e.billing(interfaceC12198e) && interfaceC5876e.adcel(interfaceC5876e.mo1270instanceof(interfaceC5876e.signatures(interfaceC12198e))) && interfaceC5876e.mo1284throw(interfaceC12198e) == 1) {
                interfaceC5876e.mo1238const(interfaceC9905e2);
            }
        }
    }

    public static List purchase(C17611e c17611e, InterfaceC5876e interfaceC5876e, InterfaceC14822e interfaceC14822e, InterfaceC10269e interfaceC10269e) {
        int i;
        List appmetrica = appmetrica(c17611e, interfaceC5876e, interfaceC14822e, interfaceC10269e);
        if (appmetrica.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : appmetrica) {
                InterfaceC13961e mo1262e = interfaceC5876e.mo1262e((InterfaceC14822e) obj);
                int mopub = interfaceC5876e.mopub(mo1262e);
                while (true) {
                    if (i >= mopub) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC9905e remoteconfig = interfaceC5876e.remoteconfig(interfaceC5876e.mo1245e(mo1262e, i));
                    i = (remoteconfig != null ? interfaceC5876e.mo1265finally(remoteconfig) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return appmetrica;
    }

    public static boolean remoteconfig(C5170e c5170e, C17611e c17611e, InterfaceC9905e interfaceC9905e, InterfaceC9905e interfaceC9905e2) {
        if (interfaceC9905e == interfaceC9905e2) {
            return true;
        }
        c17611e.getClass();
        return f11072e.billing(c17611e, c17611e.metrica, interfaceC9905e, interfaceC9905e2);
    }

    public static boolean subscription(C17611e c17611e, InterfaceC5876e interfaceC5876e, InterfaceC13961e interfaceC13961e, InterfaceC14822e interfaceC14822e) {
        boolean remoteconfig;
        InterfaceC10269e mo1272native = interfaceC5876e.mo1272native(interfaceC14822e);
        int mopub = interfaceC5876e.mopub(interfaceC13961e);
        int mo1273new = interfaceC5876e.mo1273new(mo1272native);
        if (mopub == mo1273new && mopub == interfaceC5876e.purchase(interfaceC14822e)) {
            for (int i = 0; i < mo1273new; i++) {
                InterfaceC0023e mo1255e = interfaceC5876e.mo1255e(interfaceC14822e, i);
                InterfaceC9905e remoteconfig2 = interfaceC5876e.remoteconfig(mo1255e);
                if (remoteconfig2 != null) {
                    InterfaceC0023e mo1245e = interfaceC5876e.mo1245e(interfaceC13961e, i);
                    interfaceC5876e.advert(mo1245e);
                    InterfaceC9905e remoteconfig3 = interfaceC5876e.remoteconfig(mo1245e);
                    int crashlytics = interfaceC5876e.crashlytics(interfaceC5876e.mo1282synchronized(mo1272native, i));
                    int advert = interfaceC5876e.advert(mo1255e);
                    if (crashlytics == 3) {
                        crashlytics = advert;
                    } else if (advert != 3 && crashlytics != advert) {
                        crashlytics = 0;
                    }
                    if (crashlytics == 0) {
                        return c17611e.ad;
                    }
                    if (crashlytics == 3) {
                        pro(interfaceC5876e, remoteconfig3, remoteconfig2);
                        pro(interfaceC5876e, remoteconfig2, remoteconfig3);
                    }
                    int i2 = c17611e.purchase;
                    if (i2 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + remoteconfig3).toString());
                    }
                    c17611e.purchase = i2 + 1;
                    int m2467class = AbstractC8703e.m2467class(crashlytics);
                    C5170e c5170e = f11072e;
                    if (m2467class == 0) {
                        remoteconfig = remoteconfig(c5170e, c17611e, remoteconfig2, remoteconfig3);
                    } else if (m2467class == 1) {
                        remoteconfig = remoteconfig(c5170e, c17611e, remoteconfig3, remoteconfig2);
                    } else {
                        if (m2467class != 2) {
                            throw new C14803e(10);
                        }
                        remoteconfig = adcel(c17611e, remoteconfig3, remoteconfig2);
                    }
                    c17611e.purchase--;
                    if (!remoteconfig) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static C5170e yandex(Context context, int i) {
        AbstractC4265e.license(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC11408e.signatures);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC2774e.license(context, obtainStyledAttributes, 4);
        AbstractC2774e.license(context, obtainStyledAttributes, 9);
        AbstractC2774e.license(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C15339e.ad(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0685e(0)).ad();
        obtainStyledAttributes.recycle();
        C5170e c5170e = new C5170e((byte) 0, 25);
        AbstractC4265e.purchase(rect.left);
        AbstractC4265e.purchase(rect.top);
        AbstractC4265e.purchase(rect.right);
        AbstractC4265e.purchase(rect.bottom);
        return c5170e;
    }

    @Override // defpackage.InterfaceC15316e
    public void ad(C7971e c7971e) {
        C11125e c11125e = (C11125e) c7971e.loadAd();
        Parcel m4156e = c11125e.m4156e();
        int i = AbstractC0923e.ad;
        m4156e.writeInt(1);
        AbstractC16852e.ads(m4156e, AbstractC16852e.applovin(m4156e, 20293));
        c11125e.m4153e(m4156e, 2010);
    }

    public synchronized String amazon() {
        synchronized (C5170e.class) {
            try {
                if (f11058e.length() > 0) {
                    return f11058e;
                }
                C14027e c14027e = C14027e.ad;
                c14027e.getClass();
                C15024e c15024e = C14027e.license;
                InterfaceC8614e[] interfaceC8614eArr = C14027e.vip;
                InterfaceC8614e interfaceC8614e = interfaceC8614eArr[1];
                f11058e = (String) c15024e.tapsense(c14027e);
                if (f11058e.length() == 0) {
                    f11058e = advert();
                    String str = f11058e;
                    InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[1];
                    ((SharedPreferences) c15024e.f29788e).edit().putString((String) c15024e.f29787e, str).apply();
                }
                return f11058e;
            } catch (Exception unused) {
                return BuildConfig.FLAVOR;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x025a, code lost:
    
        r9 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0258, code lost:
    
        if (license(r21, r20, r2, r3, true) != false) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033d  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.AbstractCollection, eْٓۦ, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean billing(defpackage.C17611e r20, defpackage.InterfaceC5876e r21, defpackage.InterfaceC9905e r22, defpackage.InterfaceC9905e r23) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5170e.billing(eًؚ٘, eؘۙۘ, eٍۦٖ, eٍۦٖ):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        InterfaceC5083e interfaceC5083e = null;
        switch (this.f11079e) {
            case 9:
                c9398e.f18710e.mopub(C13886e.f27539e, new C11656e((Function2) abstractC7185e, interfaceC5083e, 1));
                return;
            default:
                Function3 function3 = (Function3) abstractC7185e;
                C11672e c11672e = C8007e.vip;
                C8208e c8208e = AbstractC5341e.ad;
                C5874e c5874e = (C5874e) c9398e.f18705e.purchase(AbstractC5341e.ad);
                Object purchase = c5874e != null ? c5874e.purchase(C8007e.metrica) : null;
                if (purchase != null) {
                    ((C8007e) purchase).ad.add(new C14566e(function3, c9398e, interfaceC5083e, 3));
                    return;
                }
                throw new IllegalStateException("Plugin " + c11672e + " is not installed. Consider using `install(" + C8007e.metrica + ")` in client config first.");
        }
    }

    @Override // defpackage.InterfaceC9274e
    public Rect isVip(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!AbstractC12026e.Signature(activity)) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    @Override // defpackage.InterfaceC11628e
    public Iterable smaato(Object obj) {
        Collection mo337finally;
        InterfaceC0390e interfaceC0390e = (InterfaceC0390e) obj;
        return (interfaceC0390e == null || (mo337finally = interfaceC0390e.mo337finally()) == null) ? C13664e.f27089e : mo337finally;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        if (defpackage.AbstractC15448e.ad(defpackage.C14427e.ad, r0) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (((defpackage.C4199e) r9).m1505e(r1, r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r9 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startapp(long r7, defpackage.AbstractC10731e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.C4264e
            if (r0 == 0) goto L13
            r0 = r9
            eؖٞۜ r0 = (defpackage.C4264e) r0
            int r1 = r0.f9351e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9351e = r1
            goto L18
        L13:
            eؖٞۜ r0 = new eؖٞۜ
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f9349e
            int r1 = r0.f9351e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L41
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.AbstractC2003e.purchase(r9)
            goto L76
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            long r7 = r0.f9350e
            defpackage.AbstractC2003e.purchase(r9)
            goto L67
        L3b:
            long r7 = r0.f9350e
            defpackage.AbstractC2003e.purchase(r9)
            goto L53
        L41:
            defpackage.AbstractC2003e.purchase(r9)
            eًۚ r9 = defpackage.C18353e.ad
            r0.f9350e = r7
            r0.f9351e = r4
            eۣۡ r9 = defpackage.C18353e.vip
            java.lang.Object r9 = r9.m4501e(r0)
            if (r9 != r5) goto L53
            goto L75
        L53:
            eّؖٚ r9 = (defpackage.C4199e) r9
            eُٓٞ r1 = new eُٓٞ
            r4 = 11
            r1.<init>(r7, r4)
            r0.f9350e = r7
            r0.f9351e = r3
            java.lang.Object r9 = r9.m1505e(r1, r0)
            if (r9 != r5) goto L67
            goto L75
        L67:
            eؘۢؕ r9 = defpackage.AbstractC15448e.ad
            r0.f9350e = r7
            r0.f9351e = r2
            eٔؐٔ r7 = defpackage.C14427e.ad
            java.lang.Object r7 = defpackage.AbstractC15448e.ad(r7, r0)
            if (r7 != r5) goto L76
        L75:
            return r5
        L76:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5170e.startapp(long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5170e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f11079e) {
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC13730e
    public int vip(C14856e c14856e, int i) {
        return i;
    }
}
