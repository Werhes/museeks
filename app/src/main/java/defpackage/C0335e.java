package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335e {
    public static final C0335e license = new C0335e(new long[0], new RemoteViews[0], 1);
    public final long[] ad;
    public final int metrica;
    public final RemoteViews[] vip;

    public C0335e(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.ad = jArr;
        this.vip = remoteViewsArr;
        this.metrica = i;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC13480e.premium(arrayList).size();
        if (size <= this.metrica) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.metrica + ", but the collection contains " + size + " different layout ids").toString());
    }
}
