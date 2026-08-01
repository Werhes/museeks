package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7031e extends AbstractC17065e {
    public static final C18482e purchase = new C18482e("MRDiscoveryCallback", null);
    public final C9271e appmetrica;
    public final Map metrica = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet license = new LinkedHashSet();
    public final Set vip = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final C16009e ad = new C16009e(this);

    public C7031e(Context context) {
        this.appmetrica = new C9271e(context);
    }

    public final void Signature() {
        int size = this.license.size();
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 33);
        sb.append("Starting RouteDiscovery with ");
        sb.append(size);
        sb.append(" IDs");
        C18482e c18482e = purchase;
        c18482e.vip(sb.toString(), new Object[0]);
        c18482e.vip("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.metrica.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            admob();
        } else {
            new HandlerC9134e(Looper.getMainLooper(), 6).post(new RunnableC10538e(this, 0));
        }
    }

    public final void admob() {
        C9271e c9271e = this.appmetrica;
        if (((C10085e) c9271e.f18485e) == null) {
            c9271e.f18485e = C10085e.license((Context) c9271e.f18486e);
        }
        C10085e c10085e = (C10085e) c9271e.f18485e;
        if (c10085e != null) {
            c10085e.yandex(this);
        }
        LinkedHashSet linkedHashSet = this.license;
        synchronized (linkedHashSet) {
            try {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String billing = AbstractC9764e.billing(str);
                    if (billing == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(billing)) {
                        arrayList.add(billing);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    C0056e c0056e = new C0056e(bundle, arrayList);
                    Map map = this.metrica;
                    if (((C15593e) map.get(str)) == null) {
                        map.put(str, new C15593e(c0056e));
                    }
                    C18482e c18482e = purchase;
                    String billing2 = AbstractC9764e.billing(str);
                    StringBuilder sb = new StringBuilder(billing2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(billing2);
                    c18482e.vip(sb.toString(), new Object[0]);
                    if (((C10085e) c9271e.f18485e) == null) {
                        c9271e.f18485e = C10085e.license((Context) c9271e.f18486e);
                    }
                    ((C10085e) c9271e.f18485e).ad(c0056e, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.metrica;
        purchase.vip("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }

    @Override // defpackage.AbstractC17065e
    public final void appmetrica(C10085e c10085e, C6541e c6541e) {
        purchase.vip("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        loadAd(c6541e, true);
    }

    @Override // defpackage.AbstractC17065e
    public final void license(C10085e c10085e, C6541e c6541e) {
        purchase.vip("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        loadAd(c6541e, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x019b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ae, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadAd(defpackage.C6541e r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7031e.loadAd(eؙِٞ, boolean):void");
    }

    @Override // defpackage.AbstractC17065e
    public final void yandex(C10085e c10085e, C6541e c6541e) {
        purchase.vip("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        loadAd(c6541e, false);
    }
}
