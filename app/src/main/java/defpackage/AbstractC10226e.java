package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10226e extends AbstractC15728e implements InterfaceC7557e, InterfaceC13961e {
    @Override // defpackage.AbstractC15728e
    /* renamed from: applovin, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC10226e isVip(C6557e c6557e);

    @Override // defpackage.AbstractC15728e
    /* renamed from: isPro, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC10226e pro(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C8746e.appmetrica.isVip((InterfaceC16566e) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(loadAd());
        if (!mopub().isEmpty()) {
            AbstractC13480e.m3610while(mopub(), sb, ", ", "<", ">", null, 112);
        }
        if (Signature()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
