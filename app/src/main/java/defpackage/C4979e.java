package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4979e implements InterfaceC2994e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C4979e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC2994e
    public final void ad(Object obj) {
        HashMap hashMap;
        switch (this.ad) {
            case 0:
                ((C6736e) this.vip).startapp(obj);
                return;
            case 1:
                C18478e c18478e = (C18478e) this.vip;
                C0214e c0214e = (C0214e) obj;
                synchronized (((HashMap) c18478e.f36227e)) {
                    hashMap = new HashMap((HashMap) c18478e.f36227e);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    ((Executor) entry.getValue()).execute(new RunnableC7410e(entry, c0214e, 3));
                }
                return;
            default:
                ((C6846e) this.vip).invoke(obj);
                return;
        }
    }
}
