package defpackage;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17606e extends LruCache {
    public final /* synthetic */ C9407e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17606e(C9407e c9407e) {
        super(20);
        this.ad = c9407e;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            ArrayList arrayList = this.ad.billing;
            AbstractC9528e.startapp(arrayList);
            arrayList.add(num);
        }
    }
}
