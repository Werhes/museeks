package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9576e implements InterfaceC6343e {
    public final C16417e ad;
    public int appmetrica;
    public C3862e metrica;
    public boolean purchase;
    public final Object vip = new Object();
    public final ArrayList license = new ArrayList();

    public C9576e(C9872e c9872e, C16417e c16417e) {
        this.ad = c16417e;
    }

    @Override // defpackage.InterfaceC6343e
    public final void ad(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Set<Set> appmetrica = AbstractC17861e.appmetrica(this.ad);
            if (appmetrica == null) {
                appmetrica = C3295e.f7451e;
            }
            for (Set set : appmetrica) {
                Set set2 = set;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5060e) it.next()).ad);
                }
                Set m3582e = AbstractC13480e.m3582e(arrayList);
                if (list.containsAll(m3582e)) {
                    List m3575continue = AbstractC13480e.m3575continue(set);
                    if (m3575continue.size() >= 2) {
                        String str = ((C5060e) m3575continue.get(0)).ad;
                        String str2 = ((C5060e) m3575continue.get(1)).ad;
                        try {
                            if (AbstractC6286e.adcel(this.ad, str) && AbstractC6286e.adcel(this.ad, str2)) {
                                linkedHashSet.add(set);
                                if (!linkedHashMap.containsKey(str)) {
                                    linkedHashMap.put(str, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str)).add(str2);
                                if (!linkedHashMap.containsKey(str2)) {
                                    linkedHashMap.put(str2, new ArrayList());
                                }
                                ((List) linkedHashMap.get(str2)).add(str);
                            }
                        } catch (C4573e e) {
                            if (AbstractC9464e.admob()) {
                                Log.w("CXCP", "Skipping incompatible concurrent pair: " + set + " due to " + e.getMessage());
                            }
                        }
                    }
                } else if (AbstractC9464e.admob()) {
                    Log.w("CXCP", "Failed to retrieve concurrent camera: " + m3582e + " from " + list);
                }
            }
            synchronized (this.vip) {
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            throw new Exception("Failed to retrieve concurrent camera id info for camera-pipe.", e2);
        }
    }

    public final void license() {
        synchronized (this.vip) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eٍٍٛ] */
    public final void metrica(C3862e c3862e) {
        ?? r0;
        synchronized (this.vip) {
            this.metrica = c3862e;
            Unit unit = Unit.INSTANCE;
        }
        ArrayList metrica = AbstractC17861e.metrica(this.ad);
        if (metrica != null) {
            r0 = new ArrayList(AbstractC0746e.subscription(metrica, 10));
            Iterator it = metrica.iterator();
            while (it.hasNext()) {
                r0.add(((C5060e) it.next()).ad);
            }
        } else {
            r0 = C13664e.f27089e;
        }
        ad(r0);
    }

    public final int vip() {
        int i;
        synchronized (this.vip) {
            i = this.appmetrica;
        }
        return i;
    }
}
