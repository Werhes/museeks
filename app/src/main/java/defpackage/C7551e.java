package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7551e {
    public final C14067e ad;
    public static final C11951e vip = new C11951e("fire-global");
    public static final C11951e metrica = new C11951e("fire-count");
    public static final C11951e license = new C11951e("last-used-date");

    public C7551e(Context context, String str) {
        this.ad = new C14067e(context, AbstractC17861e.Signature("FirebaseHeartBeat", str));
    }

    public final synchronized long ad(C0044e c0044e) {
        long j;
        try {
            Object obj = 0L;
            Object metrica2 = c0044e.metrica(metrica);
            if (metrica2 != null) {
                obj = metrica2;
            }
            long longValue = ((Long) obj).longValue();
            String str = BuildConfig.FLAVOR;
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : c0044e.ad().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = ((C11951e) entry.getKey()).ad;
                        hashSet = set;
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            c0044e.license(new C11951e(str), hashSet2);
            j = longValue - 1;
            c0044e.license(metrica, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized boolean adcel(long j) {
        C14067e c14067e = this.ad;
        c14067e.getClass();
        InterfaceC5083e interfaceC5083e = null;
        C10777e c10777e = new C10777e(c14067e, interfaceC5083e, 1);
        C2693e c2693e = C2693e.f6576e;
        if (purchase(((Long) AbstractC5336e.yandex(c2693e, c10777e)).longValue(), j)) {
            return false;
        }
        C14067e c14067e2 = this.ad;
        Long valueOf = Long.valueOf(j);
        c14067e2.getClass();
        return true;
    }

    public final synchronized void advert(long j) {
        this.ad.ad(new C14134e(j, 6));
    }

    public final synchronized C11951e appmetrica(C0044e c0044e, String str) {
        for (Map.Entry entry : c0044e.ad().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new C11951e(((C11951e) entry.getKey()).ad);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void billing() {
        this.ad.ad(new C9041e(this, license(System.currentTimeMillis()), 20));
    }

    public final synchronized String license(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized ArrayList metrica() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String license2 = license(System.currentTimeMillis());
            C14067e c14067e = this.ad;
            c14067e.getClass();
            for (Map.Entry entry : ((Map) AbstractC5336e.yandex(C2693e.f6576e, new C10777e(c14067e, null, 0))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(license2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C14984e(((C11951e) entry.getKey()).ad, new ArrayList(hashSet)));
                    }
                }
            }
            advert(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void mopub(long j, String str) {
        try {
            try {
                String license2 = license(j);
                C11951e c11951e = new C11951e(str);
                this.ad.ad(new C17819e(this, license2, str, c11951e, 5));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized boolean purchase(long j, long j2) {
        return license(j).equals(license(j2));
    }

    public final synchronized boolean startapp(long j) {
        return adcel(j);
    }

    public final synchronized void vip() {
        this.ad.ad(new C10739e(29, this));
    }

    public final synchronized void yandex(C0044e c0044e, String str) {
        C11951e appmetrica = appmetrica(c0044e, str);
        if (appmetrica == null) {
            return;
        }
        Object hashSet = new HashSet();
        Object metrica2 = c0044e.metrica(appmetrica);
        if (metrica2 != null) {
            hashSet = metrica2;
        }
        HashSet hashSet2 = new HashSet((Collection) hashSet);
        hashSet2.remove(str);
        if (hashSet2.isEmpty()) {
            c0044e.vip();
            c0044e.ad.remove(appmetrica);
        } else {
            c0044e.license(appmetrica, hashSet2);
        }
    }
}
