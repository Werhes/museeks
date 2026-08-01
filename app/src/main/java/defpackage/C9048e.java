package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۡٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9048e extends AbstractC1776e {
    public final Object metrica;
    public final /* synthetic */ int vip = 1;

    public C9048e(C0075e c0075e) {
        super(255);
        this.metrica = c0075e;
        c0075e.invoke(255);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9048e(defpackage.C0075e r1, byte r2) {
        /*
            r0 = this;
            r2 = 0
            r0.vip = r2
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.<init>(r2)
            r0.metrica = r1
            r1.invoke(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9048e.<init>(eؑؔۙ, byte):void");
    }

    public C9048e(Paint[] paintArr) {
        super(null);
        this.metrica = AbstractC6874e.startapp((Paint[]) Arrays.copyOf(paintArr, paintArr.length));
    }

    public final void appmetrica(Object obj) {
        switch (this.vip) {
            case 0:
                Float f = (Float) obj;
                if (((Float) this.ad).equals(f)) {
                    return;
                }
                this.ad = f;
                ((C0075e) this.metrica).invoke(f);
                return;
            case 1:
                Integer num = (Integer) obj;
                if (((Integer) this.ad).equals(num)) {
                    return;
                }
                this.ad = num;
                ((C0075e) this.metrica).invoke(num);
                return;
            default:
                ColorFilter colorFilter = (ColorFilter) obj;
                Iterator it = ((List) this.metrica).iterator();
                while (it.hasNext()) {
                    ((Paint) it.next()).setColorFilter(colorFilter);
                }
                this.ad = colorFilter;
                return;
        }
    }
}
