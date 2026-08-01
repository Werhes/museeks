package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٝٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12613e extends OrientationEventListener {
    public int ad;
    public final /* synthetic */ C0912e vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12613e(C0912e c0912e, Context context) {
        super(context);
        this.vip = c0912e;
        this.ad = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i == -1) {
            return;
        }
        int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
        if (this.ad != i2) {
            this.ad = i2;
            synchronized (this.vip.f3332e) {
                arrayList = new ArrayList(((HashMap) this.vip.f3333e).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C8565e c8565e = (C8565e) it.next();
                c8565e.vip.execute(new RunnableC9766e(c8565e, i2, 10));
            }
        }
    }
}
