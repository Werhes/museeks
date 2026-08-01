package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13308e extends AbstractC2195e implements InterfaceC15687e {
    public final ArrayList ad;

    public C13308e(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C13308e) {
                AbstractC13480e.inmobi(arrayList, ((InterfaceC15687e) obj).ad());
            } else {
                arrayList.add(obj);
            }
        }
        this.ad = arrayList;
    }

    @Override // defpackage.InterfaceC15687e
    public final List ad() {
        return this.ad;
    }
}
