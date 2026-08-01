package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5665e {
    public final String ad;
    public final C4731e adcel;
    public Executor appmetrica;
    public boolean billing;
    public Executor license;
    public ArrayList metrica;
    public HashSet mopub;
    public InterfaceC2276e purchase;
    public boolean startapp;
    public final Context vip;
    public boolean yandex = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [eًؗؕ, java.lang.Object] */
    public C5665e(Context context, String str) {
        this.vip = context;
        this.ad = str;
        ?? obj = new Object();
        obj.ad = new HashMap();
        this.adcel = obj;
    }

    public final void ad(AbstractC13287e... abstractC13287eArr) {
        if (this.mopub == null) {
            this.mopub = new HashSet();
        }
        for (AbstractC13287e abstractC13287e : abstractC13287eArr) {
            this.mopub.add(Integer.valueOf(abstractC13287e.ad));
            this.mopub.add(Integer.valueOf(abstractC13287e.vip));
        }
        C4731e c4731e = this.adcel;
        c4731e.getClass();
        for (AbstractC13287e abstractC13287e2 : abstractC13287eArr) {
            int i = abstractC13287e2.ad;
            int i2 = abstractC13287e2.vip;
            HashMap hashMap = c4731e.ad;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i), treeMap);
            }
            AbstractC13287e abstractC13287e3 = (AbstractC13287e) treeMap.get(Integer.valueOf(i2));
            if (abstractC13287e3 != null) {
                Log.w("ROOM", "Overriding migration " + abstractC13287e3 + " with " + abstractC13287e2);
            }
            treeMap.put(Integer.valueOf(i2), abstractC13287e2);
        }
    }
}
