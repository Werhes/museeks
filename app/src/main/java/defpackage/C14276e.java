package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eٓ۠ؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14276e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12092e f28245e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28246e;

    public /* synthetic */ C14276e(C12092e c12092e, int i) {
        this.f28246e = i;
        this.f28245e = c12092e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28246e) {
            case 0:
                return AbstractC13480e.m3582e(AbstractC7762e.Signature(AbstractC7762e.loadAd(AbstractC7762e.adcel(AbstractC1660e.billing(this.f28245e.loadAd.ad.getDeclaredClasses()), C8865e.f17814e), C8865e.f17819e)));
            case 1:
                List ad = this.f28245e.loadAd.ad();
                ArrayList arrayList = new ArrayList();
                for (Object obj : ad) {
                    if (((C1214e) obj).ad.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(arrayList, 10));
                if (appmetrica < 16) {
                    appmetrica = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((C1214e) next).vip(), next);
                }
                return linkedHashMap;
            default:
                C12092e c12092e = this.f28245e;
                return AbstractC4511e.loadAd(c12092e.vip(), c12092e.billing());
        }
    }
}
