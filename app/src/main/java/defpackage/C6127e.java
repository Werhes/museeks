package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6127e {
    public final /* synthetic */ AbstractActivityC15824e yandex;
    public final LinkedHashMap ad = new LinkedHashMap();
    public final LinkedHashMap vip = new LinkedHashMap();
    public final LinkedHashMap metrica = new LinkedHashMap();
    public final ArrayList license = new ArrayList();
    public final transient LinkedHashMap appmetrica = new LinkedHashMap();
    public final LinkedHashMap purchase = new LinkedHashMap();
    public final Bundle billing = new Bundle();

    public C6127e(AbstractActivityC15824e abstractActivityC15824e) {
        this.yandex = abstractActivityC15824e;
    }

    public final boolean ad(int i, int i2, Intent intent) {
        String str = (String) this.ad.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C14633e c14633e = (C14633e) this.appmetrica.get(str);
        if ((c14633e != null ? c14633e.ad : null) != null) {
            ArrayList arrayList = this.license;
            if (arrayList.contains(str)) {
                c14633e.ad.purchase(c14633e.vip.adcel(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.purchase.remove(str);
        this.billing.putParcelable(str, new C13381e(intent, i2));
        return true;
    }

    public final void appmetrica(String str) {
        Integer num;
        if (!this.license.contains(str) && (num = (Integer) this.vip.remove(str)) != null) {
            this.ad.remove(num);
        }
        this.appmetrica.remove(str);
        LinkedHashMap linkedHashMap = this.purchase;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder applovin = AbstractC8703e.applovin("Dropping pending result for request ", str, ": ");
            applovin.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", applovin.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.billing;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C13381e) AbstractC9528e.amazon(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.metrica;
        C7758e c7758e = (C7758e) linkedHashMap2.get(str);
        if (c7758e != null) {
            ArrayList arrayList = c7758e.vip;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c7758e.ad.vip((InterfaceC12179e) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final void license(String str) {
        LinkedHashMap linkedHashMap = this.vip;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        C0743e c0743e = new C0743e(1);
        Iterator it = new C15006e(new C6993e(c0743e, new C17897e(12, c0743e), 0)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.ad;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final C15172e metrica(String str, C4094e c4094e, InterfaceC17091e interfaceC17091e) {
        license(str);
        this.appmetrica.put(str, new C14633e(interfaceC17091e, c4094e));
        LinkedHashMap linkedHashMap = this.purchase;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC17091e.purchase(obj);
        }
        Bundle bundle = this.billing;
        C13381e c13381e = (C13381e) AbstractC9528e.amazon(str, bundle);
        if (c13381e != null) {
            bundle.remove(str);
            interfaceC17091e.purchase(c4094e.adcel(c13381e.f26638e, c13381e.f26639e));
        }
        return new C15172e(this, str, c4094e, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void vip(int i, C4094e c4094e, Object obj) {
        C2362e c2362e;
        int i2;
        int i3 = c4094e.ad;
        int i4 = 3;
        Bundle bundle = null;
        AbstractActivityC15824e abstractActivityC15824e = this.yandex;
        switch (i3) {
            case 0:
                c2362e = null;
                break;
            case 1:
                c2362e = null;
                break;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    c2362e = new C2362e(i4, C9139e.f18290e);
                    break;
                } else {
                    for (String str : strArr) {
                        if (AbstractC10077e.appmetrica(abstractActivityC15824e, str) != 0) {
                            c2362e = null;
                            break;
                        }
                    }
                    int appmetrica = AbstractC10064e.appmetrica(strArr.length);
                    if (appmetrica < 16) {
                        appmetrica = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    c2362e = new C2362e(i4, linkedHashMap);
                    break;
                }
            case 3:
                if (AbstractC10077e.appmetrica(abstractActivityC15824e, (String) obj) == 0) {
                    c2362e = new C2362e(i4, Boolean.TRUE);
                    break;
                }
                c2362e = null;
                break;
            default:
                c2362e = null;
                break;
        }
        if (c2362e != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC16764e(this, i, c2362e, 1));
            return;
        }
        Intent license = c4094e.license(abstractActivityC15824e, obj);
        if (license.getExtras() != null && license.getExtras().getClassLoader() == null) {
            license.setExtrasClassLoader(abstractActivityC15824e.getClassLoader());
        }
        if (license.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = license.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            license.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(license.getAction())) {
            String[] stringArrayExtra = license.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC10077e.ads(abstractActivityC15824e, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(license.getAction())) {
            abstractActivityC15824e.startActivityForResult(license, i, bundle2);
            return;
        }
        C6307e c6307e = (C6307e) license.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
        } catch (IntentSender.SendIntentException e) {
            e = e;
            i2 = i;
        }
        try {
            abstractActivityC15824e.startIntentSenderForResult(c6307e.f13136e, i2, c6307e.f13134e, c6307e.f13133e, c6307e.f13135e, 0, bundle2);
            Unit unit = Unit.INSTANCE;
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            new Handler(Looper.getMainLooper()).post(new RunnableC16764e(this, i2, e, 2));
        }
    }
}
