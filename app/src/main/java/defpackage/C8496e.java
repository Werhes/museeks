package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8496e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f17294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8496e(int i) {
        super(10);
        this.f17294e = i;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eؘٙؓ */
    public final Object mo1317e(Object obj) {
        switch (this.f17294e) {
            case 0:
                C2316e metrica = C2316e.metrica();
                return new C10682e(metrica.vip(), (C6043e) metrica.ad(C6043e.class), new C13755e(C2316e.metrica().vip(), (C9257e) obj));
            case 1:
                C2316e metrica2 = C2316e.metrica();
                Context vip = C2316e.metrica().vip();
                ArrayList arrayList = new ArrayList();
                C7936e c7936e = new C7936e(23);
                C12664e c12664e = C12664e.appmetrica;
                C6553e.vip(vip);
                C6553e.ad().metrica(c12664e);
                C12664e.license.contains(new C12007e("json"));
                arrayList.add(c7936e);
                return new C3842e(metrica2.vip(), (C6043e) metrica2.ad(C6043e.class));
            default:
                C6758e c6758e = (C6758e) obj;
                C2316e metrica3 = C2316e.metrica();
                return new C17856e(metrica3.vip(), (C6043e) metrica3.ad(C6043e.class), new C1534e(C2316e.metrica().vip(), c6758e), c6758e.ad);
        }
    }
}
