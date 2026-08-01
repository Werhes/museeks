package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4083e extends OrientationEventListener {
    public final /* synthetic */ C4909e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4083e(Context context, C4909e c4909e) {
        super(context);
        this.ad = c4909e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0024, code lost:
    
        if (r4 < 315) goto L46;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r4) {
        /*
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L5
            goto L89
        L5:
            eٕؗٗ r1 = r3.ad
            int r2 = r1.license
            if (r2 != r0) goto L27
            r0 = 45
            if (r4 < 0) goto L12
            if (r4 >= r0) goto L12
            goto L36
        L12:
            r1 = 135(0x87, float:1.89E-43)
            if (r0 > r4) goto L19
            if (r4 >= r1) goto L19
            goto L40
        L19:
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 > r4) goto L20
            if (r4 >= r0) goto L20
            goto L4a
        L20:
            if (r0 > r4) goto L36
            r0 = 315(0x13b, float:4.41E-43)
            if (r4 >= r0) goto L36
            goto L54
        L27:
            if (r4 < 0) goto L2e
            r0 = 40
            if (r4 >= r0) goto L2e
            goto L36
        L2e:
            r0 = 320(0x140, float:4.48E-43)
            if (r0 > r4) goto L38
            r0 = 360(0x168, float:5.04E-43)
            if (r4 >= r0) goto L38
        L36:
            r4 = 0
            goto L58
        L38:
            r0 = 50
            if (r0 > r4) goto L42
            r0 = 130(0x82, float:1.82E-43)
            if (r4 >= r0) goto L42
        L40:
            r4 = 3
            goto L58
        L42:
            r0 = 140(0x8c, float:1.96E-43)
            if (r0 > r4) goto L4c
            r0 = 220(0xdc, float:3.08E-43)
            if (r4 >= r0) goto L4c
        L4a:
            r4 = 2
            goto L58
        L4c:
            r0 = 230(0xe6, float:3.22E-43)
            if (r0 > r4) goto L56
            r0 = 310(0x136, float:4.34E-43)
            if (r4 >= r0) goto L56
        L54:
            r4 = 1
            goto L58
        L56:
            int r4 = r1.license
        L58:
            eٕؗٗ r0 = r3.ad
            int r1 = r0.license
            if (r1 == r4) goto L89
            r0.license = r4
            java.lang.Object r1 = r0.ad
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r0.metrica     // Catch: java.lang.Throwable -> L86
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L86
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L86
            java.util.List r0 = defpackage.AbstractC13480e.m3575continue(r0)     // Catch: java.lang.Throwable -> L86
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L86
            monitor-exit(r1)
            java.util.Iterator r0 = r0.iterator()
        L76:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r0.next()
            eٌَِ r1 = (defpackage.C8635e) r1
            r1.ad(r4)
            goto L76
        L86:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4083e.onOrientationChanged(int):void");
    }
}
