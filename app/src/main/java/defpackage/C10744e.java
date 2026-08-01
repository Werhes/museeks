package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10744e extends AbstractC13795e {
    public static final C10744e appmetrica;
    public static final C7056e[] license = {C7056e.yandex};
    public static final C10744e purchase;

    /* JADX WARN: Type inference failed for: r0v4, types: [eٓؗ۠, eُؒٛ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eٓؗ۠, eُؒٛ] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eٓؗ۠, eٌؙۘ] */
    /* JADX WARN: Type inference failed for: r6v0, types: [eٓؗ۠, eٌؙۘ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eٓؗ۠, eُؒٛ] */
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC12359e.class);
        arrayList.add(AbstractC16725e.class);
        appmetrica = new AbstractC13795e(arrayList, true);
        arrayList.clear();
        arrayList.add(AbstractC3291e.class);
        arrayList.add(AbstractC7168e.class);
        arrayList.add(AbstractC13214e.class);
        arrayList.add(AbstractC0156e.class);
        ?? abstractC13795e = new AbstractC13795e(arrayList, true);
        ?? abstractC13795e2 = new AbstractC13795e(arrayList, true);
        ?? abstractC13795e3 = new AbstractC13795e(arrayList, true);
        purchase = abstractC13795e3;
        abstractC13795e3.appmetrica(abstractC13795e);
        arrayList.add(AbstractC12359e.class);
        arrayList.add(AbstractC16725e.class);
        arrayList.add(AbstractC3975e.class);
        arrayList.add(AbstractC13907e.class);
        arrayList.add(AbstractC11707e.class);
        new AbstractC13795e(arrayList, false).appmetrica(abstractC13795e2);
    }

    @Override // defpackage.InterfaceC8572e
    public final C7056e[] ad() {
        return (C7056e[]) license.clone();
    }

    public final void appmetrica(C8927e c8927e) {
        for (C7056e c7056e : c8927e.ad()) {
            this.vip.put(c7056e, c8927e);
        }
    }

    @Override // defpackage.AbstractC13795e
    public final AbstractC8578e metrica(long j, BigInteger bigInteger, C2527e c2527e) {
        long appmetrica2 = AbstractC12394e.appmetrica(c2527e);
        if (c2527e.read() != 1) {
            throw new IOException("No ASF");
        }
        if (c2527e.read() == 2) {
            return new C2637e(j, bigInteger, appmetrica2);
        }
        throw new IOException("No ASF");
    }
}
