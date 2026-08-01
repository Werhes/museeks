package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12173e extends AbstractC9594e implements InterfaceC8149e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f24471e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C5152e f24472e = C5152e.metrica;

    public final void purchase(AbstractC0641e abstractC0641e) {
        C15497e c15497e;
        if (!this.f24471e) {
            this.f24472e = this.f24472e.clone();
            this.f24471e = true;
        }
        C5152e c5152e = this.f24472e;
        C5152e c5152e2 = abstractC0641e.f2878e;
        c5152e.getClass();
        int i = 0;
        while (true) {
            c15497e = c5152e2.ad;
            if (i >= c15497e.f30613e.size()) {
                break;
            }
            c5152e.billing((Map.Entry) c15497e.f30613e.get(i));
            i++;
        }
        Iterator it = c15497e.metrica().iterator();
        while (it.hasNext()) {
            c5152e.billing((Map.Entry) it.next());
        }
    }
}
